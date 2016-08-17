
/* 
 * PojoBankTransferChannel.java  
 * 
 * version TODO
 *
 * 2016年3月7日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.trade.model;


/**
 * Class Description
 *
 * @author Luxiaoshuai
 * @version
 * @date 2016年3月7日 下午3:39:36
 * @since 
 */

public class PojoBankTransferChannel {
    /****/
    private Long id;
    /**渠道号**/
    private String channelCode;
    /**渠道名称**/
    private String channelName;
    /**批次最大笔数**/
    private Long detaCount;
    /**定时发送（分钟）**/
    private Long scheduleDeliver;
    /**每日最终发送时间（hhmmss格式）**/
    private String finalDeliverTime;
    /**银行渠道号（参照T_Channel）**/
    private String bankChannelCode;
    /**行内行外（银行代码）01-行内 02-跨行**/
    private String bankType;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
   
    public String getChannelCode() {
        return channelCode;
    }
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }
    
    public String getChannelName() {
        return channelName;
    }
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
   
    public Long getDetaCount() {
        return detaCount;
    }
    public void setDetaCount(Long detaCount) {
        this.detaCount = detaCount;
    }
   
    public Long getScheduleDeliver() {
        return scheduleDeliver;
    }
    public void setScheduleDeliver(Long scheduleDeliver) {
        this.scheduleDeliver = scheduleDeliver;
    }
    
    public String getFinalDeliverTime() {
        return finalDeliverTime;
    }
    public void setFinalDeliverTime(String finalDeliverTime) {
        this.finalDeliverTime = finalDeliverTime;
    }
    
    public String getBankChannelCode() {
        return bankChannelCode;
    }
    public void setBankChannelCode(String bankChannelCode) {
        this.bankChannelCode = bankChannelCode;
    }
   
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
    
    
}

