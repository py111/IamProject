<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body style="background: url('images/index.jpg') no-repeat center center fixed; -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;">
<center>
	<h1><br><br><br>Please LOGIN</h1><br>
	<form name="Loginform" action="./Login"	method="post">

		<table cellspacing="5" border="0">
			<tr>
				<td align="right"><font size="4">User Name:</font></td>
				<td><input type="text" name="UserName" class="form-control"></td>
			</tr>
			<tr>
				<td  align="right"><br><font size="4">Password:</font></td>
				<td><br><input type="text" name="password" class="form-control"></td>
			</tr>
			<tr>
				<td></td>
				<td><br><br> <label><input type="checkbox" value="remember-me"> Remember me</label> <br>
				<br>
				<button name="signin" type="submit" style="background-color:lightblue">LOGIN</button></td>
			</tr>
		</table>
	</form>
</center>
</body>
</html>
