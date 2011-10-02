package com.sms.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.sms.bo.LoginForm;
import com.sms.util.DbConnection;

public class LoginAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		boolean flag = false;
		Connection conn = DbConnection.getConnection();

		LoginForm loginForm = (LoginForm) form;
		loginForm.setStaffName(request.getParameter("staffName"));
		loginForm.setStaffPwd(request.getParameter("staffPwd"));
		
		if (!loginForm.getStaffName().equals("")
				&& !loginForm.getStaffPwd().equals("")) {
			if (null != conn) {
				String query2 = "select * from userdetails where username = \""
						+ loginForm.getStaffName() + "\" and password = \""
						+ loginForm.getStaffPwd() + "\"";
				Statement stmt;
				try {
					stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(query2);
					while (rs.next()) {
						if (loginForm.getStaffName().equalsIgnoreCase(
								rs.getString("username"))
								&& loginForm.getStaffPwd().equals(
										rs.getString("password"))) {
							flag = true;
						} else {
							flag = false;
						}
					}

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else {
			flag = false;
		}

		if (flag == true) {
			return mapping.findForward("success");
		} else {
			return mapping.findForward("failure");
		}
	}
}
