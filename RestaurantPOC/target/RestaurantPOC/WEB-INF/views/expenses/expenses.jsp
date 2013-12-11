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
		</style>
	</head>

	<body>
		<div id="wrapper">
			<div id="header">
				<div id="header_info">
					<h2>Al Mehfal Restaurant</h2>
					<jsp:include page="../menu.jsp"></jsp:include>
				</div>
			</div>
	
			<div class="content_2columns">
				<div id="leftPan">
					<ul style="display: block;" class="nav1">
						<li>
							<a href='<c:url value="/${role}/rawMaterials" />'> Raw Materials </a>
						</li>
						<li>
							<a href='<c:url value="/${role}/suppliers" />'> Suppliers </a>
						</li>
						<li>
							<a href='<c:url value="/${role}/purchases" />'> Purchases </a>
						</li>
						<li class="current">
							<a href='<c:url value="/${role}/expenses" />'> Expenses </a>
						</li>
					</ul>
				</div>
				<div id="rightPan">
					<form method="post" action='<c:url value="/${role}/${url}" />'
						id="expenses" name="expenses">
						<h1>Daily Expenses</h1>
						<br />
						<table>
							<tr>
								<td colspan="10" align="right">
									<a href='<c:url value="/${role}/viewExpenses" />'> View Expenses </a>
								</td>
							</tr>
							<tr>
								<td align="right">Expense Head: </td>
								<td> <input type="hidden" name="expId" value="${expenses.expId}" />
									<input class="validate[required]" type="text"
										name="expHead" value="${expenses.expHead}" />
								</td>
							</tr>
							<tr>
								<td align="right">Expense Sub Head: </td>
								<td>
									<input class="validate[required]" type="text"
										name="expSubHead" value="${expenses.expSubHead}" />
								</td>
							</tr>
							<tr>
								<td align="right">Expense Details: </td>
								<td>
									<input class="validate[required]" type="text"
										name="expDetails" value="${expenses.expDetails}" />
								</td>
							</tr>
							<tr>
								<td align="right">Expense Amount: </td>
								<td>
									<input class="validate[required,custom[number]]" type="text"
										name="expAmount" value="${expenses.expAmount}" />
								</td>
							</tr>
							<tr>
								<td align="right">Expense Date: </td>
								<td>
									<input class="validate[required,custom[date]]"
										id="date1" type="text" name="expDate" value="${expenses.expDate}" />
								</td>
							</tr>
							<tr>
								<td colspan="2" align="center"><br />
									<input type="submit" value="Submit" class="btn" />
								</td>
						</table>
					</form>
				</div>
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
				$("ul.nav").find('li').eq(1).attr('class','current');
				
				$("#expenses").validationEngine('attach',{
					onValidationComplete : function(form, status) {
						if (status == true) {
							return true;
						}
						return false;
					},
					showOneMessage: true
				});
			});
		</script>
	</body>
</html>