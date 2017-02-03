/******************************************************************************
 * @File name : EvaluationCtl.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年8月11日 下午4:29:30
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.ctl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.envisioncn.it.super_sonic.showcase.evaluation.biz.ClgApplicationService;
import com.envisioncn.it.super_sonic.showcase.evaluation.entity.ClgApplication;
import com.envisioncn.it.super_sonic.showcase.evaluation.pbg.ApplicationPageBean;
import com.envisioncn.it.super_sonic.showcase.evaluation.tran.ClgApplicationTransfer;
import com.envisioncn.it.super_sonic.showcase.evaluation.utils.SessionUtil;

@Controller
@RequestMapping("/application")
public class ApplicationCtl {
	@Autowired
	private HttpSession httpSession;
	
	@Autowired
	private ClgApplicationService clgApplicationService;
	
	@Autowired
	private ClgApplicationTransfer clgApplicationTransfer;
	
	/*
	 * 根据条件查询评论
	 */
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public ModelAndView queryApp() throws Exception {
		ModelAndView mv = new ModelAndView("application/application_list.page");
		List<ClgApplication> apps=clgApplicationService.queryAll();
		List<ApplicationPageBean> list=clgApplicationTransfer.toPageBean(apps);
		httpSession.setAttribute(SessionUtil.EVALIST, list);
		mv.addObject("applications", list);
		return mv;
	}
	
	/*
	 * 跳转到新增页面
	 */
	@RequestMapping(value = "/toAdd", method = RequestMethod.GET)
	public ModelAndView toAdd() throws Exception {
		ModelAndView mv = new ModelAndView("application/add.page");
		return mv;
	}
	
	/*
	 * 新增应用
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(@RequestParam(value = "name") String name,
			@RequestParam(value = "icon") String icon,@RequestParam(value = "color") String color,
			@RequestParam(value = "url") String url,@RequestParam(value = "sort") String sort,
			@RequestParam(value = "show") String show) throws Exception {
		ClgApplication ca=new ClgApplication();
		ca.setName(name);
		ca.setIcon(icon);
		ca.setColor(color);
		ca.setUrl(url);
		ca.setSort(Integer.parseInt(sort));
		ca.setShow(Boolean.parseBoolean(show));
		clgApplicationService.add(ca);
		return queryApp();
	}
	
	/*
	 * 删除应用
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView delete(@RequestParam(value = "id") int id) throws Exception {
		System.out.println("@@@@@@id"+id);
		clgApplicationService.delete(id);
		return queryApp();
	}
	
	/*
	 * 跳转到修改页面
	 */
	@RequestMapping(value = "/toUpdate", method = RequestMethod.POST)
	public ModelAndView toUpdate(@RequestParam(value = "id") int id) throws Exception {
		ClgApplication ca=clgApplicationService.queryById(id);
		ApplicationPageBean apb=clgApplicationTransfer.toAppPageBean(ca);
		ModelAndView mv = new ModelAndView("application/update.page");
		mv.addObject("application", apb);
		return mv;
	}
	
	/*
	 * 跳转到修改页面
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@RequestParam(value = "id") int id,@RequestParam(value = "name") String name,
			@RequestParam(value = "icon") String icon,@RequestParam(value = "color") String color,
			@RequestParam(value = "url") String url,@RequestParam(value = "sort") String sort,
			@RequestParam(value = "show") String show) throws Exception {
		
		ClgApplication ca=new ClgApplication();
		ca.setId(id);
		ca.setName(name);
		ca.setIcon(icon);
		ca.setColor(color);
		ca.setUrl(url);
		ca.setSort(Integer.parseInt(sort));
		ca.setShow(Boolean.parseBoolean(show));
		clgApplicationService.update(ca);
		System.out.println("开始修改:id="+id+",name="+name+",icon="+
		icon+",color="+color+",url="+url+",sort="+Integer.parseInt(sort)+",show="+Boolean.parseBoolean(show));
		
		return queryApp();
	}
	
	
	/*
	 * 错误页面
	 */
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public ModelAndView errorPage(){
		ModelAndView mv = new ModelAndView("evaluation/error_view.page");
		return mv;
	}

	 
}
	