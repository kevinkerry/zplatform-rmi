/* 
 * MerchWhiteListServiceProxyImpl.java  
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
import com.zlebank.zplatform.rmi.trade.MerchWhiteListServiceProxy;
import com.zlebank.zplatform.trade.model.PojoMerchWhiteList;
import com.zlebank.zplatform.trade.service.MerchWhiteListServiceExt;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月24日 上午11:49:43
 * @since 
 */
@Repository
public class MerchWhiteListServiceProxyImpl extends HessianServlet implements MerchWhiteListServiceProxy{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7037198407514875441L;
	@Autowired
	private MerchWhiteListServiceExt merchWhiteListService;
	/**
	 *
	 * @param merId
	 * @param accNo
	 * @param accName
	 * @return
	 */
	@Override
	public PojoMerchWhiteList getWhiteListByCardNoAndName(String merId,
			String accNo, String accName) {
		// TODO Auto-generated method stub
		return merchWhiteListService.getWhiteListByCardNoAndName(merId, accNo, accName);
	}

	/**
	 *
	 * @param id
	 * @return
	 */
	@Override
	public PojoMerchWhiteList getMerchWhiteListById(Long id) {
		// TODO Auto-generated method stub
		return merchWhiteListService.getMerchWhiteListById(id);
	}

	/**
	 *
	 * @param merchWhiteList
	 */
	@Override
	public void merge(PojoMerchWhiteList merchWhiteList) {
		// TODO Auto-generated method stub
		merchWhiteListService.merge(merchWhiteList);
	}

}
