package com.iris.test;

import java.io.File;
import java.util.regex.Pattern;

import org.artofsolving.jodconverter.OfficeDocumentConverter;
import org.artofsolving.jodconverter.office.DefaultOfficeManagerConfiguration;
import org.artofsolving.jodconverter.office.OfficeManager;

/**
 * 测试word转pdf
 * @author admin
 */
public class Word2PDF {

	public static String getOfficeHome() {
		String osName = System.getProperty("os.name");
		if (Pattern.matches("Linux.*", osName)) {
			return "/opt/openoffice.org3";
		} else if (Pattern.matches("Windows.*", osName)) {
			// return "D:/Program Files/OpenOffice.org 3";
			return "G:/programes/openOffice4.1.2";
		} else if (Pattern.matches("Mac.*", osName)) {
			return "/Application/OpenOffice.org.app/Contents";
		}
		return null;
	}

	public static String getOutputFilePath(String inputFilePath) {
		String outputFilePath = inputFilePath.replaceAll(".doc", ".pdf");
		return outputFilePath;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		word2pdf("F:/testword2pdf.doc");
	}

	/**
	 * 将Office文档转换为PDF. 运行该函数需要用到OpenOffice, OpenOffice
	 * @param sourceFile 源文件,绝对路径. 可以是Office2003-2007全部格式的文档, Office2010的没测试. * 包括.doc, .docx, .xls, .xlsx, .ppt,
	 *            .pptx等.
	 * @param destFile 目标文件.绝对路径.
	 */
	public static void word2pdf(String inputFilePath) {

		DefaultOfficeManagerConfiguration config = new DefaultOfficeManagerConfiguration();

		String officeHome = getOfficeHome();
		config.setOfficeHome(officeHome);

		OfficeManager officeManager = config.buildOfficeManager();
		officeManager.start();

		OfficeDocumentConverter converter = new OfficeDocumentConverter(officeManager);
		String outputFilePath = getOutputFilePath(inputFilePath);
		File inputFile = new File(inputFilePath);
		if (inputFile.exists()) {// 找不到源文件, 则返回
			File outputFile = new File(outputFilePath);
			if (!outputFile.getParentFile().exists()) { // 假如目标路径不存在, 则新建该路径
				outputFile.getParentFile().mkdirs();
			}
			converter.convert(inputFile, outputFile);
		}
		officeManager.stop();
	}
}
