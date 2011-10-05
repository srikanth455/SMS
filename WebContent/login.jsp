<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/lib/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login SMS</title>
</head>
<body>
School Management System
<pre>
<html:form action="/LoginAction.do">
<table>
	<tr>
	<td>Staff Name :</td>
	<td> <html:text property="staffName" />
	<html:errors property="staffName" /></td>
	</tr>
	<tr>
	<td>Staff Password  :</td>
	<td> <html:password property="staffPwd" />
	<html:errors property="staffPwd" /></td>
	</tr>
	<tr>
	<td><html:submit value="Login" /></td>
	</tr>
</table>
</html:form>
</pre>
</body>
</html>
