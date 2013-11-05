<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<sec:authorize ifAnyGranted="ROLE_MANAGER">
	<c:set var="role" value="manager" ></c:set>
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
	</head>

	<body>
		<div id="wrapper" style="background:#360000;">
			<div id="header">
				<div id="header_info">
					<h2>Al Mehfal Restaurant</h2>
					<jsp:include page="menu.jsp" />
				</div>
			</div>

			<div class="content_2columns">
				<form method="post" name="materials" id="materials" action='<c:url value="/${role}/saveRawMaterials" />'>
					<table>
						<tr>
							<td align="center" colspan="3">
								<h2> Raw Materials Defination </h2>
							</td>
						</tr>
						<tr>
							<td align="center"> ID </td>
							<td align="center"> Description </td>
							<td align="center"> Unit of Measure </td>
						</tr>
						<tr>
							<td>
								<input type="text" name="materials[0].id" />
							</td>
							<td>
								<input type="text" name="materials[0].desc" />
							</td>
							<td>
								<input type="text" name="materials[0].uom" />
							</td>
						</tr>
						<tr>
							<td colspan="3" align="center">
								<input type="submit" />
							</td>
						</tr>
					</table>
				</form>
			</div>

			<div id="footer">
				<div id="footer_info">
					<p class="copyright">&copy; 2013, Al Mehfal Restaurant, All Rights Reserved</p>
				</div>
			</div>
		</div>
		
		<script type="text/javascript">
			$(document).ready(function() {
				$(document).on("keyup","table tr:eq(-2) td input",function(event) {
					var index = $("table tr").length-3;
					$('<tr>' +
							'<td> <input type="text" name="materials['+index+'].id" /> </td>' +
							'<td> <input type="text" name="materials['+index+'].desc" /> </td>' +
							'<td> <input type="text" name="materials['+index+'].uom" /> </td>' +
					'</tr>').insertAfter($("table tr:eq(-2)"));
				});
			});
		</script>
	</body>
</html>