/**
 * 
 */
package com.iris.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.iris.test.utils.HttpClientUtil;

/**
 * @copyright:Iris Systems(Shenzhen)Limited
 * @Description:
 * @author zhoujian
 * @date 2016年6月18日 下午3:11:46
 */
public class TestHttpClient {

	@Test
	public void getHtmlByHttpClient() {
		String urlStr = "http://182.150.36.121/egrantweb/";
		String htmlStr = "";

		HttpClient httpClient = HttpClientUtil.getHttpClient();

		// 创建httppost
		HttpPost httpPost = new HttpPost(urlStr);

		// 创建参数队列
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		// formparams.add(new BasicNameValuePair("keyCode", ""));

		try {
			UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(formparams, HTTP.UTF_8);
			httpPost.setEntity(uefEntity);
			HttpResponse response;
			response = httpClient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			if (response.getStatusLine().getStatusCode() != 200) {
				httpPost.abort(); // 终止 此次链接
			}
			if (entity != null) {
				htmlStr = EntityUtils.toString(entity, HTTP.UTF_8);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭连接,释放资源
			httpPost.abort();
			// httpClient.getConnectionManager().shutdown();
		}
		System.out.println(htmlStr);
	}
}
