<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC - Login</title>
</head>
<body>
	<h2>Login</h2>
	<form:form method="post" action="processLogin">
 
		<table>
			<tr>
				<td><form:label path="username">User Name</form:label></td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login" /></td>
			</tr>
		</table>
 
	</form:form>
</body>
</html>