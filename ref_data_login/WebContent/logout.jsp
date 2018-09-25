<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% session.invalidate();
	   request.setAttribute("msg","Logged out successfully! <br> Please login again to continue.." );
	   request.getRequestDispatcher("index.jsp").forward(request, response);%>>
</body>
</html>