<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<html lang="en" >

  <meta charset="UTF-8">
  <title>CityScapes Landing Page Template</title>
<style>
body {
    font-family: 'Lato', sans-serif;
}

.overlay {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: rgb(0,0,0);
    background-color: rgba(0,0,0, 0.6);
    overflow-x: hidden;
    transition: 0.5s;
}

.overlay-content {
    position: relative;
    top: 20%;
    width: 100%;
    text-align: center;
}

.overlay a {
    padding: 8px;
    text-decoration: none;
    font-size: 36px;
    color: #818181;
    display: block;
    transition: 0.3s;
}

.overlay a:hover, .overlay a:focus {
    color: #f1f1f1;
}

.overlay .closebtn {
    position: absolute;
    top: 20px;
    right: 45px;
    font-size: 60px;
}

@media screen and (max-height: 450px) {
  .overlay a {font-size: 20px}
  .overlay .closebtn {
    font-size: 40px;
    top: 15px;
    right: 35px;
  }
}
</style>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
	<link rel="stylesheet" href="css/style.css">
	<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans:400,300'>
	<link rel='stylesheet' href='https://fonts.googleapis.com/icon?family=Material+Icons'>
	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'>
	<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css'>
	<link rel='stylesheet' href='https://rawgit.com/Jesus-E-Rodriguez/cityscapes-landing-page/master/css/styles.css'>  
</head>

<body>



  <!-- Main Navigation -->
<nav class="main-nav" id="main-nav">

 <!-- The overlay -->
<div id="myNav" class="overlay">

  <!-- Button to close the overlay navigation -->
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>

  <!-- Overlay content -->
  <div class="overlay-content">
    <div class="cont_centrar" >

  	<div class="cont_login" id="ye">
		<div class="cont_info_log_sign_up" >	
      	<div class="col_md_login">
			<div class="cont_ba_opcitiy">
		        <h2 style="font-size: 20px;">LOGIN</h2>  
		  		<p style="margin-bottom:0%;padding-bottom:0%;">Already have an account? </p><br> 
		  		<button class="btn_login" onclick="cambiar_login()">LOGIN</button>
		  	</div>
  		</div>
		<div class="col_md_sign_up">
			<div class="cont_ba_opcitiy">
		  		<h2 style="font-size: 20px;">SIGN UP</h2>
		  		<p style="margin-bottom:0%;padding-bottom:0%;">New User?</p><br>
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
	 <div class="cont_form_login">
		<a href="#" onclick="ocultar_login_sign_up()" ><i class="material-icons">&#xE5C4;</i></a>
	   	  <h2 style="margin-bottom:0%; font-size: 25px;">LOGIN</h2>
	   		<form action="login" method="post">
			 	<input type="text" id="username" name="username"  required placeholder="Email" onkeyup="checkmail()">
				<input type="password" name ="password" id="password" required placeholder="Password" /><br>
				<span id="error"><% if(request.getAttribute("error")!=null){%>
				<script type="text/javascript"> window.onload = function() { openNav(); cambiar_login(); };</script>
				<% out.println(request.getAttribute("error"));request.removeAttribute("error");} %></span><br>
				<button  href="#" class="btn_login" id="loginbutton" onclick="cambiar_login1()">LOGIN</button>
			</form>
	</div>
  
   	<div class="cont_form_sign_up">
<!--<a href="#" onclick="ocultar_login_sign_up()"><i class="material-icons">&#xE5C4;</i></a>
     <h2 style="padding-left:0%;margin-left:0%;margin-bottom:0%;font-size: 5px;">1</h2>-->

	    <h2 style="padding-left:0%;margin-left:0%;margin-bottom:0%;font-size:20px;">SIGN UP</h2>
			<form action="signup" method="post" >
				<input type="text"  name="email" required placeholder="Email" onkeyup="checkmail()">
				<input type="text" name="uname" required placeholder="User" >
				<input type="password" id='pswd' name = "passcode" required placeholder="Password" >
				<input type="password" id='pswd2' placeholder="Confirm Password" required onkeyup="check()"><p id="message1" hidden></p><br id="linegap"> 
				<span id="error"><% if(request.getAttribute("err")!=null){%>
				<script type="text/javascript"> window.onload = function() { openNav(); cambiar_sign_up(); };</script>
				<% out.println(request.getAttribute("err"));request.removeAttribute("err");} %></span><br>
				<button type="submit" class="btn_sign_up" id="submitsignup" onclick="cambiar_sign_up()">SIGN UP</button>
			</form>	
	</div>

    </div>    
  </div>
 </div>
</div>

</div>

<!-- Use any element to open/show the overlay navigation menu -->

     
 <div class="content-wrapper-sm">
  <a href="#" class="navbar-brand" style="margin-left:0%;text-align=left;">CityScapes</a>
  <div id="menu-button">
   <div class="bar1"></div>
   <div class="bar2"></div>
   <div class="bar3"></div>
  </div>
  <ul class="nav-links">
   <!-- <li><a href="#about">About</a></li>
   <li><a href="#reserve">Reservations</a></li> -->
   <li><a href="#contact">Contact</a></li>
   <li><a href="javascript:openNav()">Login</a> </li>
