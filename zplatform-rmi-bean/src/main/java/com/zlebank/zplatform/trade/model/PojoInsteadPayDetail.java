/* 
 * PojoInsteadPayDetail.java  
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
 * 代付批次明细表
 *
 * @author Luxiaoshuai
 * @version
 * @date 2015年11月24日 下午12:04:13
 * @since 
 */

public class PojoInsteadPayDetail implements Serializable{

    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1331826583442532288L;
	/**标识**/
    private Long id;
    /**商户代码**/
    private String merId;
    /**商户订单号**/
    private String orderId;
    /**（人民币）156**/
    private String currencyCode;
    /**单笔金额(以分为单位，最长12位)**/
    private Long amt;
    /**产品类型(固定：000001)**/
    private String bizType;
    /**账号类型01:银行卡;02:存折**/
    private String accType;
    /**账号**/
    private String accNo;
    /**户名**/
    private String accName;
    /**开户行代码帐号类型取值为“02”时不能为空**/
    private String bankCode;
    /**开户行省**/
    private String issInsProvince;
    /**开户行市**/
    private String issInsCity;
    /**开户行名称**/
    private String issInsName;
    /**证件类型**/
    private String certifTp;
    /**证件号码**/
    private String certifId;
    /**手机号**/
    private Long phoneNo;
    /**账单类型**/
    private String billType;
    /**附言**/
    private String notes;
    /**状态00：已处理01**/
    private String status;
    /**初审人**/
    private Long stexauser;
    /**初审时间**/
    private Date stexatime;
    /**初审意见**/
    private String stexaopt;
    /**复核人**/
    private Long cvlexauser;
    /**复核时间**/
    private Date cvlexatime;
    /**复核意见**/
    private String cvlexaopt;
    /**通道代码**/
    private String channelCode;
    /**划拨批次文件号**/
    private String batchFileNo;
    /**划拨响应代码**/
    private String respCode;
    /**划拨响应信息**/
    private String respMsg;
    /**备注**/
    private String remarks;
    /**写入人**/
    private Long inuser;
    /**写入时间**/
    private Date intime;
    /**交易流水号**/
    private String  txnseqno;
    /**手续费**/
    private Long  txnfee;
    /**代付明细流水号**/
    private String insteadPayDataSeqNo;
    /**申请时间**/
    private Date applyTime;
    /**划拨流水ID**/
    private Long tranDataId;

