/******************************************************************************
 * @File name : ExcelUtils.java
 *
 * @Author : bo.chen
 *
 * @Date : 2016年8月25日 下午6:31:33
 *
 * @Copyright Notice: Copyright (c) 2016 Envision, Inc. All Rights Reserved.
 *            This software is published under the terms of the Envision
 *            Software License version 1.0, a copy of which has been included
 *            with this distribution in the LICENSE.txt file.
 *
 *****************************************************************************/
package com.envisioncn.it.super_sonic.showcase.evaluation.utils;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static final String DOWNFILENAME="Challenger评论列表信息.xlsx";
	//所有评价
	public static final String ALL = "0";
	// 纵向评价
	public static final String MDEVA = "1";
	// 横向评价
	public static final String TDEVA = "2";
	// 发出的
	public static final String SEND = "1";
	// 得到的
	public static final String GET = "2";
	
	public static final String XLS=".xls";
	
	public static final String XLSX=".xlsx";
	
	public static final String VERSION2003="Version2003";
	
	public static final String VERSION2007="Version2007";
	
	public static final String VERSION=VERSION2003;
	
	// 第三方应用
	public static final String APPLICATION = "3";
	/*
	 * 判别Excel2003和Excel2007
	 */
	public static String initType(String fileName) {
		String version = VERSION;
		
		if (fileName != null) {
			int index = fileName.indexOf(".");
			String suffex = fileName.substring(index);

			if (XLS.equals(suffex)) {
				version = VERSION2003;
				
			} else if (XLSX.equals(suffex)) {
				version = VERSION2007;
			}
		}
		return version;
	}
	/*
	 * 根据版本不同的工作表xls和xlsx
	 */
	public static Workbook createWorkbook(String fileName,InputStream in) throws IOException{
		String type = initType(fileName);
		Workbook workbook = null;
		
		if (type.equals(VERSION2003)) {
			workbook = new HSSFWorkbook(in);
		} else if (type.equals(VERSION2007)) {
			workbook = new XSSFWorkbook(in);
		}
		
		return workbook;
	}
	/**
	 * 得到Excel表中的值
	 * 
	 * @param hssfCell
	 *            Excel中的每一个格子
	 * @return Excel中每一个格子中的值
	 */
	@SuppressWarnings("static-access")
	public static String getValue(Cell Cell){
		
		// 布尔类型的值
		if (Cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {

			return String.valueOf(Cell.getBooleanCellValue());
			// 数值类型的值
		} else if (Cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {

			return String.valueOf(new BigDecimal(Cell.getNumericCellValue()));
			// 返回字符串类型的值
		} else {

			return String.valueOf(Cell.getStringCellValue());
		}
	}
	/*
	 * 设置标题模板(根据code不同创建纵向和横向评价标题)
	 */
	public static void createTitle(XSSFRow headerRow,String code){
		if(code.equals(MDEVA)){
			headerRow.createCell(0).setCellValue("纵向评价周期id");
			headerRow.createCell(1).setCellValue("上级工号");
			headerRow.createCell(2).setCellValue("上级姓名");
			headerRow.createCell(3).setCellValue("上级常驻");
			headerRow.createCell(4).setCellValue("上级体系");
			headerRow.createCell(5).setCellValue("上级部门");
			headerRow.createCell(6).setCellValue("下级工号");
			headerRow.createCell(7).setCellValue("下级姓名");
			headerRow.createCell(8).setCellValue("下级常驻");
			headerRow.createCell(9).setCellValue("下级体系");
			headerRow.createCell(10).setCellValue("下级部门");
			headerRow.createCell(11).setCellValue("意志评分");
			headerRow.createCell(12).setCellValue("智慧评分");
			headerRow.createCell(13).setCellValue("博爱评分");
			headerRow.createCell(14).setCellValue("意志评价");
			headerRow.createCell(15).setCellValue("智慧评价");
			headerRow.createCell(16).setCellValue("博爱评价");
			headerRow.createCell(17).setCellValue("评论时间");
			headerRow.createCell(18).setCellValue("备注");
		}else if(code.equals(TDEVA)){
			headerRow.createCell(0).setCellValue("横向评价周期id");
			headerRow.createCell(1).setCellValue("评价人工号");
			headerRow.createCell(2).setCellValue("评价人姓名");
			headerRow.createCell(3).setCellValue("评价人常驻");
			headerRow.createCell(4).setCellValue("评价人体系");
			headerRow.createCell(5).setCellValue("评价人部门");
			headerRow.createCell(6).setCellValue("评价对象工号");
			headerRow.createCell(7).setCellValue("评价对象姓名");
			headerRow.createCell(8).setCellValue("评价对象常驻");
			headerRow.createCell(9).setCellValue("评价对象体系");
			headerRow.createCell(10).setCellValue("评价对象部门");
			headerRow.createCell(11).setCellValue("意志评分");
			headerRow.createCell(12).setCellValue("智慧评分");
			headerRow.createCell(13).setCellValue("博爱评分");
			headerRow.createCell(14).setCellValue("意志评价");
			headerRow.createCell(15).setCellValue("智慧评价");
			headerRow.createCell(16).setCellValue("博爱评价");
			headerRow.createCell(17).setCellValue("评论时间");
		}else if(code.equals(ALL)){
			headerRow.createCell(0).setCellValue("评价周期id");
			headerRow.createCell(1).setCellValue("评价人工号");
			headerRow.createCell(2).setCellValue("评价人姓名");
			headerRow.createCell(3).setCellValue("评价人常驻");
			headerRow.createCell(4).setCellValue("评价人体系");
			headerRow.createCell(5).setCellValue("评价人部门");
			headerRow.createCell(6).setCellValue("评价对象工号");
			headerRow.createCell(7).setCellValue("评价对象姓名");
			headerRow.createCell(8).setCellValue("评价对象常驻");
			headerRow.createCell(9).setCellValue("评价对象体系");
			headerRow.createCell(10).setCellValue("评价对象部门");
			headerRow.createCell(11).setCellValue("意志评分");
			headerRow.createCell(12).setCellValue("智慧评分");
			headerRow.createCell(13).setCellValue("博爱评分");
			headerRow.createCell(14).setCellValue("意志评价");
			headerRow.createCell(15).setCellValue("智慧评价");
			headerRow.createCell(16).setCellValue("博爱评价");
			headerRow.createCell(17).setCellValue("评论时间");
			headerRow.createCell(18).setCellValue("备注");
		}
	}
    /*
     * 附件下载
     */
	public static void downFile(HttpServletResponse response,HttpServletRequest request,XSSFWorkbook xssfWorkbook) throws IOException {
		// -----下载
		// 设置客户端浏览器用于识别附件的两个参数Content-Type和Content-Disposition
		// 文件名
		String downFilename = DOWNFILENAME;
		// 获取文件的MIME类型：
		String contentType = request.getServletContext().getMimeType(
				downFilename);
		// 将MIME类型放入响应
		response.setContentType(contentType);
		// 浏览器类型
		String agent = request.getHeader("user-agent");
		// 附件名编码，解决中文乱码问题
		downFilename = FileUtils.encodeDownloadFilename(downFilename, agent);
		// 获取附件的名字和下载方式
		String contentDisposition = "attachment;filename=" + downFilename;
		// 将附件名字和下载方式放入响应头信息中
		response.setHeader("Content-Disposition", contentDisposition);

		// 将excel写入响应
		xssfWorkbook.write(response.getOutputStream());
	}
}
