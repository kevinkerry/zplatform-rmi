/* 
 * PojoCMBCResfileLog.java  
 * 
 * version TODO
 *
 * 2016年6月28日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.trade.model;

import java.io.Serializable;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年6月28日 上午10:38:13
 * @since
 */

public class PojoCMBCResfileLog implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private Long tid;
	private String bankTranDataSeqNo;
	private String bankTranResNo;
	private String accNo;
	private String accName;
	private Long tranAmt;
	private String resType;
	private String resCode;
	private String resInfo;
	private String payDate;
	private String payDatetime;
	private String bankTranBatchNo;
	/**
	 * @return the tid
	 */
	public Long getTid() {
		return tid;
	}
	/**
	 * @param tid the tid to set
	 */
	public void setTid(Long tid) {
		this.tid = tid;
	}
	/**
	 * @return the bankTranDataSeqNo
	 */
	public String getBankTranDataSeqNo() {
		return bankTranDataSeqNo;
	}
	/**
	 * @param bankTranDataSeqNo the bankTranDataSeqNo to set
	 */
	public void setBankTranDataSeqNo(String bankTranDataSeqNo) {
		this.bankTranDataSeqNo = bankTranDataSeqNo;
	}
	/**
	 * @return the bankTranResNo
	 */
	public String getBankTranResNo() {
		return bankTranResNo;
	}
	/**
	 * @param bankTranResNo the bankTranResNo to set
	 */
	public void setBankTranResNo(String bankTranResNo) {
		this.bankTranResNo = bankTranResNo;
	}
	/**
	 * @return the accNo
	 */
	public String getAccNo() {
		return accNo;
	}
	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	/**
	 * @return the accName
	 */
	public String getAccName() {
		return accName;
	}
	/**
	 * @param accName the accName to set
	 */
	public void setAccName(String accName) {
		this.accName = accName;
	}
	/**
	 * @return the tranAmt
	 */
	public Long getTranAmt() {
		return tranAmt;
	}
	/**
	 * @param tranAmt the tranAmt to set
	 */
	public void setTranAmt(Long tranAmt) {
		this.tranAmt = tranAmt;
	}
	/**
	 * @return the resType
	 */
	public String getResType() {
		return resType;
	}
	/**
	 * @param resType the resType to set
	 */
	public void setResType(String resType) {
		this.resType = resType;
	}
	/**
	 * @return the resCode
	 */
	public String getResCode() {
		return resCode;
	}
	/**
	 * @param resCode the resCode to set
	 */
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	/**
	 * @return the resInfo
	 */
	public String getResInfo() {
		return resInfo;
	}
	/**
	 * @param resInfo the resInfo to set
	 */
	public void setResInfo(String resInfo) {
		this.resInfo = resInfo;
	}
	/**
	 * @return the payDate
	 */
	public String getPayDate() {
		return payDate;
	}
	/**
	 * @param payDate the payDate to set
	 */
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	/**
	 * @return the payDatetime
	 */
	public String getPayDatetime() {
		return payDatetime;
	}
	/**
	 * @param payDatetime the payDatetime to set
	 */
	public void setPayDatetime(String payDatetime) {
		this.payDatetime = payDatetime;
	}
	/**
	 * @return the bankTranBatchNo
	 */
	public String getBankTranBatchNo() {
		return bankTranBatchNo;
	}
	/**
	 * @param bankTranBatchNo the bankTranBatchNo to set
	 */
	public void setBankTranBatchNo(String bankTranBatchNo) {
		this.bankTranBatchNo = bankTranBatchNo;
	}
	
	
}
