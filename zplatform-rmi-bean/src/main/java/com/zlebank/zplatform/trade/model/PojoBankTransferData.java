/* 
 * PojoBankTransferData.java  
 * 
 * version TODO
 *
 * 2016年3月7日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.trade.model;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
/**
 * 转账流水
 *
 * @author Luxiaoshuai
 * @version
 * @date 2016年3月7日 上午11:40:30
 * @since 1.3.0
 */
public class PojoBankTransferData implements Serializable{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1216450255077674134L;
    /**"表标识"**/
    private Long tid;
    /**"银行转账流水序列号"**/
    private String bankTranDataSeqNo;
    /**"银行转账应答流水序列号"**/
    private String bankTranResNo;
    /**"银行转账批次号"**/
    @JSONField (serialize=false) 
    private PojoBankTransferBatch bankTranBatch;
    /**"划拨流水号"**/
    @JSONField (serialize=false) 
    private PojoTranData tranData;
    /**"转账金额"**/
    private Long tranAmt;
    /**"账户号"**/
    private String accNo;
    /**"账户名"**/
    private String accName;
    /**"银行代码"**/
    private String accBankNo;
    /**"银行名称"**/
    private String accBankName;
    /**"""状态（01：未审核02：等待转账03：正在转账04:转账完成)**/
    private String status;
    /**"响应码"**/
    private String resCode;
    /**响应信息**/
    private String resInfo;
    /**"申请时间"**/
    @JSONField (format="yyyy-MM-dd HH:mm:ss") 
    private Date applyTime;
    /**"账户类型(0:对私账户1：对公账户)"**/
    private String accType;
    /**划拨类型，01-行内02-跨行**/
    private String transferType;
    /**付款结果**/
    private String resType;
    
   
    public Long getTid() {
        return tid;
    }
    public void setTid(Long tid) {
        this.tid = tid;
    }
    public String getBankTranDataSeqNo() {
        return bankTranDataSeqNo;
    }
    public void setBankTranDataSeqNo(String bankTranDataSeqNo) {
        this.bankTranDataSeqNo = bankTranDataSeqNo;
    } 
    public PojoBankTransferBatch getBankTranBatch() {
        return bankTranBatch;
    }
    public void setBankTranBatch(PojoBankTransferBatch bankTranBatch) {
        this.bankTranBatch = bankTranBatch;
    }
    public PojoTranData getTranData() {
        return tranData;
    }
    public void setTranData(PojoTranData tranData) {
        this.tranData = tranData;
    }
    public Long getTranAmt() {
        return tranAmt;
    }
    public void setTranAmt(Long tranAmt) {
        this.tranAmt = tranAmt;
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
	 * @return the accBankNo
	 */
	public String getAccBankNo() {
		return accBankNo;
	}
	/**
	 * @param accBankNo the accBankNo to set
	 */
	public void setAccBankNo(String accBankNo) {
		this.accBankNo = accBankNo;
	}
	/**
	 * @return the accBankName
	 */
	public String getAccBankName() {
		return accBankName;
	}
	/**
	 * @param accBankName the accBankName to set
	 */
	public void setAccBankName(String accBankName) {
		this.accBankName = accBankName;
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
	 * @return the transferType
	 */
	public String getTransferType() {
		return transferType;
	}
	/**
	 * @param transferType the transferType to set
	 */
	public void setTransferType(String transferType) {
		this.transferType = transferType;
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
    
}
