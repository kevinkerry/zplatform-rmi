/* 
 * RealNameAuthServiceProxyImpl.java  
 * 
 * version TODO
 *
 * 2016年9月13日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade.insteadpay.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.trade.insteadpay.RealNameAuthServiceProxy;
import com.zlebank.zplatform.trade.exception.BalanceNotEnoughException;
import com.zlebank.zplatform.trade.exception.DuplicateOrderIdException;
import com.zlebank.zplatform.trade.exception.MessageDecryptFailException;
import com.zlebank.zplatform.trade.exception.RealNameAuthFailException;
import com.zlebank.zplatform.trade.insteadPay.message.RealnameAuthFile;
import com.zlebank.zplatform.trade.insteadPay.message.RealnameAuthQuery_Request;
import com.zlebank.zplatform.trade.insteadPay.message.RealnameAuthQuery_Response;
import com.zlebank.zplatform.trade.insteadPay.message.RealnameAuth_Request;
import com.zlebank.zplatform.trade.service.RealNameAuthService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年9月13日 上午11:52:09
 * @since
 */
@Repository
public class RealNameAuthServiceProxyImpl extends HessianServlet implements
		RealNameAuthServiceProxy {

	private static final Log log = LogFactory
			.getLog(RealNameAuthServiceProxyImpl.class);
	@Autowired
	private RealNameAuthService realNameAuthService;

	/**
	 *
	 * @param request
	 * @param realNameAuth
	 * @param orderId
	 * @return
	 * @throws MessageDecryptFailException
	 * @throws RealNameAuthFailException
	 * @throws BalanceNotEnoughException
	 */
	@Override
	public boolean realNameAuth(RealnameAuth_Request request,
			RealnameAuthFile realNameAuth, Long orderId) throws Exception {
		// TODO Auto-generated method stub

		try {
			return realNameAuthService.realNameAuth(request, realNameAuth,
					orderId);
		} catch (MessageDecryptFailException | RealNameAuthFailException
				| BalanceNotEnoughException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error(e.getMessage());
			throw new Exception(e.getMessage());
		}
	}

	/**
	 *
	 * @param requestBean
	 * @param responseBean
	 */
	@Override
	public void realNameAuthQuery(RealnameAuthQuery_Request requestBean,
			RealnameAuthQuery_Response responseBean) {
		// TODO Auto-generated method stub
		realNameAuthService.realNameAuthQuery(requestBean, responseBean);
	}

	/**
	 *
	 * @param request
	 * @param realNameAuth
	 * @return
	 * @throws Exception
	 * @throws DuplicateOrderIdException
	 */
	@Override
	public Long saveRealNameAuthOrder(RealnameAuth_Request request,
			RealnameAuthFile realNameAuth) throws Exception {
		// TODO Auto-generated method stub
		try {
			return realNameAuthService.saveRealNameAuthOrder(request,
					realNameAuth);
		} catch (DuplicateOrderIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error(e.getMessage());
			throw new Exception(e.getMessage());
		}

	}

}
