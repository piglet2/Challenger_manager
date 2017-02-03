/******************************************************************************
 * @File name : DateUtils.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年8月15日 下午5:58:46
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class DateUtils {
	/**
	 * Format: yyyy-MM-dd
	 */
	public static final String YYYYMMDD = "yyyy-MM-dd";
	/**
	 * Format: yyyy-MM-dd hh:mm:ss
	 */
	public static final String YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";
	
	private static final String DEFAULT_FORMAT = YYYYMMDD;
	
	public static String format(Date date) {
		return format(date, DEFAULT_FORMAT);
	}

	public static String format(Date date, String format) {
		Objects.requireNonNull(date);
		Objects.requireNonNull(format);
		
		return new SimpleDateFormat(format).format(date);
	}
	
}
