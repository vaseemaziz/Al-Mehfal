<%@ page language="java" %>
<%@ page import="java.sql.*" %>
<%@ page isThreadSafe="true" %>

<jsp:useBean id="dbConn" class="dbbean.DatabaseBean">
</jsp:useBean>

<%
	String username = (String)session.getAttribute("user");
	if(username!=null)
		response.sendRedirect("home.jsp");


	username = request.getParameter("user");
	String password = request.getParameter("pwd");
	String type = request.getParameter("type");

	if(username != null && password != null && type != null) {

		type = type.toLowerCase();
		Connection con = dbConn.getConnection();

		try {
			Statement stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery("select password,privilege from user where id=\'" + username + "\'");

			if(rs.next()) {
				if(password.equals(rs.getString(1)) && type.equals(rs.getString(2).toLowerCase())) {
					session.setAttribute("user",username);
					session.setAttribute("pwd",password);
					session.setAttribute("type",type);

					out.println("<user>" + username + "</user>");
				}
				else {
					out.println("<error> Invalid username/password </error>");
				}
			}
			else {
				out.println("<error> Invalid username/password </error>");
			}
		}
		catch(Exception e) {
			out.println("<error> Server error: " + e.getMessage() + " </error>");
		}
		finally {
			try {
				con.close();
			}
			catch(Exception e) {
			}
		}
	}
	else {
		out.println("<error> Submit valid credintials </error>");
	}
%>