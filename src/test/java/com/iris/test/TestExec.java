package com.iris.test;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;
import org.apache.commons.io.output.ByteArrayOutputStream;

public class TestExec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ping("www.baidu.com1"));
	}

	public static String ping(String ip) {

		try {

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			ByteArrayOutputStream errorStream = new ByteArrayOutputStream();

			String command = "ping " + ip;
			CommandLine commandline = CommandLine.parse(command);

			DefaultExecutor exec = new DefaultExecutor();
			exec.setExitValues(null);
			exec.setStreamHandler(new PumpStreamHandler(outputStream, errorStream));
			exec.execute(commandline);

			String out = outputStream.toString("gbk");
			String error = errorStream.toString("gbk");

			return out + error;

		} catch (Exception e) {
			return e.toString();
		}

	}
}
