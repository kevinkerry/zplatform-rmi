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

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.member.dao.ParaDicDAO;
import com.zlebank.zplatform.rmi.ITestCase;

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
	private ParaDicDAO paraDicDAO;
	
	/**
	 *
	 * @param para
	 * @return
	 */
	@Override
	public String test(String para) {
		String seqNextval = paraDicDAO.getSeqNextval("seq_checkstandver");
        return seqNextval; 
	}

	
}
