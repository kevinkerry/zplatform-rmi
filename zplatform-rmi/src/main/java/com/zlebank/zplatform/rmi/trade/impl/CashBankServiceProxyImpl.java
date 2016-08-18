/* 
 * CashBankServiceProxyImpl.java  
 * 
 * version TODO
 *
 * 2016年8月18日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.trade.CashBankServiceProxy;
import com.zlebank.zplatform.trade.common.page.PageVo;
import com.zlebank.zplatform.trade.model.CashBankModel;
import com.zlebank.zplatform.trade.service.ICashBankService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 上午9:54:54
 * @since 
 */
@Repository
public class CashBankServiceProxyImpl  extends HessianServlet implements CashBankServiceProxy{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1181001841393051073L;
	@Autowired
	private ICashBankService cashBankService;
	/**
	 *
	 * @param cashCode
	 * @return
	 */
	@Override
	public List<CashBankModel> findBankByCashCode(String cashCode) {
		// TODO Auto-generated method stub
		return cashBankService.findBankByCashCode(cashCode);
	}

	/**
	 *
	 * @param payType
	 * @return
	 */
	@Override
	public List<CashBankModel> findBankByPaytype(String payType) {
		// TODO Auto-generated method stub
		return cashBankService.findBankByPaytype(payType);
	}

	/**
	 *
	 * @param page
	 * @param pageSize
	 * @return
	 */
	@Override
	public List<CashBankModel> findBankPage(int page, int pageSize) {
		// TODO Auto-generated method stub
		return cashBankService.findBankPage(page, pageSize);
	}

	/**
	 *
	 * @return
	 */
	@Override
	public long findBankCount() {
		// TODO Auto-generated method stub
		return cashBankService.findBankCount();
	}

	/**
	 *
	 * @param query
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@Override
	public PageVo<CashBankModel> getCardList(Map<String, Object> query,
			Integer pageNo, Integer pageSize) {
		// TODO Auto-generated method stub
		return cashBankService.getCardList(query, pageNo, pageSize);
	}

}
