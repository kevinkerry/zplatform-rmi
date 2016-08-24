/* 
 * RegionServiceTest.java  
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

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.zlebank.zplatform.commons.dao.pojo.PojoProvince;
import com.zlebank.zplatform.rmi.test.BaseTest;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月19日 下午5:46:51
 * @since 
 */
public class RegionServiceTest extends BaseTest{

	@Autowired
	private RegionServiceProxy regionServiceProxy;
	
	@Test
	public void test_province(){
		List<PojoProvince> allProvince = regionServiceProxy.getAllProvince();
		System.out.println(JSON.toJSONString(allProvince));
	}
}
