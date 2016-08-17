/* 
 * GateWayServiceImpl.java  
 * 
 * version TODO
 *
 * 2016年8月16日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.trade.IGateWayService;
import com.zlebank.zplatform.trade.bean.ResultBean;
import com.zlebank.zplatform.trade.bean.wap.WapCardBean;
import com.zlebank.zplatform.trade.exception.TradeException;
import com.zlebank.zplatform.trade.model.TxnsOrderinfoModel;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月16日 下午4:36:07
 * @since 
 */
@Repository
public class GateWayServiceImpl extends HessianServlet implements IGateWayService{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3471789345770777318L;
	@Autowired
	private com.zlebank.zplatform.trade.service.IGateWayService gateWayService;

	/**
	 *
	 * @param json
	 * @throws TradeException
	 */
	@Override
	public void sendSMSMessage(String json) throws TradeException {
		// TODO Auto-generated method stub
		gateWayService.sendSMSMessage(json);
	}

	/**
	 *
	 * @param tn
	 * @return
	 */
	@Override
	public TxnsOrderinfoModel getOrderinfoByTN(String tn) {
		// TODO Auto-generated method stub
		return gateWayService.getOrderinfoByTN(tn);
	}

	/**
	 *
	 * @param memberId
	 * @param personMemberId
	 * @param cardBean
	 * @return
	 */
	@Override
	public ResultBean bindingBankCard(String memberId, String personMemberId,
			WapCardBean cardBean) {
		// TODO Auto-generated method stub
		return gateWayService.bindingBankCard(memberId, personMemberId, cardBean);
	}

}
