/* 
 * ConfigInfoServiceProxyImpl.java  
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.trade.ConfigInfoServiceProxy;
import com.zlebank.zplatform.trade.model.ConfigInfoModel;
import com.zlebank.zplatform.trade.service.ConfigInfoService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 上午10:17:42
 * @since 
 */
@Repository
public class ConfigInfoServiceProxyImpl extends HessianServlet implements ConfigInfoServiceProxy{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -454694486126670356L;
	
	@Autowired
	private ConfigInfoService configInfoService;

	/**
	 *
	 * @param paraName
	 * @return
	 */
	@Override
	public ConfigInfoModel getConfigByParaName(String paraName) {
		// TODO Auto-generated method stub
		return configInfoService.getConfigByParaName(paraName);
	}

	/**
	 *
	 * @param paraName
	 * @return
	 */
	@Override
	public List<ConfigInfoModel> getConfigListByParaName(String paraName) {
		// TODO Auto-generated method stub
		return configInfoService.getConfigListByParaName(paraName);
	}

	/**
	 *
	 * @param sequences
	 * @return
	 */
	@Override
	public long getSequence(String sequences) {
		// TODO Auto-generated method stub
		return configInfoService.getSequence(sequences);
	}

}
