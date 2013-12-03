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
		<title>RawMaterials - Al Mehfal Restaurant</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		
		<link rel="stylesheet" href="web/css/common.css" type="text/css" />
		<script src="web/js/jquery.min.js" type="text/javascript"></script>
		
		<script type="text/javascript">
			$(document).ready(function(){
				$("ul.nav").find('li').eq(1).attr('class','current');
			});
		</script>
		
		<c:choose>
			<c:when test="${mode eq 'save'}">
				<link href="web/css/jquery.validation.css" rel="stylesheet" type="text/css" />
				<script src="web/js/jquery.validation.js" type="text/javascript"></script>
				<script src="web/js/jquery.validation-en.js" type="text/javascript"></script>
		
				<style type="text/css">
					input[type="text"] {
						width: 100%;
						font-family: "Arial";
						font-size: 12px;
						height: 19px;
						line-height: 18px;
						color: black;
						background-color: white;
						border: 2px inset #cccccc;
					}
					input[type="text"].uneditable {
						width: 100%;
						height: 19px;
						line-height: 18px;
						background-color: #aaa;
						color: black;
						border: 2px inset #cccccc;
					}
					table {
						border-collapse: collapse;
						margin-left: 30px;
					}
					table tr th {
						border: 1px solid #fff;
						background: #629cd7;
						color: white;
						padding: 5px;
						text-align: center;
						font-size: 13px;
						line-height: 19px;
						font-weight: bold;
					}
					table tr td {
						padding-left: 8px;
						padding-right: 8px;
						padding-top: 4px;
						padding-bottom: 4px;
						vertical-align: middle;
						border: 1px solid #aaa;
					}
					table tr td.noBorder {
						border: none;
					}
					table tr td img {
						cursor: pointer;
					}
				</style>
				
				<script type="text/javascript">
					$(document).ready(function() {
						$(document).on("keyup","table tr:eq(-2) td input",function(event) {
							var index = $("table tr").length-3;
							$('<tr>' +
									'<td> <input type="text" name="materials['+index+'].id" class="validate[required]" /> </td>' +
									'<td> <input type="text" name="materials['+index+'].desc" class="validate[required]" /> </td>' +
									'<td> <input type="text" name="materials['+index+'].uom" class="validate[required]" /> </td>' +
									'<td> <img src="web/images/delete.png" width="18px" height="18px" /> </td>' +
							'</tr>').insertAfter($("table tr:eq(-2)"));
						});
						
						$("#addRow").click(function(event) {
							var index = $("table tr").length-3;
							$('<tr>' +
									'<td> <input type="text" name="materials['+index+'].id" class="validate[required]" /> </td>' +
									'<td> <input type="text" name="materials['+index+'].desc" class="validate[required]" /> </td>' +
									'<td> <input type="text" name="materials['+index+'].uom" class="validate[required]" /> </td>' +
									'<td> <img src="web/images/delete.png" width="18px" height="18px" /> </td>' +
							'</tr>').insertAfter($("table tr:eq(-2)"));
						});
						
						$(document).on("click", "table tbody tr td img", function(event) {
							var rowIndex = $('table tr').length - 4;
							if(rowIndex <= 0) {
								alert("Must contain atleast one raw material details");
							}
							else {
								var removeConfirm = confirm("Are you sure do you want to remove?");
								if(removeConfirm == true) {
									var row = $(this).parent().parent();
									row.remove();
								}
							}
						});
						
						$("#rawMaterials").validationEngine('attach', {
							onValidationComplete: function(form, status) {
								if(status == true) {
									if($('table tr').length <= 3) {
										alert("There should be atleast one item to order");
										return false;
									}
									var count = $('table tr').length();
									$('table tr').each(function(index) {
										if(index > 1 && index < (count-2)) {
											var one = $(this).find("td").eq(0).find('input').eq(0);
											var newName = one.attr('name').replace(/\[[0-9]+\]/i, '[' + (index-2) + ']');
											one.attr('name', newName);
		
											var two = $(this).find("td").eq(1).find('input').eq(0);
											newName = two.attr('name').replace(/\[[0-9]+\]/i, '[' + (index-2) + ']');
											two.attr('name', newName);
		
											var three = $(this).find("td").eq(2).find('input').eq(0);
											newName = three.attr('name').replace(/\[[0-9]+\]/i, '[' + (index-2) + ']');
											three.attr('name', newName);
										}
									});
									return true;
								}
								return false;
							}
						});
					});
				</script>
			</c:when>
			<c:otherwise>
				<link href="web/css/theme.blue.css" rel="stylesheet" type="text/css" />
				<script src="web/js/jquery.tablesorter.js" type="text/javascript"></script>
				<link href="web/css/jquery.ui.css" rel="stylesheet" type="text/css" />
				<link href="web/css/jquery.ui.theme.css" rel="stylesheet" type="text/css" />
				
				<script src="web/js/jquery.ui.js" type="text/javascript"></script>
				<script type="text/javascript">
					$(document).ready(function () {
						$("table").tablesorter({ theme : 'blue'});
					});
				</script>
				
				<style type="text/css">
					.tablesorter tbody tr td {
						font-size: 13px;
					}
					
					.tablesorter thead tr th {
						font-size: 14px;
					}
				</style>
			</c:otherwise>
		</c:choose>
	</head>

	<body>
		<div id="wrapper">
			<div id="header">
				<div id="header_info">
					<h2>Al Mehfal Restaurant</h2>
					<jsp:include page="menu.jsp" />
				</div>
			</div>
	
			<div class="content_2columns">
				<div id="leftPan">
					<ul style="display: block;" class="nav1">
						<li class="current">
							<a href='<c:url value="/${role}/rawMaterials" />'> Raw Materials </a>
						</li>
						<li>
							<a href='<c:url value="/${role}/suppliers" />'> Suppliers </a>
						</li>
						<li>
							<a href='<c:url value="/${role}/purchases" />'> Purchases </a>
						</li>
					</ul>
				</div>
				<div id="rightPan">
					<c:choose>
						<c:when test="${mode eq 'save'}">
							<h2>Raw Materials Definition</h2>
							<br />
							<form method="post" name="rawMaterials" id="rawMaterials"
								action='<c:url value="/${role}/saveRawMaterials" />'>
								<table>
									<tr>
										<td colspan="4" align="right" class="noBorder"><a id="addRow"
											href="javascript:void(0)"> Add Row </a> &nbsp; &nbsp; <a
											href='<c:url value="/${role}/viewRawMaterials" />'> View Raw
												Materials </a></td>
									</tr>
									<tr>
										<th align="center">&nbsp;&nbsp; Raw Material ID &nbsp;&nbsp;
										</th>
										<th align="center">&nbsp;&nbsp; Raw Material Description
											&nbsp;&nbsp;</th>
										<th align="center">&nbsp;&nbsp; Raw Material Uom &nbsp;&nbsp;
										</th>
										<th></th>
									</tr>
									<tr>
										<td><input type="text" name="materials[0].id"
											class="validate[required,minSize[2],maxSize[20]]" /></td>
										<td><input type="text" name="materials[0].desc"
											class="validate[required,minSize[2],maxSize[50]]" /></td>
										<td><input type="text" name="materials[0].uom"
											class="validate[required,minSize[2],maxSize[10]]" /></td>
										<td><img src="web/images/delete.png" width="18px"
											height="18px" /></td>
									</tr>
									<tr>
										<td colspan="4" align="center" class="noBorder"><br /> <input
											type="submit" value=" Submit " class="btn" /></td>
									</tr>
								</table>
							</form>
						</c:when>
						<c:otherwise>
							<h2>Raw Materials List</h2>
							<br />
							<table class="tablesorter" style="margin-left:40px;width:auto;">
								<thead>
									<tr>
										<th>Raw Material ID</th>
										<th>Raw Material Description</th>
										<th>Raw Material Uom</th>
										<th></th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list}" var="rawMaterial">
										<tr>
											<td>${rawMaterial.id}</td>
											<td>${rawMaterial.desc}</td>
											<td>${rawMaterial.uom}</td>
											<td><div class="btn" id="${rawMaterial.sno}">Edit</div></td>
										</tr>
									</c:forEach>
									<c:if test="${empty list}">
										<tr>
											<td colspan="3" align="center">No Raw Materials</td>
										</tr>
									</c:if>
								</tbody>
							</table>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
	
			<div id="footer">
				<div id="footer_info">
					<p class="copyright">&copy; 2013, Al Mehfal Restaurant, All
						Rights Reserved</p>
				</div>
			</div>
		</div>
		
		<c:if test="${mode eq 'view'}">
			<div id="part1" title="Select billing method">
				<form method="post" action='<c:url value="/${role}/editRawMaterial" />' name="editRawMaterial" id="editForm">
					<table border="0">
						<tr>
							<td align="right"> Raw Material ID : </td>
							<td> <input type="hidden" name="sno" id="sno"/>
								<input type="text" name="id" id="name" /> </td>
						</tr>
						<tr>
							<td align="right"> Raw Material Desc : </td>
							<td> <input type="text" name="desc" id="desc" /> </td>
						</tr>
						<tr>
							<td align="right"> Raw Material Uom : </td>
							<td> <input type="text" name="uom" id="uom" /> </td>
						</tr>
						<tr>
							<td colspan="2" align="right">
								<input type="submit" value=" Update " />
							</td>
						</tr>
					</table>
				</form>
			</div>
			
			<script type="text/javascript">
				$(document).ready(function () {
					$("#part1").dialog({
						autoOpen: false,
						resizable: false,
						width: 400,
						modal: true
					});
					
					$(document).on("click","div.btn",function(){
						var row1 = $(this).parent().parent();
						$("#part1 #sno").val($(this).attr('id'));
						$("#part1 #name").val(row1.find('td').eq(0).html());
						$("#part1 #desc").val(row1.find('td').eq(1).html());
						$("#part1 #uom").val(row1.find('td').eq(2).html());
						$("#part1").dialog("open");
					});
				});
			</script>
		</c:if>
	</body>
</html>