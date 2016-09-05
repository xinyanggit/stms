/**
 *
 */
package com.iris.test;

import java.util.Date;

import org.apache.commons.validator.routines.DateValidator;
import org.junit.Test;

/**
 * @copyright:Iris Systems(Shenzhen)Limited
 * @Description:
 * @author zhoujian
 * @date 2016年9月30日 下午3:36:22
 */
public class CommonValidator {

	/**
	 * @Description:
	 * @param args
	 * @author zhoujian
	 * @date 2016年9月30日 下午3:36:22
	 */
	public static void main(String[] args) {

	}

	@Test
	public void testDateValidator() {
		DateValidator dateValidator = DateValidator.getInstance();
		Date validate = dateValidator.validate("2016-10-19", "yyyy-MM-dd");
		System.out.println(validate);
	}

}
