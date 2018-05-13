<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search the identities</title>
</head>
<body style="background: url('images/about.jpg') no-repeat center center fixed; -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;">
<center>
	<br><br><h1>Search for Identities</h1>
	<p><h2>Enter either User Name OR Last Name OR Email ID</h2></p>
	<form name="Selectionform" action="./Search" method="post">
		<table cellspacing="5" border="0">
			<tr>
				<td align="right"><font size="4"><h3>User Name:</h3></font></td>
				<td><input type="text" name="UserName" /></td>
			</tr>
			<tr>
				<td align="right"><font size="4"><h3>Last Name:</h3></font></td>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr>
				<td align="right"><font size="4"><h3>Email ID:</h3></font></td>
				<td><input type="email" name="email" /></td>
			</tr>
		</table>
		<tr>
			<br> <br> <td><button type="submit" name="Enter"  style="background-color:lightblue">Enter</button></td>
		</tr>
	</form>
</center>
</body>
</html>