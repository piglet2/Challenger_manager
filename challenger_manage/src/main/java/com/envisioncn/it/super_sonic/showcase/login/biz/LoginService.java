/******************************************************************************
 * @File name   :      LoginService.java
 *
 * @Author      :      xiaobo.qin
 *
 * @Date        :      2016年6月4日 下午1:04:32
 *
 * @Copyright Notice: 
 * Copyright (c) 2016 Envision, Inc. All  Rights Reserved.
 * This software is published under the terms of the Envision Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.login.biz;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;


@Service
public class LoginService {
	public boolean login(String loginName, String password,HttpServletRequest req) {
		if("envision".equals(loginName) && "password".equals(password)){
			req.getSession().setAttribute("user", loginName);
			return true;
		}	
		return false;
	}
	
	/*
	 * 未实现
	 */
	public void logout(){

	}
}
