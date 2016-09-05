/**
 *
 */
package com.iris.test;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.junit.Test;

/**
 * @copyright:Iris Systems(Shenzhen)Limited
 * @Description:
 * @author zhoujian
 * @date 2016年9月30日 下午4:08:25
 */
public class CommonEmail {
	public static void main(String[] args) {

	}

	@Test
	public void test() {
		try {
			Email email = new SimpleEmail();
			email.setHostName("smtp.exmail.qq.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("jianzhou@irissz.com", "zhoujian123"));
			email.setSSLOnConnect(true);
			email.setFrom("jianzhou@irissz.com");
			email.addTo("452403071@qq.com");
			email.setSubject("TestMail");
			email.setMsg("This is a test mail ... :-)");
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}
