/* 
 * AppUpdateServiceProxyImpl.java  
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

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.trade.AppUpdateServiceProxy;
import com.zlebank.zplatform.trade.dao.AppUpdateDAO;
import com.zlebank.zplatform.trade.model.PojoAppUpdate;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月24日 下午3:14:37
 * @since 
 */
public class AppUpdateServiceProxyImpl extends HessianServlet implements AppUpdateServiceProxy{

	@Autowired
	private AppUpdateDAO appUpdateDAO;
	/**
	 *
	 * @param appVersion
	 * @param appChannelId
	 * @return
	 */
	@Override
	public PojoAppUpdate getAppUpdate(String appVersion, String appChannelId) {
		// TODO Auto-generated method stub
		return appUpdateDAO.getAppUpdate(appVersion, appChannelId);
	}

}
