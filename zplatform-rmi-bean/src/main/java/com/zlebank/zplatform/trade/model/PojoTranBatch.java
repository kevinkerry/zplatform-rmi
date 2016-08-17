/* 
 * PojoTranBatch.java  
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
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
/**
 * 划拨批次
 *
 * @author Luxiaoshuai
 * @version
 * @date 2016年3月8日 下午3:20:31
 * @since 1.3.0
 */

public class PojoTranBatch implements Serializable{
	
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8961908889138761351L;
	/**标示**/
    private Long tid;
    /**划拨批次号**/
    private String tranBatchNo;
    /**总笔数**/
    private Long totalCount;
    /**总金额**/
    private Long totalAmt;
    /**审核通过笔数**/
    private Long approveCount;
    /**审核通过金额**/
    private Long approveAmt;
    /**审核拒绝笔数**/
    private Long refuseCount;
    /**审核拒绝金额**/
    private Long refuseAmt;
    /**"""状态（01：未审核02：部分审核通过03：全部审核通过**/
    private String status;
    /**"申请时间"**/
    @JSONField (format="yyyy-MM-dd HH:mm:ss") 
    private Date applyTime;
    /**"全部通过完成时间"**/
    @JSONField (format="yyyy-MM-dd HH:mm:ss") 
    private Date approveFinishTime;
    /**"业务类型（00：代付01：提现02：退款）"**/
    private String busiType;
    /**"业务批次ID"**/
    private Long busiBatchId;
    /**"银行转账完成时间"**/
    @JSONField (format="yyyy-MM-dd HH:mm:ss") 
    private Date finishTime; 
    /**待审核笔数**/
    private Long waitApproveCount;
    /**待审核金额**/
    private Long waitApproveAmt;
    /**银行转账批次号**/
    @JSONField(serialize = false)  
    private List<PojoBankTransferBatch> bankTransferBatchs;
    /**银行转账流水**/
    @JSONField(serialize = false)  
    private List<PojoTranData> tranDatas;
    /**代付批次**/
    @JSONField(serialize = false)  
    private PojoInsteadPayBatch insteadPayBatch;
    
    private String merchBathcNo;
    private String busiBatchNo;
   
   
    public Long getTid() {
        return tid;
    }
    public void setTid(Long tid) {
        this.tid = tid;
    }
    public String getTranBatchNo() {
        return tranBatchNo;
    }
    public void setTranBatchNo(String tranBatchNo) {
        this.tranBatchNo = tranBatchNo;
    }
    public Long getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
    public Long getTotalAmt() {
        return totalAmt;
    }
    public void setTotalAmt(Long totalAmt) {
        this.totalAmt = totalAmt;
    }
    public Long getApproveCount() {
        return approveCount;
    }
    public void setApproveCount(Long approveCount) {
        this.approveCount = approveCount;
    }
    public Long getApproveAmt() {
        return approveAmt;
    }
    public void setApproveAmt(Long approveAmt) {
        this.approveAmt = approveAmt;
    }
    public Long getRefuseCount() {
        return refuseCount;
    }
    public void setRefuseCount(Long refuseCount) {
        this.refuseCount = refuseCount;
    }
    public Long getRefuseAmt() {
        return refuseAmt;
    }
    public void setRefuseAmt(Long refuseAmt) {
        this.refuseAmt = refuseAmt;
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
    public Date getApproveFinishTime() {
        return approveFinishTime;
    }
    public void setApproveFinishTime(Date approveFinishTime) {
        this.approveFinishTime = approveFinishTime;
    }
    public String getBusiType() {
        return busiType;
    }
    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }
    public Long getBusiBatchId() {
        return busiBatchId;
    }
    public void setBusiBatchId(Long busiBatchId) {
        this.busiBatchId = busiBatchId;
    }
    public Date getFinishTime() {
        return finishTime;
    }
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
    public Long getWaitApproveCount() {
        return waitApproveCount;
    }
    public void setWaitApproveCount(Long waitApproveCount) {
        this.waitApproveCount = waitApproveCount;
    }
    public Long getWaitApproveAmt() {
        return waitApproveAmt;
    }
    public void setWaitApproveAmt(Long waitApproveAmt) {
        this.waitApproveAmt = waitApproveAmt;
    }
    public List<PojoBankTransferBatch> getBankTransferBatchs() {
        return bankTransferBatchs;
    }
    public void setBankTransferBatchs(List<PojoBankTransferBatch> bankTransferBatchs) {
        this.bankTransferBatchs = bankTransferBatchs;
    }
    public List<PojoTranData> getTranDatas() {
        return tranDatas;
    }
    public void setTranDatas(List<PojoTranData> tranDatas) {
        this.tranDatas = tranDatas;
    }
    public PojoInsteadPayBatch getInsteadPayBatch() {
        return insteadPayBatch;
    }
    public void setInsteadPayBatch(PojoInsteadPayBatch insteadPayBatch) {
        this.insteadPayBatch = insteadPayBatch;
    }
    
    public void addTranDatas(List<PojoTranData> tranDatas){
        for(PojoTranData tranData:tranDatas){
            tranData.setTranBatch(this);
        }
        if(this.tranDatas==null){
            this.tranDatas = tranDatas;
        }else{
            this.tranDatas.addAll(tranDatas);
        }
    }
    public String getMerchBathcNo() {
        return merchBathcNo;
    }
    public void setMerchBathcNo(String merchBathcNo) {
        this.merchBathcNo = merchBathcNo;
    }
    public String getBusiBatchNo() {
        return busiBatchNo;
    }
    public void setBusiBatchNo(String busiBatchNo) {
        this.busiBatchNo = busiBatchNo;
    }
}
