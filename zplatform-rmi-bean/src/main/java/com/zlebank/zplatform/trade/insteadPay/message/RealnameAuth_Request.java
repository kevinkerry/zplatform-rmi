/* 
 * RealnameAuth_Request.java  
 * 
 * version v1.0
 *
 * 2015年11月24日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.trade.insteadPay.message;


/**
 * 实名认证【请求报文】
 *
 * @author Luxiaoshuai
 * @version
 * @date 2015年11月24日 下午4:42:14
 * @since 
 */
public class RealnameAuth_Request extends BaseMessage{

    /**接入类型**/
    private String accessType;
    /**商户订单号**/
    private String orderId;
    /**订单发送时间**/
    private String txnTime;
    /**加密信息域**/
    private String encryptData;

    public String getAccessType() {
        return accessType;
    }
    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getTxnTime() {
        return txnTime;
    }
    public void setTxnTime(String txnTime) {
        this.txnTime = txnTime;
    }
    public String getEncryptData() {
        return encryptData;
    }
    public void setEncryptData(String encryptData) {
        this.encryptData = encryptData;
    }
}
