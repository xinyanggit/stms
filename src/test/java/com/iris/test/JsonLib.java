/**
 * 
 */
package com.iris.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @copyright:Iris Systems(Shenzhen)Limited
 * @Description:测试jsonLib
 * @author zhoujian
 * @date 2016年6月14日 上午11:59:33
 */
public class JsonLib {

	/**
	 * @Description:
	 * @param args
	 * @author zhoujian
	 * @date 2016年6月14日 上午11:59:33
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/**
		 * 将 Json 形式的字符串转换为 Map
		 */
		String str = "{\"total\": 1, " + "\"enterprise_list\": [{\"unit\": \"1229\", \"est_date\": \"1994-03-02\",\"inst_code\": \"201966768\", "
				+ "\"pt_name\": \"成都彩虹电器（集团）股份有限公司\",\"pt_sn\": 300890589,\"accp_no\": \"20150612\",\"check_date\": null,\"idno\": \"915101002019667683\","
				+ "\"reg_no\": \"510100000109497\"}],\"code\": \"200\",\"ip\": \"58.250.204.14\"}";
		JSONObject jsonObject = JSONObject.fromObject(str);
		Object object = jsonObject.get("enterprise_list");
		JSONArray jsonArray = JSONArray.fromObject(object);
		System.out.println(jsonArray.get(0));

		// Map<String, Object> map = (Map<String, Object>) JSONObject.toBean(jsonObject, Map.class);
	}

	/**
	 * @Description:
	 * @author zhoujian
	 * @date 2016年6月14日 下午2:26:21
	 */
	private static void toJson() {
		/**
		 * 解析 HashMap
		 */
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Tom");
		map.put("age", 33);
		JSONObject jsonObject = JSONObject.fromObject(map);
		System.out.println(jsonObject);

		/**
		 * 将 Array 解析成 Json 串
		 */
		String[] str = { "Jack", "Tom", "90", "true" };
		JSONArray json = JSONArray.fromObject(str);
		System.err.println(json);

		/**
		 * 对像数组，注意数字和布而值
		 */
		Object[] o = { "北京", "上海", 89, true, 90.87 };
		json = JSONArray.fromObject(o);
		System.err.println(json);

		/**
		 * 使用集合类
		 */
		List<String> list = new ArrayList<String>();
		list.add("Jack");
		list.add("Rose");
		json = JSONArray.fromObject(list);
		System.err.println(json);

		/**
		 * 使用 set 集
		 */
		Set<Object> set = new HashSet<Object>();
		set.add("Hello");
		set.add(true);
		set.add(99);
		json = JSONArray.fromObject(set);
		System.err.println(json);
	}

}
