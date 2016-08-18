/* 
 * CoopInstiBusi.java  
 * 
 * version TODO
 *
 * 2016年1月13日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.bean;

import java.io.Serializable;

import com.zlebank.zplatform.member.bean.enums.BusinessActorType;


/**
 * 合作机构
 *
 * @author Luxiaoshuai
 * @version
 * @date 2016年1月13日 下午7:54:01
 * @since 
 */
public class CoopInstiBusi implements BusinessActor,Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -6341821408552519295L;
    private String businessActorId;


    /**
     * 
     * @return
     */
    @Override
    public BusinessActorType getBusinessActorType() {
        return BusinessActorType.COOPINSTI;
    }


    public String getBusinessActorId() {
        return businessActorId;
    }


    public void setBusinessActorId(String businessActorId) {
        this.businessActorId = businessActorId;
    }

}
