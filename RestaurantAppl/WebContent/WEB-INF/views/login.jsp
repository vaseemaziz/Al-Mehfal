<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title> Login Page </title>
		<link href="<c:url value="web/css/style.css" />" rel="stylesheet" type="text/css" />
		<link href="web/css/login.css" rel="stylesheet" type="text/css" />

		<script type="text/javascript" src="web/js/jquery.js"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				$("form").submit(function() {
					if($('#username').val().length == 0) {
						alert("Enter username");
						$('#username').focus();
						return false;
					}
					
					if($('#password').val().length == 0) {
						alert("Enter password");
						$('#password').focus();
						return false;
					}

					return true;
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
							<img src="web/images/icon.png" />
						</div>
						<div class="text">
							<span class="title"> AL MEHFAL RESTAURANT </span> <br />
							<span class="subtitle"> Best Hyderabadi Restaurant in Town </span>
						</div>
					</div>
					<div class="space"></div>
					
					<div class="block">
						<div class="image">
							<img src="web/images/clock.png" />
						</div>
						<div class="text">
							<span class="title"> Timings </span> <br />
							<span class="subtitle"> 12.00 noon to Midnight </span>
						</div>
					</div>
					<div class="space"></div>
					
					<div class="block">
						<div class="image">
							<img src="web/images/call.png" />
						</div>
						<div class="text">
							<span class="title"> Free home delivery </span> <br />
							<span class="subtitle"> Call 07-2223700 </span>
						</div>
					</div>
				</div>
				
				<div class="rightDiv">
					<div class="loginPanel">
					
						<form id="login_form" method="post" action="<c:url value="/validate" />">
							<div class="loginTitle">
								Portal Log In
							</div>

							<div class="loginId">
								<div> <strong> Login ID </strong> </div>
								<div> <input type="text" name="username" id="username" /> </div>
							</div>

							<div class="loginPwd">
								<div> <strong> Password </strong> </div>
								<div> <input type="password" name="password" id="password" /> </div>
							</div>

							<div class="loginMsg">
								<c:if test="${not empty param.error}">
									<font color="#ed2836">
										Login error: ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
									</font>
								</c:if>
							</div>

							<div class="loginSubmit">
								<input type="image" src="web/images/login.gif" />
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		
	</body>
</html>