package com.bill99.coe.dto;

import com.bill99.coe.page.Page;
/**
 * 对前端传递过来的数据的封装
 * 此处只是一个示例，成员属性个数及名称要根据前端的实际展示需求进行定制
 * @author kenan.zhang
 *
 */
public class BusinessOpportunityDTO extends Page {

	private String rowId;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}
	
}