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
		<title>HomePage - Al Mehfal Restaurant</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		
		<link rel="stylesheet" href="web/css/common.css" type="text/css" />
		<link href="web/css/jquery.ui.css" rel="stylesheet" type="text/css" />
		
		<script src="web/js/jquery.min.js" type="text/javascript"></script>
		<script src="web/js/jquery.ui.js" type="text/javascript"></script>

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
				
				$("ul.nav").find('li').eq(2).attr('class','current');
				
				$("#date2").datepicker({
					dateFormat: 'yy-mm-dd',
					changeMonth: true,
					changeYear: true,
					showWeek: true,
					firstDay: 1
				});
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
				<h3> Date wise Reports </h3> <br />
				<form method="post" action='<c:url value="/${role}/dateWiseReport" />'>
					From Date : <input type="text" value="${pDate}" name="fDate"
						id="date1" style="width: 100px" readonly />
					&nbsp; &nbsp; To Date : <input type="text" value="${toDate}" name="tDate"
						id="date2" style="width: 100px" readonly />
					&nbsp; &nbsp; <input type="submit" value=" Get Reports " />
				</form> <br /> <br />
				<h3> Month Wise Reports </h3> <br />
				<form method="post" action='<c:url value="/${role}/monthWiseReport" />'>
					From Month : <select name="fMonth">
						<option value="01">Jan</option>
						<option value="02">Feb</option>
						<option value="03">Mar</option>
						<option value="04">Apr</option>
						<option value="05">May</option>
						<option value="06">June</option>
						<option value="07">July</option>
						<option value="08">Aug</option>
						<option value="09">Sept</option>
						<option value="10">Oct</option>
						<option value="11">Nov</option>
						<option value="12">Dec</option>
					</select> &nbsp; &nbsp;
					To Month : <select name="tMonth">
						<option value="01">Jan</option>
						<option value="02">Feb</option>
						<option value="03">Mar</option>
						<option value="04">Apr</option>
						<option value="05">May</option>
						<option value="06">June</option>
						<option value="07">July</option>
						<option value="08">Aug</option>
						<option value="09">Sept</option>
						<option value="10">Oct</option>
						<option value="11">Nov</option>
						<option value="12">Dec</option>
					</select> &nbsp; &nbsp; Year: &nbsp; <input type="text" style="width:100px;" name="year" />
					&nbsp; &nbsp; <input type="submit" value=" Get Reports " />
				</form>
				<br /> <br />
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