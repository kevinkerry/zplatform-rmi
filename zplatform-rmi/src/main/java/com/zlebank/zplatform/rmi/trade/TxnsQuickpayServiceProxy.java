/* 
 * TxnsQuickpayServiceProxy.java  
 * 
 * version TODO
 *
 * 2016年8月18日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 上午10:36:01
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/txnsQuickpayServiceProxy")
public interface TxnsQuickpayServiceProxy {
	 /**
     * 通过交易序列号获取融宝订单号
     * @param txnseqno
     * @return
     */
    public String getReapayOrderNo(String txnseqno);
}
