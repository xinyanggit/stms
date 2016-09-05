/**
 *
 */
package com.iris.test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

/**
 * @copyright:Iris Systems(Shenzhen)Limited
 * @Description:
 * @author zhoujian
 * @date 2016年9月30日 下午3:39:16
 */
public class CommonCompress {

	@Test
	public void test() throws Exception {
		//// 创建压缩对象
		ZipArchiveEntry archiveEntry = new ZipArchiveEntry("CompressTest");
		// 要压缩的文件
		FileInputStream fileInputStream = new FileInputStream(new File("E:\\图片\\ioc图标\\6036\\magnifier1.ico"));
		// 输出压缩文件
		ZipArchiveOutputStream archiveOutputStream = new ZipArchiveOutputStream(new File("E:\\图片\\ioc图标\\6036\\test.zip"));
		archiveOutputStream.putArchiveEntry(archiveEntry);
		IOUtils.copyLarge(fileInputStream, archiveOutputStream);

		IOUtils.closeQuietly(archiveOutputStream);
		IOUtils.closeQuietly(fileInputStream);
	}

}
