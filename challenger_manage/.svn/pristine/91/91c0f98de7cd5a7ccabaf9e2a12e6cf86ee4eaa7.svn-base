/******************************************************************************
 * @File name : ExceptionAdvice.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年8月18日 下午4:15:27
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.advice;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Controller;

@Aspect
@Controller
public class ExceptionAdvice {
	

	@Around(value = "execution(public * com.envisioncn.it.super_sonic.showcase.evaluation.ctl.*.*(..))")
	public Object around(ProceedingJoinPoint pjp) {
		
		try {
			return  pjp.proceed();
		
		} catch (Throwable e) {
			
			e.printStackTrace();
			
			return "redirect:/evaluation/error";
		}

	}

}
