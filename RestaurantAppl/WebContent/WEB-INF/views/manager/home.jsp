<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="utf-8" />

		<title> Home Page </title>
		<link href="web/css/style.css" rel="stylesheet" type="text/css" />
		<link href="web/css/home.css" rel="stylesheet" type="text/css" />
		
		<style type="text/css">
			.module {
				float: left;
				position: relative;
				width: 150px;
				height: 200px;
				margin-left: 25px;
				margin-right: 25px;
				text-align: center;
			}
			
			.module a img {
				width: 150px;
				height: 150px;
				border: none;
				outline: none;
			}
			
			.module a, .module a:active {
				text-decoration: none;
				color: #1f9dd1;
				font-size: 20px;
			}
		</style>
	</head>

	<body>
		<div class="top">
			<div class="container">
				<div class="leftDiv">
					AL MEHFAL RESTAURANT
				</div>
				<div class="rightDiv">
					<a href="<c:url value="/logout" />">Log Out</a>
				</div>
			</div>
		</div>

		<div class="content">
			<div class="container">
				<div class="block">
					<br />Welcome! ${username} &nbsp;&nbsp; (Manager)<br /><br />
					<div class="module">
						<a href="javascript:void(0);">
							<img src="web/images/sales.png" width="150px" height="150px" />
							<br /> <span>Sales</span>
						</a>
					</div>
					<div class="module">
						<a href="javascript:void(0);">
							<img src="web/images/menu.png" width="150px" height="150px" />
							<br /> <span>Menu</span>
						</a>
					</div>
					<div class="module">
						<a href="javascript:void(0);">
							<img src="web/images/expenses_disabled.png" width="150px" height="150px" />
							<br /> <span>Expenses</span>
						</a>
					</div>
					<div class="module">
						<a href="javascript:void(0);">
							<img src="web/images/reports_disabled.png" width="150px" height="150px" />
							<br /> <span>Reports</span>
						</a>
					</div>
					<div class="module">
						<a href="javascript:void(0);">
							<img src="web/images/suppliers_disabled.png" width="150px" height="150px" />
							<br /> <span>Suppliers</span>
						</a>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>