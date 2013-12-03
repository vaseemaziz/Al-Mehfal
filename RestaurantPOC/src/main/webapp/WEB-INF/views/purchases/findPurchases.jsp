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
		<title>Find Purchases - Al Mehfal Restaurant</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		
		<link rel="stylesheet" href="web/css/common.css" type="text/css" />
		<link href="web/css/jquery.ui.css" rel="stylesheet" type="text/css" />
		<link href="web/css/theme.blue.css" rel="stylesheet" type="text/css" />
		
		<script src="web/js/jquery.min.js" type="text/javascript"></script>
		<script src="web/js/jquery.ui.js" type="text/javascript"></script>
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
			$(document).ready(function(){
				$("#date1").datepicker({
					dateFormat: 'yy-mm-dd',
					changeMonth: true,
					changeYear: true,
					showWeek: true,
					firstDay: 1
				});
				
				$("ul.nav").find('li').eq(1).attr('class','current');
				
				$("#date2").datepicker({
					dateFormat: 'yy-mm-dd',
					changeMonth: true,
					changeYear: true,
					showWeek: true,
					firstDay: 1
				});
				
				$("table").tablesorter({ theme : 'blue'});
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
						<li>
							<a href='<c:url value="/${role}/suppliers" />'> Suppliers </a>
						</li>
						<li class="current">
							<a href='<c:url value="/${role}/purchases" />'> Purchases </a>
						</li>
					</ul>
				</div>
				<div id="rightPan">
					<form method="post" action='<c:url value="/${role}/getPurchases" />'>
						Purchase Date : <input type="text" value="${pDate}" name="pDate"
							id="date1" style="width: 100px" readonly />
						&nbsp; &nbsp; To Date : <input type="text" value="${toDate}" name="toDate"
							id="date2" style="width: 100px" readonly />
						&nbsp; &nbsp; Supplier No : <input type="text" value="${sNum}"
							name="sNum" style="width: 100px" readonly />
						&nbsp; &nbsp; <input type="submit" value=" Find " />
					</form>
					<br /> <br />
		
					<c:if test="${not empty list}">
						<table class="tablesorter">
							<thead><tr>
								<th>Grn No</th>
								<th>Grn Date</th>
								<th>Supplier Name</th>
								<th>Invoice Num</th>
								<th>Invoice Date</th>
								<th>Invoice Amount</th>
								<th>Created On</th>
								<th>Paid Amount</th>
							</tr></thead>
							<tbody><c:forEach items="${list}" var="data">
								<tr>
									<td>${data.grnNo}</td>
									<td>${data.purchaseDate}</td>
									<td>${data.supplierName}</td>
									<td>${data.invoiceNum}</td>
									<td>${data.invoiceDate}</td>
									<td>${data.invoiceAmount}</td>
									<td>${data.createdOn}</td>
									<td>${data.paidAmount}</td>
								</tr>
							</c:forEach></tbody>
						</table>
					</c:if>
					<c:if test="${empty list}">
						No Purchases Found
					</c:if>
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