    private  PojoInsteadPayBatch insteadPayBatch;

   
    public PojoInsteadPayBatch getInsteadPayBatch() {
        return insteadPayBatch;
    }
    public void setInsteadPayBatch(PojoInsteadPayBatch insteadPayBatch) {
        this.insteadPayBatch = insteadPayBatch;
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
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}
	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	/**
	 * @return the amt
	 */
	public Long getAmt() {
		return amt;
	}
	/**
	 * @param amt the amt to set
	 */
	public void setAmt(Long amt) {
		this.amt = amt;
	}
	/**
	 * @return the bizType
	 */
	public String getBizType() {
		return bizType;
	}
	/**
	 * @param bizType the bizType to set
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	/**
	 * @return the accType
	 */
	public String getAccType() {
		return accType;
	}
	/**
	 * @param accType the accType to set
	 */
	public void setAccType(String accType) {
		this.accType = accType;
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
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}
	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	/**
	 * @return the issInsProvince
	 */
	public String getIssInsProvince() {
		return issInsProvince;
	}
	/**
	 * @param issInsProvince the issInsProvince to set
	 */
	public void setIssInsProvince(String issInsProvince) {
		this.issInsProvince = issInsProvince;
	}
	/**
	 * @return the issInsCity
	 */
	public String getIssInsCity() {
		return issInsCity;
	}
	/**
	 * @param issInsCity the issInsCity to set
	 */
	public void setIssInsCity(String issInsCity) {
		this.issInsCity = issInsCity;
	}
	/**
	 * @return the issInsName
	 */
	public String getIssInsName() {
		return issInsName;
	}
	/**
	 * @param issInsName the issInsName to set
	 */
	public void setIssInsName(String issInsName) {
		this.issInsName = issInsName;
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
	 * @return the billType
	 */
	public String getBillType() {
		return billType;
	}
	/**
	 * @param billType the billType to set
	 */
	public void setBillType(String billType) {
		this.billType = billType;
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
	 * @return the stexauser
	 */
	public Long getStexauser() {
		return stexauser;
	}
	/**
	 * @param stexauser the stexauser to set
	 */
	public void setStexauser(Long stexauser) {
		this.stexauser = stexauser;
	}
	/**
	 * @return the stexatime
	 */
	public Date getStexatime() {
		return stexatime;
	}
	/**
	 * @param stexatime the stexatime to set
	 */
	public void setStexatime(Date stexatime) {
		this.stexatime = stexatime;
	}
	/**
	 * @return the stexaopt
	 */
	public String getStexaopt() {
		return stexaopt;
	}
	/**
	 * @param stexaopt the stexaopt to set
	 */
	public void setStexaopt(String stexaopt) {
		this.stexaopt = stexaopt;
	}
	/**
	 * @return the cvlexauser
	 */
	public Long getCvlexauser() {
		return cvlexauser;
	}
	/**
	 * @param cvlexauser the cvlexauser to set
	 */
	public void setCvlexauser(Long cvlexauser) {
		this.cvlexauser = cvlexauser;
	}
	/**
	 * @return the cvlexatime
	 */
	public Date getCvlexatime() {
		return cvlexatime;
	}
	/**
	 * @param cvlexatime the cvlexatime to set
	 */
	public void setCvlexatime(Date cvlexatime) {
		this.cvlexatime = cvlexatime;
	}
	/**
	 * @return the cvlexaopt
	 */
	public String getCvlexaopt() {
		return cvlexaopt;
	}
	/**
	 * @param cvlexaopt the cvlexaopt to set
	 */
	public void setCvlexaopt(String cvlexaopt) {
		this.cvlexaopt = cvlexaopt;
	}
	/**
	 * @return the channelCode
	 */
	public String getChannelCode() {
		return channelCode;
	}
	/**
	 * @param channelCode the channelCode to set
	 */
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	/**
	 * @return the batchFileNo
	 */
	public String getBatchFileNo() {
		return batchFileNo;
	}
	/**
	 * @param batchFileNo the batchFileNo to set
	 */
	public void setBatchFileNo(String batchFileNo) {
		this.batchFileNo = batchFileNo;
	}
	/**
	 * @return the respCode
	 */
	public String getRespCode() {
		return respCode;
	}
	/**
	 * @param respCode the respCode to set
	 */
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	/**
	 * @return the respMsg
	 */
	public String getRespMsg() {
		return respMsg;
	}
	/**
	 * @param respMsg the respMsg to set
	 */
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	 * @return the txnseqno
	 */
	public String getTxnseqno() {
		return txnseqno;
	}
	/**
	 * @param txnseqno the txnseqno to set
	 */
	public void setTxnseqno(String txnseqno) {
		this.txnseqno = txnseqno;
	}
	/**
	 * @return the txnfee
	 */
	public Long getTxnfee() {
		return txnfee;
	}
	/**
	 * @param txnfee the txnfee to set
	 */
	public void setTxnfee(Long txnfee) {
		this.txnfee = txnfee;
	}
	/**
	 * @return the insteadPayDataSeqNo
	 */
	public String getInsteadPayDataSeqNo() {
		return insteadPayDataSeqNo;
	}
	/**
	 * @param insteadPayDataSeqNo the insteadPayDataSeqNo to set
	 */
	public void setInsteadPayDataSeqNo(String insteadPayDataSeqNo) {
		this.insteadPayDataSeqNo = insteadPayDataSeqNo;
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
	 * @return the tranDataId
	 */
	public Long getTranDataId() {
		return tranDataId;
	}
	/**
	 * @param tranDataId the tranDataId to set
	 */
	public void setTranDataId(Long tranDataId) {
		this.tranDataId = tranDataId;
	}
   
}