<script>
function openNav() {
  document.getElementById("myNav").style.width = "100%";
}

function closeNav() {
  document.getElementById("myNav").style.width = "0%";
}
</script>
  </ul>
 </div>
 
</nav>

<!-- Main header -->
<header>
 <img class="img-absolute" src="https://raw.githubusercontent.com/Jesus-E-Rodriguez/cityscapes-landing-page/88c9b44e3def10ae253dd8d44b717cfa78cca42d/img/city.png" alt="City 1">
 <div class="wrapper astonish animated fadeInDown">
  <h1><strong>City</strong>Scapes</h1>
  <h2>A free, responsive, landing page. <br>
                    Created by <strong>Pragya </strong>The leader.</h2>
 </div>
</header>

Main content
<main>
 <div class="content-wrapper" id="about">
  second replaceble image
  <img class="img-absolute" src="https://raw.githubusercontent.com/Jesus-E-Rodriguez/cityscapes-landing-page/master/img/city2.png" alt="City 2">
  <div class="grid">
   <div class="grid-col-sm-12 grid-col-md-6 astonish" data-animation="fadeInLeft">
    <h2 class="section-title">About CityScapes</h2>
    <p>CityScapes is a fully responsive and customizable landing page template. All images can easily be replaced from the html side, without having to dig through the css.</p>
    <p>The full version of this template is available at Github and it comes with the SASS files in order to provide quicker customization features, for those who are developers.</p>
    <p>Javascript files are also included, they are used to enhance the user experience but apart from the menu.js file, they are all optional.</p>
   </div>
  </div>
 </div>

 <div id="reserve" class="content-wrapper-lg text-center astonish" data-animation="zoomIn">
  <h2 class="section-title">Explore New Pathways</h2>
  <p>CityScapes is great for any travel agency or tour agency, that wishes to showcase the focal points of a city. If you want a unique looking landing page that has a unique artistic style that will attract clients, then this is the template for you. Go
   ahead and download it for free from Github.</p>
  <a href="https://github.com/Jesus-E-Rodriguez/cityscapes-landing-page" class="btn btn-outline-purple" target="_blank">Download</a>
 </div>

 <div class="content-wrapper" id="contact">
  <!--  Third replaceble image -->
  <img class="img-absolute" src="https://raw.githubusercontent.com/Jesus-E-Rodriguez/cityscapes-landing-page/master/img/city3.png" alt="City 3">

  Custom form, important note: you will need additional code in order to make this form work
  <form class="contact-form astonish" action="#" method="post" data-animation="fadeInRight">
   <h2 class="section-title">Contact Us</h2>
   <div class="grid">
    <div class="grid-col-sm-12 grid-col-md-6">
     <div class="form-group">
      <input type="text" name="firstName" required>
      <label for="firstName">First Name:</label>
     </div>
    </div>
    <div class="grid-col-sm-12 grid-col-md-6">
     <div class="form-group">
      <input type="text" name="lastName" required>
      <label for="lasttName">Last Name:</label>
     </div>
    </div>
    <div class="grid-col-sm-12">
     <div class="form-group">
      <input type="text" name="email" required>
      <label for="email">Email:</label>
     </div>
    </div>
    <div class="grid-col-sm-12">
     <div class="form-group">
      <textarea name="message" required></textarea>
      <label for="message">Message:</label>
     </div>
    </div>
   </div>
   <input class="btn btn-outline-teal" type="submit" value="Send">
  </form>
 </div>

 This is an embedded Google map, this is easily customizable especially if you get a Google API key, this will allow for more customizable features.
 <iframe id="map" src="https://www.google.com/maps/embed?pb=!1m10!1m8!1m3!1d81584.50435706123!2d-80.8378430874413!3d35.23358937843391!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sus!4v1514142608486" frameborder="0" style="border:0" allowfullscreen></iframe>
</main>

Main footer
<footer>
 <div class="content-wrapper-sm display-flex-between">
  Easily replaceble copyright information
  <small>Your copyright 2017.</small>

  Make sure to edit the links so that they go to your social media.
  <div class="social-links">
   <ul>
    <li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
    <li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
    <li><a href="#"><i class="fa fa-snapchat-square" aria-hidden="true"></i></a></li>
    <li><a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
   </ul>
  </div>
 </div>
</footer>
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
<script src='https://rawgit.com/Jesus-E-Rodriguez/cityscapes-landing-page/master/js/astonish.js'></script>
<script src='https://rawgit.com/Jesus-E-Rodriguez/cityscapes-landing-page/master/js/menu.js'></script>
<script src='https://rawgit.com/Jesus-E-Rodriguez/cityscapes-landing-page/master/js/nav.js'></script>
<script src='https://rawgit.com/Jesus-E-Rodriguez/cityscapes-landing-page/master/js/scroll.js'></script>

  
    <script  src="./index.js"></script>

	
</body>
</html>