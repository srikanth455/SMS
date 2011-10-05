<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*,com.sms.bo.StudentRegisterForm,com.sms.action.StudentRegisterAction"%>
<%@taglib uri="/WEB-INF/lib/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Students</title>
</head>
<body>

<html:form action="/ViewAction.do">
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
			<td><html:submit value="View" /></td>
		</tr>
	</table>
</html:form>
</body>
</html>
