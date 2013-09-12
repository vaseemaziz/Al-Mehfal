<%@ page language="java" %>
<%@ page import="java.sql.*" %>
<%@ page isThreadSafe="true" %>

<%
	String username = (String)session.getAttribute("user");
	if(username==null)
		response.sendRedirect("index.jsp");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
	<head>
		<title> Home Page </title>
		<link href="css/style.css" rel="stylesheet" type="text/css" />
		<link href="css/home.css" rel="stylesheet" type="text/css" />

		<script type="text/javascript" src="js/jquery.js"></script>
	</head>

	<body>
		<div class="header">
			<div class="container">
				<h1> AL MEHFAL RESTAURANT </h1>
			</div>
		</div>
		<div class="content">
			<div class="container">
				<h3> You are logged in as <%= username %> (type: <%= session.getAttribute("type") %>) </h3>
				<a href="logout.jsp"> Logout </a>
			</div>
		</div>
	</body>
</html>