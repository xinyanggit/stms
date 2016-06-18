package com.iris.test;

import java.io.File;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;

/**
 * 将html转换为pdf格式的文件
 * @author admin
 * 
 */
public class HtmlToPdf {

	// wkhtmltopdf在系统中的路径
	private static final String toPdfTool = "G:\\programes\\wkhtmltopdf\\bin\\wkhtmltopdf.exe";

	/**
	 * @param htmlPath html路径，可以本地硬盘路径或者url
	 * @param destPath pdf保存路径
	 * @return 转换成功返回true
	 */
	public static boolean convert(String htmlPath, String destPath) {
		File file = new File(destPath);
		File parent = file.getParentFile();
		// 如果pdf保存路径不存在，则创建路径
		if (!parent.exists()) {
			parent.mkdirs();
		}

		CommandLine cmdLine = new CommandLine(toPdfTool);
		cmdLine.addArgument(htmlPath, true);
		cmdLine.addArgument(destPath, true);

		DefaultExecutor executor = new DefaultExecutor();

		// 设置执行命令成功的退出值为1
		executor.setExitValue(1);

		// 非阻塞
		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();

		boolean result = true;
		try {
			executor.execute(cmdLine, resultHandler);
			resultHandler.waitFor();
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}

		return result;
	}

	public static void main(String[] args) {
		convert("http://www.irissz.com/cn/", "F:\\tetWkHtmlToPdf.pdf");
	}
}
