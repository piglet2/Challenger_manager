/******************************************************************************
 * @File name : Evaluation.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年8月11日 下午6:16:11
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.pbg;


public class EvaluationPageBean{

	 //周期唯一标识
	private String periodId;
	
	 //评论人id
	private String managerId;
	
     //被评论人id
	private String userId;
	// 评论人
	private String manager;
	// 被评论人
	private String user;
	// 评论周期
	private String period;
	// 意志_评分
	private String priseWill;
	// 智慧_评分
	private String priseWisdom;
	// 博爱_评分
	private String priseLove;
	// 意志_评论
	private String prosWill;
	// 智慧_评论
	private String prosWisdom;
	// 博爱_评论
	private String prosLove;
	//评论人部门
    private String managerDepartment;
	//评论人体系
	private String managerDivision;
	//评论人常驻地址
	private String managerLocation;
	//被评论人部门
    private String userDepartment;
	//被评论人体系
	private String userDivision;
	//被评论人常驻地址
	private String userLocation;
	
	// 评论时间
	private String cts;
	
	/*
	 * 备注
	 * */
	private String remark;
	

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

    
	public String getProsWill() {
		return prosWill;
	}

	public void setProsWill(String prosWill) {
		this.prosWill = prosWill;
	}

	public String getProsWisdom() {
		return prosWisdom;
	}

	public void setProsWisdom(String prosWisdom) {
		this.prosWisdom = prosWisdom;
	}

	public String getProsLove() {
		return prosLove;
	}

	public void setProsLove(String prosLove) {
		this.prosLove = prosLove;
	}

	public String getCts() {
		return cts;
	}

	public void setCts(String cts) {
		this.cts = cts;
	}

	public String getPeriodId() {
		return periodId;
	}

	public void setPeriodId(String periodId) {
		this.periodId = periodId;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPriseWill() {
		return priseWill;
	}

	public void setPriseWill(String priseWill) {
		this.priseWill = priseWill;
	}

	public String getPriseWisdom() {
		return priseWisdom;
	}

	public void setPriseWisdom(String priseWisdom) {
		this.priseWisdom = priseWisdom;
	}

	public String getPriseLove() {
		return priseLove;
	}

	public void setPriseLove(String priseLove) {
		this.priseLove = priseLove;
	}

	public String getManagerDepartment() {
		return managerDepartment;
	}

	public void setManagerDepartment(String manageDepartment) {
		this.managerDepartment = manageDepartment;
	}

	public String getManagerDivision() {
		return managerDivision;
	}

	public void setManagerDivision(String manageDivision) {
		this.managerDivision = manageDivision;
	}

	public String getManagerLocation() {
		return managerLocation;
	}

	public void setManagerLocation(String manageLocation) {
		this.managerLocation = manageLocation;
	}

	public String getUserDepartment() {
		return userDepartment;
	}

	public void setUserDepartment(String userDepartment) {
		this.userDepartment = userDepartment;
	}

	public String getUserDivision() {
		return userDivision;
	}

	public void setUserDivision(String userDivision) {
		this.userDivision = userDivision;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

}
