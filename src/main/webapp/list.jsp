<%@ page import="in.py.iam.datamodel.Identity"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Of Identities</title>
</head>
<body style="background: url('images/about.jpg') no-repeat center center fixed; -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;">
<div><center>
	<form class="getList" action="./GetList" method="post">
		<%
			List<Identity> identityList = (List<Identity>) session.getAttribute("identityList");
		%>
		<table style="background-color:white" border="2" cellpadding ="15">
		
				<br><br><h1>List Of Users</h1>
				<tr>
					<th>UserName</th>
					<th>LastName</th>
					<th>FirstName</th>
					<th>Email</th>
					<th>Password</th>
					<th>Birthdate</th>
					<%
						if (identityList == null || identityList.isEmpty()) {
					%>

					<td colspan="2">Nothing to display</td>

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
				</tr>
				
				<%
					}
					}
				%>
				
			</table>
	</form>
		
<form name="Exit" action="Modify.jsp" method="get">
			<br> <br>
			<button name="exit" type="submit" style="background-color:lightblue">BACK</button>
		</form>
	</center></div>
</body>
</html>