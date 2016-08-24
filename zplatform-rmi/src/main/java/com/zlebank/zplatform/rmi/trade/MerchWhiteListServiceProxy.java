/* 
 * MerchWhiteListServiceProxy.java  
 * 
 * version TODO
 *
 * 2016年8月24日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.trade.model.PojoMerchWhiteList;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月24日 上午11:48:02
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/merchWhiteListServiceProxy")
public interface MerchWhiteListServiceProxy {
	/**
     * 得到指定的白名单信息
     * @param accNo
     * @param accName
     */
    public PojoMerchWhiteList getWhiteListByCardNoAndName(String merId, String accNo, String accName);
    
    /**
     * 通过ID获取商户白名单信息
     * @param id
     * @return
     */
    public PojoMerchWhiteList getMerchWhiteListById(Long id);
    
    
    public void merge(PojoMerchWhiteList merchWhiteList);
}
