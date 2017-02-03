/******************************************************************************
 * @File name : SessionUtil.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年8月16日 下午5:46:49
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.utils;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.envisioncn.it.super_sonic.showcase.evaluation.pbg.EvaluationPageBean;


public class SessionUtil {
	
	public static final String USER="user"; 
	
	public static final String EVALIST="evaList"; 
	
	public static final String CODE="code";
	
	public static final String CONDITION="condition"; 
	
	/*
	 * 得到评论列表
	 */
	public static List<EvaluationPageBean> getEvaList(HttpSession session) {
		@SuppressWarnings("unchecked")
		List<EvaluationPageBean> evas = (List<EvaluationPageBean>) session.getAttribute(EVALIST);
		
		return evas;
	}
	
	/*
	 * 得到标识（1-纵向，2-横向）
	 */
	public static String getCode(HttpSession session) {
		
		String code = (String) session.getAttribute(CODE);
		
		return code;
	}
	
	/*
	 * 得到评价条件
	 */
	public static String getCondition(HttpSession session) {
		
		String condition = (String) session.getAttribute(CONDITION);
		
		return condition;
	}
	/*
	 * 得到用户名
	 */
	public static String getUser(HttpSession session) {
		
		String user = (String) session.getAttribute(USER);
		
		return user;
	}
}
