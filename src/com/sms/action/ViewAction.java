package com.sms.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sms.bo.StudentRegisterForm;
import com.sms.util.DbConnection;

public class ViewAction extends Action {

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

		List<StudentRegisterForm> viewStudents = new ArrayList<StudentRegisterForm>();

		if (null != conn) {
			String query1 = "select * from student_details";
			Statement stmt;
			try {
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query1);
				while (rs.next()) {
					studentForm.setFirstName(rs.getString("firstName"));
					studentForm.setMiddleName(rs.getString("middleName"));
					studentForm.setLastName(rs.getString("lastName"));
					studentForm.setFatherName(rs.getString("fatherName"));
					studentForm.setMotherName(rs.getString("motherName"));
					studentForm.setResAddress(rs.getString("resAddress"));
					studentForm.setCoj(rs.getString("coj"));
//					studentForm.setDob(rs.getString("dob"));
					studentForm.setSex(rs.getString("sex"));
					studentForm.setEmail(rs.getString("email"));
					viewStudents.add(studentForm);
				}
				request.setAttribute("viewedStudents", viewStudents);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			//request.getRequestDispatcher("/view.jsp");
			return mapping.findForward("request.getRequestDispatcher('/view.jsp')");
		} else
			return mapping.findForward("failure");
	}
}
