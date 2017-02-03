/******************************************************************************
 * @File name : SAPUserService.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年8月15日 上午10:31:47
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.biz;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.envisioncn.it.super_sonic.showcase.evaluation.entity.SAPUser;
import com.envisioncn.it.super_sonic.showcase.evaluation.mapper.SAPUserMapper;


@Service
public class SAPUserService {
	
	@Autowired
	private SAPUserMapper sapUserMapper;
	
    public List<SAPUser> getSapUsers(){
    	return sapUserMapper.getSapUsers();
    }
    /**
     * 根据id查询姓名
     * @param managerId
     * @return
     */
	public String getLastNameById(String id) {
		Objects.requireNonNull(id);
		
		List<SAPUser> list = sapUserMapper.getSapUsersById(id);
		return  list.isEmpty() ? "" : list.get(0).getLastName();
	}
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	public SAPUser getSapUserById(String id) {
		Objects.requireNonNull(id);
		
		List<SAPUser> list = sapUserMapper.getSapUsersById(id);
		return list.isEmpty() ? null : list.get(0);
	}
}
