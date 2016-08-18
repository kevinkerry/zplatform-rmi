/* 
 * WeChatQRServiceProxy.java  
 * 
 * version TODO
 *
 * 2016年8月18日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade;

import net.sf.json.JSONObject;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.trade.bean.ResultBean;
import com.zlebank.zplatform.trade.bean.TradeBean;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 上午11:01:37
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/weChatQRServiceProxy")
public interface WeChatQRServiceProxy {


	/**
	 * 创建微信支付订单
	 * @param tn
	 * @return
	 */
	public JSONObject creatOrder(String tn);
	
	/***
	 * 查询微信订单
	 * @param map
	 * @return
	 */
	public ResultBean queryWechatOrder(TradeBean trade);
}
