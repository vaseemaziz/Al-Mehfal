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
		<script type="text/javascript" src="web/js/jquery.min.js"></script>
		
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
			input[type="text"].uneditable {
				background-color: #aaa;
				color: black;
				border: 2px inset #cccccc;
			}
		</style>
	</head>

	<body>
		<div id="wrapper">
			<div id="header">
				<div id="header_info">
					<h2>Al Mehfal Restaurant</h2>
					<jsp:include page="menu.jsp"></jsp:include>
				</div>
			</div>

			<div class="content_2columns">
				<form method="post" action='<c:url value="/${role}/savePayroll" />'
										name="payrolls" id="payrolls">
					<b>Payroll Month - Year:</b> &nbsp; &nbsp;
					<input type="text" name="month" value="${month}" style="width:60px;" class="uneditable" readonly /> &nbsp; &nbsp;
					<input type="text" name="year" value="${year}" style="width:60px;" class="uneditable" readonly />
					<table>
						<tr>
							<th>Reg No.</th>
							<th>Name</th>
							<th>Salary</th>
							<th>Gross Pay</th>
							<th>Loan Deduction</th>
							<th>Other Deduction</th>
							<th>Net Salary</th>
							<th>Created By</th>
							<th>Created On</th>
						</tr>
						<c:forEach items="${empList}" var="emp" varStatus="status">
							<tr>
								<td> <input type="text" value="${emp.regNum}" name="payrolls[${status.index}].regNum" class="uneditable" style="width:40px;" readonly /> </td>
								<td> <input type="text" value="${emp.name}" name="payrolls[${status.index}].name" class="uneditable" style="width:140px;" readonly /> </td>
								<td> <input type="text" value="${emp.basicSalary}" name="payrolls[${status.index}].basicSalary" class="uneditable" style="width:100px;" readonly /> </td>
								<td> <input type="text" name="payrolls[${status.index}].grossPay" style="width:100px;" /> </td>
								<td> <input type="text" name="payrolls[${status.index}].loanDeduction" style="width:100px;" /> </td>
								<td> <input type="text" name="payrolls[${status.index}].otherDeduction" style="width:100px;" /> </td>
								<td> <input type="text" name="payrolls[${status.index}].netSalary" style="width:100px;" /> </td>
								<td> <input type="text" class="uneditable" value="${user}" name="payrolls[${status.index}].createdBy" style="width:100px;" readonly /> </td>
								<td> <input type="text" class="uneditable" value="${user}" name="payrolls[${status.index}].createdOn" style="width:100px;" readonly /> </td>
							</tr>
						</c:forEach>
						<tr>
							<td colspan="8" align="center"> <input type="submit" value=" Submit " /> </td>
						</tr>
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
			$(document).ready(function(){
				$("ul.nav").find('li').eq(4).attr('class','current');
			});
		</script>
	</body>
</html>