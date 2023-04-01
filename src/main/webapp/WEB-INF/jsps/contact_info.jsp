<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact info</title>
</head>
<body>
	<a href="viewCreateLeadPage"><input type="button" value="New Lead"/></a>
	<h2>:Contact Details:</h2>
	First Name : ${contact.firstName }<br>
	Last Name : ${contact.lastName }<br>
	Email : ${contact.email}<br>
	Mobile : ${contact.mobile}<br>
	Source : ${contact.source}<br>
	
	<form action="sendEmail" method="post">
		<input type="hidden" name="email" value="${contact.email}"/>
		<input type="submit" value="Send Email"/>
	</form>
	
	<form action="convertLead" method="post">
		<input type="hidden" name="id" value="${contact.id}"/>
		<input type="submit" value="convert"/>
	</form>
</body>
</html>