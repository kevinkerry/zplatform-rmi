/* 
 * TxnsQuickpayServiceProxyImpl.java  
 * 
 * version TODO
 *
 * 2016年8月18日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.trade.TxnsQuickpayServiceProxy;
import com.zlebank.zplatform.trade.service.ITxnsQuickpayService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 上午10:38:28
 * @since 
 */
@Repository
public class TxnsQuickpayServiceProxyImpl extends HessianServlet implements TxnsQuickpayServiceProxy{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8368412554673857361L;
	@Autowired
	private ITxnsQuickpayService txnsQuickpayService;

	/**
	 *
	 * @param txnseqno
	 * @return
	 */
	@Override
	public String getReapayOrderNo(String txnseqno) {
		// TODO Auto-generated method stub
		return txnsQuickpayService.getReapayOrderNo(txnseqno);
	}
	
}
