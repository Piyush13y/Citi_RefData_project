<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Password Change</title>
</head>

<body>
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
	</tbody>
	</table>

</body>

</html>