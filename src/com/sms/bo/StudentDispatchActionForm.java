package com.sms.bo;

import org.apache.struts.action.ActionForm;

public class StudentDispatchActionForm extends ActionForm {

	private String parameter = " ";

	public String getParameter()
	{
		return parameter;
	}

	public void setParameter(String parameter)
	{
		this.parameter = parameter;
	}
}
