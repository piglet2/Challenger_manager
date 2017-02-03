/******************************************************************************
 * @File name : EvaluationDao.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年8月15日 下午5:57:54
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.mapper;

import java.util.List;

import com.envisioncn.it.super_sonic.showcase.evaluation.entity.Evaluation;
import com.envisioncn.it.super_sonic.showcase.evaluation.pbg.EvaluationPageBean;



public interface EvaluationMapper{
	/*
	 * 查询所有纵向评论并按时间排序
	 */
	public List<Evaluation>  getAllMDEvasByTime();
    /*
     * 保存评论列表
     */
	public void save(Evaluation evaluation);
    /*
     * 得到纵向没有评分的人员列表
     */
	public List<EvaluationPageBean> getNotEvaluation(String periodId);
	
	
}
