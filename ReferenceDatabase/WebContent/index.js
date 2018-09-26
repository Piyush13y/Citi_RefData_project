/* ------------------------------------ Click on login and Sign Up to  changue and view the effect
---------------------------------------
*/

	window.addEventListener('click', function(e){
	
	if (document.getElementById('ye').contains(e.target)){
  	
  } else{
  	ocultar_login_sign_up();
  }
})
	//ocultar_login_sign_up();
	//}

//onclick="ocultar_login_sign_up()"

function cambiar_login() {
	
  document.querySelector('.cont_forms').className = "cont_forms cont_forms_active_login";  
document.querySelector('.cont_form_login').style.display = "block";
document.querySelector('.cont_form_sign_up').style.opacity = "0";               

setTimeout(function(){  document.querySelector('.cont_form_login').style.opacity = "1"; },400);  
  
setTimeout(function(){    
document.querySelector('.cont_form_sign_up').style.display = "none";
},200);  
  }
  
 function cambiar_login1() {
	 
  }

function cambiar_sign_up() {
  document.querySelector('.cont_forms').className = "cont_forms cont_forms_active_sign_up";
  document.querySelector('.cont_form_sign_up').style.display = "block";
document.querySelector('.cont_form_login').style.opacity = "0";
  
setTimeout(function(){  document.querySelector('.cont_form_sign_up').style.opacity = "1";
},100);  

setTimeout(function(){   document.querySelector('.cont_form_login').style.display = "none";
},400);  


}    



function ocultar_login_sign_up() {

document.querySelector('.cont_forms').className = "cont_forms";  
document.querySelector('.cont_form_sign_up').style.opacity = "0";               
document.querySelector('.cont_form_login').style.opacity = "0"; 

setTimeout(function(){
document.querySelector('.cont_form_sign_up').style.display = "none";
document.querySelector('.cont_form_login').style.display = "none";
},500);  
  
  }

  function check() {
	document.getElementById('message1').hidden= false;
	document.getElementById('linegap').hidden= true;
	  if (document.getElementById('pswd').value ==
	    document.getElementById('pswd2').value) {
	    document.getElementById('message1').style.color = 'green';
	    document.getElementById('message1').innerHTML = 'matching';
	    document.getElementById('submitsignup').disabled=false;
	  } else {
	    document.getElementById('message1').style.color = 'red';
	    document.getElementById('message1').innerHTML = 'not matching';
	    document.getElementById('submitsignup').disabled=true;
	  }
	}
  

	function checkmail() {
		
		if(/^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(document.getElementById('username'))){
			document.getElementById('loginbutton').disabled=false;
			//alert("okk");
		} else{
			//alert("else");
			//document.getElementById('loginbutton').disabled=true;
		
		}
	}
//		if(/^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/.test(document.getElementById('email'))){
//			document.getElementById('submitsignup').disabled=false;
//		} else {
//			document.getElementById('submitsignup').disabled=true;
//		}
	