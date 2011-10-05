<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="/WEB-INF/lib/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
Student Registration Form:
<br>
<html:form action="/StudentRegisterAction.do">
	<table>
		<tr>
			<td>First Name:</td>
			<td><html:text property="firstName" /></td>
		</tr>
		<tr>
			<td>Middle Name:</td>
			<td><html:text property="middleName" /></td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td><html:text property="lastName" /></td>
		</tr>
		<tr>
			<td>Father's Name:</td>
			<td><html:text property="fatherName" /></td>
		</tr>
		<tr>
			<td>Mother's Name:</td>
			<td><html:text property="motherName" /></td>
		</tr>
		<tr>
			<td>Residence Address:</td>
			<td><html:text property="resAddress" /></td>
		</tr>
		<tr>
			<td>Class of Joining:</td>
			<td><html:text property="coj" /></td>
		</tr>
		<tr>
			<td>Date of Birth:(dd-MMM-yy)</td>
			<td><html:text property="dob" /></td>
		</tr>
		<tr>
			<td>Sex:</td>
			<td><html:radio property="sex" value="Male"/> Male   
			<html:radio property="sex" value="Female"/>Female</td>
		</tr>
		<tr>
			<td>Parents Email Address(if any):</td>
			<td><html:text property="email" /></td>
		</tr>
		<tr>
			<td><html:submit value="Register" /></td>
		</tr>
	</table>

</html:form>
</body>
</html>
