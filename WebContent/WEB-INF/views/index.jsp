<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<style>
.form {
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
  background-color: green;
}

.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background: #4CAF50;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
}
.form button:hover,.form button:active,.form button:focus {
  background: #43A047;
}

.login-page
{
width: 360px;
  padding: 8% 0 0;
  margin: auto;
}
h2.header {
  text-align: center;
}
	table.center {
	 margin: 0 auto;
     margin-top: 10%;
     border-collapse:collapse;
	}
	
	form{
	border: 3px solid #f1f1f1;
    border-radius: 25px;
	}
	
	@keyframes example {
  0%   {background-color: red;}
  20%  {background-color: yellow;}
  40%  {background-color: blue;}
  60%  {background-color: purple}
  80%  {background-color: green;}
  100% {background-color: red;}
}



</style>
<head>
<title>Spring MVC - Login</title>
</head>
<body>
		<h2 class="header">Login</h2>
	<form:form method="post" action="processLogin">
<div class = "login-page">
<div class = "form"> 
		<table class="center" >
			<form:input path="username" placeholder="Username" />
			<form:password path="password" placeholder="Password"/>
			
			<button>login</button>
			<!-- <tr>
				 <td></td>	
				<!-- <td colspan="2"><input type="submit" value="Login" /></td> 
			</tr> -->	
		</table>
		</div>
 </div>
	</form:form>
</body>
</html>