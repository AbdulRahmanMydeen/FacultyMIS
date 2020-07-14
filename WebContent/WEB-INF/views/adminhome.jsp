<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Faculty Management System Home</title>

<style>
a{
font-family: Comic Sans MS;
}
#grad {
height : 100%;
}

</style>
</head>
<body>
	<div id=grad>
	<div align="center">
	<h1>Faculty List</h1>
	<table border = "11" cellpadding="5">
		<thead>
		<tr>
			<td><b>idNumber</b></td>
			<td><b>FirstName</b></td>
			<td><b>LastName</b></td>
			<td><b>MobileNumber</b></td>
			<td><b>Age</b></td>
			<td><b>Gender</b></td>
			<td><b>Qualification</b></td>
			<td><b>Department</b></td>
			<td><b>Designation</b></td>  
			<td><b>NumberOfConferences</b></td>
			<td><b>NumberOfPapers</b></td>
			<td><b>EmailId</b></td>
			<td><b>Username</b></td>
			<td><b>Password</b></td>
			<td><b>Action</b></td>
			
		</tr>
		</thead>
		<c:forEach items="${listFaculties}" var="faculty" varStatus="status">
		<tr>
			<td>${faculty.facultyId }</td>
			<td>${faculty.facultyFirstName }</td>
			<td>${faculty.facultyLastName }</td>
			<td>${faculty.mobileNumber }</td>
			<td>${faculty.age }</td>
			<td>${faculty.gender }</td>			
			<td>${faculty.qualification }</td>
			<td>${faculty.department }</td>
			<td>${faculty.designation }</td>
			<td>${faculty.numberOfConference }</td>
			<td>${faculty.numberOfPapers }</td>
			<td>${faculty.mailId }</td>
			<td>${faculty.username}</td>
			<td>${faculty.password}</td>
			<td>
				<a href="edit?id=${faculty.facultyId}">Edit</a>
				&nbsp;&nbsp;
				<a href="delete?id=${faculty.facultyId}">Delete</a>
			</td>
									
		</tr>
		
		
		</c:forEach>
	
	</table>
	<br>
	<a href = "adminpanel"> Back to homepage </a>
	</br>
	</div>
	</div>
</body>
</html>