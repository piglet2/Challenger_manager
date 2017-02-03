/******************************************************************************
 * @File name : Evaluation.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年8月16日 下午5:45:35
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.entity;



import java.util.Date;


public class Evaluation  {
	
	/*
	 * 主键自增长
	*/
	private int id;
	
	/*
	 * 期唯一标识
	*/
	private String periodId;
	
	/*
	 * 评论人id
	*/
	private String managerId;
	
	/*
	 * 被评论人id
	*/
	private String userId;
	
	/*
	 * 意志_评分
	*/
	private int priseWill;
	
	/*
	 * 智慧_评分
	*/
	private int priseWisdom;
	
	/*
	 * 博爱_评分
	*/
	private int priseLove;
	
	/*
	 * 鼓励_评论
	*/
	private String prosWill;
	
	/*
	 * 鼓励_评论
	*/
	private String prosWisdom;
	
	/*
	 * 鼓励_评论
	*/
	private String prosLove;
	
	/*
	 * 是否已读
	*/
	private int hasRead;
	
	/*
	 * 反馈
	*/
	private int feedback;
	
	/*
	 * 反馈时间
	*/
	private Date feedbackTime;
	
	/*
	 * 评价时间
	*/
	private Date cts;
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPriseWill() {
		return priseWill;
	}

	public void setPriseWill(int priseWill) {
		this.priseWill = priseWill;
	}

	public int getPriseWisdom() {
		return priseWisdom;
	}

	public void setPriseWisdom(int priseWisdom) {
		this.priseWisdom = priseWisdom;
	}

	public int getPriseLove() {
		return priseLove;
	}

	public void setPriseLove(int priseLove) {
		this.priseLove = priseLove;
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

	public int getHasRead() {
		return hasRead;
	}

	public void setHasRead(int hasRead) {
		this.hasRead = hasRead;
	}

	public int getFeedback() {
		return feedback;
	}

	public void setFeedback(int feedback) {
		this.feedback = feedback;
	}

	public Date getFeedbackTime() {
		return feedbackTime;
	}

	public void setFeedbackTime(Date feedbackTime) {
		this.feedbackTime = feedbackTime;
	}

	public Date getCts() {
		return cts;
	}

	public void setCts(Date cts) {
		this.cts = cts;
	}

	
}
