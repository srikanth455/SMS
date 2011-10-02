package com.sms.bo;

import org.apache.struts.action.ActionForm;

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

	
	/*public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = super.validate(mapping, request);
		if ((StaffPwd == null || StaffPwd.length() < 6)) {
			errors
					.add("StaffPwd", new ActionMessage(
							"error.StaffPwd.required"));
		}
		if ((StaffName == null || StaffName.length() < 6)) {
			errors.add("StaffName", new ActionMessage(
					"error.StaffName.required"));
		}
		return errors;
	}*/

}
