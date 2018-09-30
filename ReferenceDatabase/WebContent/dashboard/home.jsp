<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.beans.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Responsive Dashboard</title>
  <meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  
  <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'>
<link rel='stylesheet' href='https://morrisjs.github.io/morris.js/css/morris.css'>

      <link rel="stylesheet" href="../css/dashboardstyle.css">
	   <link rel="stylesheet" href="../css/dashboardtest.css"> 


  
</head>

<body>

 
 <% response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
   response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
   response.setDateHeader("Expires", 0); 
   User user = (User)session.getAttribute("user");
   if(user == null) {
      response.sendRedirect("../index.jsp");
   }    %>
  <div class="">
    <header class="navbar-fixed-top">
      <div class="row">
        <div class="container-fluid">
          <div class="pull-left">
            <div class="pull-left logo text-center">
              <span>LOGO</span>
            </div><button class="btn btn-primary menu"><span class=
            "glyphicon glyphicon glyphicon-menu-hamburger"></span></button>
          </div>
          <div class="pull-right">
            <div class="marr20">
              <ul class="nav navbar-top-links navbar-right">
	                <li class="dropdown task">  
	                <li class="dropdown user">
	                  <a aria-expanded="false" class="dropdown-toggle" data-toggle="dropdown" href="#"><i class=
	                  "fa fa-cogs fa-fw"></i> <i class="fa fa-caret-down"></i></a>
	                  <ul class="dropdown-menu dropdown-user">
	                    <!-- <li>
	                      <a href="user_profile.jsp"><i class="fa fa-gear fa-5x"></i> User Profile</a>
	                    </li> -->
	                    <!-- <li>
	                      <a href="user_password.jsp"><i class="fa fa-gear fa-fw"></i> Settings</a>
	                    </li> -->
	                    <li class="divider"></li>
	                    <li>
	                      <a href="../logout.jsp"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
	                    </li>
	                  </ul>
               		</li>
               	
              </ul>
            </div>
          </div>
        </div>
      </div>
    </header>
    <div class="wrap">
      <div class="side-menu">
        <nav class="navbar navbar-default" role="navigation">
          <div class="navbar-header">
            <div class="brand-wrapper">
              <div class="brand-name-wrapper">
                <a class="navbar-brand" href="#">Navigation Menu</a>
              </div><a class="btn btn-default" data-toggle="collapse" href="#search" id="search-trigger"><span class=
              "glyphicon glyphicon-search"></span></a>
              <div class="panel-collapse collapse" id="search">
                <div class="panel-body">
                  <form class="navbar-form" role="search">
                    <div class="form-group">
                      <input class="form-control" placeholder="Search" type="text">
                    </div><button class="btn btn-default" type="submit"><span class=
                    "glyphicon glyphicon-ok"></span></button>
                  </form>
                </div>
              </div>
            </div>
          </div><!-- Main Menu -->
          <div class="side-menu-container">
            <ul class="nav navbar-nav">
              <li>
                <a href="#" onclick="showDash()"><span class="glyphicon glyphicon-send"></span> Home</a>
              </li>
			  <li>
                <a href="#" onclick="showInput()"><span class="glyphicon glyphicon-send"></span> Input Trade</a>
              </li>
              <li >
                <a href="#" onclick="showLog()"><span class="glyphicon glyphicon-send"></span> Trades Log</a>
              </li>
              <li >
                <a href="#" onclick="showSec()"><span class="glyphicon glyphicon-send"></span> Update Securities</a>
              </li>
              
              </ul>
          </div><!-- /.navbar-collapse -->
        </nav>
      </div>	
      <div class="container-fluid" id="dash" >
        <div class="side-body">
          <div class="page-title-box">
            <h3 class="page-title pull-left">Home</h3>
            <ol class="breadcrumb pull-right">
              <li>
                <a href="#">home</a>
              </li>
              <li class="active">Dashboard</li>
            </ol>
            <div class="clearfix"></div>
          </div>
          <div class="row">
            <div class="col-lg-8 col-sm-12">
              <div class="row">
                <div class="col-sm-10 ">
                  <div class="panel panel-green">
                    <div class="panel-heading">
                      <div class="row">
                        <div class="col-xs-9">
                          <!-- <div class="huge">09</div>
                          <div>New Clients!      </div> -->
                          
                          <h1 style="color:#000000"> <u>  User Details</u></h1><br>
                          <table style="width:400px">
                          <tr><td><h3>FirstName:</h3></td><td><h3><%=user.getUserFname() %></h3></td></tr> 
                          <tr><td><h3>LastName:</h3></td><td><h3><%=user.getUserLname() %></h3></td></tr> 
                          <tr><td><h3>Gender:</h3></td><td><h3><%=user.getGender() %></h3></td></tr> 
                          <tr><td><h3>Contact:</h3></td><td><h3><%=user.getContact() %></h3></td></tr></table>  
                        </div>
                        <div class="col-xs-3 text-right">
                         <i class="fa fa-user fa-5x" style="color:#ffd700"></i>
                        </div>
                      </div>
                    </div><a href="user_profile.jsp">
                    <div class="panel-footer">
                      <span class="pull-left">Update User Details</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                    <a href="user_password.jsp">
                    <div class="panel-footer" >
                      <span class="pull-left">Update Password</span> <span class="pull-right"><i class=
                      "fa fa-arrow-circle-right"></i></span>
                      <div class="clearfix"></div>
                    </div></a>
                  </div>
                </div>
                </div>
                </div>
                </div>
                </div>
                </div>
      
	<div class="container-fluid" id="input" hidden >
        <div class="side-body">
			<div class="page-title-box">
            	<h3 class="page-title pull-left">Trade Form</h3>
            		<ol class="breadcrumb pull-right">
              	<li>
                	<a href="#">home</a>
              	</li>
              	<li class="active">Dashboard</li>
            		</ol>
            <div class="clearfix"></div>
          	</div>
	          <div class="row">
	            <div class="col-lg-9 col-sm-12">
	              <div class="row">
	                <div style="margin-left:40%"class="col-sm-8">
	                  <div class="panel panel-yellow">
	                    <div class="panel-heading">
	                      <div class="row">
	                        <div class="col-xs-9">
	                          <form action="../addTrade" method="post">		 
             							Trade-date : <input id="donedate" type="date" name="tradeDate" style="margin-left:35px"></span> <!-- <input type="button" value="Set Today" onclick="setDate()"> --> <br>
             							Trade-time: <input id="time" type="time" name="tradeTime" style="margin-left:40px">  <!-- </span><input type="button" value="Set Now" onclick="setTime()"> --> <br>
             							Security name: <select name="secName" id="security"  style="margin-left:20px"> 
                							 						<option value="" disabled selected>Select security</option>
                													<% List<Security>list=(List<Security>)session.getAttribute("secList"); for(Security sec:list){ %>
                													<option value="<%=sec.getSecId() %>"><%= sec.getIssuerName() %></option>
                													<%} %>
                													</select><br>
               							Trade: <select name="tradeType" id="trade"  style="margin-left:75px">
               													<option value="Buy" >Buy</option>
               													<option value="Sell">Sell</option>
               													</select><br>
               													<!-- <span id="msg"></span>
               													<span id="msg1"></span><br> -->
               													
               							Counterparty:<input type="text" name="counterparty" placeholder="Party Name" style="margin-left:30px"><br>
               							Settlement Date: <select name="settlementDate" style="margin-left:75px">
               													<option value="0" >T+0</option>
               													<option value="1">T+1</option>
               													<option value="2">T+2</option>
               											 </select><br>							
               							Traded Price:<input type="radio" name="method" id="decimalInput" onchange="display()" value="decimalInput" style="margin-left:30px"> Decimal Input<br>
               										 <input type="radio" name="method" id="fractionInput" onchange="display()" value="fractionInput" style="margin-left:112px"> Fraction input<br>
               										  <span id="decimalvalue11" style="margin-left:112px" hidden ><input type="number" name="decimal" placeholder="Price in Decimals"></span>
               										  <span id="fraction11" style="margin-left:112px" class="row" hidden><input type="number" name="fractionWhole" placeholder="Price in whole number" style="margin-left:112px"><input type="number" name="fractionPart" placeholder="Ticks"  min= "0" max="32" size="5" style="margin-left:112px"></span>
               										  <br>
               										 <input name ="user" value="<%= user.getUsername() %>" type="hidden" > 
               											
               							<input type="submit" style="margin-left:120px">
						            </form>	
						            <script type="text/javascript">

									function display(){
									
									if( document.getElementById("decimalInput").checked==true){
												document.getElementById("decimalvalue11").hidden=false;
												document.getElementById("fraction11").hidden=true;}
									if( document.getElementById("fractionInput").checked==true){
												document.getElementById("decimalvalue11").hidden=true;
												document.getElementById("fraction11").hidden=false;}	
									
												
												}
									</script>
							</div>
						 </div>
						</div>
					 </div>
				  </div>
			    </div>
		      </div>
		    </div>
		 </div>
		</div>
	 <div class="container-fluid" id="log" hidden>
        <div class="side-body">
          <div class="page-title-box">
            <h3 class="page-title pull-left">Analysis</h3>
            <ol class="breadcrumb pull-right">
              <li>
                <a href="#">home</a>
              </li>
              <li class="active">Dashboard</li>
            </ol>
            <div class="clearfix"></div>
          </div> 
          <table border='1'  bgcolor="yellow">
						<thead>
							<tr>
								<th>SECURITY</th>
								<th>TRADE DATE</th>
								<th>TRADE TIME</th>
								<th>TRADE PRICE</th>
								<th>COUNTERPARTY</th>
								<th>CLEAN PRICE </th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="TradeItem" items="${tradeList}">
								<tr>
									<td ><c:out value="${TradeItem.secDetails.securityName}"></c:out> </td>
									<td><c:out value="${TradeItem.tradeDate}"></c:out> </td>
									<td><c:out value="${TradeItem.tradeTime}"></c:out> </td>
									<td><c:out value="${TradeItem.tradePrice}"></c:out> </td>	
									<td><c:out value="${TradeItem.counterParty}"></c:out></td>
									<td><c:out value="${TradeItem.cleanPrice}"></c:out></td>
									<td><a href="../showDetailsTrade?tradeId=<c:out value='${TradeItem.tradeId}'/>">Show Details</a></td>
									<td><a href="../showAccrued?tradeId=<c:out value='${TradeItem.tradeId}'/>">Show Accrued</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
		<div class="stack-horz" style="padding-left: 8%;padding-right:5%;padding-top:3%;padding-bottom:5%">
		        <div id = "container" class="content" style="width: 48%; height: 35%;">Horz 1</div>
		        <div id = "container2"class="content" style="width: 48%; height: 35%;">Horz 2</div>
    	</div>
		<div class="stack-horz" style="padding-left: 8%;padding-right:5%;padding-top:5%;padding-bottom:5%">
        	<div id = "container1" class="content" style="width: 48%; height: 35%;">Horz 1</div>
        	<div id = "container3" class="content" style="width: 48%; height: 35%;">Horz 2</div>
        
    	</div>	
	 </div>
	</div>

	<div class="container-fluid" id="sec" hidden >
	        <div class="side-body">
				<div class="page-title-box">
	            	<h3 class="page-title pull-left">Update Securities</h3>
	            		<ol class="breadcrumb pull-right">
			              <li>
			                <a href="#">home</a>
			              </li>
			              <li class="active">Dashboard</li>
			            </ol>
	            		<div class="clearfix"></div>
	           </div>
	          <div class="row">
	            <div class="col-sm-9 col-sm-12">
	              <div class="row">
	                <div class="col-sm-12">
	                  				
