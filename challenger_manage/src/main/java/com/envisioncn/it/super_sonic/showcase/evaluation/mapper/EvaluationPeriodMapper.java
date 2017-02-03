/******************************************************************************
 * @File name : EvaluationPeriodDao.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年8月16日 下午5:44:51
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.mapper;

import java.util.List;

import com.envisioncn.it.super_sonic.showcase.evaluation.entity.EvaluationPeriod;


public interface EvaluationPeriodMapper{

	public List<EvaluationPeriod> getEvaluationPeriod(String periodId);
   
}
