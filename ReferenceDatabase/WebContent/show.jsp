<%@page import="com.beans.Security"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "java.util.List" %> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <% 
    //List<Security> securities= (List<Security>)request.getAttribute("securityList");
    
	%>
	<table border="1">
	<thead>
	<tr>
	<th class="text-left">ISIN</th>
	<th class="text-left">ISUUER</th>
	<th class="text-left">FACE VALUE</th>
	<th class="text-left">SECURITY NAME</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="security" items="${securityList}"> 
	<tr>
		<td><c:out value="${security.iSIN}"></c:out> </td>
		<td><c:out value="${security.issuerName}"></c:out> </td>
		<td><c:out value="${security.faceValue}"></c:out> </td>
		<td><c:out value="${security.securityName}"></c:out> </td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
	
	
		<!-- <tr>
	<td class="text-left">SEC_NAME</td>
	<td class="text-left">$ 10,000.00</td>
	<td class="text-left"></td>
	</tr>
	<tr>
	<td class="text-left">ISSUER_NAME</td>
	<td class="text-left">$ 85,000.00</td>
	<td class="text-left"></td>
	</tr>
	<tr>
	<td class="text-left">FACE_VALUE</td>
	<td class="text-left">$ 56,000.00</td>
	<td class="text-left"></td>
	</tr>
	<tr>
	<td class="text-left">COUPON_RATE</td>
	<td class="text-left">$ 98,000.00</td>
	<td class="text-left"></td>
	</tr>
	
	<tr>
	<td class="text-left">FREQUENCY</td>
	<td class="text-left">$ 98,000.00</td>
	<td class="text-left"></td>
	</tr>
	
	<tr>
	<td class="text-left">Maturity_date</td>
	<td class="text-left">$ 98,000.00</td>
	<td class="text-left"></td>
	</tr>
	<tr>
	<td class="text-left">Day_count_convo</td>
	<td class="text-left">$ 98,000.00</td>
	<td class="text-left"></td>
	</tr>
	
	<tr>
	<td class="text-left">COUPON_Date</td>
	<td class="text-left">$ 98,000.00</td>
	<td class="text-left"></td>
	</tr>
	
	<tr>
	<td class="text-left">ISIN</td>
	<td class="text-left">$ 98,000.00</td>
	<td class="text-left"></td>
	</tr>
	 -->
	</tbody>
	</table>
	<a href="/showservlet">III</a>
</body>
</html>
