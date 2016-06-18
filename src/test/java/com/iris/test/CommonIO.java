package com.iris.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;

/**
 * 测试Commons的IO工具类
 * 
 * @author admin
 */
public class CommonIO {

	private static final String EXAMPLE_TXT_PATH = "E:\\testio.txt";
	private static final String PARENT_DIR = "E:\\testio";

	public static void main(String[] args) throws Exception {
		copyWebHtml();
	}

	/**
	 * 获取html源码，以html格式保存在本地
	 */
	private static void copyWebHtml() {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new URL("http://182.150.36.121/egrantweb/").openStream();
			outputStream = new FileOutputStream(new File("F:\\test.html"));
			IOUtils.copy(inputStream, outputStream);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(outputStream);
			IOUtils.closeQuietly(inputStream);
		}
	}

	/**
	 * 普通文件copy
	 */
	private static void copyFile() {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream(new File("F:\\eclipse常用设置.doc"));
			outputStream = new FileOutputStream(new File("E:\\copy.doc"));
			IOUtils.copy(inputStream, outputStream);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(outputStream);
			IOUtils.closeQuietly(inputStream);
		}
	}

	/**
	 * 网络下载文件
	 */
	private static void copyWebFile() {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new URL("http://rescdn.qqmail.com/dyimg/20140409/72B8663B7F23.jpg").openStream();
			outputStream = new FileOutputStream(new File("E:\\pic.jpg"));
			IOUtils.copy(inputStream, outputStream);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(outputStream);
			IOUtils.closeQuietly(inputStream);
		}
	}

	/**
	 * 获取url的html源码文件
	 */
	private static void getStringByURL() {
		try {
			InputStream openStream = new URL("http://182.150.36.121/egrantweb/").openStream();
			System.out.println(IOUtils.toString(openStream));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void runExample() throws IOException {
		System.out.println("Utility Classes example...");

		// FilenameUtils
		System.out.println("Full path of exampleTxt: " + FilenameUtils.getFullPath(EXAMPLE_TXT_PATH));
		System.out.println("Full name of exampleTxt: " + FilenameUtils.getName(EXAMPLE_TXT_PATH));
		System.out.println("Extension of exampleTxt: " + FilenameUtils.getExtension(EXAMPLE_TXT_PATH));
		System.out.println("Base name of exampleTxt: " + FilenameUtils.getBaseName(EXAMPLE_TXT_PATH));

		// FileUtils
		// We can create a new File object using FileUtils.getFile(String)
		// and then use this object to get information from the file.
		File exampleFile = FileUtils.getFile(EXAMPLE_TXT_PATH);
		LineIterator iter = FileUtils.lineIterator(exampleFile);
		System.out.println("Contents of exampleTxt...");
		while (iter.hasNext()) {
			System.out.println("t" + iter.next());
		}
		iter.close();

		// We can check if a file exists somewhere inside a certain directory.
		File parent = FileUtils.getFile(PARENT_DIR);
		System.out.println("Parent directory contains exampleTxt file: " + FileUtils.directoryContains(parent, exampleFile));

		// IOCase
		String str1 = "This is a new String.";
		String str2 = "This is another new String, yes!";
		System.out.println("Ends with string (case sensitive): " + IOCase.SENSITIVE.checkEndsWith(str1, "string."));
		System.out.println("Ends with string (case insensitive): " + IOCase.INSENSITIVE.checkEndsWith(str1, "string."));
		System.out.println("String equality: " + IOCase.SENSITIVE.checkEquals(str1, str2));

		// FileSystemUtils
		System.out.println("Free disk space (in KB): " + FileSystemUtils.freeSpaceKb("C:"));
		System.out.println("Free disk space (in MB): " + FileSystemUtils.freeSpaceKb("C:") / 1024);
	}
}
