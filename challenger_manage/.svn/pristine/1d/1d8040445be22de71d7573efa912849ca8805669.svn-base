/******************************************************************************
 * @File name   :      GlobalCtl.java
 *
 * @Author      :      xiaobo.qin
 *
 * @Date        :      2016年6月4日 下午1:11:32
 *
 * @Copyright Notice: 
 * Copyright (c) 2016 Envision, Inc. All  Rights Reserved.
 * This software is published under the terms of the Envision Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GlobalCtl {

	@RequestMapping(value = {"/",""}, method = RequestMethod.GET)
	public String index() {
		return "index.page";
	}

	/*
	 * 登录地址
	 */	
	@RequestMapping(value = "pre_login", method = RequestMethod.GET)
	public String preLogin() {
		return "pre_login.page";
	}	
	
	/*
	 * 通用加载jsp文件
	 */
	@RequestMapping(value = "/jsp/{module}/{jspFileName}.page", method = RequestMethod.GET)
	public ModelAndView toStaticPage(@PathVariable String module,@PathVariable("jspFileName") String jspFileName) {
		ModelAndView mv = new ModelAndView(module + "/" + jspFileName+ ".page");
		return mv;
	}
}
