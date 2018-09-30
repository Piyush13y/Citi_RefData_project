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
	<thead>
		<tr>
			<th>SECURITY ISIN</th>
			<th>TRADE TIME</th>
			<th>TRADE PRICE</th>
			<th>TRADE DATE</th>
			<th>COUNTERPARTY</th>
			<th>CLEAN PRICE</th>
			<th>DIRTY PRICE</th>
			<th>MARKET YIELD</th>
			<th>ACCRUED </th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="TradeItem" items="${tradeList}">
			<tr>
				<td ><c:out value="${TradeItem.secDetails.iSIN}"></c:out> </td>
				<td><c:out value="${TradeItem.tradeTime}"></c:out> </td>
				<td><c:out value="${TradeItem.tradePrice}"></c:out> </td>				
				<td><c:out value="${TradeItem.tradeDate}"></c:out> </td>
				<td><c:out value="${TradeItem.counterParty}"></c:out></td>
				<td><c:out value="${TradeItem.cleanPrice}"></c:out></td>
				<td><c:out value="${TradeItem.dirtyPrice}"></c:out></td>
				<td><c:out value="${TradeItem.marketYield}"></c:out></td>
				<td><a href="showAccrued?tradeId=<c:out value='${TradeItem.tradeId}'/>">Show Accrued</a></td>
			</tr>
		</c:forEach>
	</tbody>
	</table>

</body>
</html>