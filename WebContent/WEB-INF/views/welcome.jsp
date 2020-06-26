<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
  
}
th, td {
  padding: 5px;
  text-align: left;
}

</style>

<meta charset="ISO-8859-1">
<title>User Panel</title>
</head>
<body>
 <table style = "width:30%">
            <tr>
            	<th>First Name:</th>
                <td>${firstname}</td>
            </tr>
            <tr>
            	<th>Last Name:</th>
                <td>${lastname}</td>
            </tr>
			<tr>
            	<th>Department:</th>
                <td>${department}</td>
            </tr>
            <tr>
            	<th>Designation:</th>
                <td>${designation}</td>
            </tr>
            </table>
            
</body>
</html>