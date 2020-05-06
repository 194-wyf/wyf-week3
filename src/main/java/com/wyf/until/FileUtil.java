package com.wyf.until;

import java.io.File;

public class FileUtil {
	/*
	 * 返回文件的后缀名
	 * 
	 */
	public static String getExtendName(String fileName) {
		if (!StringUtil.hasText(fileName) || !fileName.contains(".")) {
			throw new RuntimeException("文件名不能为空");
		}
		String str = fileName.substring(fileName.lastIndexOf("."));
		return str;
	}
	/*
	 * 返回系统临时目录
	 */
	public static File getTemDirectory() {
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}

	public static File getUserDirectory() {
		String path = System.getProperty("user.home");
		return new File(path);
	}
}
