<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans:400,300'>
<link rel='stylesheet' href='https://fonts.googleapis.com/icon?family=Material+Icons'>
	<script type="text/javascript" src="livevalidation_standalone.js"></script>		
	<link rel="stylesheet" href="./css/style.css">
</head>
<body>
	
<a href="trying.jsp">go to try</a>
<a href="index1.jsp">index1</a>

  <div class="cotn_principal">
<div class="cont_centrar">

  <div class="cont_login">
<div class="cont_info_log_sign_up">
	<div class="col_md_login">
	<div class="cont_ba_opcitiy">	        
	        <h2>LOGIN</h2>  
	  	<p>Already have an account? </p><br> 
	  	<button class="btn_login" onclick="cambiar_login()">LOGIN</button>
	 </div>
	 </div>
	
	<div class="col_md_sign_up">
	<div class="cont_ba_opcitiy">
	  		<h2>SIGN UP</h2>
	  		<p>New User?</p>
		<br>
	  		<button class="btn_sign_up" onclick="cambiar_sign_up()">SIGN UP</button>
	</div>
	</div>
</div>

    
    <div class="cont_back_info">
       <div class="cont_img_back_grey">
       <img src="https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d" alt="" />
       </div>       
    </div>
    
<div class="cont_forms" >
    <div class="cont_img_back_">
       <img src="https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d" alt="" />
       </div>
 <div class="cont_form_login" >
		<a href="#" onclick="ocultar_login_sign_up()" ><i class="material-icons">&#xE5C4;</i></a>
   <h2>LOGIN</h2>
 	<form action="login" method="post" >  
	 	<input type="text" id="username" name="username" placeholder="Email" /><br>
	 	<!-- <span >Error message here!</span> -->
	 		<script type="text/javascript"> var f1 = new LiveValidation('username');
		     f1.add(Validate.Presence);
		   	</script>
		<input type="password" id="password" name ="password" placeholder="Password" />
		<p id="error"><% if(request.getAttribute("error")!=null){out.println(request.getAttribute("error"));} %></p><br>
		<button  href="#" class="btn_login" id="login" onclick="cambiar_login1()">LOGIN</button>
	</form>
  </div>
  
   <div class="cont_form_sign_up">
	<a href="#" onclick="ocultar_login_sign_up()"><i class="material-icons">&#xE5C4;</i></a>
	     <h2>SIGN UP</h2>
	<form action="signup" method="post" >
		<input type="text" onkeyup="check()" name="email" placeholder="Email" />
		<span id="demo"></span>
		<input type="text" name="username" placeholder="User" />
		<input type="password" name = "passcode" placeholder="Password" />
		<input type="password" placeholder="Confirm Password" />
		<button class="btn_sign_up" onclick="cambiar_sign_up()">SIGN UP</button>
	</form>
  </div>

    </div>
    
  </div>
 </div>
</div>
  
  

    <script  src="index.js"></script>

</body>
</html>