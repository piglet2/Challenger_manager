/******************************************************************************
 * @File name : SAPEmpjobService.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年9月6日 下午5:22:06
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.biz;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.envisioncn.it.super_sonic.showcase.evaluation.entity.SAPEmpJob;
import com.envisioncn.it.super_sonic.showcase.evaluation.mapper.SAPEmpJobMapper;


@Service
public class SAPEmpjobService {
	
	private static final String MARK_NO_MANAGER = "NO_MANAGER";
	@Autowired
	private SAPEmpJobMapper sapEmpJobMapper;
	
    public List<SAPEmpJob> getSapEmpJobs(){
    	return sapEmpJobMapper.getSapEmpJobs();
    }
    
    /**
	 * 是否为其上级
	 */
	public boolean isHigherLevel(String userId, String thinkManagerId) throws Exception {
		return queryHigherLevel(userId).contains(thinkManagerId);
	}
	
	/**
	 * 根据用户ID查询上级列表
	 */
	public Set<String> queryHigherLevel(String userId) throws Exception {
		Set<String> managers = new LinkedHashSet<String>();
		List<SAPEmpJob> list = queryByUserId(userId);
        if(!list.isEmpty()){
		for (SAPEmpJob sapEmpJob : list) {
			managers.add(sapEmpJob.getManagerId());
		}
		    managers.remove(MARK_NO_MANAGER);
        }
		return managers;
	}
	
	/**
	 * Query by userId 
	 */
	@SuppressWarnings("unchecked")
	private List<SAPEmpJob> queryByUserId(String userId) {
		Objects.requireNonNull(userId);
		List<SAPEmpJob> list = sapEmpJobMapper.getSapEmpJobsById(userId);
		return (List<SAPEmpJob>) (list.isEmpty() ? Collections.emptyList() : list);
	}
}
