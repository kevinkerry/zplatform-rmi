/* 
 * TxnsLogServiceProxyImpl.java  
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
import com.zlebank.zplatform.rmi.trade.TxnsLogServiceProxy;
import com.zlebank.zplatform.trade.model.TxnsLogModel;
import com.zlebank.zplatform.trade.service.ITxnsLogService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 上午10:10:35
 * @since 
 */
@Repository
public class TxnsLogServiceProxyImpl extends HessianServlet implements TxnsLogServiceProxy{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3961786689215316474L;

	@Autowired
	private ITxnsLogService txnsLogService;
	/**
	 *
	 * @param txnseqno
	 * @return
	 */
	@Override
	public TxnsLogModel getTxnsLogByTxnseqno(String txnseqno) {
		// TODO Auto-generated method stub
		return txnsLogService.getTxnsLogByTxnseqno(txnseqno);
	}
	/**
	 *
	 * @param txnseqno
	 * @param memberId
	 */
	@Override
	public void updateAnonOrderToMemberOrder(String txnseqno, String memberId) {
		// TODO Auto-generated method stub
		txnsLogService.updateAnonOrderToMemberOrder(txnseqno, memberId);
	}

}
