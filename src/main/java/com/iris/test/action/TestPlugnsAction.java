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

	public String jaauldeCookies() throws Exception {
		return "jaauldeCookies";
	}

	public String uploadify() throws Exception {
		return "uploadify";
	}

	public String artDialogV6() throws Exception {
		return "artDialogV6";
	}

	public String artDialogV4() throws Exception {
		return "artDialogV4";
	}

	public String jqueryPowerFloat() throws Exception {
		return "jquery-powerFloat";
	}

	public String jqueryLoadMask() throws Exception {
		return "jqueryLoadMask";
	}

	public String bootstrap() throws Exception {
		return "bootstrap";
	}

	public String jqueryTmpl() throws Exception {
		return "jqueryTmpl";
	}

	public String jqueryTmpl2() throws Exception {
		return "jqueryTmpl2";
	}

	public String hightCharts() throws Exception {
		return "hightCharts";
	}

	public String jqGrid() throws Exception {
		return "jqGrid";
	}

	public String jqGridTreeGrid() throws Exception {
		return "jqGridTreeGrid";
	}

	public String maxazanJqueryTreegrid() throws Exception {
		return "maxazan-jquery-treegrid";
	}

	public String rowspan() throws Exception {
		return "rowspan";
	}

}
