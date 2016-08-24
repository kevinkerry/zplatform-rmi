/* 
 * RegionServiceProxy.java  
 * 
 * version TODO
 *
 * 2016年8月19日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.commons;

import java.util.List;

import com.zlebank.zplatform.commons.dao.pojo.PojoCity;
import com.zlebank.zplatform.commons.dao.pojo.PojoCounty;
import com.zlebank.zplatform.commons.dao.pojo.PojoProvince;
import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月19日 下午5:38:12
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/regionServiceProxy")
public interface RegionServiceProxy {
	/**
	 * 取得全部省份信息
	 * @return
	 */
	public List<PojoProvince> getAllProvince();
	/**
	 * 通过PID取得市信息
	 * @param pid
	 * @return
	 */
	public List<PojoCity> getCityByPID(Long pid);
	/**
	 * 通过CID取得区信息
	 * @param cid
	 * @return
	 */
	public List<PojoCounty> getCountyByCID(Long cid);
}
