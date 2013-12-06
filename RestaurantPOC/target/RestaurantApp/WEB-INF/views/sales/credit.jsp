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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
		<title>Credit Details - Al Mehfal Restaurant</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

		<link rel="stylesheet" href="web/css/common.css" type="text/css" media="screen" />
		<link href="web/css/jquery.ui.css" rel="stylesheet" type="text/css" />
		<link href="web/css/jquery.ui.theme.css" rel="stylesheet" type="text/css" />
		<link href="web/css/theme.blue.css" rel="stylesheet" type="text/css" />
		
		<script type="text/javascript" src="web/js/jquery.min.js"></script>
		<script src="web/js/jquery.ui.js" type="text/javascript"></script>
		<script src="web/js/jquery.tablesorter.js" type="text/javascript"></script>
		
		<style type="text/css">
			.tablesorter tbody tr td {
				font-size: 13px;
				vertical-align: middle;
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
					<jsp:include page="../menu.jsp">
						<jsp:param value="2" name="current" />
					</jsp:include>
				</div>
			</div>
			<div class="content_2columns">
				<table class="tablesorter">
					<thead><tr>
						<th> Name </th>
						<th> Mobile </th>
						<th> Address </th>
						<th> Due </th>
						<th></th>
						<th></th>
					</tr></thead>
					<tbody>
						<c:forEach items="${list}" var="array">
							<tr>
								<c:forEach items="${array}" var="item">
									<td> ${item} </td>
								</c:forEach>
								<td> <div class="btn" id="pay"> Pay </div> </td>
								<td> <a class="btn" target="_blank" href='<c:url value="/${role}/printCreditBill" />?creditId=${array[1]}'>Bill Receipt</a> </td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

			<div id="footer">
				<div id="footer_info">
					<p class="copyright">&copy; 2013, Al Mehfal Restaurant, All Rights Reserved</p>
				</div>
			</div>
		</div>
		
		<div id="part1" title="Pay Due Amount">
			<form id="payForm" name="payForm" method="post" action='<c:url value="/${role}/payBill" />'>
				<table border="0">
					<tr>
						<td align="right"> Customer Name : </td>
						<td id="custName"></td>
					</tr>
					<tr>
						<td align="right"> Customer Mobile : </td>
						<td id="custMobile"></td>
					</tr>
					<tr>
						<td align="right"> Due : </td>
						<td id="dueAmount"></td>
					</tr>
					<tr>
						<td align="right"> Paid Amount : </td>
						<td> <input type="hidden" name="mobile" id="mobile" />
							<input type="text" name="paidAmount" id="paidAmount" /> </td>
					</tr>
					<tr>
						<td colspan="2" align="right">
							<input type="submit" value=" Pay " />
						</td>
					</tr>
				</table>
			</form>
		</div>
		
		<script type="text/javascript">
			$(document).ready(function () {
				$("table").tablesorter({ theme : 'blue'});
				
				$("#part1").dialog({
					autoOpen: false,
					resizable: false,
					width: 400,
					modal: true
				});
				
				$(document).on("click", "div#pay", function() {
					var row1 = $(this).parent().parent();
					$("#custName").html(row1.find('td').eq(0).html());
					$("#custMobile").html(row1.find('td').eq(1).html());
					$("#mobile").val(row1.find('td').eq(1).html());
					$("#dueAmount").html(row1.find('td').eq(3).html());
					$("#part1").dialog("open");
				});
			});
		</script>
	</body>
</html>