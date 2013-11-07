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
		<title>ExpensesPage - Al Mehfal Restaurant</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		<link rel="stylesheet" href="web/css/common.css" type="text/css" media="screen" />
		
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
		
		<script type="text/javascript" src="web/js/jquery.min.js"></script>
		<script src="web/js/jquery.validation.js" type="text/javascript"></script>
		<script src="web/js/jquery.validation-en.js" type="text/javascript"></script>
		
		<script type="text/javascript">
			$(document).ready(function(){
				$(document).on("keyup", "table tr:eq(-2) td input", function(){
					var index = $("table tr").length - 2;
					$('<tr>' + 
							'<td id="cols1"> <input class="uneditable" type="text" name="expenses['+index+'].expId" readonly /> </td>' +
							'<td id="cols2"> <input type="text" name="expenses['+index+'].expHead" /> </td>' +
							'<td id="cols3"> <input type="text" name="expenses['+index+'].expSubHead" /> </td>' +
							'<td id="cols4"> <input type="text" name="expenses['+index+'].expDetails" /> </td>' +
							'<td id="cols5"> <input type="text" name="expenses['+index+'].expAmount" /> </td>' +
							'<td id="cols6"> <input type="text" name="expenses['+index+'].expDate" /> </td>' +
							'<td id="cols7"> <input class="uneditable" type="text" name="expenses['+index+'].createdBy" readonly /> </td>' +
							'<td id="cols8"> <input class="uneditable" type="text" name="expenses['+index+'].createdOn" readonly /> </td>' +
							'<td id="cols9"> <input class="uneditable" type="text" name="expenses['+index+'].lastUpdatedOn" readonly /> </td>' +
							'<td id="cols10"> <input class="uneditable" type="text" name="expenses['+index+'].lastUpdatedBy" readonly /> </td>' + 
					'</tr>').insertAfter($("table tr:eq(-2)"));
				});
			});
		</script>
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
				<form method="post" action='<c:url value="/${role}/saveExpenses" />' name="expenses">
					<h1> Daily Expenses Sheet</h1>
					<table style="width:900px;">
						<tr>
							<th id="cols1"> Exp. ID </th>
							<th id="cols2"> Exp.Head </th>
							<th id="cols3"> Exp.Sub Head </th>
							<th id="cols4"> Expense Details </th>
							<th id="cols5"> Exp. Amount </th>
							<th id="cols6"> Expense Date </th>
							<th id="cols7"> Created On </th>
							<th id="cols8"> Created By </th>
							<th id="cols9"> Last<br />Updated On </th>
							<th id="cols10"> Last<br />Updated By </th>
						</tr>
						<tr>
							<td id="cols1"> <input class="uneditable" type="text" name="expenses[0].expId" readonly /> </td>
							<td id="cols2"> <input type="text" name="expenses[0].expHead" /> </td>
							<td id="cols3"> <input type="text" name="expenses[0].expSubHead" /> </td>
							<td id="cols4"> <input type="text" name="expenses[0].expDetails" /> </td>
							<td id="cols5"> <input type="text" name="expenses[0].expAmount" /> </td>
							<td id="cols6"> <input type="text" name="expenses[0].expDate" /> </td>
							<td id="cols7"> <input class="uneditable" type="text" name="expenses[0].createdBy" readonly /> </td>
							<td id="cols8"> <input class="uneditable" type="text" name="expenses[0].createdOn" readonly /> </td>
							<td id="cols9"> <input class="uneditable" type="text" name="expenses[0].lastUpdatedOn" readonly /> </td>
							<td id="cols10"> <input class="uneditable" type="text" name="expenses[0].lastUpdatedBy" readonly /> </td>
						</tr>
						<tr>
							<td colspan="10" align="center">
								<br /><input type="submit" value="Submit" class="btn" />
							</td>
					</table>
				</form>
			</div>
			<br />
			<div id="footer">
				<div id="footer_info">
					<p class="copyright">&copy; 2013, Al Mehfal Restaurant, All Rights Reserved</p>
				</div>
			</div>
			
			<br />
		</div>
	</body>
</html>