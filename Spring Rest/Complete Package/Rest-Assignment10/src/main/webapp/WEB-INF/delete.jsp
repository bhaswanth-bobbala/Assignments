<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete By Name</title>
</head>
<body>
<form action="delete" method="get">
	<p>
		Enter First Name <input type="text" name="firstName"/>
	</p>
	<p>
		Enter Last Name <input type="text" name="lastName"/>
	</p>
	<input type="submit" value="Delete"/>
</form>
</body>
</html>