<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel='stylesheet' href='https://cdn.jsdelivr.net/foundation/5.5.0/css/foundation.css'>
  <link rel="stylesheet" href="SecurityStyle.css">
</head>
<body>

<form action="addSecurities" method="get">
  
  <div class="row">  ADD SECURITY FORM </div>
  <div class="row">
    <div class="large-12 columns">
      <label>Security Name
        <input type="text" name="SECURITY_NAME" placeholder="Enter Security name" />
      </label>
    </div>
  </div>
  
    <div class="row">
    <div class="large-9 columns">
      <label>Issuer Name
        <input type="text" name="ISSUER_NAME" placeholder="Enter Issuer name" />
      </label>
    </div>
    <div class="small-3 columns">
          <label> ISIN
          <input type="text" name="ISIN" placeholder="Security ISIN" />
          </label>
        </div>
  </div>

  <div class="row">
    
    <div class="small-3 columns">
          <label> Maturity Date
          <input type="date" name="MATURITY_DATE" placeholder="some example" />
          </label>
    </div>
    <div class="large-3 columns">
      <label>Coupon Rate
        <input type="number" step="0.01" name="COUPON_RATE"placeholder="Annual coupon rate %" />  
      </label>
    </div>
    <div class="large-3 columns">
      <label>Face Value
        <input type="number" oninput="this.value=this.value.replace(/[^0-9]/g,'');" name="FACE_VALUE" placeholder="Enter the face value" />
      </label>
    </div>
    <div class="large-3 columns">
      <label> Frequency
        <input type="number" name="FREQUENCY" placeholder="Coupon frequency" />
      </label>
    </div>
    
  </div>
    <div class="row">
        <div class="large-6 columns">
          <label> Coupon Dates
          <input type="text" name="COUPON_DATES" placeholder="Coupon Dates" />
          </label>
        </div>
        <div class="large-3 columns">
          <label>Tick size
            <input type="number" step="0.01" name ="TICK_SIZE" placeholder="Tick Size" />
          </label>
        </div>
    <div class="large-3 columns">
      <div class="row collapse">
        <label>Day Count Convenction</label>
        <select name="DAY_COUNT_CONVENTION">
          <option value="" disabled selected >Select Day Count Convention</option>
          <option value="1">ACT/365</option>
          <option value="2">ACT/360</option>
          <option value="3">30/360</option>
       </select>
      </div>
    </div>
      
        
      
    </div>
    
  </div>
  <div class="row button-section">
    <div class="large-12 columns">
        <input type ="submit" class="button small radius" value="Add Security" />
    </div>
  </div>
  
</form>
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



</body>
</html>