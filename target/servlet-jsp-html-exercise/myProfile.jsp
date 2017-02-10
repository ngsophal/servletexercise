<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Profile</title>
</head>
<body >
<% if(session.getAttribute("s_email") != null){ %>
	<jsp:include page="link.jsp" />
	<div style="margin:0 auto; width:800px;">
		<table border="0">
			<tr>
				<td colspan="2">
					<div style="text-align: center">
						<Strong>User Profile</Strong>					
					</div>	
				</td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><%= session.getAttribute("s_email") %></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><%= session.getAttribute("s_password") %></td>
			</tr>
			<tr>
				<td>Created Date:</td>
				<td><%= session.getAttribute("s_createddate") %></td>
			</tr>
			<tr>
				<td>Url Photo:</td>
				<td><%= session.getAttribute("s_urlphoto") %></td>
			</tr>
		</table>
	</div>
<%} %>
</body>
</html>

