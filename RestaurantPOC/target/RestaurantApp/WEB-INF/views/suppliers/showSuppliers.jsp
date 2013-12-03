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
		<title>SuppliersPage - Al Mehfal Restaurant</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		<link rel="stylesheet" href="web/css/common.css" type="text/css" />
		<link href="web/css/theme.blue.css" rel="stylesheet" type="text/css" />
		
		<script type="text/javascript" src="web/js/jquery.min.js"></script>
		<script src="web/js/jquery.tablesorter.js" type="text/javascript"></script>
		
		<style type="text/css">
			table th,table td {
				font-size: 14px;
			}
			
			table a:hover {
				color: black;
			}
		</style>
		
		<script type="text/javascript">
			$(document).ready(function(){
				$(".tablesorter").tablesorter({ theme : 'blue'});
				$("ul.nav").find('li').eq(1).attr('class','current');
			});
		</script>
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
						<li class="current">
							<a href='<c:url value="/${role}/suppliers" />'> Suppliers </a>
						</li>
						<li>
							<a href='<c:url value="/${role}/purchases" />'> Purchases </a>
						</li>
					</ul>
				</div>
				<div id="rightPan">
					<table class="tablesorter">
						<thead>
							<tr>
								<th>Suplier Id</th>
								<th>Supplier Name</th>
								<th>Contact No.</th>
								<th>Mobile No.</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="supplier">
								<tr>
									<td>${supplier.supplierNum}</td>
									<td>${supplier.supplierName}</td>
									<td>${supplier.firstContactNum}</td>
									<td>${supplier.firstMobileNum}</td>
									<td align="center"><a
										href='<c:url value="/${role}/editSupplier" />?id=${supplier.supplierNum}'>
											Edit </a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
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