/* 
 * PojoInsteadPayBatch.java  
 * 
 * version TODO
 *
 * 2015年11月24日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.trade.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 代付批次表
 *
 * @author Luxiaoshuai
 * @version
 * @date 2015年11月24日 下午12:07:25
 * @since 
 */
public class PojoInsteadPayBatch implements Serializable{

    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6539529976172126397L;
	/**标识**/
    private Long id;
    /**批次号**/
    private Long batchNo;
    /**商户号**/
    private String merId;
    /**订单发送时间(yyyyMMddhhmmss)**/
    private String txnTime;
    /**总笔数**/
    private Long totalQty;
    /**总金额**/
    private Long totalAmt;
    /**状态(00:已处理01:未处理)**/
    private String status;
    /**创建人**/
    private Long inuser;
    /**创建时间**/
    private Date intime;
    /**修改人**/
    private Long upuser;
    /**修改时间**/
    private Date uptime;
    /**备注**/
    private String notes;
    /**接入类型（01：文件导入00：接口）**/
    private String type;
    /**通过笔数**/
    private Long approveCount;
    /**通过金额**/
    private Long approveAmt;
    /**未审核笔数**/
    private Long unapproveCount;
    /**未审核金额**/
    private Long unapproveAmt;
    /**拒绝笔数**/
    private Long refuseCount;
    /**拒绝金额**/
    private Long refuseAmt;
    /**申请时间**/
    private Date applyTime;
    /**审核完成时间**/
    private Date approveFinishTime;
    /**转账完成时间**/
    private Date finishTime;
    /**代付批次序列号**/
    private String insteadPayBatchSeqNo;
    /**文件路径**/
    private String filePath;
    /**原文件名**/
    private String originalFileName;
    /**URL**/
    private String notifyUrl;
    
    /**批次明细**/
    private List<PojoInsteadPayDetail> details = new ArrayList<PojoInsteadPayDetail>();
    
    /**划拨批次**/
    @JSONField(serialize = false) 
    private List<PojoTranBatch> tranBatchs = new ArrayList<PojoTranBatch>();
    
