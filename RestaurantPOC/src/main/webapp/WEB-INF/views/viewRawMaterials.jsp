<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<sec:authorize ifAnyGranted="ROLE_MANAGER">
	<c:set var="role" value="manager" ></c:set>
</sec:authorize>
<sec:authorize ifAnyGranted="ROLE_ADMIN">
	<c:set var="role" value="admin"></c:set>
</sec:authorize>
<!DOCTYPE html>
<html>
	<head>
		<title>RawMaterials - Al Mehfal Restaurant</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		<link rel="stylesheet" href="web/css/common.css" type="text/css" media="screen" />
		<link href="web/css/theme.blue.css" rel="stylesheet" type="text/css" />
		
		<script type="text/javascript" src="web/js/jquery.min.js"></script>
		<script src="web/js/jquery.tablesorter.js" type="text/javascript"></script>
		
		<script type="text/javascript">
			$(document).ready(function () {
				$("table").tablesorter({ theme : 'blue'});
			});
		</script>
		
		<style type="text/css">
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
					<jsp:include page="menu.jsp" />
				</div>
			</div>

			<div class="content_2columns">
				<br />
				<h2> Raw Materials List </h2>
				<br />
				<table class="tablesorter">
					<thead><tr>
						<th> Raw Material ID </th>
						<th> Raw Material Description </th>
						<th> Raw Material Uom </th>
					</tr></thead>
					<tbody><c:forEach items="${list}" var="rawMaterial">
						<tr>
							<td> ${rawMaterial.id} </td>
							<td> ${rawMaterial.desc} </td>
							<td> ${rawMaterial.uom} </td>
						</tr>
					</c:forEach>
					<c:if test="${empty list}">
						<tr>
							<td colspan="3" align="center">
								No Raw Materials
							</td>
						</tr>
					</c:if></tbody>
				</table>
			</div>

			<div id="footer">
				<div id="footer_info">
					<p class="copyright">&copy; 2013, Al Mehfal Restaurant, All Rights Reserved</p>
				</div>
			</div>
		</div>
	</body>
</html>