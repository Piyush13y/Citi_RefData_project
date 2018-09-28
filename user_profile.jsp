<%@page import="com.beans.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>User Profile</title>
  
  
  <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>

      <link rel="stylesheet" href="../css/styleCheck.css">

  
</head>

<body>
<%

User user= (User)session.getAttribute("userdetails");
session.setAttribute("USERNAME", user.getUsername());
%>

  	<form  action="../user_profile_servlet" class="form" onsubmit="Profile Updated">
  	
	  <h2>User Profile</h2>


	  <div class="form-group">
		  <label for="email">First Name:</label>
		  <div class="relative">
			  <input class="form-control" id="name" name="USERFNAME" type="text" oninput="this.value=this.value.replace(/[^a-zA-Z\s]/g,'');" required="" autofocus="" title="Username should only contain letters. e.g. Piyush Gupta" autocomplete="" placeholder="Type your name here...">
			  <i class="fa fa-user"></i>
		  </div>
	  </div>
	  <div class="form-group">
	  	<label for="email">Surname:</label>
	  	<div class="relative">
		  	<input class="form-control" type="text" name="USERLNAME" oninput="this.value=this.value.replace(/[^a-zA-Z\s]/g,'');"required="" placeholder="Type your Surname.." >
		  	<i class="fa fa-user"></i>
	  	</div>
	  </div>
	  <div class="form-group">
	  	<label for="email">Contact Number:</label>
	  	<div class="relative">
	  		<input class="form-control" type="text" name="CONTACT" maxlength="10" oninput="this.value=this.value.replace(/[^0-9]/g,'');" required="" placeholder="Type your Mobile Number...">
	  		<i class="fa fa-phone"></i>
	  	</div>
	  </div>
	  <div class="form-group">
	  	<label for="email">Gender:</label>
	  	<div class="relative">
	  		<input class="form-control" type="text" name="GENDER" oninput="this.value=this.value.replace(/[^a-zA-Z\s]/g,'');" required="" placeholder="Mention your gender">
	  		<i class="fa fa-user"></i>
	  	</div>
	  </div>
	            	
	  <div class="tright">
	  	<a href=""><button class="movebtn movebtnre" type="Reset"><i class="fa fa-fw fa-refresh"></i> Reset </button></a>
	  <button class="movebtn movebtnsu" type="Submit"><i class="fa fa-fw fa-paper-plane"></i>Submit</button>
	  </div>
	</form>

	 <div class="thanks" style="display: none;">
		
		<p><small>Profile Updated.</small></p>
	</div>
  <script src='https://code.jquery.com/jquery-1.12.4.js'></script>
<script src='https://code.jquery.com/ui/1.12.1/jquery-ui.js'></script>

  

    <script  src="../js/indexRename.js"></script>




</body>

</html>
