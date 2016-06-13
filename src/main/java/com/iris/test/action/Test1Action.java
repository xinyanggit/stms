package com.iris.test.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.iris.test.service.ITest1Service;
import com.iris.test.webservice.client.IHelloWorld;
import com.iris.test.webservice.idcard.com._36wu.IdCardServiceSoap;
import com.iris.test.webservice.mobileInfows.cn.com.webxml.MobileCodeWSSoap;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class Test1Action extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Resource(name = "test1Service")
	private ITest1Service test1Service;

	// 自己测试调用自己发布的webservice接口
	@Resource
	private IHelloWorld helloWorldClient;

	// 真实天气预报webservice接口
	@Resource
	private MobileCodeWSSoap mobileCodeWSSoapClient;

	// 身份证查询webservice接口
	@Resource
	private IdCardServiceSoap idCardServiceSoapClient;

	@Override
	public String execute() throws Exception {
		System.out.println("测试开始......");

		// 1、调用短信接口测试
		// TestSendSMS.sendSMS();

		// 2、hibernate测试
		// List list = test1Service.findAll();

		// 3、调用webservice接口
		// String result = helloWorldClient.sayHi("tomcat");
		// System.out.println("result="+result);

		// 4、调用天气预报webservice接口：获得国内手机号码归属地数据库信息，输入参数：无；返回数据：一维字符串数组（省份 城市 记录数量）。
		/*List<String> str = mobileCodeWSSoapClient.getDatabaseInfo().getString();
		for(String infostr : str){
			System.out.println(infostr);
		}*/

		// 5、获得国内手机号码归属地省份、地区和手机卡类型信息</h3><p>输入参数：mobileCode = 字符串（手机号码，最少前7位数字），userID = 字符串（商业用户ID） 免费用户为空字符串；返回数据：字符串（手机号码：省份 城市 手机卡类型）。
		// System.out.println(mobileCodeWSSoapClient.getMobileCodeInfo("13714196207", null));

		// 6、身份证查询:授权AuthKey：1edfa3bcce78449ca400b6af15c3c723请您在一个工作日内完成测试，此AuthKey将于2015-07-12 00:00:00过期，如商用请您购买服务。
		/*ResultOfIdCard resultOfIdCard = idCardServiceSoapClient.getIdCardInfo("413365198810261158", "1edfa3bcce78449ca400b6af15c3c723");
		System.out.println(resultOfIdCard.getMessage());
		System.out.println(resultOfIdCard.getStatus());
		IdCard idCard = resultOfIdCard.getData();
		System.out.println(idCard.getAddress());
		System.out.println(idCard.getBirthday());
		System.out.println(idCard.getIdcard());
		System.out.println(idCard.getSex());*/

		System.out.println("测试结束。");
		return SUCCESS;
	}

}
