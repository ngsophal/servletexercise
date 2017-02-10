<%@page import="java.awt.print.Printable"%>
<div style="text-align:right;">

<%
if(session.getAttribute("s_email") == null)//if (session == null)
	//if (session.getAttribute("s_password") == null || session.getAttribute("s_password").equals(""))
  {
    %><a href="login.jsp">Login</a><%
  }else{
%>
	
	<a href="LogoutServlet">Logout</a>
	<a href="myProfile.jsp">Profile</a>
	<a href="upload.jsp">Upload</a>
<% } %>
	<hr/>
</div>
