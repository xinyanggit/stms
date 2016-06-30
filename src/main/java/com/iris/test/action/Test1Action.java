package com.iris.test.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.iris.test.service.ITest1Service;
import com.iris.test.webservice.client.IHelloWorld;
import com.iris.test.webservice.cxpt.ICdxyWebserviceActionPortType;
import com.iris.test.webservice.dxpt.ServiceSoap;
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

	// 成都诚信平台接口
	@Autowired
	private ICdxyWebserviceActionPortType cdxyWebserviceActionClient;

	// 成都商务局短信平台对接
	@Autowired
	private ServiceSoap smsServiceClient;

	@Override
	public String execute() throws Exception {

		// 8、成都商务局短信接口调试
		cdmccSendSms();

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

		// 5、获得国内手机号码归属地省份、地区和手机卡类型信息</h3><p>输入参数：mobileCode = 字符串（手机号码，最少前7位数字），userID = 字符串（商业用户ID）
		// 免费用户为空字符串；返回数据：字符串（手机号码：省份 城市 手机卡类型）。
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

		/**
		 * 7、测试成都诚信平台接口。格式：{\ "ptName\":\"成都彩虹电器（集团）股份有限公司\",\"pageNo\":\"1\",\"pageNum\":\"5\",\"userId\":\"deyang\",\"ipAddress\":\"192.168.42.95\"} select *
		 * decode(nvl(t.org_no_type,0),0,t.org_no,t.org_shxy_no) as ,t.*,t.rowid from organization t;
		 */
		// getQyList:按页获取主体基础信息
		// getQyList();

		// getQyDetail:获取主体基础信息
		// getQyDetail();

		// getXzxkList:获取主体行政许可信息
		// getXzxkList();

		// getBlxxList:获取主体不良信息
		// getBlxxList();

		// getRyxxList:获取主体业绩信息
		// getRyxxList();

		return SUCCESS;
	}

	/**
	 * @Description:
	 * @author zhoujian
	 * @date 2016年7月2日 下午3:15:02
	 */
	private void cdmccSendSms() {
		String uid = "96";// 用户名
		String upass = "swwsms160701";// 密码
		String message = "成都商务局短信平台对接测试！";
		String phone = "13714196207";
		int pid = 4;// 必须为4
		String messid = "898989892";// 短信唯一标识,最大长度22,我们自定义为sms_log.mail_code

		String returnsString = smsServiceClient.sendMessage(uid, upass, messid, pid, phone, message);
		System.out.println("sendMessage()返回结果=" + returnsString);
	}

	/**
	 * @Description:
	 * @author zhoujian
	 * @date 2016年6月14日 下午3:23:55
	 */
	private void getRyxxList() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", "shenzhenxinyong");// 用户id
		map.put("ipAddress", "192.168.42.95");// 授信IP地址
		map.put("ptSn", "5187047899");// 主体编号
		String jsonString = JSONObject.fromObject(map).toString();
		String qyList = cdxyWebserviceActionClient.getRyxxList(jsonString);
		System.out.println(qyList);// {"code":"300","msg":"未查询到数据","ip":"58.250.204.14"}
	}

	/**
	 * @Description:
	 * @author zhoujian
	 * @date 2016年6月14日 下午3:23:41
	 */
	private void getBlxxList() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", "shenzhenxinyong");// 用户id
		map.put("ipAddress", "192.168.42.95");// 授信IP地址
		map.put("ptSn", "5187047899");// 主体编号
		String jsonString = JSONObject.fromObject(map).toString();
		String qyList = cdxyWebserviceActionClient.getBlxxList(jsonString);
		System.out.println(qyList);
	}

	/**
	 * @Description:
	 * @author zhoujian
	 * @date 2016年6月14日 下午3:23:28
	 */
	private void getXzxkList() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", "shenzhenxinyong");// 用户id
		map.put("ipAddress", "192.168.42.95");// 授信IP地址
		map.put("ptSn", "5187047899");// 主体编号
		String jsonString = JSONObject.fromObject(map).toString();
		String qyList = cdxyWebserviceActionClient.getXzxkList(jsonString);
		System.out.println(qyList);// {"code":"300","msg":"未查询到数据","ip":"58.250.204.14"}
	}

	/**
	 * @Description:
	 * @author zhoujian
	 * @date 2016年6月14日 下午3:23:18
	 */
	private void getQyDetail() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", "shenzhenxinyong");// 用户id
		map.put("ipAddress", "192.168.42.95");// 授信IP地址
		map.put("ptSn", "5187047899");// 主体编号
		String jsonString = JSONObject.fromObject(map).toString();
		String qyList = cdxyWebserviceActionClient.getQyDetail(jsonString);
		System.out.println(qyList);// "code": "200"
	}

	/**
	 * @Description:
	 * @author zhoujian
	 * @date 2016年6月14日 下午3:23:09
	 */
	private void getQyList() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", "shenzhenxinyong");// 用户id
		map.put("ipAddress", "192.168.42.95");// 授信IP地址
		// map.put("regNo", "510100000109497");// 营业执照注册号
		map.put("instCode", "077664403");// 组织机构代码
		map.put("pageNo", "1");
		map.put("pageNum", "10");
		// map.put("idno", "915101002019667683");// 统一社会信用码
		String jsonString = JSONObject.fromObject(map).toString();
		String qyList = cdxyWebserviceActionClient.getQyList(jsonString);
		System.out.println(qyList);

		/*String jsonString = "{\"userId\":\"shenzhenxinyong\",\"instCode\":\"077664403\",\"ipAddress\":\"192.168.42.95\"}";
		String qyList = cdxyWebserviceActionClient.getQyList(jsonString);
		System.out.println(qyList);*/
	}
}
