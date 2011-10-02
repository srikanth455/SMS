<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/lib/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/lib/struts-bean.tld" prefix="bean"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students Home</title>
</head>
<body>
<html:form action="/studentDispatchAction.do">
<p><html:link page="/studentDispatchAction.do?parameter=view">View Students</html:link></p> 
<p><html:link page="/studentDispatchAction.do?parameter=register">Register Students</html:link></p> 
</html:form>
</body>
</html>