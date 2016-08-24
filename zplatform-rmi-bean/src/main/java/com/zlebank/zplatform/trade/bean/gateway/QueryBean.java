/* 
 * QueryBean.java  
 * 
 * version TODO
 *
 * 2015年9月30日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.trade.bean.gateway;

import java.io.Serializable;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2015年9月30日 下午4:24:35
 * @since 
 */
public class QueryBean implements Serializable{
    
    
    private static final long serialVersionUID = 7297085099954126985L;
    
    private String version="";
    
    private String encoding="";
   
    private String certId="";
    
    private String signature;
    
    private String signMethod;
    
    private String txnType="";
    
    private String txnSubType="";
    
    private String bizType="";
   
    private String accessType;
    
    private String coopInstiId="";
   
    private String merId="";
    
    private String txnTime="";
    private String orderId="";
    private String queryId="";
    private String reserved="";
    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }
    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }
    /**
     * @return the encoding
     */
    public String getEncoding() {
        return encoding;
    }
    /**
     * @param encoding the encoding to set
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
    /**
     * @return the certId
     */
    public String getCertId() {
        return certId;
    }
    /**
     * @param certId the certId to set
     */
    public void setCertId(String certId) {
        this.certId = certId;
    }
    /**
     * @return the signature
     */
    public String getSignature() {
        return signature;
    }
    /**
     * @param signature the signature to set
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }
    /**
     * @return the signMethod
     */
    public String getSignMethod() {
        return signMethod;
    }
    /**
     * @param signMethod the signMethod to set
     */
    public void setSignMethod(String signMethod) {
        this.signMethod = signMethod;
    }
    /**
     * @return the txnType
     */
    public String getTxnType() {
        return txnType;
    }
    /**
     * @param txnType the txnType to set
     */
    public void setTxnType(String txnType) {
        this.txnType = txnType;
    }
    /**
     * @return the txnSubType
     */
    public String getTxnSubType() {
        return txnSubType;
    }
    /**
     * @param txnSubType the txnSubType to set
     */
    public void setTxnSubType(String txnSubType) {
        this.txnSubType = txnSubType;
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
     * @return the accessType
     */
    public String getAccessType() {
        return accessType;
    }
    /**
     * @param accessType the accessType to set
     */
    public void setAccessType(String accessType) {
        this.accessType = accessType;
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
     * @return the queryId
     */
    public String getQueryId() {
        return queryId;
    }
    /**
     * @param queryId the queryId to set
     */
    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }
    /**
     * @return the reserved
     */
    public String getReserved() {
        return reserved;
    }
    /**
     * @param reserved the reserved to set
     */
    public void setReserved(String reserved) {
        this.reserved = reserved;
    }
	/**
	 * @return the coopInstiId
	 */
	public String getCoopInstiId() {
		return coopInstiId;
	}
	/**
	 * @param coopInstiId the coopInstiId to set
	 */
	public void setCoopInstiId(String coopInstiId) {
		this.coopInstiId = coopInstiId;
	}
    
    
}
