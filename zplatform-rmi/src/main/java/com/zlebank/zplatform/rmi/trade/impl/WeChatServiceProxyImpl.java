/* 
 * WeChatServiceProxyImpl.java  
 * 
 * version TODO
 *
 * 2016年8月18日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade.impl;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.trade.WeChatServiceProxy;
import com.zlebank.zplatform.trade.bean.ResultBean;
import com.zlebank.zplatform.trade.bean.TradeBean;
import com.zlebank.zplatform.wechat.service.WeChatService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 上午10:31:40
 * @since 
 */
@Repository
public class WeChatServiceProxyImpl extends HessianServlet implements WeChatServiceProxy{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7570714425765569120L;
	@Autowired
	private WeChatService weChatService;
	/**
	 *
	 * @param tn
	 * @return
	 */
	@Override
	public JSONObject creatOrder(String tn) {
		// TODO Auto-generated method stub
		return weChatService.creatOrder(tn);
	}

	/**
	 *
	 * @param trade
	 * @return
	 */
	@Override
	public ResultBean queryWechatOrder(TradeBean trade) {
		// TODO Auto-generated method stub
		return weChatService.queryWechatOrder(trade);
	}

	
}
