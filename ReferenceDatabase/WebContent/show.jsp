show.java<%@page import="com.beans.Security"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <% 
    Security security=(Security)request.getAttribute("security");
	
	%>
	
	<div class="table-title">
		<h3>Data Table</h3>
	</div>
	<table class="table-fill"  >
	<thead>
	<tr>
	<th class="text-left">Month</th>
	<th class="text-left">Sales</th>
	<th class="text-left">Extra Info</th>
	</tr>
	</thead>
	<tbody class="table-hover">
	<tr>
	<td class="text-left">SECID</td>
	<td class="text-left"><%security.getISIN(); %></td>
	<td class="text-left"></td>
	</tr>
	<tr>
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
	
	</tbody>
	</table>
	<a href="/showservlet"></a>
</body>
</html>
