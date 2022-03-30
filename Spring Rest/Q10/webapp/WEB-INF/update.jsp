<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update the Customer</title>
</head>
<body>
<form action="update" method="post">
	<p>
		Enter First Name <input type="text" name="firstName"/>
	</p>
	<p>
		Enter Last Name <input type="text" name="lastName"/>
	</p>
	<p>
		Enter Street <input type="text" name="street"/>
	</p>
	<p>
		Enter City <input type="text" name="city"/>
	</p>
	<p>
		Enter State <input type="text" name="state"/>
	</p>
	<p>
		Enter Country <input type="text" name="country"/>
	</p>
	<p>
		Enter Zipcode <input type="text" name="zipcode"/>
	</p>
	<input type="submit" value="Update"/>
</form>

</body>
</html>