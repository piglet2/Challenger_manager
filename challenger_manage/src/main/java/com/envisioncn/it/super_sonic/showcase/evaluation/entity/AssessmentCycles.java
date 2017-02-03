/******************************************************************************
 * @File name : AssessmentCycles.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年9月14日 上午11:51:00
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/

package com.envisioncn.it.super_sonic.showcase.evaluation.entity;

import java.util.Date;



public class AssessmentCycles {
	
	/*
	 * 主键自增长
	*/
	private int id;
	
	/*
	 * 期唯一标识
	*/
	private String cycleId;
	
	/*
	 * 周期开始
	 * */
	private Date cyclesDateFrom;
	
	/*
	 * 周期结束
	 * */
	private Date cyclesDateTo;
	
	/*
	 * 描述
	 * */
	private String des;
	
	/*
	 * 创建时间
	 * */
	private Date cts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCycleId() {
		return cycleId;
	}

	public void setCycleId(String cycleId) {
		this.cycleId = cycleId;
	}

	public Date getCyclesDateFrom() {
		return cyclesDateFrom;
	}

	public void setCyclesDateFrom(Date cyclesDateFrom) {
		this.cyclesDateFrom = cyclesDateFrom;
	}

	public Date getCyclesDateTo() {
		return cyclesDateTo;
	}

	public void setCyclesDateTo(Date cyclesDateTo) {
		this.cyclesDateTo = cyclesDateTo;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Date getCts() {
		return cts;
	}

	public void setCts(Date cts) {
		this.cts = cts;
	}

}
