/* 
 * CardBinServiceProxyImpl.java  
 * 
 * version TODO
 *
 * 2016年8月17日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.trade.CardBinServiceProxy;
import com.zlebank.zplatform.trade.bean.CardBinBean;
import com.zlebank.zplatform.trade.service.CardBinService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月17日 下午3:39:45
 * @since 
 */
@Repository
public class CardBinServiceProxyImpl extends HessianServlet implements CardBinServiceProxy{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2760293092004910428L;
	@Autowired
	private CardBinService cardBinService;
	/**
	 *
	 * @param cardNo
	 * @return
	 */
	public CardBinBean getCard(String cardNo) {
		// TODO Auto-generated method stub
		return cardBinService.getCard(cardNo);
	}
}
