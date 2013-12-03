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
		<title>Employee Payrolls - Al Mehfal Restaurant</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

		<link rel="stylesheet" href="web/css/common.css" type="text/css" />
		<link href="web/css/theme.blue.css" rel="stylesheet" type="text/css" />
		
		<script type="text/javascript" src="web/js/jquery.min.js"></script>
		<script src="web/js/jquery.tablesorter.js" type="text/javascript"></script>
		
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
				<form method="post" action='<c:url value="/${role}/findPayrolls" />' name="payroll" id="payroll">
					Month: <select name="month">
						<option>Jan</option>
						<option>Feb</option>
						<option>Mar</option>
						<option>Apr</option>
						<option>May</option>
						<option>June</option>
						<option>July</option>
						<option>Aug</option>
						<option>Sept</option>
						<option>Oct</option>
						<option>Nov</option>
						<option>Dec</option>
					</select> &nbsp; &nbsp; &nbsp; Year :
					<input type="text" name="year" /> &nbsp; &nbsp;
					<input type="submit" value="Produce Payroll" />
				</form>
				<table>
					<thead><tr>
						<th>Name</th>
						<th>Salary</th>
						<th>Gross Pay</th>
						<th>Loan Deduction</th>
						<th>Other Deduction</th>
						<th>Net Salary</th>
						<th>Created By</th>
						<th>Created On</th>
					</tr></thead>
					<tbody> <c:forEach items="${payrolls}" var="payroll">
						<tr>
							<td> ${payroll.name} </td>
							<td> ${payroll.basicSalary} </td>
							<td> ${payroll.grossPay} </td>
							<td> ${payroll.loanDeduction} </td>
							<td> ${payroll.otherDeduction} </td>
							<td> ${payroll.netSalary} </td>
							<td> ${payroll.createdBy} </td>
							<td> ${payroll.createdOn} </td>
						</tr>
					</c:forEach> </tbody>
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