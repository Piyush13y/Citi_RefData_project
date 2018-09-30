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
	<table border='1'>
			<tr>
				<td> Acrrued Days</td>
				<td> Accrued Interest</td>
			</tr>
		<c:forEach var="accrued" items="${accValues }">
			<tr>
				<td><c:out value="${accrued.accruedDays}"></c:out> </td>
				<td><c:out value="${accrued.accruedInterest}"></c:out> </td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>