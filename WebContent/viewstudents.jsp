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
<style>
.border {
	color: green;
}
</style>
</head>
<body>
<%
	List<StudentRegisterForm> viewStudentsList = (List<StudentRegisterForm>) request
			.getAttribute("viewedStudents");
%>
<table>
	<tr>
		<th colspan="6" style="background-color: #7c2f97;">View Students:</th>
	</tr>
	<tr style="background-color: #f0a64e;">
		<th class="border">First Name</th>
		<th class="border">Middle Name</th>
		<th class="border">Last Name</th>
		<th class="border">Father Name</th>
		<th class="border">Mother Name</th>
		<th class="border">Residence Address</th>
		<th class="border">Class of Joining</th>
		<th class="border">Date of Birth</th>
		<th class="border">Sex</th>
		<th class="border">Email</th>

	</tr>
	<%
		for (StudentRegisterForm studentForm : viewStudentsList) {
	%>
	<tr>
		<td><%=studentForm.getFirstName()%></td>
		<td><%=studentForm.getMiddleName()%></td>
		<td><%=studentForm.getLastName()%></td>
		<td><%=studentForm.getFatherName()%></td>
		<td><%=studentForm.getMotherName()%></td>
		<td><%=studentForm.getResAddress()%></td>
		<td><%=studentForm.getCoj()%></td>
		<td><%=studentForm.getDob()%></td>
		<td><%=studentForm.getSex()%></td>
		<td><%=studentForm.getEmail()%></td>
	</tr>
	<%
		}
	%>
</table>
</body>
</html>
