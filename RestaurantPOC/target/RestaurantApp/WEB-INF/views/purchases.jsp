<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<sec:authorize ifAnyGranted="ROLE_USER">
	<c:set var="role" value="user"></c:set>
</sec:authorize>
<sec:authorize ifAnyGranted="ROLE_MANAGER">
	<c:set var="role" value="manager" ></c:set>
</sec:authorize>
<sec:authorize ifAnyGranted="ROLE_ADMIN">
	<c:set var="role" value="admin"></c:set>
</sec:authorize>
<!DOCTYPE html>
<html>
	<head>
		<title>HomePage - Al Mehfal Restaurant</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

		<link rel="stylesheet" href="web/css/common.css" type="text/css" media="screen" />
		<link href="web/css/jquery.validation.css" rel="stylesheet" type="text/css" />
		<link href="web/css/jquery.ui.css" rel="stylesheet" type="text/css" />
		<link href="web/css/theme.blue.css" rel="stylesheet" type="text/css" />
		
		<script src="web/js/jquery.min.js" type="text/javascript"></script>
		<script src="web/js/jquery.tablesorter.js" type="text/javascript"></script>
		<script src="web/js/jquery.ui.js" type="text/javascript"></script>
		<script src="web/js/jquery.validation.js" type="text/javascript"></script>
		<script src="web/js/jquery.validation-en.js" type="text/javascript"></script>
		<script src="web/js/jquery.ui.touch-punch.js" type="text/javascript"></script>
		
		<style type="text/css">
			#table1 {
				border: none;
				border-collapse: collapse;
				margin-left: 30px;
			}
			#table1 tr td {
				padding: 3px;
				border: none;
				font-size: 12px;
			}
			#table1 tr td input[type="text"] {
				font-family: "Arial";
				font-size: 12px;
				height: 19px;
				line-height: 18px;
				color: black;
				background-color: white;
				border: 2px inset #cccccc;
			}
			#table1 tr td input[type="text"].uneditable {
				background-color: #aaa;
				color: black;
				border: 2px inset #cccccc;
			}
			div#menuButton {
				display: inline-block;
				color: black;
				text-align: center;
				border: 2px outset #cccccc;
				background: #d5d5d5;
				pointer: cursor;
				font-size: 12px;
				font-family: Arial;
				cursor: pointer;
			}
			div#menuButton:hover {
				background: #b5b5b5;
			}
			#table2 {
				margin-left: 30px;
				border: 1px solid #aaa;
				border-collapse: collapse;
			}
			#table2 tr th {
				background: #629cd7;
				color: white;
				text-align: center;
				font-size: 13px;
				line-height: 19px;
				font-weight: bold;
			}
			#table2 tr td {
				padding: 2px;
				border: 1px solid #aaa;
			}
			#table2 tr td.noBorder {
				border: none;
			}
			#table2 tr td img {
				cursor: pointer;
			}
			#table2 tr td input[type="text"] {
				font-family: "Arial";
				font-size: 12px;
				height: 19px;
				line-height: 18px;
				color: black;
				background-color: white;
				border: 2px inset #cccccc;
			}
			#table2 tr td input[type="text"].uneditable {
				background-color: #aaa;
				color: black;
				border: 2px inset #cccccc;
			}
			#table4 {
				border-collapse: collapse;
			}
			#table4 tr td,
			#table4 tr th {
				padding: 5px;
				text-align: left;
			}
			.tablesorter tbody tr td {
				font-size: 13px;
			}
			.tablesorter thead tr th {
				font-size: 14px;
			}
		</style>
	</head>

	<body>
		<div id="wrapper">
			<div id="header">
				<div id="header_info">
					<h2>Al Mehfal Restaurant</h2>
					<jsp:include page="menu.jsp">
						<jsp:param value="1" name="current" />
					</jsp:include>
				</div>
			</div>

			<div class="content_2columns">
				<h1> New Purchases </h1>
				<br /><br />
				<form name="purchases" id="purchases" method="post" action='<c:url value="/${role}/savePurchases" />'>
					<table id="table1">
						<tr>
							<td align="right"> GRN <b>:</b> &nbsp; </td>
							<td> <input class="uneditable" type="text" name="grp" 
									value="${purchases.grnNo}" readonly /> </td>
							<td align="right"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Invoice Date <b>:</b> &nbsp; </td>
							<td> <input type="text" id="invoiceDate" name="invoiceDate" readonly 
									value="${purchases.invoiceDate}" class="validate[required]" /></td>
						</tr>
						<tr>
							<td align="right"> Date of Purchase <b>:</b> &nbsp; </td>
							<td> <input type="text" id="purchaseDate" name="purchaseDate" class="validate[required]" /> </td>
							<td align="right"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Invoice Amount <b>:</b> &nbsp; </td>
							<td> <input class="validate[required] uneditable" type="text" 
									id="invoiceAmount" name="invoiceAmount" readonly /></td>
						</tr>
						<tr>
							<td align="right"> Supplier# <b>:</b> &nbsp; </td>
							<td>
								<input type="text" name="supplierNum" id="supplierNum" 
									class="validate[required]" placeHolder="SUPPLIER_NO" readonly />
								<div id="menuButton">&nbsp; ... &nbsp; </div>
								<input type="text" name="supplierName" id="supplierName" 
									class="validate[required]" placeHolder="SUPPLIER_NAME" readonly />
							</td>
							<td align="right"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Paid Amount <b>:</b> &nbsp; </td>
							<td> <input class="validate[required]" type="text" name="paidAmount" /></td>
						</tr>
						<tr>
							<td align="right"> Invoice No. <b>:</b> &nbsp; </td>
							<td> <input type="text" name="invoiceNum" class="validate[required]" /> </td>
							<td align="right"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Created On <b>:</b> &nbsp; </td>
							<td> <input class="uneditable"  type="text" name="createdOn" 
										value="${purchases.createdOn}" readonly /></td>
						</tr>
						<tr>
							<td></td>
							<td></td>
							<td align="right"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Created By <b>:</b> &nbsp; </td>
							<td> <input type="text" name="createdBy" class="uneditable" 
										value="${purchases.createdBy}" readonly /></td>
						</tr>
					</table> <br /> <br />
					<table id="table2">
						<tr>
							<th>Raw<br />Marerial ID</th>
							<th></th>
							<th>Raw Marerial<br />Description</th>
							<th>Unit of<br />Measure</th>
							<th><br />Quantity</th>
							<th><br />Amount</th>
							<th></th>
						</tr>
						<tr>
							<td> <input type="text" name="materials[0].rawMaterialId" class="validate[required]" /> </td>
							<td> <div id="menuButton"> &nbsp; ... &nbsp; </div> </td>
							<td> <input type="text" name="materials[0].rawMaterialDesc" class="validate[required]" /> </td>
							<td> <input type="text" name="materials[0].rawMaterialUom" class="validate[required]" /> </td>
							<td> <input type="text" name="materials[0].rawMaterialQty" class="validate[required,custom[integer]]" /> </td>
							<td> <input type="text" id="materialAmount" name="materials[0].rawMaterialAmount" class="validate[required,custom[number]]" /> </td>
							<td> <img src="web/images/delete.png" width="20px" height="20px" /> </td>
						</tr>
						<tr>
							<td colspan="5" class="noBorder"></td>
							<td> <input type="text" class="uneditable" id="totalAmt" 
									name="totalAmount" readonly /> </td>
							<td class="noBorder"></td>
						</tr>
						<tr>
							<td colspan="7" align="center">
								<input id="addRow" type="button" value="  Add Row " /> &nbsp;
								<input type="submit" value="  Save  " /> &nbsp;
								<input type="button" value="  New  " />
							</td>
						</tr>
					</table>
				</form>
			</div>

			<div id="footer">
				<div id="footer_info">
					<p class="copyright">&copy; 2013, Al Mehfal Restaurant, All Rights Reserved</p>
				</div>
			</div>
		</div>
		
		<div id="dialog">
			<table id="table4">
				<thead><tr>
					<th>Supplier No.</th>
					<th>Supplier Name </th>
					<th> Invoice Amount </th>
					<th> </th>
				</tr></thead>
				<tbody><c:forEach items="${amounts}" var="data">
					<tr>
						<td> ${data.supplierNum} </td>
						<td> ${data.supplierName} </td>
						<td> ${data.amount} </td>
						<td> ${data.invoiceDate} </td>
						<td> <a id="selectSupplier" href="javascript:void(0)"> Select </a></td>
					</tr>
				</c:forEach>
				<c:if test="${empty amounts}">
					<tr>
						<td colspan="4" align="center">
							No supplier exists
						</td>
					</tr>
				</c:if></tbody>
			</table>
		</div>
		
		<div id="dialog1">
			<table id="table4" class="tablesorter">
				<thead><tr>
					<th> Raw Material ID </th>
					<th> Raw Material Name </th>
					<th> Unit of Measure </th>
					<th> </th>
				</tr></thead>
				<tbody><c:forEach items="${materials}" var="data1">
					<tr>
						<td> ${data1.id} </td>
						<td> ${data1.desc} </td>
						<td> ${data1.uom} </td>
						<td> <a id="selectSupplier" href="javascript:void(0)"> Select </a></td>
					</tr>
				</c:forEach>
				<c:if test="${empty amounts}">
					<tr>
						<td colspan="4" align="center">
							No raw material exists
						</td>
					</tr>
				</c:if></tbody>
			</table>
		</div>
		
		<script type="text/javascript">
			$(document).ready(function() {
				$(".tablesorter").tablesorter({ theme : 'blue'});
				$("#invoiceDate").datepicker({
					dateFormat: 'yy-mm-dd',
					changeMonth: true,
					changeYear: true,
					showWeek: true,
					firstDay: 1
				});
				
				$("#purchaseDate").datepicker({
					dateFormat: 'yy-mm-dd',
					changeMonth: true,
					changeYear: true,
					showWeek: true,
					firstDay: 1
				});
				
				$("#dialog").dialog({
					autoOpen: false,
					title: 'Suppliers List',
					hide: 'slide',
					width: 450,
					height: 350,
					closeOnEscape: true,
					resizable: true,
					modal: false,
					show: 'slide',
					open : function (event, ui) {
						$("#accordion").css('display','block');
					}
				});
				$("#dialog").dialog("widget").draggable("option","containment","none");
				
				$("#dialog1").dialog({
					autoOpen: false,
					title: 'Raw Material List',
					hide: 'slide',
					width: 450,
					height: 350,
					closeOnEscape: true,
					resizable: true,
					modal: false,
					show: 'slide',
					open : function (event, ui) {
						$("#accordion").css('display','block');
					}
				});
				$("#dialog1").dialog("widget").draggable("option","containment","none");
				
				$(document).on("click","#dialog #selectSupplier", function(event) {
					var cols = $(this).parent().parent().find('td');
					var supplierNum = $.trim(cols.eq(0).html());
					var supplierName = $.trim(cols.eq(1).html());
					var invoiceAmount = $.trim(cols.eq(2).html());
					var invoiceDate = $.trim(cols.eq(3).html());
					
					$("#supplierNum").val(supplierNum);
					$("#supplierName").val(supplierName);
					$("#invoiceAmount").val(invoiceAmount);
					$("#invoiceDate").val(invoiceDate);
				});
				
				$("#table1 td div#menuButton").click(function(event) {
					$("#dialog").dialog('option','position',[event.clientX, event.clientY]);
					$("#dialog").dialog("open");
				});
				
				var columns;
				$(document).on("click", "#table2 td div#menuButton", function(event) {
					$("#dialog1").dialog('option','position',[event.clientX, event.clientY]);
					$("#dialog1").dialog("open");
					
					columns = $(this).parent().parent().find('td');
				});
				
				$(document).on("click","#dialog1 #selectSupplier", function(event) {
					var cols = $(this).parent().parent().find('td');
					var id = $.trim(cols.eq(0).html());
					var desc = $.trim(cols.eq(1).html());
					var uom = $.trim(cols.eq(2).html());
					
					columns.eq(0).find('input').eq(0).val(id);
					columns.eq(2).find('input').eq(0).val(desc);
					columns.eq(3).find('input').eq(0).val(uom);
				});
				
				$(document).on("keyup","#table2 tr:eq(-3) td input",function(event) {
					var index = $("#table2 tr").length-3;
					$('<tr>' +
						'<td> <input type="text" name="materials['+index+'].rawMaterialId" class="validate[required]" /> </td>' +
						'<td> <div id="menuButton"> &nbsp; ... &nbsp; </div> </td>' +
						'<td> <input type="text" name="materials['+index+'].rawMaterialDesc" class="validate[required]" /> </td>' +
						'<td> <input type="text" name="materials['+index+'].rawMaterialUom" class="validate[required]" /> </td>' +
						'<td> <input type="text" name="materials['+index+'].rawMaterialQty" class="validate[required,customer[integer]]" /> </td>' +
						'<td> <input type="text" id="materialAmount" name="materials['+index+'].rawMaterialAmount" class="validate[required,custom[number]]" /> </td>' +
						'<td> <img src="web/images/delete.png" width="20px" height="20px" /> </td>' +
					'</tr>').insertAfter($("#table2 tr:eq(-3)"));
				});
				
				$(document).on("mousedown", "div#menuButton", function(event) {
					$(this).css({'border': '2px inset #cccccc'});
					$(this).css({'background': '#8fca10'});
				});
	
				$(document).on("mouseup", "div#menuButton", function(event) {
					$(this).css({'border': '2px outset #cccccc'});
					$(this).css({'background': '#d5d5d5'});
				});
				
				$("#addRow").click(function(event) {
					var index = $("#table2 tr").length-3;
					$('<tr>' + 
						'<td> <input type="text" name="materials['+index+'].rawMaterialId" class="validate[required]" /> </td>' +
						'<td> <div id="menuButton"> &nbsp; ... &nbsp; </div> </td>' +
						'<td> <input type="text" name="materials['+index+'].rawMaterialDesc" class="validate[required]" /> </td>' +
						'<td> <input type="text" name="materials['+index+'].rawMaterialUom" class="validate[required]" /> </td>' +
						'<td> <input type="text" name="materials['+index+'].rawMaterialQty" class="validate[required,customer[integer]]" /> </td>' +
						'<td> <input type="text" id="materialAmount" name="materials['+index+'].rawMaterialAmount" class="validate[required,customer[number]]" /> </td>' +
						'<td> <img src="web/images/delete.png" width="20px" height="20px" /> </td>' +
					'</tr>').insertAfter($("#table2 tr:eq(-3)"));
				});
				
				$(document).on("click", "#table2 tr td img", function(event) {
					var rowIndex = $('#table2 tr').length - 4;
					if(rowIndex <= 0) {
						alert("Must contain atleast one raw material details");
					}
					else {
						var removeConfirm = confirm("Are you sure do you want to remove?");
						if(removeConfirm == true) {
							var row = $(this).parent().parent();
							row.remove();
						}
					}
				});
				
				$("#purchases").validationEngine('attach', {
					onValidationComplete: function(form, status) {
						if(status == true) {
							if($('#table2 tr').length <= 3) {
								alert("There should be atleast raw material");
								return false;
							}
							var count = $('#table2 tr').length();
							$('#table2 tr').each(function(index) {
								if(index >= 1 && index < (count-2)) {
									var one = $(this).find("td").eq(0).find('input').eq(0);
									var newName = one.attr('name').replace(/\[[0-9]+\]/i, '[' + (index-2) + ']');
									one.attr('name', newName);

									var two = $(this).find("td").eq(2).find('input').eq(0);
									newName = two.attr('name').replace(/\[[0-9]+\]/i, '[' + (index-2) + ']');
									two.attr('name', newName);

									var three = $(this).find("td").eq(3).find('input').eq(0);
									newName = three.attr('name').replace(/\[[0-9]+\]/i, '[' + (index-2) + ']');
									three.attr('name', newName);
									
									var four = $(this).find("td").eq(4).find('input').eq(0);
									newName = four.attr('name').replace(/\[[0-9]+\]/i, '[' + (index-2) + ']');
									three.attr('name', newName);
									
									var five = $(this).find("td").eq(5).find('input').eq(0);
									newName = five.attr('name').replace(/\[[0-9]+\]/i, '[' + (index-2) + ']');
									three.attr('name', newName);
								}
							});
							return true;
						}
						return false;
					}
				});
				
				function calculateTotal() {
					var count = $('#table2 tr').length;
					var total = 0.0;
					$('#table2 tr').each(function(index) {
						if(index >= 1 && index < (count-2)) {
							var n = parseFloat($(this).find('td').eq(5).find('input').eq(0).val());
							if(isNaN(n))
								n = 0.0;
							total += n;
						}
					});
					
					$("#totalAmt").val(total);
				}
				
				$(document).on("keyup","#table2 #materialAmount", function() {
					calculateTotal();
				});
			});
		</script>
	</body>
</html>