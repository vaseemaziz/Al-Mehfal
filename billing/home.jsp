<%@ page language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat, java.text.SimpleDateFormat" %>
<%@ page isThreadSafe="true" %>

<%
	String username = (String)session.getAttribute("user");
	if(username==null)
		response.sendRedirect("index.jsp");
%>

<jsp:useBean id="dbConn" class="dbbean.DatabaseBean">
</jsp:useBean>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="utf-8" />

		<title> Home Page </title>

		<link href="css/home.css" rel="stylesheet" type="text/css" />
		<link href="css/tabs.css" rel="stylesheet" type="text/css" />
		<link href="css/jquery-ui.css" rel="stylesheet" type="text/css" />


		<script src="js/jquery.js" type="text/javascript"></script>
		<script src="js/jquery.tabs.js" type="text/javascript"></script>
		<script src="js/jquery-ui.min.js"></script>

		<script type="text/javascript">
			var availableTags = [
				<%
					Connection con = dbConn.getConnection();

					try {
						Statement stmt=con.createStatement();
						ResultSet rs = stmt.executeQuery("select item_name,item_cost from dish_items");

						rs.next();
						out.print("{label: \"" + rs.getString(1) + "\", value: \"" + rs.getString(2) + "\"}");

						while(rs.next())
							out.print(",\n{label: \"" + rs.getString(1) + "\", value: \"" + rs.getString(2) + "\"}");
					}
					catch(Exception e) {
					}
					finally {
						try {
							con.close();
						}
						catch(Exception e) {
						}
					}
				%>
			];

			function applyAutoComplete() {
				$("input#tag").each(function(){
					$(this).autocomplete({
						source: availableTags,
						focus: function(event, ui) {
							$(this).val(ui.item.label);
							$(this).next().val(ui.item.value);
							return false;
						},
						select: function(event, ui) {
							$(this).val(ui.item.label);
							$(this).next().val(ui.item.value);
							return false;
						}
					});
				});
			}

			$(window).resize(function(){
				document.title = $(window).width() + "px";
			});

			$(document).ready(function () {
				$('#myTab').responsiveTabs({
					startCollapsed: 'accordion',
					collapsible: true,
					rotate: false,
					setHash: true
				});

				applyAutoComplete();

				$('table tr td img').live('click', function() {
					var c = confirm("Are you sure you want to remove?");
					if(c == false)
						return false;

					var row = $(this).parent().parent();

					if(row.index() == $('table tr').length-3)
						row.prev().find('td input').eq(1).addClass('last');

					row.remove();
				});

				$('#save').click(function() {
					alert($('#hello').serialize());
				});

				$('input#qty').live("keypress", function(e) {
					var row = $(this).parent().parent();
					var tds = row.find('td');

					cols[0].each(function(index) {
					});
				});

				$('input.last').live("keypress", function(e) {
					var keyCode = e.keyCode || e.which; 

					if (keyCode == 9 || keyCode == 13) {
						e.preventDefault();
						$(this).removeClass('last');

						$('<tr>' + 
						          '<td> <input type="text" name="itemName" id="tag" />' +
							'<input type="hidden" name="itemCost" /> </td>' + 
						          '<td> <input type="text" name="qty" id="qty" class="last" /> </td>' + 
						          '<td> </td>' +
						          '<td> <img src="images/remove.png" width="20px" height="20px" /> </td>' +
						   '</tr>').insertBefore('#tableSeperator');

						applyAutoComplete();						
					}
				});

				$('#addRow').live('click', function() {
					$('input.last').removeClass('last');
					$('<tr>' + 
					          '<td> <input type="text" name="itemName" id="tag" />' +
						'<input type="hidden" name="itemCost" /> </td>' + 
					          '<td> <input type="text" name="qty" id="qty" class="last" /> </td>' + 
					          '<td> </td>' +
					          '<td> <img src="images/remove.png" width="20px" height="20px" /> </td>' +
					   '</tr>').insertBefore('#tableSeperator');

					applyAutoComplete();
				});
			});
		</script>
	</head>
	<body>
		<div class="top">
			<div class="container">
				<div class="leftDiv">
					AL MEHFAL RESTAURANT
				</div>
				<div class="rightDiv">
					<a href="logout.jsp">Log Out</a>
				</div>
			</div>
		</div>

		<div class="content"> <div class="container">
			<div class="block" id="myTab">
				<ul>
					<li> <a href="#al-a-carte"> Al-a-Carte </a> </li>
					<li> <a href="#parcel"> Parcels </a> </li>
					<li> <a href="#bulk"> Bulk </a> </li>
					<li> <a href="#profile"> My Profile </a> </li>
				</ul>

				<div id="al-a-carte">
					<div class="myTabContent">
						<br /><b class="btn"> New Order </b> &nbsp; &nbsp;
						<b class="btn" id="save"> Save Order </b> &nbsp; &nbsp;
						<b class="btn"> Current Orders </b><br /><br />
					</div>

					<div class="myTabContent">
						<div class="block">
							<div class="text">
								Bill No. :
							</div>
							<div class="textbox">
								<%
									DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
									Date date = new Date();
								%>
								<%= dateFormat.format(date) %>
							</div>
						</div>

						<div class="block">
							<div class="text">
								Date :
							</div>
							<div class="textbox">
								<%
									dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
									date = new Date();
								%>
								<%= dateFormat.format(date) %>
							</div>
						</div>
					</div>

					<form id="hello" method="post" action="#"> <div class="myTabContent">
						<div class="block">
							<div class="text">
								Customer Name :
							</div>
							<div class="textbox">
								<input type="text" name="custName" id="custName" />
							</div>
						</div>

						<div class="block">
							<div class="text">
								Table No. :
							</div>
							<div class="textbox">
								<input type="text" name="tableNum" id="tableNum"/>
							</div>
						</div>
					</div>

					<div class="myTabContent">
						<table>
							<tr>
								<th> Item Name </th>
								<th> Quantity </th>
								<th> Price </th>
								<th></th>
							</tr>
							<tr>
								<td> <input type="text" id="tag" name="itemName"/>
									<input type="hidden" name="itemCost" /> </td>
								<td> <input type="text" name="qty" id="qty" /> </td>
								<td> </td>
								<td> <img src="images/remove.png" width="20px" height="20px" /> </td>
							</tr>
							<tr>
								<td> <input type="text" id="tag" name="itemName" />
									<input type="hidden" name="itemCost" /> </td>
								<td> <input type="text" name="qty" id="qty" /> </td>
								<td> </td>
								<td> <img src="images/remove.png" width="20px" height="20px" /> </td>
							</tr>
							<tr>
								<td> <input type="text" id="tag" name="itemName" />
									<input type="hidden" name="itemCost" /> </td>
								<td> <input type="text" name="qty" id="qty" /> </td>
								<td> </td>
								<td> <img src="images/remove.png" width="20px" height="20px" /> </td>
							</tr>
							<tr>
								<td> <input type="text" id="tag" name="itemName" />
									<input type="hidden" name="itemCost" /> </td>
								<td> <input type="text" name="qty" class="last" id="qty" /> </td>
								<td> </td>
								<td> <img src="images/remove.png" width="20px" height="20px" /> </td>
							</tr>
							<tr id="tableSeperator">
								<td class="noBorder" colspan="4"></td>
							</tr>
							<tr>
								<td colspan="4" align="right" class="noBorder">
									<b class="btn" id="addRow"> Add Row </b>
								</td>
							</tr>
						</table>
					</div> </form>
				</div>

				<div id="parcel">
					<div class="myTabContent">
					</div>
				</div>

				<div id="bulk">
					<div class="myTabContent">
					</div>
				</div>

				<div id="profile">
					<div class="myTabContent">
					</div>
				</div>
			</div>
		</div> </div>
	</body>
</html>