/* 
 * TxnsLogServiceProxy.java  
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
import com.zlebank.zplatform.trade.model.TxnsLogModel;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 上午10:03:07
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/txnsLogServiceProxy")
public interface TxnsLogServiceProxy {

	/**
     * 通过交易流水号获取交易信息
     * @param txnseqno
     * @return
     */
    public TxnsLogModel getTxnsLogByTxnseqno(String txnseqno);
    
    /**
	 * 更新匿名下单，登陆支付
	 * @param txnseqno
	 * @param memberId
	 */
	public void updateAnonOrderToMemberOrder(String txnseqno,String memberId);
}
