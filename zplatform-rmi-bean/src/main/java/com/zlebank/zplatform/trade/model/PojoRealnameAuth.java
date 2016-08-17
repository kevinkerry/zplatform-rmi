/* 
 * PojoRealnameAuth.java  
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
import java.util.Date;

/**
 * 实名认证类
 *
 * @author Luxiaoshuai
 * @version
 * @date 2015年11月24日 上午11:51:30
 * @since 
 */

public class PojoRealnameAuth implements Serializable{
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -73324835258416999L;
	/**标识**/
    private Long id;
    /**商户代码**/
    private String merId;
    /**商户订单号**/
    private String orderId;
    /**订单发送时间(yyyyMMddhhmmss)**/
    private String txnTime;
    /**银行卡号**/
    private String cardNo;
    /**卡类型**/
    private String cardType;
    /**持卡人姓名**/
    private String customerNm;
    /**证件类型**/
    private String certifTp;
    /**证件号**/
    private String certifId;
    /**手机号**/
    private Long phoneNo;
    /**cvn2**/
    private String cvn2;
    /**卡有效期**/
    private String expired;
    /**状态(00:已认证01:认证)**/
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
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * @return the cardType
	 */
	public String getCardType() {
		return cardType;
	}
	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	/**
	 * @return the customerNm
	 */
	public String getCustomerNm() {
		return customerNm;
	}
	/**
	 * @param customerNm the customerNm to set
	 */
	public void setCustomerNm(String customerNm) {
		this.customerNm = customerNm;
	}
	/**
	 * @return the certifTp
	 */
	public String getCertifTp() {
		return certifTp;
	}
	/**
	 * @param certifTp the certifTp to set
	 */
	public void setCertifTp(String certifTp) {
		this.certifTp = certifTp;
	}
	/**
	 * @return the certifId
	 */
	public String getCertifId() {
		return certifId;
	}
	/**
	 * @param certifId the certifId to set
	 */
	public void setCertifId(String certifId) {
		this.certifId = certifId;
	}
	/**
	 * @return the phoneNo
	 */
	public Long getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * @return the cvn2
	 */
	public String getCvn2() {
		return cvn2;
	}
	/**
	 * @param cvn2 the cvn2 to set
	 */
	public void setCvn2(String cvn2) {
		this.cvn2 = cvn2;
	}
	/**
	 * @return the expired
	 */
	public String getExpired() {
		return expired;
	}
	/**
	 * @param expired the expired to set
	 */
	public void setExpired(String expired) {
		this.expired = expired;
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
    
    
    
    
}
