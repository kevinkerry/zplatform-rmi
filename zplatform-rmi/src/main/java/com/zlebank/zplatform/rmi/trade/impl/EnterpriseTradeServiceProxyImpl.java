/* 
 * EnterpriseTradeServiceProxyImpl.java  
 * 
 * version TODO
 *
 * 2016年8月22日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.member.bean.EnterpriseRealNameBean;
import com.zlebank.zplatform.member.bean.EnterpriseRealNameConfirmBean;
import com.zlebank.zplatform.member.exception.DataCheckFailedException;
import com.zlebank.zplatform.member.exception.InvalidMemberDataException;
import com.zlebank.zplatform.rmi.trade.EnterpriseTradeServiceProxy;
import com.zlebank.zplatform.trade.exception.TradeException;
import com.zlebank.zplatform.trade.service.EnterpriseTradeService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月22日 下午2:58:07
 * @since 
 */
@Repository
public class EnterpriseTradeServiceProxyImpl extends HessianServlet implements EnterpriseTradeServiceProxy{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7249001097078562027L;
	
	@Autowired
	private EnterpriseTradeService enterpriseTradeService;
	
	public String createEnterpriseRealNameOrder(EnterpriseRealNameBean enterpriseRealNameBean) throws Exception{
		String tn = null;
		try {
			tn = enterpriseTradeService.createEnterpriseRealNameOrder(enterpriseRealNameBean);
		} catch (InvalidMemberDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception(e.getMessage());
		} catch (TradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		return tn;
	}

	/**
	 *
	 * @param enterpriseRealNameConfirmBean
	 * @throws Exception
	 */
	@Override
	public void realNameConfirm(EnterpriseRealNameConfirmBean enterpriseRealNameConfirmBean) throws Exception{
		// TODO Auto-generated method stub
		try {
			enterpriseTradeService.realNameConfirm(enterpriseRealNameConfirmBean);
		} catch (InvalidMemberDataException | DataCheckFailedException | TradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
}
