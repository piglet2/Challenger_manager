/******************************************************************************
 * @File name   :      LoginCtl.java
 *
 * @Author      :      xiaobo.qin
 *
 * @Date        :      2016年6月4日 下午1:08:12
 *
 * @Copyright Notice: 
 * Copyright (c) 2016 Envision, Inc. All  Rights Reserved.
 * This software is published under the terms of the Envision Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.login.ctl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.envisioncn.it.super_sonic.showcase.login.biz.LoginService;

@Controller
public class LoginCtl {
	@Autowired
	private LoginService loginService;	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@RequestParam(defaultValue = "",value="login_name") String loginName, @RequestParam(defaultValue = "") String password,HttpServletRequest req) {
		return loginService.login(loginName, password,req) ? "redirect:/": "redirect:/pre_login.page";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		loginService.logout();
		return"redirect:/";
	}
}
