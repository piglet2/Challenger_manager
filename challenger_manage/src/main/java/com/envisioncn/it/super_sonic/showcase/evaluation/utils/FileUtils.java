/******************************************************************************
 * @File name : FileUtils.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年8月16日 下午5:46:22
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.utils;

import java.io.IOException;
import java.net.URLEncoder;

import sun.misc.BASE64Encoder;

public class FileUtils {
		/**
		 * 下载文件时，针对不同浏览器，进行附件名的编码
		 * 
		 * @param filename
		 *            下载文件名
		 * @param agent
		 *            客户端浏览器
		 * @return 编码后的下载附件名
		 * @throws IOException
		 */
		public static String encodeDownloadFilename(String filename, String agent)
				throws IOException {
			if (agent.contains("Firefox")) { // 火狐浏览器
				filename = "=?UTF-8?B?"
						+ new BASE64Encoder().encode(filename.getBytes("utf-8"))
						+ "?=";
				filename = filename.replaceAll("\r\n", "");
			} else { // IE及其他浏览器
				filename = URLEncoder.encode(filename, "utf-8");
				filename = filename.replace("+"," ");
			}
			return filename;
		}
}
