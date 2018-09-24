<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h>Dikh gaya Bencho! ye to  <% out.println(" " +session.getAttribute("user")); %>   h </h><br>
	<a href="index.jsp"> Logout</a>
</body>
</html>