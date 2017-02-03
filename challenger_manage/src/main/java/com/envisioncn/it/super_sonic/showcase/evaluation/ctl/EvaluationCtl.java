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

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.envisioncn.it.super_sonic.showcase.evaluation.biz.EvaluationService;
import com.envisioncn.it.super_sonic.showcase.evaluation.entity.Assessment;
import com.envisioncn.it.super_sonic.showcase.evaluation.entity.Evaluation;
import com.envisioncn.it.super_sonic.showcase.evaluation.pbg.EvaluationPageBean;
import com.envisioncn.it.super_sonic.showcase.evaluation.pbg.ImportAssPageBean;
import com.envisioncn.it.super_sonic.showcase.evaluation.pbg.ImportEvaPageBean;
import com.envisioncn.it.super_sonic.showcase.evaluation.utils.EvaluationThreadLocal;
import com.envisioncn.it.super_sonic.showcase.evaluation.utils.ExcelUtils;
import com.envisioncn.it.super_sonic.showcase.evaluation.utils.SessionUtil;

@Controller
@RequestMapping("/evaluation")
public class EvaluationCtl {
	@Autowired
	private EvaluationService evaluationService;
	@Autowired
	private HttpSession httpSession;
    
	/*
	 * 评论列表
	 */
	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
	public ModelAndView index(
			@RequestParam(value = "code", required = true, defaultValue = "0") String code)throws Exception {
		
		ModelAndView mv = skipPage(code);
		List<EvaluationPageBean> evas = evaluationService.getEvaluationList(code);
		httpSession.setAttribute(SessionUtil.EVALIST, evas);
		httpSession.setAttribute(SessionUtil.CODE, code);
		mv.addObject("evaluations", evas);
		
		return mv;
	}
	
	/*
	 * 评论列表导出
	 * 
	 * @RequestMapping(value = "/evaluationList_export/excel", method =
	 * RequestMethod.GET) public String viewExcel(HttpServletResponse
	 * response,HttpServletRequest request) throws Exception {
	 * List<EvaluationPageBean> lists = evaluationService.getEvaluationList();
	 * evaluationService.export(response,request,lists); return null; }
	 */
	
	/*
	 * 根据条件查询评论
	 */
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public ModelAndView getEvaListByCondition(
			@RequestParam(value = "condition") String condition,
			@RequestParam(value = "code", required = true, defaultValue = "0") String code,
			@RequestParam(value = "mode", required = true, defaultValue = "0") String mode) throws Exception {
		
		ModelAndView mv = skipPage(code);
//		condition = new String(condition.getBytes("ISO8859-1"), "UTF-8");
		List<EvaluationPageBean> evas = evaluationService.getEvaluationByCondition(condition,code,mode);
		httpSession.setAttribute(SessionUtil.EVALIST, evas);
		httpSession.setAttribute(SessionUtil.CODE, code);
		httpSession.setAttribute(SessionUtil.CONDITION, condition);
		// EvaluationThreadLocal.set(evas);
		mv.addObject("evaluations", evas);
		
		return mv;
	}
	
	/*
	 * 条件查询评论列表导出
	 */
	@RequestMapping(value = "/evaListByCondition_export/excel", method = RequestMethod.GET)
	public String viewExcelByCondition(HttpServletResponse response,HttpServletRequest request) throws Exception {
		String code= "0";
		List<EvaluationPageBean> evas = SessionUtil.getEvaList(httpSession);
	    code = SessionUtil.getCode(httpSession);
	    String condition = SessionUtil.getCondition(httpSession);
//		List<EvaluationPageBean> evas = EvaluationThreadLocal.get();
		evaluationService.export(response,request,evas,code,condition);
		
		return null;		
	}
	/*
	 * 错误页面
	 */
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public ModelAndView errorPage(){
		ModelAndView mv = new ModelAndView("evaluation/error_view.page");
		return mv;
	}

	/*
	 * 文件上传
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(@RequestParam("file") MultipartFile multipartFile,
			@RequestParam(value = "code", required = true, defaultValue = "0") String code)
			throws Exception {
		
		String cod="";
		String url="redirect:/jsp/evaluation/fail.page";
		
		if (multipartFile != null) {
			// multipartFile.getOriginalFilename() 获取文件的原始名称
			String filename = multipartFile.getOriginalFilename();
			InputStream inputStream = multipartFile.getInputStream();
			
			//导入纵向评价
			if (code.equals(ExcelUtils.MDEVA)) {
				List<ImportEvaPageBean> list = evaluationService.getMDExcel(inputStream,filename);
				cod = evaluationService.importEvaluation(list);
			//导入横向评价
			} else if (code.equals(ExcelUtils.TDEVA)) {
				List<ImportAssPageBean> list = evaluationService.getTDExcel(inputStream,filename);
				cod = evaluationService.importAssessment(list);
			}
		}
		if(cod.equals("200")){
		   url="redirect:/jsp/evaluation/success.page";
		}
		return url;
	}
	/*
	 * 测试专用接口
	 */
	@ResponseBody
	@RequestMapping(value = "/test/{perId}", method = RequestMethod.GET)
	public List<EvaluationPageBean> test(@PathVariable("perId")String perId){
		List<EvaluationPageBean> pb = evaluationService.testNotEva(perId);
		return pb;
	}
	
	/*
	 * 判断跳转页面
	 */
	private ModelAndView skipPage(String code) {
		Objects.requireNonNull(code);

		ModelAndView mv = null;
		if (code.equals(ExcelUtils.MDEVA)) {
			mv = new ModelAndView("evaluation/MDeva_index.page");
		} else if (code.equals(ExcelUtils.TDEVA)) {
			mv = new ModelAndView("evaluation/TDeva_index.page");
		} else if (code.equals(ExcelUtils.ALL)) {
			mv = new ModelAndView("evaluation/all_index.page");
		}
		return mv;
	}
	 
}
	