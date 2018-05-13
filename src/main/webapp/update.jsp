<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Page</title>
</head>
<body style="background: url('images/about.jpg') no-repeat center center fixed; -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;">
  	<center><br><br><br><br><br>
  	<h2>Update the Identity</h2><br>
		<form action="./Update" method="post">
		<input type="hidden" name="UserName" value="<%=request.getParameter("UserName")%>">
            <table cellspacing="5" border="0">
			<tr>
				<td align="right">Last name:</td><td>
				<input type="text" name="lastName" value="${identity.lastName}"></td>
			</tr>
			<tr>
				<td align="right">First name:</td><td>
				<input type="text" name="firstName" value="${identity.firstName}"></td>
			</tr>
			<tr>
				<td align="right">Email Address:</td><td>
				<input type="text" name="emailid" value="${identity.emailid}"></td>
			</tr>
			<tr>
				<td align="right">Password:</td><td>
				<input type="text" name="password" value="${identity.password}"></td>
			</tr>
			<tr>
				<td align="right">Birthdate:</td><td>
				<input type="date" name="birthdate" value="${identity.birthdate}"></td>
			</tr>
				<td></td>
				<td><br><input type="submit" value="Submit"></td>
			</table>
		</form>
	</center>

</body>
</html>