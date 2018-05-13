<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body style="background: url('images/about.jpg') no-repeat center center fixed; -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;">
<center>
	<font size="4"><br> <%
 	String message = (String) request.getAttribute("message");
 %> ${requestScope.message}</font>
	<br><br>
	<p><font size="5"><h1>To Create A New Identity, Enter Below Details</h1></font></p>
	<p><i>${message}</i></p>

<div>
	<form name="userEntryForm" action="./Create" method="post">

		<table cellspacing="5" border="0">
			<tr><td align="right"><h3>User name:</h3></td><td><input type="text" name="UserName"></td></tr>
			<tr><td align="right"><h3>Last name:</h3></td><td><input type="text" name="lastName"></td></tr>
			<tr><td align="right"><h3>First name:</h3></td><td><input type="text" name="firstName"></td></tr>
			<tr><td align="right"><h3>Email address:</h3></td><td><input type="email" name="emailid"></td></tr>
			<tr><td align="right"><h3>Password:</h3></td><td><input type="text" name="password"></td></tr>
			<tr><td align="right"><h3>Birth date:</h3></td><td><input type="date" name="birthdate"></td></tr>
			<tr><td></td><td><br> <input type="submit" name="createProfile" value="Submit"  style="background-color:lightblue"></td></tr>
		</table>
	</form>
</div>
</center>
</body>
</html>