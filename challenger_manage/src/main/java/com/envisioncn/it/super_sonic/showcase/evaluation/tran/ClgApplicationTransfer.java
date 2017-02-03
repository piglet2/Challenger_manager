/******************************************************************************
 * @File name : EvaluationTransfer.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年8月15日 下午2:22:19
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.tran;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.envisioncn.it.super_sonic.showcase.evaluation.entity.ClgApplication;
import com.envisioncn.it.super_sonic.showcase.evaluation.pbg.ApplicationPageBean;



@Service
public class ClgApplicationTransfer {
	
	/*
	 * 根据code判断是横向还是纵向，进行封装数据
	 */
	public List<ApplicationPageBean> toPageBean(List<ClgApplication> apps)throws Exception {
		List<ApplicationPageBean> list=new ArrayList<ApplicationPageBean>();
		for(int i=0;i<apps.size();i++){
			ApplicationPageBean ap=new ApplicationPageBean();
			ap.setId(apps.get(i).getId());
			ap.setIcon(apps.get(i).getIcon());
			ap.setColor(apps.get(i).getColor());
			ap.setName(apps.get(i).getName());
			ap.setUrl(apps.get(i).getUrl());
			ap.setSort(apps.get(i).getSort());
			ap.setShow(checkShow(apps.get(i).isShow()));
			ap.setCts(checkCts(apps.get(i).getCts()));
			list.add(ap);
		}
		return list;
	}
	
	public ApplicationPageBean toAppPageBean(ClgApplication app){
		ApplicationPageBean apb=new ApplicationPageBean();
		apb.setId(app.getId());
		apb.setColor(app.getColor());
		apb.setCts(checkCts(app.getCts()));
		apb.setShow(checkShow(app.isShow()));
		apb.setIcon(app.getIcon());
		apb.setName(app.getName());
		apb.setSort(app.getSort());
		apb.setUrl(app.getUrl());
		return apb;
	}
	
	public String checkShow(boolean flag){
		String result="";
		if(flag==false){
			result="不可见";
		}else{
			result="可见";
		}
		return result;
	}
	
	public String checkCts(Date cts){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
		String result=sdf.format(cts);  
		return result;
	}
 
}
