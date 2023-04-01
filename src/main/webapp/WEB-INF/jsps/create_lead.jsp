<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create new lead</title>
</head>
<body>
	<h2>:Create New Lead:</h2>
	<form action="saveLead" method="post">
	<pre>
		First Name : <input type="text" name="firstName" placeholder="Enter First Name"/><br>
		Last Name : <input type="text" name="lastName" placeholder="Enter Last Name"/><br>
		Email : <input type="email" name="email" placeholder="Enter Email"/><br>
		Mobile : <input type="number" name="mobile" placeholder="Enter Mobile"/><br>
		Source : <select name="source" >
					 <option value="Select">Select</option>
					 <option value="radio">Radio</option>
					 <option value="news paper">News Paper</option>
					 <option value="trade show">Trade Show</option>
					 <option value="website">Website</option>
				</select><br>
		<input type="submit" value="save"/>
	</pre>
	</form>
</body>
</html>