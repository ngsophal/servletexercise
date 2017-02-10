<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In Form</title>
</head>
<body>
	<div style="margin:0 auto; width:500px;">
		<form action="LoginServlet" method="post">
		<table border="0">
			<tr>
				<td colspan="2">
					<div style="text-align: center">
						<Strong>Log In</Strong><br>(Servlet JSP HTML)
					</div>	
				</td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Log In"></td>
			</tr>	
		</table>
		</form>
	</div>
</body>
</html>
