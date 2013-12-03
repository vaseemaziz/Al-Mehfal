<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<sec:authorize ifAnyGranted="ROLE_USER">
	<c:set var="role" value="user"></c:set>
</sec:authorize>
<sec:authorize ifAnyGranted="ROLE_MANAGER">
	<c:set var="role" value="manager"></c:set>
</sec:authorize>
<sec:authorize ifAnyGranted="ROLE_ADMIN">
	<c:set var="role" value="admin"></c:set>
</sec:authorize>
<!DOCTYPE html>
<html>
	<head>
		<title>ExpensesPage - Al Mehfal Restaurant</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		<link rel="stylesheet" href="web/css/common.css" type="text/css" />
		<link href="web/css/jquery.validation.css" rel="stylesheet" type="text/css" />
		
		<script type="text/javascript" src="web/js/jquery.min.js"></script>
		<script src="web/js/jquery.validation.js" type="text/javascript"></script>
		<script src="web/js/jquery.validation-en.js" type="text/javascript"></script>
		
		<style type="text/css">
			th {
				text-align: center;
				background: #00a2e8;
			}
			td {
				padding: 3px;
			}
			input[type="text"] {
				width: 100%;
				font-family: "Arial";
				font-size: 12px;
				height: 19px;
				line-height: 18px;
				color: black;
				background-color: white;
				border: 2px inset #cccccc;
			}
			input[type="text"].uneditable {
				width: 100%;
				height: 19px;
				line-height: 18px;
				background-color: #aaa;
				color: black;
				border: 2px inset #cccccc;
			}
			table img {
				cursor: pointer;
			}
			#cols1 {
				width: 40px;
			}
			#cols2 {
				width: 80px;
			}
			#cols3 {
				width: 80px;
			}
			#cols4 {
				width: 120px;
			}
			#cols5 {
				width: 60px;
			}
			#cols6 {
				width: 90px;
			}
			#cols7 {
				width: 90px;
			}
			#cols8 {
				width: 90px;
			}
			#cols9 {
				width: 90px;
			}
			#cols10 {
				width: 90px;
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
				<form method="post" action='<c:url value="/${role}/saveExpenses" />'
					id="expenses" name="expenses">
					<h1>Daily Expenses Sheet</h1>
					<br />
					<table style="width: 900px;">
						<tr>
							<td colspan="10" align="right">
								<a id="addRow" href="javascript:void(0)">Add Row</a> &nbsp; &nbsp;
								<a href='<c:url value="/${role}/viewExpenses" />'> View Expenses </a>
							</td>
						</tr>
						<tr>
							<th id="cols2">Exp.Head</th>
							<th id="cols3">Exp.Sub Head</th>
							<th id="cols4">Expense Details</th>
							<th id="cols5">Exp. Amount</th>
							<th id="cols6">Expense Date</th>
							<th id="cols7">Created On</th>
							<th id="cols8">Created By</th>
							<th id="cols1"></th>
						</tr>
						<tr>
							<td id="cols2">
								<input class="validate[required]" type="text"
									name="expenses[0].expHead" /></td>
							<td id="cols3">
								<input class="validate[required]" type="text"
									name="expenses[0].expSubHead" /></td>
							<td id="cols4">
								<input class="validate[required]" type="text"
									name="expenses[0].expDetails" /></td>
							<td id="cols5">
								<input class="validate[required,custom[number]]" type="text"
									name="expenses[0].expAmount" /></td>
							<td id="cols6">
								<input class="validate[required,custom[date]]"
									id="date1" type="text" name="expenses[0].expDate" /></td>
							<td id="cols7">
								<input class="uneditable" type="text" value="${user}"
									name="expenses[0].createdBy" readonly /></td>
							<td id="cols8">
								<input class="uneditable" type="text" value="${user}"
									name="expenses[0].createdOn" readonly /></td>
							<td id="cols1">
								&nbsp; <img src="web/images/delete.png" width="20px" height="20px" />
							</td>
						</tr>
						<tr>
							<td colspan="8" align="center"><br />
								<input type="submit" value="Submit" class="btn" />
							</td>
					</table>
				</form>
			</div>
			<div id="footer">
				<div id="footer_info">
					<p class="copyright">&copy; 2013, Al Mehfal Restaurant, All
						Rights Reserved</p>
				</div>
			</div>
		</div>

		<script type="text/javascript">
			$(document).ready(function() {
				$("ul.nav").find('li').eq(3).attr('class','current');
				
				$(document).on("click", "table img", function(event) {
					var rowIndex = $('table tr').length - 4;
					if (rowIndex <= 0) {
						alert("Must contain atleast expenses details");
					} else {
						var removeConfirm = confirm("Are you sure do you want to remove?");
						if (removeConfirm == true) {
							var row = $(this).parent().parent();
							row.remove();
						}
					}
				});
				

				$(document).on("keyup", "table tr:eq(-2) td input", function() {
					var index = $("table tr").length - 3;
					$('<tr>'
						+ '<td id="cols2"> <input class="validate[required]" type="text" name="expenses['+index+'].expHead" /> </td>'
						+ '<td id="cols3"> <input class="validate[required]" type="text" name="expenses['+index+'].expSubHead" /> </td>'
						+ '<td id="cols4"> <input class="validate[required]" type="text" name="expenses['+index+'].expDetails" /> </td>'
						+ '<td id="cols5"> <input class="validate[required,custom[number]]" type="text" name="expenses['+index+'].expAmount" /> </td>'
						+ '<td id="cols6"> <input class="validate[required,custom[date]]" type="text" id="date1" name="expenses['+index+'].expDate" /> </td>'
						+ '<td id="cols7"> <input class="uneditable" type="text" name="expenses['+index+'].createdBy" value="${user}" readonly /> </td>'
						+ '<td id="cols8"> <input class="uneditable" type="text" name="expenses['+index+'].createdOn" value="${user}" readonly /> </td>'
						+ '<td id="cols1"> &nbsp; <img src="web/images/delete.png" width="20px" height="20px" /> </td>'
					+ '</tr>').insertAfter($("table tr:eq(-2)"));
				});

				$("#addRow").click(function() {
					var index = $("table tr").length - 3;
					$('<tr>'
						+ '<td id="cols2"> <input class="validate[required]" type="text" name="expenses['+index+'].expHead" /> </td>'
						+ '<td id="cols3"> <input class="validate[required]" type="text" name="expenses['+index+'].expSubHead" /> </td>'
						+ '<td id="cols4"> <input class="validate[required]" type="text" name="expenses['+index+'].expDetails" /> </td>'
						+ '<td id="cols5"> <input class="validate[required,custom[number]]" type="text" name="expenses['+index+'].expAmount" /> </td>'
						+ '<td id="cols6"> <input class="validate[required,custom[date]]" type="text" id="date1" name="expenses['+index+'].expDate" /> </td>'
						+ '<td id="cols7"> <input class="uneditable" type="text" name="expenses['+index+'].createdBy" value="${user}" readonly /> </td>'
						+ '<td id="cols8"> <input class="uneditable" type="text" name="expenses['+index+'].createdOn" value="${user}" readonly /> </td>'
						+ '<td id="cols1"> &nbsp; <img src="web/images/delete.png" width="20px" height="20px" /> </td>'
					+ '</tr>').insertAfter($("table tr:eq(-2)"));
				});

				$("#expenses").validationEngine('attach',{
					onValidationComplete : function(form, status) {
						if (status == true) {
							if ($('table tr').length < 4) {
								alert("There should be atleast raw material");
								return false;
							}
							var count = $('table tr').length;
							$('table tr').each(function(index) {
								if (index >= 2 && index < (count - 1)) {
									var one = $(this).find("td").eq(0).find('input').eq(0);
									var newName = one.attr('name').replace(/\[[0-9]+\]/i,'['+ (index - 2)+ ']');
									one.attr('name',newName);

									one = $(this).find("td").eq(1).find('input').eq(0);
									newName = one.attr('name').replace(/\[[0-9]+\]/i,'['+ (index - 2)+ ']');
									one.attr('name',newName);

									one = $(this).find("td").eq(2).find('input').eq(0);
									newName = one.attr('name').replace(/\[[0-9]+\]/i,'['+ (index - 2)+ ']');
									one.attr('name',newName);

									one = $(this).find("td").eq(3).find('input').eq(0);
									newName = one.attr('name').replace(/\[[0-9]+\]/i,'['+ (index - 2)+ ']');
									one.attr('name',newName);

									one = $(this).find("td").eq(4).find('input').eq(0);
									newName = one.attr('name').replace(/\[[0-9]+\]/i,'['+ (index - 2)+ ']');
									one.attr('name',newName);

									one = $(this).find("td").eq(5).find('input').eq(0);
									newName = one.attr('name').replace(/\[[0-9]+\]/i,'['+ (index - 2)+ ']');
									one.attr('name',newName);

									one = $(this).find("td").eq(6).find('input').eq(0);
									newName = one.attr('name').replace(/\[[0-9]+\]/i,'['+ (index - 2)+ ']');
									one.attr('name',newName);

									one = $(this).find("td").eq(7).find('input').eq(0);
									newName = one.attr('name').replace(/\[[0-9]+\]/i,'['+ (index - 2)+ ']');
									one.attr('name',newName);

									one = $(this).find("td").eq(8).find('input').eq(0);
									newName = one.attr('name').replace(/\[[0-9]+\]/i,'['+ (index - 2)+ ']');
									one.attr('name',newName);
								}
							});
							return true;
						}
						return false;
					}
				});
			});
		</script>
	</body>
</html>