<div class="container-fluid" >
<form  action="../addSecurities" method="post" style="position:relative; z-index=-100">
  
  
  <div class="row">
    <div class="col-sm-6">
      <label>Security Name<br>
        <input type="text" name="SECURITY_NAME" placeholder="Enter Security name" required style="width:330%"/>
      </label>
    </div>
  </div><br>
  
    <div class="row">
    <div class="col-sm-6">
      <label>Issuer Name<br>
        <input type="text" name="ISSUER_NAME" placeholder="Enter Issuer name" required style="width:180%" />
      </label>
    </div>
    <div class="col-sm-2"></div>
    <div class="col-sm-2">
          <label> ISIN
          <input type="text" name="ISIN" required placeholder="Security ISIN" />
          </label>
        </div>
  </div> <br>

  <div class="row">
    
    <div class="col-sm-3">
          <label> Maturity Date
          <input type="date" name="MATURITY_DATE" required placeholder="some example" />
          </label>
    </div>
    <div class="col-sm-3">
      <label>Coupon Rate
        <input type="number" step="0.01" name="COUPON_RATE" required placeholder="Annual coupon rate %" style="width:100%"/>  
      </label>
    </div>
    <div class="col-sm-3">
      <label>Face Value
        <input type="number" oninput="this.value=this.value.replace(/[^0-9]/g,'');" name="FACE_VALUE" required placeholder="Enter the face value" style="width:150px"/>
      </label>
    </div>
    <div class="col-sm-3">
      <label> Frequency
        <input type="number" name="FREQUENCY" required placeholder="Coupon frequency" style="width:100%"/>
      </label>
    </div>
    
  </div><br>
    <div class="row">
        <div class="col-sm-4">
          <label> Coupon Dates<br>
          <input type="text" name="COUPON_DATES" required placeholder="Coupon Dates" style="width:100%" />
          </label>
        </div>
        <div class="col-sm-2">
          <label>Tick size<br>
            <input type="number" step="0.01" name ="TICK_SIZE" required placeholder="Tick Size" style="width:50%" />
          </label>
        </div>
    <div class="col-sm-3">
      <div class="row ">	
        <label>Day Count Convention</label>
        <select name="DAY_COUNT_CONVENTION" required >
          <option value="" disabled selected >Select Day Count Convention</option>
          <option value="1">ACT/365</option>
          <option value="2">ACT/360</option>
          <option value="3">30/360</option>
       </select>
      </div>
    </div>
  </div>
    
  <br>
  <div class="row">
    <div class="col-sm-6"></div>
        <div class="col-sm-3">
        <input type="submit" value="Add Security" />
    </div>
  </div>
  

  
</form>
</div>
</div>
</div>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
  <script  src="SecurityIndex.js"></script>
  <style>
    #percent-sign {
        top: 8px;
        left: 45px;
        color: #555;
        position: absolute;
        z-index: 1;
    }
</style>
	                  				
					
					
					 </div>
				   </div>
				 </div>
			   </div>
			</div>
		  </div>
		  
		  
        </div>
    </div>
 </div>
 
                  </div>
                </div>
              </div>
            </div>
           <div class="side-footer">
          <div class="footer text-center">
            Designed By <a target="_blank" href="https://www.linkedin.com/in/peeyush200/"> Peeyush </a>
          </div>
        </div>
      </div>
 
</body>
<script src='https://code.jquery.com/jquery-1.12.4.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js'></script>
<script src='https://cdn.oesmith.co.uk/morris-0.4.1.min.js'></script>
<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>

  
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script  src="../js/dashboardindex.js"></script>
<script src="../js/dashboardciti_test.js"></script>
<script src="../js/dashboardclick2add.js"></script>
<script src="../js/dashboardpie.js"></script>
<script src="../js/dashboardcolumn.js"></script>

</body>

</html>
	

</body>
</html>