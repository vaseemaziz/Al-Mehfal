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
		<link href="web/css/jquery.validation.css" rel="stylesheet" type="text/css" />
		
		<style type="text/css">
			input[type="text"] {
				width: 220px;
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
			table {
				margin-top: 20px;
				margin-left: 70px;
				border: none;
			}
			table tr td {
				font-size: 13px;
			}
		</style>
		
		<script type="text/javascript" src="web/js/jquery.min.js"></script>
		<script src="web/js/jquery.validation.js" type="text/javascript"></script>
		<script src="web/js/jquery.validation-en.js" type="text/javascript"></script>
		
		<script type="text/javascript">
			$(document).ready(function() {
				$("#supplier").validationEngine('attach',{showOneMessage: true});
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
						<li>
							<a href='<c:url value="/${role}/expenses" />'> Expenses </a>
						</li>
					</ul>
				</div>
				<div id="rightPan">
					<h1 style="margin-left: 30px;">Supplier Registration</h1>
					<form method="post" name="supplier" id="supplier" action='<c:url value="/${role}/${url}" />'>
						<table>
							<tr>
								<td colspan="2" align="right">
									<a href='<c:url value="/${role}/listSuppliers" />'> Show Suppliers </a> <br />
								</td>
							</tr>
							<tr>
								<td align="right">Supplier ID&nbsp; : &nbsp;</td>
								<td><input class="uneditable" type="text"
									value="${supplier.supplierNum}" name="supplierNum" readonly /></td>
							</tr>
							<tr>
								<td align="right">Supplier Name&nbsp; : &nbsp;</td>
								<td><input type="text" name="supplierName"
									class="validate[required,minSize[2],maxSize[50]]"
									value="${supplier.supplierName}" /></td>
							</tr>
							<tr>
								<td align="right">Created By&nbsp; : &nbsp;</td>
								<td><input type="text" name="createdBy" value="${supplier.createdBy}"
									class="uneditable" readonly /></td>
							</tr>
							<tr>
								<td align="right">Created On&nbsp; : &nbsp;</td>
								<td><input type="text" name="createdOn" value="${supplier.createdOn}"
									class="uneditable" readonly /></td>
							</tr>
							<tr>
								<td align="right">Last Updated By&nbsp; : &nbsp;</td>
								<td><input type="text" name="lastUpdatedBy" value="${supplier.lastUpdatedBy}"
									class="uneditable" readonly />
								</td>
							</tr>
							<tr>
								<td align="right">Last Updated On&nbsp; : &nbsp;</td>
								<td><input type="text" name="lastUpdatedOn" value="${supplier.lastUpdatedOn}"
										class="uneditable" readonly />
								</td>
							</tr>
							<tr>
								<td><br />
									<h2>Contact</h2> <br /></td>
							</tr>
							<tr>
								<td align="right">First Contact Name&nbsp; : &nbsp;</td>
								<td><input type="text" name="firstContactName"
									value="${supplier.firstContactName}" />
								</td>
							</tr>
							<tr>
								<td align="right">First Contact Num&nbsp; : &nbsp;</td>
								<td><input type="text" name="firstContactNum"
									value="${supplier.firstContactNum}" />
								</td>
							</tr>
							<tr>
								<td align="right">First Mobile Num&nbsp; : &nbsp;</td>
								<td><input type="text" name="firstMobileNum"
									value="${supplier.firstMobileNum}" />
								</td>
							</tr>
							<tr>
								<td align="right">Second Contact Name&nbsp; : &nbsp;</td>
								<td><input type="text" name="secondContactName"
									value="${supplier.secondContactName}" /></td>
							</tr>
							<tr>
								<td align="right">Second Contact Num&nbsp; : &nbsp;</td>
								<td><input type="text" name="secondContactNum"
									value="${supplier.secondContactNum}" /></td>
							</tr>
							<tr>
								<td align="right">Second Mobile Num&nbsp; : &nbsp;</td>
								<td><input type="text" name="secondMobileNum"
									value="${supplier.secondMobileNum}" /></td>
							</tr>
							<tr>
								<td><br />
									<h2>Address</h2> <br /></td>
							</tr>
							<tr>
								<td align="right">Address Line 1&nbsp; : &nbsp;</td>
								<td><input type="text" name="addressLine1"
									value="${supplier.addressLine1}" /></td>
							</tr>
							<tr>
								<td align="right">Address Line 2&nbsp; : &nbsp;</td>
								<td><input type="text" name="addressLine2"
									value="${supplier.addressLine2}" /></td>
							</tr>
							<tr>
								<td align="right">Address Line 3&nbsp; : &nbsp;</td>
								<td><input type="text" name="addressLine3"
									value="${supplier.addressLine3}" /></td>
							</tr>
						</table>
						<input type="submit" class=".btn" style="margin-left: 320px;" value=" Submit " />
					</form>
				</div>
			</div>
			
			<div id="footer">
				<div id="footer_info">
					<p class="copyright">&copy; 2013, Al Mehfal Restaurant, All Rights Reserved</p>
				</div>
			</div>
		</div>
	</body>
</html>