/* 
 * TxnsNotifyTaskServiceProxyImpl.java  
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
import com.zlebank.zplatform.rmi.trade.TxnsNotifyTaskServiceProxy;
import com.zlebank.zplatform.trade.model.TxnsNotifyTaskModel;
import com.zlebank.zplatform.trade.service.ITxnsNotifyTaskService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 上午10:56:07
 * @since 
 */
@Repository
public class TxnsNotifyTaskServiceProxyImpl extends HessianServlet implements TxnsNotifyTaskServiceProxy{

	@Autowired
	private ITxnsNotifyTaskService txnsNotifyTaskService;

	/**
	 *
	 * @param task
	 */
	@Override
	public void saveTask(TxnsNotifyTaskModel task) {
		// TODO Auto-generated method stub
		txnsNotifyTaskService.saveTask(task);
	}
	
}
