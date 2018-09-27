<%@page import="com.beans.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

User user= (User)session.getAttribute("userdetails");
session.setAttribute("USERNAME", user.getUsername());
%>

<div class="table-title">
		
		<h3>Data Table</h3>
	</div>
	<form action="../user_profile_servlet" method="GET">
	<table class="table-fill"  >
	<thead>
	<tr>
	<th class="text-left">Name</th>
	<th class="text-left">DETAILS</th>
	
	</tr>
	</thead>
	<tbody class="table-hover">
<tr>
	<td class="text-left">USERNAME</td>
	<td class="text-left"><%=user.getUsername()%></td>
	<td class="text-left"></td>
	</tr>

	<tr>
	<td class="text-left" >USERFNAME</td>
	<td class="text-left"><input type ="text" name="USERFNAME"></td>
	<td class="text-left"></td>
	</tr>
	<tr>
	<td class="text-left">USERLNAME</td>
	<td class="text-left"><input type ="text" name="USERLNAME"></td>
	<td class="text-left"></td>
	</tr>
	<tr>
	<td class="text-left">CONTACT</td>
	<td class="text-left"><input type ="text" name="CONTACT"></td>
	<td class="text-left"></td>
	</tr>
	<tr>
	<td class="text-left">GENDER</td>
	<td class="text-left"><input type ="text" name="GENDER"></td>
	
	<td class="text-left"></td>
	</tr>
	
	</tbody>
	</table>
	
<input type="submit" value="click ckarna">

</form>
</body>
</html>