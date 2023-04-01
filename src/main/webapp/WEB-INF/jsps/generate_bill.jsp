<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create bill</title>
</head>
<body>
	<a href="viewCreateLeadPage"><input type="button" value="New Lead"/></a>
	<h2>:Create Bill:</h2>
	<form action="saveBill" method="post">
	<pre>
		First Name : <input type="text" name="firstName" value="${contact.firstName }"/><br>
		Last Name : <input type="text" name="lastName" value="${contact.lastName }"/><br>
		Email : <input type="email" name="email" value="${contact.email}"/><br>
		Mobile : <input type="number" name="mobile" value="${contact.mobile}"/><br>
		Product : <input type="text" name="product"/><br>
		Amount : <input type="text" name="amount"/><br>
		<input type="submit" value="Generate Bill"/>
	</pre>
	</form>
</body>
</html>