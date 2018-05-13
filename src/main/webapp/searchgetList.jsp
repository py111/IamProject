<%@ page import="in.py.iam.datamodel.Identity"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background: url('images/about.jpg') no-repeat center center fixed; -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;">
<center>
	<%
		List<Identity> identityList = (List<Identity>) session.getAttribute("identityList");
		//instruction in java console
		System.out.println("testToConsole");
	%>
	<div>
		<table style="background-color: #ffffcc;" border="1" cellpadding="5">
			<br><h1>List Of Users</h1><br>
			<tr>
				<th>UserName</th>
				<th>LastName</th>
				<th>FirstName</th>
				<th>Email</th>
				<th>Password</th>
				<th>Birthdate</th>
				<th>UPDATE</th>
				<th>DELETE</th>
			</tr>
			<%
				if (identityList == null || identityList.isEmpty()) {
			%>
			<tr>
				<td colspan="2">Nothing to display</td>
			</tr>
			<%
				} else {
					for (Identity identity1 : identityList) {
			%>
			<tr>
				<td><%=identity1.getUserName()%></td>
				<td><%=identity1.getLastName()%></td>
				<td><%=identity1.getFirstName()%></td>
				<td><%=identity1.getEmailid()%></td>
				<td><%=identity1.getPassword()%></td>
				<td><%=identity1.getBirthdate()%></td>
				<form action="update.jsp" method="post">
					<input type="hidden" name="UserName" value="<%=identity1.getUserName()%>">
					<td><br><button name="update" type="submit">UPDATE</button></td>
				</form>
				<form action="Delete" method="post">
					<input type="hidden" name="UserName" value="<%=identity1.getUserName()%>">
					<td><br><button name="delete" type="submit">DELETE</button></td>
				</form>

			</tr>
			<%
				}
				}
			%>
		</table>
		
		<form name="Exit" action="Modify.jsp" method="get">
			<br> <br>
			<button name="exit" type="submit" style="background-color:lightblue">BACK</button>
		</form>
</div>
</center>
</body>
</html>