/* 
 * MerchWhiteListServiceProxyImpl.java  
 * 
 * version TODO
 *
 * 2016年9月13日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade.insteadpay.impl;



import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.trade.insteadpay.MerchWhiteListInsteadPayServiceProxy;
import com.zlebank.zplatform.trade.insteadPay.message.MerWhiteList_Request;
import com.zlebank.zplatform.trade.service.MerchWhiteListService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年9月13日 上午11:46:41
 * @since 
 */
@Repository
public class MerchWhiteListInsteadPayServiceProxyImpl extends HessianServlet implements MerchWhiteListInsteadPayServiceProxy{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3616525790189383821L;
	private MerchWhiteListService merchWhiteListService;
	/**
	 *
	 * @param request
	 * @return
	 */
	@Override
	public String addMerchWhiteListService(MerWhiteList_Request request) {
		// TODO Auto-generated method stub
		return merchWhiteListService.addMerchWhiteListService(request);
	}

	/**
	 *
	 * @param merId
	 * @param accName
	 * @param accNo
	 * @return
	 */
	@Override
	public String checkMerchWhiteList(String merId, String accName, String accNo) {
		// TODO Auto-generated method stub
		return merchWhiteListService.checkMerchWhiteList(merId, accName, accNo);
	}

}
