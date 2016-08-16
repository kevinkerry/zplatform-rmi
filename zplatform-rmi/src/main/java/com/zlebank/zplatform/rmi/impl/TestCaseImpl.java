/* 
 * TestCaseImpl.java  
 * 
 * version TODO
 *
 * 2016年8月16日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.ITestCase;
import com.zlebank.zplatform.trade.model.TxnsLogModel;
import com.zlebank.zplatform.trade.service.ITxnsLogService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月16日 上午11:33:15
 * @since 
 */
@Repository("testcase")
public class TestCaseImpl extends HessianServlet implements ITestCase{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -384423138675900382L;
	@Autowired
	private ITxnsLogService txnsLogService;
	
	
	/**
	 *
	 * @param para
	 * @return
	 */
	@Override
	public String test(String para) {
		TxnsLogModel txnsLogByTxnseqno = txnsLogService.getTxnsLogByTxnseqno("1608169900056461");
        return JSON.toJSONString(txnsLogByTxnseqno); 
	}

	
}
