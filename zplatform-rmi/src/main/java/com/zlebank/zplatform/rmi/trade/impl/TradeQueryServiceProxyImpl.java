/* 
 * TradeQueryServiceProxyImpl.java  
 * 
 * version TODO
 *
 * 2016年8月24日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.trade.TradeQueryServiceProxy;
import com.zlebank.zplatform.trade.bean.enums.OrderStatusEnum;
import com.zlebank.zplatform.trade.service.TradeQueryService;
import com.zlebank.zplatform.trade.utils.OrderNumber;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月24日 下午2:50:39
 * @since 
 */
@Repository
public class TradeQueryServiceProxyImpl extends HessianServlet implements TradeQueryServiceProxy{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -9003702858552964889L;
	@Autowired
	private TradeQueryService tradeQueryService;
	/**
	 *
	 * @param txnseqno
	 * @return
	 */
	@Override
	public OrderStatusEnum queryTradeResult(String txnseqno) {
		OrderNumber.getInstance().generateTxnseqno("8000");
		return tradeQueryService.queryTradeResult(txnseqno);
	}

}
