/******************************************************************************
 * @File name : EvaluationService.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年8月15日 下午4:54:30
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.envisioncn.it.super_sonic.showcase.evaluation.entity.ClgApplication;
import com.envisioncn.it.super_sonic.showcase.evaluation.mapper.AssessmentMapper;
import com.envisioncn.it.super_sonic.showcase.evaluation.mapper.ClgApplicationMapper;
import com.envisioncn.it.super_sonic.showcase.evaluation.tran.EvaluationTransfer;


@Service
public class ApplicationService{
	
	@Autowired
	private ClgApplicationMapper clgApplicaationMapper;
	
	/*
     * 查询所有应用
     */
	public  List<ClgApplication> getAllMDEvas() {
		return clgApplicaationMapper.queryAll();
	}
	
	
}
