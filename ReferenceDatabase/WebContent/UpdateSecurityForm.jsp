<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>
<a href="showservlet">here i'm</a>
	<form action="showservlet" method="get" >
			<input name="ISIN" id="ISIN">
			<input type="submit" value="submit">
				
	</form>

				
	<div class="panel panel-yellow">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <form action="add_securities_servlet" method="get">
							 							 
							 Date : <span id="donedate1" name="donedate" style="margin-left:40px"></span><br>
							<!-- Trade-time: <span id="time1" name="time" style="margin-left:40px"></span><br>-->
							 Security name: <input type="text" name="SECURITY_NAME" placeholder="Security Name" style="margin-left:30px"><br>
							<!--Trade: <select name="trade" id="trade1" onchange="updatetrade()" style="margin-left:75px">
													<option value="Buy" >Buy</option>
													<option value="Sell">Sell</option>
													</select><br>
													<span id="msg"></span>
													<span id="msg1"></span>-->
													
							Issuer Name:<input type="text" name="ISSUER_NAME" placeholder="Issuer Name" style="margin-left:45px">

							Frequency:<input type="text" name="FREQUENCY" placeholder="Frequency" style="margin-left:57px"><br>

							Day Count Convention: <select name="DAY_COUNT_CONVENTION" id="trade1" onchange="" style="margin-left:45px">
													<option value="1" >30/ACT</option>
													<option value="2">ACT/360</option>
													</select><br>
													<span id="msg"></span>
													<span id="msg1"></span>							
							ISIN:<input type="text" name="ISIN" placeholder="ISIN" style="margin-left:97px"><br>

							Face Value:<input type="text" name="FACE_VALUE" placeholder="Face Value" style="margin-left:55px"><br>

							Coupon Dates:<input type="text" name="COUPON_DATES" placeholder="Coupon Dates" style="margin-left:33px"><br>

							Maturity Date: <input id="setdate" type="date" name="MATURITY_DATE" style="margin-left:31px">
						<!--	Traded Price:<input type="radio" name="method" id="decimalInput1" onchange="display1()" value="decimalInput" style="margin-left:30px"> Decimal Input<br>
										 <input type="radio" name="method" id="fractionInput1" onchange="display1()" value="fractionInput" style="margin-left:112px"> Fraction input<br>
										  <span id="decimalvalue11" style="margin-left:112px" hidden ><input type="text" name="decimal" placeholder="Price in Decimals"></span>
										  <span id="fraction11" style="margin-left:112px" hidden><input type="text" name="fraction_whole" placeholder="Price in whole number"><input type="text" name="fraction_frac" placeholder="Multiples of 1/32" style="margin-left:112px"></span>
										  
										  -->
													<script> 
	
													function display1(){
													
													if( document.getElementById("decimalInput1").checked==true){
																document.getElementById("decimalvalue11").hidden=false;
																document.getElementById("fraction11").hidden=true;}
													if( document.getElementById("fractionInput1").checked==true){
																document.getElementById("decimalvalue11").hidden=true;
																document.getElementById("fraction11").hidden=false;}	
													
																
																}

													function updatesec(){
													p=document.getElementById("security").value;
													document.getElementById("msg").innerHTML=p;}
													function updatetrade(){
													q=document.getElementById("trade").value;
													document.getElementById("msg1").innerHTML=q;}
													
							 var d= new Date();
							 var r = d.getMonth()+1;
							 document.getElementById("donedate1").innerHTML=d.getDate()+"/"+r+"/"+d.getFullYear()+" (dd/mm/yyyy)";
							// document.getElementById("time1").innerHTML=d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();						 
							 </script>	<br>
							<input type="submit"  style="margin-left:120px; margin-top:4%" value="insert">
							</form>	
							</div>
						</div>
						</div>
					</div>
	
</body>
</html>