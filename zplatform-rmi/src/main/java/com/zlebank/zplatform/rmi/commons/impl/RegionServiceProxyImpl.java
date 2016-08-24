/* 
 * RegionServiceProxyImpl.java  
 * 
 * version TODO
 *
 * 2016年8月19日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.commons.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.commons.dao.pojo.PojoCity;
import com.zlebank.zplatform.commons.dao.pojo.PojoCounty;
import com.zlebank.zplatform.commons.dao.pojo.PojoProvince;
import com.zlebank.zplatform.member.service.RegionService;
import com.zlebank.zplatform.rmi.commons.RegionServiceProxy;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月19日 下午5:38:37
 * @since 
 */
@Repository
public class RegionServiceProxyImpl extends HessianServlet implements RegionServiceProxy{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8194838229468152525L;
	
	@Autowired
	private RegionService regionService;
	/**
	 *
	 * @return
	 */
	@Override
	public List<PojoProvince> getAllProvince() {
		// TODO Auto-generated method stub
		return regionService.getAllProvince();
	}

	/**
	 *
	 * @param pid
	 * @return
	 */
	@Override
	public List<PojoCity> getCityByPID(Long pid) {
		// TODO Auto-generated method stub
		return regionService.getCityByPID(pid);
	}

	/**
	 *
	 * @param cid
	 * @return
	 */
	@Override
	public List<PojoCounty> getCountyByCID(Long cid) {
		// TODO Auto-generated method stub
		return regionService.getCountyByCID(cid);
	}

}
