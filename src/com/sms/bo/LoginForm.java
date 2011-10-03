package com.sms.bo;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm {
	private String staffName;
	private String staffPwd;

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffPwd() {
		return staffPwd;
	}

	public void setStaffPwd(String staffPwd) {
		this.staffPwd = staffPwd;
	}

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors =new ActionErrors();
		if ((staffPwd == null || staffPwd.length() < 6)) {
			errors
					.add(staffPwd, new ActionError(
							"error.StaffPwd.required"));
		}
		if ((staffName == null || staffName.length() < 6)) {
			errors.add(staffName, new ActionError(
					"error.StaffName.required"));
		}
		return errors;
	}

}
