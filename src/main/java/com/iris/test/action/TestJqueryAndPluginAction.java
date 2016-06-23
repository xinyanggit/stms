package com.iris.test.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.iris.test.service.ITestJqueryAndPluginService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class TestJqueryAndPluginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	ITestJqueryAndPluginService testJqueryAndPluginService;

	@Override
	public String execute() throws Exception {

		return SUCCESS;
	}

	public String jaauldeCookies() throws Exception {

		return "jaauldeCookies";
	}

}
