<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Identity Access Management System</title>
</head>
<body style="background: url('images/modify.jpg') no-repeat center center fixed; -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;">
	<center>
		<br><br><br>
		<h1><marquee width="80%" behavior="alternate"><font color="white">I AM IDENTITY MANAGEMENT SYSTEM</font></marquee></h1>
		<form name="About" action="about.jsp" method="get">
			<br> <br>
			<button name="About" type="submit" style="background-color:lightblue">About the System</button>
		</form>
		<form name="Create" action="newuser.jsp" method="get">
			<br> <br>
			<button name="create" type="submit" style="background-color:lightblue">Create New User</button>
		</form>
		<form name="List" action="GetList" method="get">
			<br> <br>
			<button name="List" type="submit" style="background-color:lightblue">List of Users</button>
		</form>
		<form name="Search" action="search.jsp" method="get">
			<br> <br>
			<button name="Search" type="submit" style="background-color:lightblue">Search User</button>
		</form>
		<form name="Exit" action="exit.jsp" method="get">
			<br> <br>
			<button name="exit" type="submit" style="background-color:lightblue">Logout</button>
		</form>
	</center>
</body>
</html>