<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
	<head>
		<title> Home Page </title>
		
		<link href="web/css/common.css" rel="stylesheet" type="text/css" />
		<link href="web/css/home.css" rel="stylesheet" type="text/css" />
		<link href="web/css/jquery.ui.css" rel="stylesheet" type="text/css" />
		<link href="web/css/jquery.validation.css" rel="stylesheet" type="text/css" />
		<link href="web/css/theme.blue.css" rel="stylesheet" type="text/css" />
		<link href="web/css/accordian.css" rel="stylesheet" type="text/css" />
		
		<script src="web/js/jquery.js" type="text/javascript"></script>
		<script src="web/js/jquery.ui.js" type="text/javascript"></script>
		<script src="web/js/jquery.validation.js" type="text/javascript"></script>
		<script src="web/js/jquery.validation-en.js" type="text/javascript"></script>
		<script src="web/js/jquery.tablesorter.js" type="text/javascript"></script>
		
		<style type="text/css">
			input.button {
				display: inline-block;
				background-color: #1f9dd1;
				border-radius: 5px;
				box-shadow: 2px 2px 2px #aaa;
				font-size: 11px;
				color: white;
				border: none;
				padding-left: 6px;
				padding-top: 2px;
				padding-bottom: 2px;
				padding-right: 6px;
				text-shadow: none;
				font-weight: normal;
				cursor: pointer;
			}
			
			input.button:hover {
				background: #5f9ad9;
				color: #ffffff;
			}
		</style>
	</head>

	<body>
		<div class="top">
			<div class="container">
				<div class="leftDiv">
					<a href="<c:url value="/user/home" />">
						AL MEHFAL RESTAURANT
					</a>
				</div>
				<div class="rightDiv">
					<a href="<c:url value="/logout" />">Log Out</a>
				</div>
			</div>
		</div>

		<div class="content">
			<div class="container">
				<div class="block">
					<div class="left-block">
						Welcome! <b> ${orderForm.createdBy} </b>
					</div>
					<div class="right-block">
						<a href="<c:url value="/user/home" />"> Home </a> &nbsp;&nbsp;
						<a href="javascript:void(0);"> <b>Sales</b> </a>
					</div>
				</div>
				<div class="block" style="margin-top:10px;border-top:1px solid #999999;">
					<br />
					<form name="orderForm" id="orderForm" method="post" 
						action="<c:url value="/user/saveOrder" />">
						
						<div class="left">
							<fieldset>
								<legend> &nbsp; <b>Restaurant Bills</b> &nbsp; </legend> <br />
								<table class="noBorder" style="display:inline-block;">
									<tr>
										<td id="right-bold"> Bill No: </td>
										<td> <input class="uneditable" type="text" size="6" 
												id="billNum" 
												name="billNum" value="${orderForm.billNum}" 
												readonly /> </td>
	
										<td id="right-bold-large"> Bill Date: </td>
										<td> <input class="uneditable" type="text" size="18" 
												id="billDate" 
												name="billDate" value="${orderForm.billDate}"
												readonly /> </td>
									</tr>
									<tr>
										<td id="right-bold"> Bill Amount: </td>
										<td> <input class="uneditable" type="text" size="10" 
												id="billAmount" 
												name="billAmount" value="${orderForm.billAmount}" 
												readonly /> </td>
	
										<td id="right-bold"> Discount Amount: </td>
										<td> <input type="text" size="6" class="validate[required]" 
												id="billDiscount" 
												name="discount" value="${orderForm.discount}" /> </td>
									</tr>
									<tr>
										<td id="right-bold"> Net Amount: </td>
										<td> <input class="uneditable" type="text" size="10" 
												id="billNetAmount" 
												name="billNetAmount" value="${orderForm.billNetAmount}" 
												readonly /> </td>
	
										<td id="right-bold"> Created By: </td>
										<td> <input class="uneditable" type="text" size="15" 
												name="createdBy" value="${orderForm.createdBy}" 
												readonly /> </td>
									</tr>
									<tr>
										<td id="right-bold"> Sales Type: </td>
										<td>
											<select name="salesType" id="salesType" 
												class="validate[required]">
												
												<option value=""> Sales Type </option>
												<option> Al-a-Carte </option>
												<option> Parcel </option>
												<option> Bulk </option>
											</select>
											<script type="text/javascript">
												$("#salesType").val('${orderForm.salesType}');
											</script>
										</td>
										<td id="right-bold"> Table#: </td>
										<td>
											<select name="tableNum" id="tableNum" 
												class="validate[required]">
												
												<option value=""> Table Number </option>
												<option> T01 </option>
												<option> T02 </option>
												<option> T03 </option>
												<option> T04 </option>
												<option> T05 </option>
												<option> T06 </option>
												<option> T07 </option>
												<option> T08 </option>
											</select>
											<script type="text/javascript">
												$("#tableNum").val('${orderForm.tableNum}');
											</script>
										</td>
									</tr>
								</table>
								
								<br /> <br />
								
								<table class="border" id="menuitems" align="center">
									<tr>
										<td class="noBorder" align="right" colspan="4">
											<input type="button" class="btn" 
												value=" New Bill " id="newBill" />
												
											<input type="button" class="btn" 
												value=" Save Bill "  id="saveBill" />
												
											<input type="button" class="btn" 
												value=" Cancel Bill "  id="cancelBill" />
												
											<input type="button" class="btn" 
												value=" Print Bill " id="printBill" />
												
											<input type="button" class="btn" 
												value=" Add Row " id="addRow" />
											<br /> <br />
										</td>
									</tr>
									<tr>
										<th> <br />Menu Item </th>
										<th> <br />Price </th>
										<th> <br />Quantity </th>
										<th> Bill Line<br />Amount </th>
									</tr>
									
									<c:forEach items="${orderForm.orderedItems}" 
										var="orderItem" varStatus="status">
										<tr>
											<td> <input type="text" size="20" id="tag"  
													name="orderedItems[${status.index}].itemName"
													value="${orderItem.itemName}" /> 
													<button id="menuButton1">...</button>
											</td>
											<td> <input class="uneditable" type="text" size="8" 
													name="orderedItems[${status.index}].itemCost"
													value="${orderItem.itemCost}" readonly />
											</td>
											<td> <input type="text" size="8" id="qty"  
													name="orderedItems[${status.index}].quantity"
													value="${orderItem.quantity}" />
											</td>
											<c:set var="billLineAmt" value="${orderItem.itemCost * orderItem.quantity} "/>
											<td> <input class="uneditable" type="text"
													value="${billLineAmt}" size="10" disabled />
											</td>
										</tr>
									</c:forEach>
								</table>
							</fieldset>
						</div>
						
						<div class="right">
							<h3> Current Bills </h3>
							<table class="tablesorter" id="currentBills">
								<thead>
									<tr>
										<th> Bill No. </th>
										<th> Bill Date </th>
										<th> Net Amount </th>
										<th> Sales Type </th>
										<th> Table# </th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${pendingOrders}" var="orderForm">
										<tr>
											<td> ${orderForm.billNum} </td>
											<td> ${orderForm.billDate} </td>
											<td> ${orderForm.billNetAmount} </td>
											<td> ${orderForm.salesType} </td>
											<td> ${orderForm.tableNum} </td>
											<td> <input type="button" value="Open Order" 
													class="button" id="openOrder" />
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</form>
				</div>
			</div>
		</div>
		
		<div id="dialog">
			<div id="accordion">
				<c:forEach items="${dishItems}" var="cateory">
					<h3>${cateory.description}</h3>
					<div>
						<c:forEach items="${cateory.dishItems}" var="item">
							<button id="menuButton" class="${item.itemCost}"> ${item.itemName} </button>
						</c:forEach>
					</div>
				</c:forEach>
			</div>
		</div>
		
		<script type="text/javascript">
			$(document).ready(function () {

				$("#dialog").dialog({autoOpen: false},{title: 'Menu Items'},{hide: 'slide'},{width:600},
						{closeOnEscape: true},{resizable: false},{modal: true},{show: 'slide'});


				$("#accordion").accordion({
					collapsible: true,
					heightStyle: "content"
				});

				<c:if test="${printBill}">
					var url = '<c:url value="/user/printBill?billNum=' + ${billNum} + '" />';
					window.open(url, '_blank', 'width=400, height=400, location=0, menubar=0, resizable=0, scrollbars=0, status=0, toolbar=0');
				</c:if>
				
				$("table").tablesorter({ theme : 'blue'});

				function calculateBill() {
					var sum = 0.00;
					$('#menuitems tr').each(function() {
						if(this.rowIndex > 1)
							var cost = $(this).find("td").eq(3).find('input').val();
							
							if(cost=='' || isNaN(cost))
								cost = 0.00;
							else
								cost = parseFloat(cost);
							
							sum += cost;
					});

					$('#billAmount').val(sum);
					var discount = $('#billDiscount').val();
					if(isNaN(discount))
						discount = 0;
					else
						discount = parseInt(discount);
						
					$('#billNetAmount').val(sum - discount);
				}
				
				$(document).on("keyup", "input#billDiscount", function() {
					calculateBill();
				});

				$(document).on("keyup", "input#qty", function() {
					var quantity = $(this).val();
					var cost = $(this).parent().prev().find("input").eq(0).val();
					$(this).parent().next().find("input").eq(0).val(quantity*cost);
					calculateBill();
				});
				
				$("#orderForm").validationEngine('attach', {
					onValidationComplete: function(form, status) {
						if(status == true) {
							calculateBill();
							return true;
						}
						return false;
					}
				});

				$(document).on("click", "div#dialog button#menuButton", function(event) {
					event.preventDefault();
					var value = $(this).attr('class');
					var name = $(this).html().trim();
					
					var row = $("#menuitems").find('tr').eq(itemRow);
					var tds = row.find('td');
					tds.eq(0).find('input').eq(0).val(name);
					tds.eq(1).find('input').eq(0).val(value);

					$("#dialog").dialog("close");
				});

				$(document).on("click", "div.right button#menuButton", function(event) {
					event.preventDefault();
					var value = $(this).attr('class');
					var name = $(this).html().trim();

					var index = $('#menuitems tr').length - 2;
					$("#menuitems")
						.find('tbody')
						.append('<tr>' +
									'<td> <input type="text" size="20" id="tag" ' + 
										'class="validate[required,minSize[3]]" ' + 
										'value="' + name + '"' + 
										'name="orderedItems[' + index + '].itemName" /> ' + 
										'<button id="menuButton1">...</button>' + 
									'</td>' +
									'<td> <input class="uneditable" type="text" ' +
										'value="' + value + '"' + 
										'size="8" name="orderedItems[' + index + '].itemCost" ' + 
										'readonly /> ' + 
									'</td>' +
									'<td> <input type="text" size="8" id="qty" '+ 
										'class="validate[required,custom[integer],min[1]]" ' + 
										'name="orderedItems[' + index + '].quantity" /> ' + 
									'</td>' +
									'<td> <input class="uneditable" type="text" ' + 
										'size="10" disabled /> ' + 
									'</td>' +
								'</tr>');
				});

				var itemRow;
				$(document).on("click", "button#menuButton1", function(event) {
					event.preventDefault();
					$("#dialog").dialog("open");
					itemRow = $(this).parent().parent().index();
				});

				$(document).on("mousedown", "button#menuButton", function(event) {
					event.preventDefault();
					$(this).css({'border': '2px inset #cccccc'});
				});

				$(document).on("mouseup", "button#menuButton", function(event) {
					event.preventDefault();
					$(this).css({'border': '2px outset #cccccc'});
				});

				$(document).on("mousedown", "button#menuButton1", function(event) {
					event.preventDefault();
					$(this).css({'border': '2px inset #cccccc'});
				});

				$(document).on("mouseup", "button#menuButton1", function(event) {
					event.preventDefault();
					$(this).css({'border': '2px outset #cccccc'});
				});

				$("#addRow").click(function() {
					var index = $('#menuitems tr').length - 2;
					$("#menuitems")
						.find('tbody')
						.append('<tr>' +
									'<td> <input type="text" size="20" id="tag" ' + 
										'class="validate[required,minSize[3]]" ' + 
										'name="orderedItems[' + index + '].itemName" /> ' + 
										'<button id="menuButton1">...</button>' + 
									'</td>' +
									'<td> <input class="uneditable" type="text" ' + 
										'size="8" name="orderedItems[' + index + '].itemCost" ' + 
										'readonly /> ' + 
									'</td>' +
									'<td> <input type="text" size="8" id="qty" '+ 
										'class="validate[required,custom[integer],min[1]]" ' + 
										'name="orderedItems[' + index + '].quantity" /> ' + 
									'</td>' +
									'<td> <input class="uneditable" type="text" ' + 
										'size="10" disabled /> ' + 
									'</td>' +
								'</tr>');
				});

				$("#saveBill").click(function() {
					alert("Message: Current order will be saved and new order will be dispalyed");
					$("#orderForm").submit();
				});

				$("#newBill").click(function() {
					var newBillConfirm = confirm("Do you want to save the changes in current order?");
					
					if(newBillConfirm == true) {
						alert("Message: Current order will be saved and new order will be dispalyed");
						$("form").submit();
					}
					else {
						var url = $("form").attr('action');
						url  = url.substring(0,url.lastIndexOf("/"));
						alert("Message: Current order will not be saved and new order will be dispalyed");
						
						window.top.location = url + '/sales';
					}
				});

				$("#cancelBill").click(function() {
					var cancelBillConfirm = confirm("Do you want to cancel the order?");
					
					if(cancelBillConfirm == true) {
						var url = $("form").attr('action');
						url  = url.substring(0,url.lastIndexOf("/")) + '/cancelOrder?value=' 
									+ $("#billNum").val();
						
						alert("Message: Current order will be deleted");
						window.top.location = url;
					}
				});
				
				$("#printBill").click(function() {
					var printBillConfirm = confirm("Do you want to print the current order?");

					if(printBillConfirm == true) {
						var url = $("form").attr('action');
						url  = url.substring(0,url.lastIndexOf("/")) +'/printOrder';
						$("form").attr('action', url);
						
						alert("Message: Current order will be saved and bill will be gnerated");
						$("form").submit();
					}
				});

				$(document).on("click", "input#openOrder", function() {
					var row = $(this).parent().parent();
					var value = row.find('td').eq(0).html();
					var url = $("form").attr('action');
					url  = url.substring(0,url.lastIndexOf("/")) +'/openOrder?value=' + $.trim(value);
					
					alert("Message: Order with bill number '" + value + "' will be opened");
					window.top.location = url;
				});
			});
		</script>
		
	</body>
</html>