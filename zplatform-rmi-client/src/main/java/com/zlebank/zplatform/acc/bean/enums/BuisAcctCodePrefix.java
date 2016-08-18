/* 
 * BuisAcctCodePrefix.java  
 * 
 * version 1.0
 *
 * 2015年9月22日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.acc.bean.enums;

/**
 * Class Description
 *
 * @author yangying
 * @version
 * @date 2015年9月22日 上午11:17:50
 * @since 
 */
public enum BuisAcctCodePrefix {
    /** 个人会员 */
    PRIVATE("60"),
    /** 企业会员 */
    PUBLIC("90"),
    /**
     * 产品
     */
    PRODUCT("80");
    private String code;
    
    private BuisAcctCodePrefix(String code){
        this.code = code;
    }
    
    public String getCode(){
        return code;
    }
}