    public List<PojoTranBatch> getTranBatchs(){
    	return tranBatchs;
    }
    public void setTranBatchs(List<PojoTranBatch> tranBatchs){
    	this.tranBatchs = tranBatchs;
    }
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the batchNo
	 */
	public Long getBatchNo() {
		return batchNo;
	}
	/**
	 * @param batchNo the batchNo to set
	 */
	public void setBatchNo(Long batchNo) {
		this.batchNo = batchNo;
	}
	/**
	 * @return the merId
	 */
	public String getMerId() {
		return merId;
	}
	/**
	 * @param merId the merId to set
	 */
	public void setMerId(String merId) {
		this.merId = merId;
	}
	/**
	 * @return the txnTime
	 */
	public String getTxnTime() {
		return txnTime;
	}
	/**
	 * @param txnTime the txnTime to set
	 */
	public void setTxnTime(String txnTime) {
		this.txnTime = txnTime;
	}
	/**
	 * @return the totalQty
	 */
	public Long getTotalQty() {
		return totalQty;
	}
	/**
	 * @param totalQty the totalQty to set
	 */
	public void setTotalQty(Long totalQty) {
		this.totalQty = totalQty;
	}
	/**
	 * @return the totalAmt
	 */
	public Long getTotalAmt() {
		return totalAmt;
	}
	/**
	 * @param totalAmt the totalAmt to set
	 */
	public void setTotalAmt(Long totalAmt) {
		this.totalAmt = totalAmt;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the inuser
	 */
	public Long getInuser() {
		return inuser;
	}
	/**
	 * @param inuser the inuser to set
	 */
	public void setInuser(Long inuser) {
		this.inuser = inuser;
	}
	/**
	 * @return the intime
	 */
	public Date getIntime() {
		return intime;
	}
	/**
	 * @param intime the intime to set
	 */
	public void setIntime(Date intime) {
		this.intime = intime;
	}
	/**
	 * @return the upuser
	 */
	public Long getUpuser() {
		return upuser;
	}
	/**
	 * @param upuser the upuser to set
	 */
	public void setUpuser(Long upuser) {
		this.upuser = upuser;
	}
	/**
	 * @return the uptime
	 */
	public Date getUptime() {
		return uptime;
	}
	/**
	 * @param uptime the uptime to set
	 */
	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the approveCount
	 */
	public Long getApproveCount() {
		return approveCount;
	}
	/**
	 * @param approveCount the approveCount to set
	 */
	public void setApproveCount(Long approveCount) {
		this.approveCount = approveCount;
	}
	/**
	 * @return the approveAmt
	 */
	public Long getApproveAmt() {
		return approveAmt;
	}
	/**
	 * @param approveAmt the approveAmt to set
	 */
	public void setApproveAmt(Long approveAmt) {
		this.approveAmt = approveAmt;
	}
	/**
	 * @return the unapproveCount
	 */
	public Long getUnapproveCount() {
		return unapproveCount;
	}
	/**
	 * @param unapproveCount the unapproveCount to set
	 */
	public void setUnapproveCount(Long unapproveCount) {
		this.unapproveCount = unapproveCount;
	}
	/**
	 * @return the unapproveAmt
	 */
	public Long getUnapproveAmt() {
		return unapproveAmt;
	}
	/**
	 * @param unapproveAmt the unapproveAmt to set
	 */
	public void setUnapproveAmt(Long unapproveAmt) {
		this.unapproveAmt = unapproveAmt;
	}
	/**
	 * @return the refuseCount
	 */
	public Long getRefuseCount() {
		return refuseCount;
	}
	/**
	 * @param refuseCount the refuseCount to set
	 */
	public void setRefuseCount(Long refuseCount) {
		this.refuseCount = refuseCount;
	}
	/**
	 * @return the refuseAmt
	 */
	public Long getRefuseAmt() {
		return refuseAmt;
	}
	/**
	 * @param refuseAmt the refuseAmt to set
	 */
	public void setRefuseAmt(Long refuseAmt) {
		this.refuseAmt = refuseAmt;
	}
	/**
	 * @return the applyTime
	 */
	public Date getApplyTime() {
		return applyTime;
	}
	/**
	 * @param applyTime the applyTime to set
	 */
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	/**
	 * @return the approveFinishTime
	 */
	public Date getApproveFinishTime() {
		return approveFinishTime;
	}
	/**
	 * @param approveFinishTime the approveFinishTime to set
	 */
	public void setApproveFinishTime(Date approveFinishTime) {
		this.approveFinishTime = approveFinishTime;
	}
	/**
	 * @return the finishTime
	 */
	public Date getFinishTime() {
		return finishTime;
	}
	/**
	 * @param finishTime the finishTime to set
	 */
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	/**
	 * @return the insteadPayBatchSeqNo
	 */
	public String getInsteadPayBatchSeqNo() {
		return insteadPayBatchSeqNo;
	}
	/**
	 * @param insteadPayBatchSeqNo the insteadPayBatchSeqNo to set
	 */
	public void setInsteadPayBatchSeqNo(String insteadPayBatchSeqNo) {
		this.insteadPayBatchSeqNo = insteadPayBatchSeqNo;
	}
	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}
	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	/**
	 * @return the originalFileName
	 */
	public String getOriginalFileName() {
		return originalFileName;
	}
	/**
	 * @param originalFileName the originalFileName to set
	 */
	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}
	/**
	 * @return the notifyUrl
	 */
	public String getNotifyUrl() {
		return notifyUrl;
	}
	/**
	 * @param notifyUrl the notifyUrl to set
	 */
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	/**
	 * @return the details
	 */
	public List<PojoInsteadPayDetail> getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(List<PojoInsteadPayDetail> details) {
		this.details = details;
	}

   
}
