package com.iris.test.service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import sun.misc.BASE64Encoder;
/**
 * 测试佛山科技局短信发送服务
 * @author admin
 *
 */
public class TestSendSMS {
	
	private static String uc;
	private static String mm;
	private static String registerUrl;
	private static String callBackUrl;
	private static String sendSmsUrl;
	private static String sessionId;
	private static final String NEED_ECHO = "1";

	public TestSendSMS(String uc, String mm, String registerUrl, String callBackUrl, String sendSmsUrl) {
		this.uc = uc;
		this.mm = mm;
		this.registerUrl = registerUrl;
		this.callBackUrl = callBackUrl;
		this.sendSmsUrl = sendSmsUrl;
		// sessionId = getSessionId();
	}

	@SuppressWarnings("restriction")
	public static void sendSMS() {
		// 075782160512为生产用号码
		// 075782160509为测试用号码
		uc = "075782160509";//075782160507（60条能接收22条） 075782160517（60条能接收0条） 075783385761（60条能接收0条）
		mm = "12345678";
		registerUrl = "http://202.105.212.146:8080/jboss-net/services/Register?wsdl";
		callBackUrl = "http://kjyw.fskw.gov.cn:8080/stms/services/TelSmsService";
		sendSmsUrl = "http://202.105.212.146:8080/jboss-net/services/SendSMS?wsdl";
		
		if (sessionId == null) {
			sessionId = getSessionId();
		}
		
		BASE64Encoder base64en = new BASE64Encoder();

		for (int i = 1; i <=60; i++) {
			String content = "Message test,I have sended 60 messages,the message interface is ok if you have received 60,otherwise there is a problem with it ! By zhoujian";
			String mobile = "13714196207";//15820459722
			String mailCode = "6688";
			String enContent = null;
			try {
				enContent = new String(content.getBytes(), "UTF-8");
				enContent = base64en.encode(enContent.getBytes("GBK"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			System.out.println("BASE64加密后的短信内容："+enContent);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// 调用发送短信接口，并接收返回值
			String stat = sendMessage(new String[]{mobile}, enContent, NEED_ECHO, Integer.valueOf(mailCode).intValue());
		}
	}

	private static String md5s(String plainText) {
		MessageDigest md = null;

		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		md.update(plainText.getBytes());
		byte b[] = md.digest();

		int i;

		StringBuffer buf = new StringBuffer("");
		for (int offset = 0; offset < b.length; offset++) {
			i = b[offset];
			if (i < 0)
				i += 256;
			if (i < 16)
				buf.append("0");
			buf.append(Integer.toHexString(i));
		}
		return buf.toString();
	}

	private static String getRandom() {
		return executeMethod(registerUrl, "getRandom", new Object[]{});
	}

	private static String getSessionId() {
		String random = getRandom();
		String md5Mm = md5s(random + mm + mm);
		return executeMethod(registerUrl, "setCallBackAddr", new Object[]{uc, md5Mm, random, callBackUrl});
	}

	//发送短信的关键接口
	private static String sendMessage(String[] mobiles, String content, String needEcho, int mailCode) {
		String random = getRandom();
		String md5Mm = md5s(random + mm + mm);
		return executeMethod(sendSmsUrl, "sendSMS", new Object[]{uc, md5Mm, random, mobiles, needEcho, content, mailCode, sessionId});
	}

	private static String executeMethod(String url, String method, Object[] params) {
		Service service = new Service();
		Call call = null;
		String strRtn = null;

		try {
			call = (Call) service.createCall();
			call.setTargetEndpointAddress(url);
			call.setOperationName(new QName(url, method));
			strRtn = (String) call.invoke(params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strRtn;
	}
	
	public static void main(String[] args) {
		sendSMS();
	}
}




