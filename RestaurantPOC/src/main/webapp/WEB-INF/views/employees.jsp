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
		<title>Employees - Al Mehfal Restaurant</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

		<link rel="stylesheet" href="web/css/common.css" type="text/css" media="screen" />
		<link href="web/css/jquery.ui.css" rel="stylesheet" type="text/css" />
		<link href="web/css/jquery.ui.theme.css" rel="stylesheet" type="text/css" />
		<link href="web/css/jquery.validation.css" rel="stylesheet" type="text/css" />
		
		<script type="text/javascript" src="web/js/jquery.min.js"></script>
		<script src="web/js/jquery.ui.js" type="text/javascript"></script>
		<script src="web/js/jquery.validation.js" type="text/javascript"></script>
		<script src="web/js/jquery.validation-en.js" type="text/javascript"></script>
		
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
				$("#orderForm").validationEngine('attach', {
					onValidationComplete: function(form, status) {
						return status;
					}
				});
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
				<h2> Employee Details </h2> <br />
				<form method="post" action='<c:url value="/${role}/${url}" />' name="employee" id="employee">
					<table style="margin-left:30px;">
						<tr>
							<td colspan="4" align="right">
								<a href='<c:url value="/${role}/showEmployees" />'> Show Employees </a> &nbsp; &nbsp;
								<a href='<c:url value="/${role}/payrolls" />'> Employee Payrolls </a>
							</td>
						</tr>
						<tr>
							<td align="right" style="width:200px;"> Reg No. : </td>
							<td> <input type="text" name="regNum" value="${emp.regNum}" readonly /> </td>
							<td align="right" style="width:200px"> Local Contact Number : </td>
							<td> <input type="text" name="localContactNum" class="validate[required,minSize[3],maxSize[20]]" value="${emp.localContactNum}" /> </td>
						</tr>
						<tr>
							<td align="right" style="width:200px;"> Name : </td>
							<td> <input type="text" name="name" class="validate[required,minSize[3],maxSize[50]]" /> </td>
							<td align="right" style="width:200px"> International Contact Number : </td>
							<td> <input type="text" name="internationalContactNum" value="${emp.internationalContactNum}" class="validate[required,minSize[3],maxSize[20]]" /> </td>
						</tr>
						<tr>
							<td align="right" style="width:200px;"> Gender : </td>
							<td> <select name="gender" class="validate[required]">
									<option> Male </option>
									<option> Female </option>
								</select>
							</td>
							<td align="right" style="width:200px;"> Created By : </td>
							<td> <input type="text" name="createdBy" class="validate[required,minSize[3],maxSize[20]]" value="${emp.createdBy}" /> </td>
						</tr>
						<tr>
							<td align="right" style="width:200px;"> Date of Birth : </td>
							<td> <input type="text" name="dateOfBirth" value="${emp.dateOfBirth}" class="validate[required,custom[date]]" /> </td>
							<td align="right" style="width:200px"> Creation Date : </td>
							<td> <input type="text" name="createdOn" value="${emp.createdOn}" class="validate[required,custom[date]]" /> </td>
						</tr>
						<tr>
							<td align="right" style="width:200px;"> Date of Joining : </td>
							<td> <input type="text" name="dateOfJoining" value="${emp.dateOfJoining}" class="validate[required,custom[date]]" /> </td>
							<td align="right" style="width:200px"> Last Updated By : </td>
							<td> <input type="text" name="lastUpdatedBy" value="${emp.lastUpdatedBy}" class="validate[required,minSize[3],maxSize[20]]" /> </td>
						</tr>
						<tr>
							<td align="right" style="width:200px;"> Passport No. : </td>
							<td> <input type="text" name="passportNum" value="${emp.passportNum}" class="validate[required,minSize[3],maxSize[40]]" /> </td>
							<td align="right" style="width:200px"> Last Updated On : </td>
							<td> <input type="text" name="lastUpdatedOn" value="${emp.lastUpdatedOn}" class="validate[required,custom[date]]" /> </td>
						</tr>
						<tr>
							<td align="right" style="width:200px"> Passport Expiry Date : </td>
							<td> <input type="text" name="passportExpiryDate" value="${emp.passportExpiryDate}" class="validate[required,custom[date]]" /> </td>
							<td align="right" style="width:200px;"> Visa No. : </td>
							<td> <input type="text" name="visaNum" value="${emp.visaNum}" class="validate[required,minSize[3],maxSize[40]]" /> </td>
						</tr>
						<tr>
							<td align="right" style="width:200px;"> Health Card Expiry Date 1 : </td>
							<td> <input type="text" name="healthCardExpiryDate" value="${emp.healthCardExpiryDate}" class="validate[required,custom[date]]" /> </td>
							<td align="right" style="width:200px"> Visa Expiry Date : </td>
							<td> <input type="text" name="visaExpiryDate" value="${emp.visaExpiryDate}" class="validate[required,custom[date]]" /> </td>
						</tr>
						<tr>
							<td align="right" style="width:200px;"> Health Card Expiry Date 2 : </td>
							<td> <input type="text" name="healthCardExpiryDate2" value="${emp.healthCardExpiryDate2}" class="validate[required,custom[date]]" /> </td>
							<td colspan="2"></td>
						</tr>
						<tr>
							<td colspan="4"> <br /> <h2> Bank Details </h2> </td>
						</tr>
						<tr>
							<td align="right" style="width:200px;"> Bank Name : </td>
							<td> <input type="text" name="bankName" value="${emp.bankName}" class="validate[required,minSize[3],maxSize[50]]" /> </td>
							<td align="right" style="width:200px;"> Branch Name : </td>
							<td> <input type="text" name="branchName" value="${emp.branchName}" class="validate[required,minSize[3],maxSize[30]]" /> </td>
						</tr>
						<tr>
							<td align="right" style="width:200px;"> Account No. : </td>
							<td> <input type="text" name="accountNum" value="${emp.accountNum}" class="validate[required,minSize[3],maxSize[30]]" /> </td>
							<td align="right" style="width:200px;"> Basic Salary : </td>
							<td> <input type="text" name="basicSalary" value="${emp.basicSalary}" class="validate[required,custom[number]]" /> </td>
						</tr>
						<tr>
							<td colspan="2"> <br /> <h2> Address </h2> </td>
							<td colspan="2"> <br /> <h2> &nbsp; &nbsp; &nbsp; Login Details </h2> </td>
						</tr>
						<tr>
							<td align="right" style="width:200px;"> Address Line 1 : </td>
							<td> <input type="text" name="addressLine1" value="${emp.addressLine1}" class="validate[required,minSize[3],maxSize[80]]" /> </td>
							<td align="right" style="width:200px;"> Username : </td>
							<td> <input type="text" name="username" value="${emp.username}" class="validate[required,minSize[3],maxSize[20]]" /> </td>
						</tr>
						<tr>
							<td align="right" style="width:200px;"> Address Line 2 : </td>
							<td> <input type="text" name="addressLine2" value="${emp.addressLine2}" class="validate[required,minSize[3],maxSize[80]]"  /> </td>
							<td align="right" style="width:200px;"> Password : </td>
							<td> <input type="text" name="password" value="${emp.password}" class="validate[required,minSize[3],maxSize[20]]" /> </td>
						</tr>
						<tr>
							<td align="right" style="width:200px;"> Address Line 3 : </td>
							<td> <input type="text" name="addressLine3" value="${emp.addressLine3}" class="validate[required,minSize[3],maxSize[20]]" /> </td>
							<td align="right" style="width:200px;"> Role : </td>
							<td>
								<select name="role" class="validate[required]">
									<option value="ROLE_USER"> Waiter </option>
									<option value="ROLE_MANAGER"> Manager </option>
									<option value="ROLE_ADMIN"> Admin </option>
								</select>
							</td>
						</tr>
						<tr>
							<td colspan="4" align="center">
								<br /><input type="submit" name="  Submit  " />
							</td>
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
	</body>
</html>