package com.sms.action;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.*;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sms.bo.StudentRegisterForm;
import com.sms.util.DbConnection;

public class StudentRegisterAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Connection conn = DbConnection.getConnection();

		StudentRegisterForm studentForm = (StudentRegisterForm) form;
		studentForm.setFirstName(request.getParameter("firstName"));
		studentForm.setMiddleName(request.getParameter("middleName"));
		studentForm.setLastName(request.getParameter("lastName"));
		studentForm.setFatherName(request.getParameter("fatherName"));
		studentForm.setMotherName(request.getParameter("motherName"));
		studentForm.setResAddress(request.getParameter("resAddress"));
		studentForm.setCoj(request.getParameter("coj"));
		studentForm.setDob(request.getParameter("dob"));
		studentForm.setSex(request.getParameter("sex"));
		studentForm.setEmail(request.getParameter("email"));
		
		DateFormat formatter ; 
		Date date = new Date(System.currentTimeMillis());  
		  formatter = new SimpleDateFormat("dd-MMM-yy");
		  String dateString = request.getParameter("dob").toString();
//		  date = (Date)formatter.parse("dateString");
		  String ds = formatter.format(date);
		  String s = formatter.format(date);
		
		  if (null != conn) {
			String query = "INSERT INTO student_details (firstName, middleName, lastName, fatherName, motherName, resAddress, coj, dob, sex, email) "
					+ "VALUES ( \""
					+ studentForm.getFirstName()
					+ "\",\""
					+ studentForm.getMiddleName()
					+ "\",\""
					+ studentForm.getLastName()
					+ "\",\""
					+ studentForm.getFatherName()
					+ "\",\""
					+ studentForm.getMotherName()
					+ "\",\""
					+ studentForm.getResAddress()
					+ "\",\""
					+ studentForm.getCoj()
					+ "\",\""
					+ date
					+ "\",\""
					+ studentForm.getSex()
					+ "\",\""
					+ studentForm.getEmail() + "\")";

			Statement stmt;
			try {
				stmt = conn.createStatement();
				stmt.executeUpdate(query);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return mapping.findForward("success");
		}
		else 
			return mapping.findForward("failure");
	}
}
