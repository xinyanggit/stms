package com.iris.test.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.iris.test.service.ITestJqueryAndPluginService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class TestPlugnsAction extends ActionSupport {

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

	public String uploadify() throws Exception {
		return "uploadify";
	}

	public String artDialog() throws Exception {
		return "artDialog";
	}

	public String uploadFile() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpSession session = ServletActionContext.getRequest().getSession();

		String someKey = request.getParameter("someKey");
		System.out.println(someKey);

		response.setCharacterEncoding("utf-8");
		PrintWriter w = response.getWriter();
		w.write("返回的数据！");
		w.flush();
		w.close();

		return null;
	}

}
