<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript" src="livevalidation_standalone.js"></script>
	<div  id="examplePresence">
	   <h3>Presence</h3>
		 <p>Presence will fail if there is no value entered in the field.</p>
		 <p>Enter the field then click somewhere else: 
		   <input type="text" id="f1" />
		   <script type="text/javascript">
		     var f1 = new LiveValidation('f1');
		     f1.add(Validate.Presence);
		   </script>  
		 </p>
  </div>
</body>
</html>