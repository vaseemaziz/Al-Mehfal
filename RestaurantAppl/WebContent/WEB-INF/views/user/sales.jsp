<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="utf-8" />

		<title> Billing Page </title>
		
		<link href="web/css/style.css" rel="stylesheet" type="text/css" />
		<link href="web/css/sales.css" rel="stylesheet" type="text/css" />
		<link href="web/css/tabs.css" rel="stylesheet" type="text/css" />
		<link href="web/css/jquery.ui.css" rel="stylesheet" type="text/css" />
		<link href="web/css/jquery.validation.css" rel="stylesheet" type="text/css" />
		
		<script src="web/js/jquery.js" type="text/javascript"></script>
		<script src="web/js/jquery.tabs.js" type="text/javascript"></script>
		<script src="web/js/jquery.ui.js" type="text/javascript"></script>
		<script src="web/js/jquery.validation.js" type="text/javascript"></script>
		<script src="web/js/jquery.validation-en.js" type="text/javascript"></script>
		
		<script type="text/javascript">
			function applyAutoComplete() {
				$("input#tag").each(function(){
					$(this).autocomplete({
						source: function (request, response) {
					        $.getJSON('${pageContext. request. contextPath}/user/getDishList', {
					            term: request.term
					        }, response);
					    },
					    focus: function(event, ui) {
						    return false;
						},
						select: function(event, ui) {
							$(this).val(ui.item.label);
							$(this).next().val(ui.item.value);
							return false;
						},
						change: function(event, ui) {
							if(!ui.item)
								this.value = '';
							return false;
						}
					});
				});
			}
	
			$(window).resize(function(){
				document.title = $(window).width() + "px";
			});
	
			$(document).ready(function () {
				$('#myTab').responsiveTabs({
					startCollapsed: 'accordion',
					collapsible: true,
					rotate: false,
					setHash: true
				});

				$("#orderForm").validationEngine('attach', {
					onValidationComplete: function(form, status) {
						
						if(status == true) {
							$.ajax({
								url: $(form).attr('action'),
								data: $(form).serialize() + '&billNum=' + $.trim($("#billNum").html()),
								type: 'post',
	
								success: function(msg) {
									msg = $.trim(msg);
									var obj = $.parseJSON(msg);
									alert(obj.value);
									
									if(obj.name == "success") {
										
										$("#orderForm")[0].reset();
										$("#price").each(function(){
											$(this).html('0');
										});
										
										$("#billNum").html(obj.newBillNum);
										$("#billDate").html(obj.newBillDate);
									}
								}
							});
						}

						return false;
					}
				});
	
				applyAutoComplete();
				
				$('#bill').click(function() {
					alert("Print Bill");
				});
	
				$('input#qty').live("keyup", function(e) {
					var prevCol = $(this).parent().prev();
					var cost = prevCol.find("input").eq(1).val();
					var qty = $(this).val();

					var nextCol = $(this).parent().next();
					nextCol.text(qty*cost);
				});
	
				$('input.last').live("keypress", function(e) {
					var keyCode = e.keyCode || e.which; 
	
					if (keyCode == 9 || keyCode == 13) {
						e.preventDefault();
						$(this).removeClass('last');

						var index = ($('table.border tr').length - 3);
						
						$('<tr>' + 
						          '<td> <input class="validate[required] text-input" type="text" name="orderedItems[' + index + '].itemName" id="tag" />' +
								'<input type="hidden" name="orderedItems[' + index + '].itemCost" /> </td>' + 
						          '<td> <input type="text" class="validate[required] text-input" name="orderedItems[' + index + '].quantity" id="qty" class="last" /> </td>' + 
						          '<td align="right" id="price"> 0 </td>' +
						   '</tr>').insertBefore('#tableSeperator');
	
						applyAutoComplete();						
					}
				});
	
				$('#addRow').live('click', function() {
					$('input.last').removeClass('last');
					var index = ($('table.border tr').length - 3);
	
					$('<tr>' + 
					          '<td> <input class="validate[required] text-input" type="text" name="orderedItems[' + index + '].itemName" id="tag" />' +
							'<input type="hidden" name="orderedItems[' + index + '].itemCost" /> </td>' + 
					          '<td> <input type="text" class="validate[required] text-input" name="orderedItems[' + index + '].quantity" id="qty" class="last" /> </td>' + 
					          '<td align="right" id="price"> 0 </td>' +
					   '</tr>').insertBefore('#tableSeperator');
	
					applyAutoComplete();
				});
			});
		</script>
	</head>

	<body>
		<div class="top">
			<div class="container">
				<div class="leftDiv">
					AL MEHFAL RESTAURANT
				</div>
				<div class="rightDiv">
					<a href="<c:url value="/logout" />">Log Out</a>
				</div>
			</div>
		</div>

		<div class="content"> <div class="container">
			<div class="block" id="myTab">
				<ul>
					<li> <a href="#al-a-carte"> Al-a-Carte </a> </li>
					<li> <a href="#parcel"> Parcels </a> </li>
					<li> <a href="#bulk"> Bulk </a> </li>
					<li> <a href="#profile"> My Profile </a> </li>
				</ul>

				<div id="al-a-carte">
					<div class="myTabContent">
						<br /><b class="btn"> New Order </b> &nbsp; &nbsp;
						<b class="btn"> Current Orders </b><br /><br />
					</div>

					<div class="myTabContent">
						<form method="post" action="<c:url value="/user/saveOrder" />" name="orderForm" id="orderForm">
							<table class="noBorder">
								<tr>
									<td align="right"> Bill No. : &nbsp;&nbsp; </td>
									<td id="billNum"> ${orderForm.billNum} </td>
								</tr>
								<tr>
									<td align="right"> Date : &nbsp;&nbsp; </td>
									<td id="billDate"> ${orderForm.date} </td>
								</tr>
								<tr>
									<td align="right"> Customer Name : &nbsp;&nbsp; </td>
									<td> <input type="text" class="validate[required,minSize[2],maxSize[50]] text-input" name="custName" id="custName" value="${orderForm.custName}" /> </td>
								</tr>
								<tr>
									<td align="right"> Table No. : &nbsp;&nbsp; </td>
									<td> <input type="text" class="validate[required,minSize[2],maxSize[5]] text-input" name="tableNum" id="tableNum" value="${orderForm.tableNum}" /> </td>
								</tr>
								<tr>
									<td align="right"> Chair No. : &nbsp;&nbsp; </td>
									<td> <input type="text" class="validate[required,minSize[1],maxSize[5]] text-input" name="chairNum" id="chairNum" value="${orderForm.chairNum}" /> </td>
								</tr>
							</table> <br /> <br />

							<table class="border">
								<tr>
									<th> Item Name </th>
									<th> Quantity </th>
									<th> Price </th>
								</tr>
								<tr>
									<td> <input class="validate[required] text-input" type="text" id="tag" name="orderedItems[0].itemName" value="" />
										<input type="hidden" name="orderedItems[0].itemCost" value="" /> </td>
									<td> <input class="validate[required] text-input" type="text" name="orderedItems[0].quantity" id="qty" class="last" value="" /> </td>
									<td align="right" id="price"> 0 </td>
								</tr>
								<tr id="tableSeperator">
									<td class="noBorder" colspan="4"></td>
								</tr>
								<tr>
									<td colspan="4" align="right" class="noBorder">
										<input type="submit" class="btn" id="save" value="Save Order" /> &nbsp; &nbsp;
										<b class="btn" id="bill"> Print Bill </b> &nbsp; &nbsp;
										<b class="btn" id="addRow"> Add Row </b>
									</td>
								</tr>
							</table>
						</form>
					</div>
				</div>

				<div id="parcel">
					<div class="myTabContent">
					</div>
				</div>

				<div id="bulk">
					<div class="myTabContent">
					</div>
				</div>

				<div id="profile">
					<div class="myTabContent">
					</div>
				</div>
			</div>
		</div> </div>
	</body>
</html>