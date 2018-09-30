<%@page import="com.beans.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>User Profile</title>
  
  
  

  
</head>

<body>
<%

User user = (User)session.getAttribute("user");
//System.out.println(user);
session.setAttribute("USERNAME", user.getUsername());
%>

  	
	 
	
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'>
	<div class="container">
		<form action="../userProfileUpdate" method="post">
		  <div class="form-group">
		    <label for="exampleInputEmail1">First Name</label>
		    <input type="text" class="form-control" required id="exampleInputEmail1" aria-describedby="emailHelp" name="fname" placeholder="First name">
		    
		  </div>
		  <div class="form-group">
		    <label for="exampleInputPassword1">Last Name</label>
		    <input type="text" class="form-control" id="exampleInputPassword1" name="lname" placeholder="Last name">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputPassword1">Contact</label>
		    <input type="number" min="1111111111" max="9999999999"required class="form-control" name ="contact" id="exampleInputPassword1" placeholder="Contact">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputPassword1">Gender</label>
		    <select required name ="gender">
		      <option value ="Male">Male</option>
		      <option value="Female">Female</option>
		    </select>
		
		  </div>
		  <input type="submit" class="btn btn-primary" value="Submit">
		</form>
		</div>



</body>

</html>
