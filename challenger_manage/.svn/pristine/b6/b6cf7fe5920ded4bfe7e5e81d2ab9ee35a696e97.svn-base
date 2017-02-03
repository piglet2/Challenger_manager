/******************************************************************************
 * @File name   :      LoginInterceptor.java
 *
 * @Author      :      xiaobo.qin
 *
 * @Date        :      2016年6月4日 下午1:10:17
 *
 * @Copyright Notice: 
 * Copyright (c) 2016 Envision, Inc. All  Rights Reserved.
 * This software is published under the terms of the Envision Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.support;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.envisioncn.it.super_sonic.showcase.evaluation.utils.SessionUtil;


public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
		String uri = req.getRequestURI();
		if (!uri.startsWith("/resources/") && !uri.startsWith("/icon/") && !uri.startsWith("/pre_login") && !uri.startsWith("/login")) {
			HttpSession session = req.getSession();	
			String user = SessionUtil.getUser(session);
			if(StringUtils.isEmpty(user)){
				res.sendRedirect("/pre_login");
				return false;
			}
		}		
		return true;

	}
}
