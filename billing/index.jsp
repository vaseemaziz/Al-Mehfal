<%@ page language="java" %>
<%@ page import="java.sql.*" %>
<%@ page isThreadSafe="true" %>

<%
	String username = (String)session.getAttribute("user");
	if(username!=null)
		response.sendRedirect("home.jsp");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
	<head>
		<title> Login Page </title>
		<link href="css/style.css" rel="stylesheet" type="text/css" />
		<link href="css/login.css" rel="stylesheet" type="text/css" />

		<script type="text/javascript" src="js/jquery.js"></script>

		<script type="text/javascript">
			$(document).ready(function() {
				$("#login_form").submit(function() {
					var uname = $('.user').val();
					var pass = $('.pwd').val();

					if( uname.length==0 ) {
						alert("Enter a valid username");
						$('.user').focus();
						return false;
					}

					if( pass.length==0 ) {
						alert("Enter a valid password");
						$('.pwd').focus();
						return false;
					}

					$(".loginMsg").css({color:'#00a2e8'}).text('Validating Your Login....').fadeIn(1000);

					this.timer = setTimeout(function() {
						$.ajax({
							url: 'validate.jsp',
							data: 'user=' + $('.user').val() + '&pwd=' + $('.pwd').val() + '&type=' + $('.type').val(),
							type: 'post',

							success: function(msg) {

								if(msg.indexOf('<error>') == -1) {
									$(".loginMsg").css({color:'#00a2e8'}).text('Login Verified, Logging in.....').fadeTo(900,1,function() {
										window.location.href='home.jsp';
									});
								}
								else {
									var errorMsg = "" + msg.substring(msg.indexOf('<error>')+7, msg.indexOf('</error>'));

									$(".loginMsg").fadeTo(200,0.1,function() {
										$(this).css({color:'#ed2836'});
										$(this).text(errorMsg).fadeTo(900,1);
									});
								}
							}
						});
					}, 200);

					return false;
				});
			});
		</script>
	</head>

	<body>
		<div class="header">
			<div class="container">
				<h1> AL MEHFAL RESTAURANT </h1>
			</div>
		</div>
		<div class="content">
			<div class="container">
				<div class="leftDiv">
					<div class="block">
						<div class="image">
							<img src="images/icon.png" />
						</div>
						<div class="text">
							<span class="title"> AL MEHFAL RESTAURANT </span> <br />
							<span class="subtitle"> Best Hyderabadi Restaurant in Town </span>
						</div>
					</div>
					<div class="space"></div>
					<div class="block">
						<div class="image">
							<img src="images/clock.png" />
						</div>
						<div class="text">
							<span class="title"> Timings </span> <br />
							<span class="subtitle"> 12.00 noon to Midnight </span>
						</div>
					</div>
					<div class="space"></div>
					<div class="block">
						<div class="image">
							<img src="images/call.png" />
						</div>
						<div class="text">
							<span class="title"> Free home delivery </span> <br />
							<span class="subtitle"> Call 07-2223700 </span>
						</div>
					</div>
				</div>
				<div class="rightDiv">
					<div class="loginPanel">
						<form id="login_form" method="post" action="">
							<div class="loginTitle">
								Portal Log In
							</div>

							<div class="loginId">
								<div> <strong> Type </strong> </div>
								<div>
									<select name="type" class="type">
										<option> Admin </option>
										<option> User </option>
										<option> Waiter </option>
									</select>
								</div>
							</div>

							<div class="loginId">
								<div> <strong> Login ID </strong> </div>
								<div> <input type="text" name="user" class="user" /> </div>
							</div>

							<div class="loginPwd">
								<div> <strong> Password </strong> </div>
								<div> <input type="password" name="pwd" class="pwd" /> </div>
							</div>

							<div class="loginMsg">
							</div>

							<div class="loginSubmit">
								<input type="image" src="images/login.gif" />
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>