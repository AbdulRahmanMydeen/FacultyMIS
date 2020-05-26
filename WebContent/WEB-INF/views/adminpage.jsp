<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Panel</title>
<style>

a{
	text-decoration:none;

	}

body{
	margin: 0px;
	border: 0px;
	background-color:#c0392b;
	}

#header{
	width: 1323;
	height: 150px;
	background: black;
	color: white;
	border-radius: 50px;
	margin: 10 10 10 10
	}

#sidebar{
	width: 300px;
	height: 500px;
	background: #B22222;
	float: left;
	margin: 20 20 10 10;
	padding: 5px;
	border-radius: 50px;
	font-family: Comic Sans MS;
	font-color: #00ff00;;
	}
	
#data{
	height: 700px;
	background: #c0392b;
	}
	
#adminlogo{
	background: white;
	padding: 5px;
	width: 100px;
	opacity: 0.6;
	margin: 20 20 0 0;
	border-radius: 50px;
	}
	
ul li{
	padding: 20px;
	border-bottom: 4px solid green;
	border-bottom-color: 2px solid grey;
	font: white;
	}
	
ul li:hover{
		background: #2c3e50;
		border-radius: 50px;
		}

</style>
</head>
<body>
	<div id='header'>
<center>
<h2 align = center>Faculty Management System</h2> 
</center>
</div>

<div id='sidebar'>
<ul>
	<li> <a href="newfaculty">Add Faculty</a></li>
	<li> <a href="listfaculties">Manage Faculty Details</a></li>
	<li> <a href="searchfaculty">Search Faculty</a></li>
	<li> <a href="/FacultyManagement">Logout</a></li>
</ul>
</div>

<div id='data'>


</div>
	

</body>
</html>