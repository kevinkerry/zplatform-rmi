/* 
 * TradeQueryServiceProxy.java  
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
import com.zlebank.zplatform.trade.bean.enums.OrderStatusEnum;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月24日 下午2:49:50
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/tradeQueryServiceProxy")
public interface TradeQueryServiceProxy {

	/**
	 * 查询交易结果（渠道查询）
	 * @param txnseqno
	 * @return
	 */
	public OrderStatusEnum queryTradeResult(String txnseqno);
}
