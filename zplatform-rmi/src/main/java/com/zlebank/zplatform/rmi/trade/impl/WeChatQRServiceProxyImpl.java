/* 
 * WeChatQRServiceProxyImpl.java  
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
import com.zlebank.zplatform.rmi.trade.WeChatQRServiceProxy;
import com.zlebank.zplatform.trade.bean.ResultBean;
import com.zlebank.zplatform.trade.bean.TradeBean;
import com.zlebank.zplatform.trade.exception.TradeException;
import com.zlebank.zplatform.wechat.qr.service.WeChatQRService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 上午11:03:07
 * @since 
 */
@Repository
public class WeChatQRServiceProxyImpl extends HessianServlet implements WeChatQRServiceProxy{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3014682067262353265L;
	@Autowired
	private WeChatQRService weChatQRService;
	/**
	 *
	 * @param tn
	 * @return
	 */
	@Override
	public JSONObject creatOrder(String tn) {
		// TODO Auto-generated method stub
		try {
			return weChatQRService.creatOrder(tn);
		} catch (TradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 *
	 * @param trade
	 * @return
	 */
	@Override
	public ResultBean queryWechatOrder(TradeBean trade) {
		// TODO Auto-generated method stub
		return weChatQRService.queryWechatOrder(trade);
	}

	
}
