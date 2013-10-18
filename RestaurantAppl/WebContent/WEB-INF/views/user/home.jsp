<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
	<head>
		<title> Home Page </title>
		
		<link href="web/css/common.css" rel="stylesheet" type="text/css" />
		<link href="web/css/home.css" rel="stylesheet" type="text/css" />
		
		<style type="text/css">
			table {
				margin-left: 30px;
			}
			span {
				color: #00a2e8;
			}
			td {
				font-size: 22px;
				font-weight: bold;
			}
		</style>
	</head>

	<body>
		<div class="top">
			<div class="container">
				<div class="leftDiv">
					<a href="<c:url value="/user/home" />">
						AL MEHFAL RESTAURANT
					</a>
				</div>
				<div class="rightDiv">
					<a href="<c:url value="/logout" />">Log Out</a>
				</div>
			</div>
		</div>

		<div class="content">
			<div class="container">
				<div class="block">
					<div class="left-block">
						Welcome! <b> ${user.user} </b>
					</div>
					<div class="right-block">
						<a href="javascript:void(0);"> <b>Home</b> </a> &nbsp;&nbsp;
						<a href="<c:url value="/user/sales" />"> Sales </a>
					</div>
				</div>
				<div class="block">
					<hr /> <br />
					<h2> Personal Info </h2>
					<table>
						<tr>
							<td align="right"> Name: &nbsp;</td>
							<td> <span>${user.name}</span> </td>
						</tr>
						<tr>
							<td align="right"> ID: &nbsp;</td>
							<td> <span>${user.user}</span> </td>
						</tr>
						<tr>
							<td align="right"> Role: &nbsp;</td>
							<td> <span>Waiter</span> </td>
						</tr>
						<tr>
							<td align="right"> Email: &nbsp;</td>
							<td> <span>${user.email}</span> </td>
						</tr>
						<tr>
							<td align="right"> Mobile: &nbsp;</td>
							<td> <span>${user.mobile}</span> </td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>
	