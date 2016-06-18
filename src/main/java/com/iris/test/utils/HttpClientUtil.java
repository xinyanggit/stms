package com.iris.test.utils;

/**
 * @author huangt
 * @time:2013.3.11
 * @功能：HttpClient连接池
 * */
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class HttpClientUtil {
	private static ThreadSafeClientConnManager cm = null; // 多连接的线程安全的管理器
	private static int MAX_TOTAL = 500; // 最大连接数
	private static int defaultMaxConnection = 100; // 默认最大 主机连接数
	public final static int CONNECT_TIMEOUT = 10000; // 连接超时时间
	public final static int SOCKET_TIMEOUT = 10000; // 读取数据超时时间

	static {
		// 设置访问协议
		SchemeRegistry schemeRegistry = new SchemeRegistry();
		schemeRegistry.register(new Scheme("http", 80, PlainSocketFactory.getSocketFactory()));
		schemeRegistry.register(new Scheme("https", 443, SSLSocketFactory.getSocketFactory()));
		cm = new ThreadSafeClientConnManager(schemeRegistry);
		try {
			cm.setMaxTotal(MAX_TOTAL);
			// 每条通道的并发连接数设置（连接池）
			cm.setDefaultMaxPerRoute(defaultMaxConnection);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static HttpClient getHttpClient() {
		HttpParams params = new BasicHttpParams();
		// HTTP 协议的版本,1.1/1.0/0.9
		params.setParameter(CoreProtocolPNames.PROTOCOL_VERSION, HttpVersion.HTTP_1_1);
		/* 连接超时 */
		HttpConnectionParams.setConnectionTimeout(params, CONNECT_TIMEOUT);
		/* 请求超时 */
		HttpConnectionParams.setSoTimeout(params, SOCKET_TIMEOUT);

		return new DefaultHttpClient(cm, params);
	}

	public static void release() {
		if (cm != null) {
			cm.shutdown();
		}
	}
}
