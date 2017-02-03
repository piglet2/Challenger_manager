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


public class ClgApplication  {
	/*
	 * 主键自增长
	*/
	private int id;
	
	/*
	 * 图片
	*/
	private String icon;
	
	/*
	 * 图片
	*/
	private String color;
	
	/*
	 * 名称
	*/
	private String name;
	
	
	/*
	 * 路径
	*/
	private String url;
	
	/*
	 * 权重
	*/
	private int sort;
	
	/*
	 * 是否完成
	*/
	private boolean show;
	

	/*
	 * 评价时间
	*/
	private Date cts;

	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getIcon() {
		return icon;
	}


	public void setIcon(String icon) {
		this.icon = icon;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public int getSort() {
		return sort;
	}


	public void setSort(int sort) {
		this.sort = sort;
	}


	public boolean isShow() {
		return show;
	}


	public void setShow(boolean show) {
		this.show = show;
	}


	public Date getCts() {
		return cts;
	}


	public void setCts(Date cts) {
		this.cts = cts;
	}
	
	
	
}
