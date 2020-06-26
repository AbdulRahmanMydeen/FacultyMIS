<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>new/edit Faculty</title>

</head>
<body>

	<div align="center">
			<h1>New/Edit Faculty</h1>
			<form:form action="save" method="post" modelAttribute="faculty" >
				<table align="center" width=40% cellpadding="2" border="5">
				<form:hidden path="facultyId" name="id"/>
				<tr>
					<td align="left" valign="top" width="41%">Id Number<span style="color:red">*</span></td>
					<td width="57%"><form:input path="facultyId" /></td>
				</tr>
				<tr>
					<td align="left" valign="top" width="41%">First Name<span style="color:red">*</span></td>
					<td width="57%"><form:input path="facultyFirstName" name="FirstName" size="24" />
					<form:errors path="facultyFirstName" /></td>
				</tr>
				<tr>
					<td align="left" valign="top" width="41%">Last Name<span style="color:red">*</span></td>
					<td width="57%"><form:input path="facultyLastName" name="LastName" size="24"/>
					<form:errors path="facultyLastName" /></td>
				</tr>
				<tr>
					<td>Mobile Number<span style="color:red">*</span></td>
					<td width="57%"><form:input path="mobileNumber" size="24" />
					<form:errors path="mobileNumber" /></td>
				</tr>
				<tr>
					<td align="left" valign="top" width="41%">Age<span style="color:red">*</span></td>
					<td width="57%"><form:input path="age" size="24"/>
					<form:errors path="age" /></td>
				</tr>
				<tr>
					<td align="left" valign="top" width="41%">Gender<span style="color:red">*</span></td>
					<td width="57%">
						Male<form:radiobutton path="gender" value="Male"/>
						Female<form:radiobutton path="gender" value="Female"/>
						</td>
				</tr>
				
				<tr>
                	<td align="left" valign="top" width="41%">Qualification<span style="color:red">*</span></td>
                	<td width="57%"><form:select path="qualification">
						<option value="Default">Default</option>
						<option value="M.E in Mechanical Engineering">M.E</option>
						<option value="B.tech">B.tech</option>
						<option value="M.tech">M.tech</option>
						<option value="M.arch">M.arch</option>
						<option value="PhD">PhD</option>
					</form:select>
					</td>
           		</tr>
           		<tr>
                	<td align="left" valign="top" width="41%">Department<span style="color:red">*</span></td>
                	<td width="57%"><form:select path="department">
						<option value="Default">Default</option>
						<option value="EEE">EEE</option>
						<option value="EIE">EIE</option>
						<option value="ECE">ECE</option>
					</form:select>
					</td>
           		</tr>
           		
           		<tr>
					<td align="left" valign="top" width="41%">Designation<span style="color:red">*</span></td>
                	<td width="57%"><form:select path="designation">
						<option value="Default">Default</option>
						<option value="AP-3">AP-3</option>
						<option value="AP-2">AP-2</option>
						<option value="AP-1">AP-1</option>
						<option value="Research Sch">Research Sch</option>
						<option value="Professor">Professor</option>
					</form:select></td>
				</tr>				
				<tr>
					<td align="left" valign="top" width="41%">No of Conferences</td>
					<td width="57%"><form:input path="numberOfConference" />
					<form:errors path="numberOfConference" /></td>
				</tr>
				<tr>
					<td align="left" valign="top" width="41%">No Of Papers</td>
					<td width="57%"><form:input path="numberOfPapers" />
					<form:errors path="numberOfPapers" /></td>
				</tr>
				<tr>
					<td align="left" valign="top" width="41%">Email-Id<span style="color:red">*</span></td>
					<td width="57%"><form:input path="mailId" />
					<form:errors path="mailId" /></td>
				</tr>
				<tr>
					<td align="left" valign="top" width="41%">Username</td>
					<td width="57%"><form:input path="username" />
					<form:errors path="username" /></td>
				</tr>
				<tr>
					<td align="left" valign="top" width="41%">Password</td>
					<td width="57%"><form:input path="password" />
					<form:errors path="password" /></td>
				</tr>
				
				<tr>
                <td colspan="2">
                    <p align="center">
                        <input type="submit" value="Save"></p></td>
                </tr>	
               						
			</table>
			</form:form>
		
		
		</div>
	
</body>
</html>