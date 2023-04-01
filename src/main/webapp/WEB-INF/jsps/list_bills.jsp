<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ include file="menu.jsp" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list bill</title>
</head>
<body>
	<a href="viewCreateLeadPage"><input type="button" value="New Lead"/></a>
	<h2>:List Bills:</h2>
	<table border="1">
		<tr>
			<th> First Name </th>
			<th> Last Name </th>
			<th> Email </th>
			<th> Mobile </th>
			<th> Product </th>
			<th> Amount </th>
		</tr>
		
		<c:forEach var="billing" items="${billing}">
			<tr>
				<td><a href="contactInfo?id=${billing.id }">${billing.firstName}</a></td>
				<td>${billing.lastName}</td>
				<td>${billing.email}</td>
				<td>${billing.mobile}</td>
				<td>${billing.product}</td>
				<td>${billing.amount}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>