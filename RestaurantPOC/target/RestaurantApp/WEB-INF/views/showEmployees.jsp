<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
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
		<title>HomePage - Al Mehfal Restaurant</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		
		<link rel="stylesheet" href="web/css/common.css" type="text/css" media="screen" />
		<link href="web/css/theme.blue.css" rel="stylesheet" type="text/css" />
		
		<script type="text/javascript" src="web/js/jquery.min.js"></script>
		<script src="web/js/jquery.tablesorter.js" type="text/javascript"></script>
		
		<style type="text/css">
			input[type="text"] {
				font-family: "Arial";
				font-size: 12px;
				height: 19px;
				line-height: 18px;
				color: black;
				background-color: white;
				border: 2px inset #cccccc;
			}
		</style>
		
		<script type="text/javascript">
			$(document).ready(function () {
				$("table").tablesorter({ theme : 'blue'});
				$("ul.nav").find('li').eq(4).attr('class','current');
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
				<table class="tablesorter">
					<thead><tr>
						<th align="center">Login ID</th>
						<th align="center">Emp.Name</th>
						<th align="center">Passport No.</th>
						<th align="center">Local No.</th>
						<th align="center">Address</th>
					</tr></thead>
					<tbody><c:forEach items="${list}" var="e">
						<tr>
							<td> ${e.username} </td>
							<td> ${e.name} </td>
							<td> ${e.passportNum} </td>
							<td> ${e.localContactNum} </td>
							<td> ${e.addressLine1} </td>
							<td> <a href='<c:url value="/${role}/editEmployee" />?id=${e.username}'> Edit </a> </td>
							<td> <a href='<c:url value="/${role}/deleteEmployee" />?id=${e.username}'>Delete</a>
						</tr>
					</c:forEach></tbody>
				</table>
			</div>
	
			<div id="footer">
				<div id="footer_info">
					<p class="copyright">&copy; 2013, Al Mehfal Restaurant, All
						Rights Reserved</p>
				</div>
			</div>
		</div>
	</body>
</html>