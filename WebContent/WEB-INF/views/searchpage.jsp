<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Faculty</title>
</head>
<body>
<div align="center">
	<form method = "get" action = "searchfaculty">
  <input type="text" name="searchbar"/>
   <button>find</button>
   </form><br>
	<table border = "11" cellpadding="5">
		<tr>
			<td><b>idNumber</b></td>
			<td><b>FirstName</b></td>
			<td><b>LastName</b></td>
			<td><b>MobileNumber</b></td>
			<td><b>Age</b></td>
			<td><b>Gender</b></td>
			<td><b>Qualification</b></td>
			<td><b>Designation</b></td>  
			<td><b>NumberOfConferences</b></td>
			<td><b>NumberOfPapers</b></td>
			<td><b>EmailId</b></td>
			<td><b>Username</b></td>
			<td><b>Password</b></td>
			
		</tr>
		<c:forEach items="${listFaculties}" var="faculty">
		<tr>
			<td>${faculty.facultyId }</td>
			<td>${faculty.facultyFirstName }</td>
			<td>${faculty.facultyLastName }</td>
			<td>${faculty.mobileNumber }</td>
			<td>${faculty.age }</td>
			<td>${faculty.gender }</td>			
			<td>${faculty.qualification }</td>
			<td>${faculty.designation }</td>
			<td>${faculty.numberOfConference }</td>
			<td>${faculty.numberOfPapers }</td>
			<td>${faculty.mailId }</td>
			<td>${faculty.username}</td>
			<td>${faculty.password}</td>
									
		</tr>
		
		
		</c:forEach>
	
	</table>
	
	</div>
	

</body>
</html>