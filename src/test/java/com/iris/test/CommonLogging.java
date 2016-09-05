/**
 *
 */
package com.iris.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * @copyright:Iris Systems(Shenzhen)Limited
 * @Description:
 * @author zhoujian
 * @date 2016年9月30日 下午4:26:27
 */
public class CommonLogging {
	private static Log log = LogFactory.getLog(CommonLogging.class);

	@Test
	public void test() {
		log.info("-------------");
	}
}
