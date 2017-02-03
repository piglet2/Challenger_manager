/******************************************************************************
 * @File name : EvaluationPeriodSerivce.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年8月12日 下午2:06:45
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.biz;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.envisioncn.it.super_sonic.showcase.evaluation.entity.EvaluationPeriod;
import com.envisioncn.it.super_sonic.showcase.evaluation.mapper.EvaluationPeriodMapper;




@Service
public class EvaluationPeriodSerivce {
	
   @Autowired
   private EvaluationPeriodMapper evaluationPeriodMapper;
   
   /*
    * 根据周期id查询周期(纵向)
    */
	public EvaluationPeriod getEvaluationPeriod(String periodId) {
		Objects.requireNonNull(periodId);
		
		List<EvaluationPeriod> list = evaluationPeriodMapper.getEvaluationPeriod(periodId);
		return list.isEmpty() ? null : list.get(0);
	}
}
