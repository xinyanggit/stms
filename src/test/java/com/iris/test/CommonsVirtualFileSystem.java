/**
 *
 */
package com.iris.test;

import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.VFS;
import org.junit.Test;

/**
 * @copyright:Iris Systems(Shenzhen)Limited
 * @Description:
 * @author zhoujian
 * @date 2016年9月30日 下午3:37:39
 */
public class CommonsVirtualFileSystem {

	@Test
	public void testVFS() throws FileSystemException {
		FileSystemManager fileSystemManager = VFS.getManager();
		FileObject fileObj = fileSystemManager.resolveFile("zip:E:\\开发包\\uploadify.zip");
		FileObject[] children = fileObj.getChildren();
		for (int i = 0; i < children.length; i++) {
			System.out.println(children[i].getName().getBaseName());
			System.out.println(children[i].getURL());
		}
	}

}
