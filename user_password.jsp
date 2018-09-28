<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Password Change</title>

  <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>

      <link rel="stylesheet" href="../css/styleCheck.css">

</head>

<body>
	<form action="../user_passwordchange_serv" class="form"method="GET">
	<h2>Password Change</h2>


	  <div class="form-group">
		  <label for="email">Old Password:</label>
		  <div class="relative">
			  <input class="form-control" id="name" name="oldPassword" type="password"  required="" autofocus=""  autocomplete="" placeholder="Type your current password here">
			  <i class="fa fa-user"></i>
		  </div>
	  </div>
	  <div class="form-group">
	  	<label for="email">New Password:</label>
	  	<div class="relative">
		  	<input class="form-control" type="password" name="newPassword" id="pass" required="" placeholder="Type your new password" >
		  	<i class="fa fa-user"></i>
	  	</div>
	  </div>
	  <div class="form-group">
	  	<label for="email">Confirm Password:</label>
	  	<div class="relative">
	  		<input class="form-control" type="password" name="confirmPassword"  id ="pass1" onekeyup="check()"required="" placeholder="Retype the above password">
	  		<i class="fa fa-user"></i>
	  	<p id="message" hidden></p>
	  	
	  	</div>
	  </div>
	            	
	  <div class="tright">
	  	<a href=""><button class="movebtn movebtnre" type="Reset"><i class="fa fa-fw fa-refresh"></i> Reset </button></a>
	  <button class="movebtn movebtnsu" type="Submit"><i class="fa fa-fw fa-paper-plane"></i>Submit</button>
	  </div>
	</form>
	<!--OLD PASSWORD: <input type ="text" name="oldPassword"><br>
	NEW PASSWORD: <input type ="text" id ="pass" name="newPassword"><br>
	CONFIRM PASSWORD: <input type ="text" id ="pass1" name="confirmPassword" onkeyup="check()">
	<br>
	<p id="message" hidden></p>
	
	//<input type="submit" id="submit" value="update password">
		
</form>
	  -->
	 <script src='https://code.jquery.com/jquery-1.12.4.js'></script>
<script src='https://code.jquery.com/ui/1.12.1/jquery-ui.js'></script>

  

    <script  src="../js/indexRename.js"></script>
	
<script>
function check() {
	document.getElementById('message').hidden= false;
	document.getElementById('submit').disabled=true;
	if (document.getElementById('pass').value == document.getElementById('pass1').value){
	    document.getElementById('message').style.color = 'green';
	    document.getElementById('message').innerHTML = 'matching';
	    document.getElementById('submit').disabled=false;
	  } else {
	    document.getElementById('message').style.color = 'red';
	    document.getElementById('message').innerHTML = 'not matching';
	    document.getElementById('submit').disabled=true;
	  }
	}

</script>
 </body>

</html>