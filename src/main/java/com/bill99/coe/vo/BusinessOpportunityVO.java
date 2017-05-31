package com.bill99.coe.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;
/**
 * 此处只是一个示例，成员属性个数及名称要根据前端的实际展示需求进行定制
 * @author kenan.zhang
 *
 */
public class BusinessOpportunityVO implements Serializable {

	private static final long serialVersionUID = 1521055399011794405L;
	private String rowId;
	private Date created;
	private String createdBy;
	private Date lastUpd;
	private String lastUpdBy;
	private BigDecimal dckingNum;
	private Long modificationNum;
	private String conflictId;
	private String buId;
	private String closedFlg;
	private String execPriorityFlg;
	public String getRowId() {
		return rowId;
	}
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getLastUpd() {
		return lastUpd;
	}
	public void setLastUpd(Date lastUpd) {
		this.lastUpd = lastUpd;
	}
	public String getLastUpdBy() {
		return lastUpdBy;
	}
	public void setLastUpdBy(String lastUpdBy) {
		this.lastUpdBy = lastUpdBy;
	}
	public BigDecimal getDckingNum() {
		return dckingNum;
	}
	public void setDckingNum(BigDecimal dckingNum) {
		this.dckingNum = dckingNum;
	}
	public Long getModificationNum() {
		return modificationNum;
	}
	public void setModificationNum(Long modificationNum) {
		this.modificationNum = modificationNum;
	}
	public String getConflictId() {
		return conflictId;
	}
	public void setConflictId(String conflictId) {
		this.conflictId = conflictId;
	}
	public String getBuId() {
		return buId;
	}
	public void setBuId(String buId) {
		this.buId = buId;
	}
	public String getClosedFlg() {
		return closedFlg;
	}
	public void setClosedFlg(String closedFlg) {
		this.closedFlg = closedFlg;
	}
	public String getExecPriorityFlg() {
		return execPriorityFlg;
	}
	public void setExecPriorityFlg(String execPriorityFlg) {
		this.execPriorityFlg = execPriorityFlg;
	}
	
}