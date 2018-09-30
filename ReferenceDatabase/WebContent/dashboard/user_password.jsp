<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.beans.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Password Change</title>


</head>

<body>
<%

User user = (User)session.getAttribute("user");
//System.out.println(user);
//session.setAttribute("USERNAME", user.getUsername());
%>
		<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
		<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'>
		<div class="container">
			<form action="../userpasswordchange" method="post">
				  <div class="form-group">
				   <label for="exampleInputEmail1">Old Password</label>
				   <input type="password" class="form-control" required id="exampleInputEmail1" aria-describedby="emailHelp" name="oldpass" placeholder="Old password">
				  	<%//System.out.println(((User)session.getAttribute("user")).getUsername()); %>
				  	<input name="username" value="<%=((User)session.getAttribute("user")).getUsername()%>" hidden>
				  </div>
		  <div class="form-group">
		    <label for="exampleInputPassword1">New Password</label>
		    <input type="password" class="form-control" id="pass" name="newpass" placeholder="New password">
		  </div>
		  <div class="form-group">
		  <div class="form-group">
		    <label for="exampleInputPassword1">Confirm Password</label>
		    <input type="password" class="form-control" id="pass1" name="newpass1" onkeyup="check()" placeholder="Confirm password">
		  </div>
		  <span id="message" hidden></span><br>
		  <input type="submit" id ="submit" class="btn btn-primary" value="Submit">
		</form>
		</div>
			
<script>
function check() {
	document.getElementById('message').hidden= false;
	document.getElementById('submit').disabled=true;
	if (document.getElementById('pass').value == document.getElementById('pass1').value){
	    document.getElementById('message').style.color = 'green';
	    document.getElementById('message').innerHTML = 'Matching';
	    document.getElementById('submit').disabled=false;
	  } else {
	    document.getElementById('message').style.color = 'red';
	    document.getElementById('message').innerHTML = 'Not matching';
	    document.getElementById('submit').disabled=true;
	  }
	}

</script>
 </body>

</html>