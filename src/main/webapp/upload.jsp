<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Uploading Form</title>
</head>
<body>
<% if(session.getAttribute("s_email") != null){ %>
	<jsp:include page="link.jsp" />
	<div style="margin:0 auto; width:800px;">
		<h3>File Upload:</h3>
		<form action="UploadServlet" method="post" enctype="multipart/form-data">
			<table border="0">
				<tr>
					<td>Browse a file to upload:</td>
				</tr>
				<tr>
					<td><input type="file" name="file" size="50" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Upload File" /></td>
				</tr>
			
			</table>
		</form>
	</div>
<%} %>
</body>
</html>
