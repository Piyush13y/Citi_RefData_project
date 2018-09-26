<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table border='1'  bgcolor="yellow">
		<c:forEach var="TradeItem" items="${TradeList}">
			<tr>
				<td color="blue"><c:out value="${TradeItem.ISIN}"></c:out> </td>
				<td><c:out value="${TradeItem.TradeTime}"></c:out> </td>
				<td><c:out value="${TradeItem.Security}"></c:out> </td>				
				<td><c:out value="${TradeItem.TradedPrice}"></c:out> </td>
				<td><c:out value="${TradeItem.TradeDate}"></c:out></td>
				<td><a href="delete?isbn=<c:out value='${TradeItem.Counterparty}'/>">DELETE</a></td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>