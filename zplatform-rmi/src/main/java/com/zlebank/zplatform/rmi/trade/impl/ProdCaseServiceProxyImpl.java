/* 
 * ProdCaseServiceProxyImpl.java  
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
import com.zlebank.zplatform.rmi.trade.ProdCaseServiceProxy;
import com.zlebank.zplatform.trade.bean.ResultBean;
import com.zlebank.zplatform.trade.bean.gateway.OrderBean;
import com.zlebank.zplatform.trade.bean.wap.WapOrderBean;
import com.zlebank.zplatform.trade.exception.TradeException;
import com.zlebank.zplatform.trade.service.IProdCaseService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月24日 下午12:07:10
 * @since 
 */
@Repository
public class ProdCaseServiceProxyImpl extends HessianServlet implements ProdCaseServiceProxy{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 803477386625543039L;
	@Autowired
	private IProdCaseService prodCaseService;
	/**
	 *
	 * @param order
	 * @return
	 */
	@Override
	public ResultBean verifyBusiness(OrderBean order) {
		// TODO Auto-generated method stub
		return prodCaseService.verifyBusiness(order);
	}

	/**
	 *
	 * @param order
	 * @throws TradeException
	 */
	@Override
	public void verifyWapBusiness(WapOrderBean order) throws TradeException {
		// TODO Auto-generated method stub
		prodCaseService.verifyWapBusiness(order);
	}

}
