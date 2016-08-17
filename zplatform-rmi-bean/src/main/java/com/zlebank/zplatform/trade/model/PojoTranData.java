/* 
 * PojoTranData.java  
 * 
 * version TODO
 *
 * 2016年3月8日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.trade.model;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
/**
 * 划拨流水
 *
 * @author Luxiaoshuai
 * @version
 * @date 2016年3月8日 下午3:23:08
 * @since 1.3.0
 */

public class PojoTranData implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -7284460033718598602L;
    /** 标示 **/
    private Long tid;
    /** "划拨流水序列号" **/
    private String tranDataSeqNo;
    /** "划拨批次序列号" **/
    @JSONField(serialize = false)  
    private PojoTranBatch tranBatch;
    /** "业务类型" **/
    private String busiType;
    /** "业务流水号" **/
    private Long busiDataId;
    /** "账户类型(0:对私账户1：对公账户)" **/
    /** "账户号" **/
    private String accType;
    private String accNo;
    /** "账户名" **/
    private String accName;
    /** "银行代码" **/
    private String bankNo;
    /** "银行名称" **/
    private String bankName;
    /** "划拨金额" **/
    private Long tranAmt;
    /** "备注" **/
    private String remark;
    /** "状态(01:未审核00：审核通过09：审核拒绝)" **/
    private String status;
    /** "申请时间" **/
    @JSONField (format="yyyy-MM-dd HH:mm:ss") 
    private Date applyTime;
    /** "通过时间" **/
    @JSONField (format="yyyy-MM-dd HH:mm:ss") 
    private Date approveTime;
    /** "通过用户" **/
    private Long approveUser;
    /** "交易手续费" **/
    private Long tranFee;
    /** 转账流水数据 **/
    @JSONField(serialize = false)  
    private PojoBankTransferData bankTranData;
    /** 会员号/付款方的会员号 **/
    private String memberId;
    /** 交易序列号 **/
    private String txnseqno;
    
    private String busiSeqNo;
    private String merchOrderNo;
    
    public Long getTid() {
        return tid;
    }
    public void setTid(Long tid) {
        this.tid = tid;
    }
    public String getTranDataSeqNo() {
        return tranDataSeqNo;
    }
    public void setTranDataSeqNo(String tranDataSeqNo) {
        this.tranDataSeqNo = tranDataSeqNo;
    }
    public String getBusiType() {
        return busiType;
    }
    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }
    public Long getBusiDataId() {
        return busiDataId;
    }
    public void setBusiDataId(Long busiDataId) {
        this.busiDataId = busiDataId;
    }

    public String getAccType() {
        return accType;
    }
    public void setAccType(String accType) {
        this.accType = accType;
    }
    public String getAccNo() {
        return accNo;
    }
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
    public String getAccName() {
        return accName;
    }
    public void setAccName(String accName) {
        this.accName = accName;
    }
    public String getBankNo() {
        return bankNo;
    }
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public Long getTranAmt() {
        return tranAmt;
    }
    public void setTranAmt(Long tranAmt) {
        this.tranAmt = tranAmt;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getApplyTime() {
        return applyTime;
    }
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
    public Date getApproveTime() {
        return approveTime;
    }
    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }
    public Long getApproveUser() {
        return approveUser;
    }
    public void setApproveUser(Long approveUser) {
        this.approveUser = approveUser;
    }
    public Long getTranFee() {
        return tranFee;
    }
    public void setTranFee(Long tranFee) {
        this.tranFee = tranFee;
    }
    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public String getTxnseqno() {
        return txnseqno;
    }
    public void setTxnseqno(String txnseqno) {
        this.txnseqno = txnseqno;
    } 
    public PojoTranBatch getTranBatch() {
        return tranBatch;
    }
    public void setTranBatch(PojoTranBatch tranBatch) {
        this.tranBatch = tranBatch;
    }
    public PojoBankTransferData getBankTranData() {
        return bankTranData;
    }
    public void setBankTranData(PojoBankTransferData bankTranData) {
        this.bankTranData = bankTranData;
    }
    public String getBusiSeqNo() {
        return busiSeqNo;
    }
    public void setBusiSeqNo(String busiSeqNo) {
        this.busiSeqNo = busiSeqNo;
    }
    public String getMerchOrderNo() {
        return merchOrderNo;
    }
    public void setMerchOrderNo(String merchOrderNo) {
        this.merchOrderNo = merchOrderNo;
    }
}
