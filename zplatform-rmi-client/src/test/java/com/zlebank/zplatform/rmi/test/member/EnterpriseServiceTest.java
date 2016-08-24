/* 
 * EnterpriseServiceTest.java  
 * 
 * version TODO
 *
 * 2016年8月19日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.test.member;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zlebank.zplatform.member.bean.EnterpriseBean;
import com.zlebank.zplatform.member.bean.enums.IndustryType;
import com.zlebank.zplatform.rmi.member.IEnterpriseService;
import com.zlebank.zplatform.rmi.test.BaseTest;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月19日 下午2:01:29
 * @since 
 */

public class EnterpriseServiceTest extends BaseTest{

	@Autowired
	private IEnterpriseService enterpriseService;
	
	@Test
	public void test_register(){
		EnterpriseBean enterpriseDeta = new EnterpriseBean();
		enterpriseDeta.setCoopInstiCode("300000000000027");
		enterpriseDeta.setEnterpriseName("测试企业"+System.currentTimeMillis());
		enterpriseDeta.setEmail("test@"+System.currentTimeMillis()+".com");
		enterpriseDeta.setCellPhoneNo("11111111111");
		enterpriseDeta.setProvince(1L);
		enterpriseDeta.setCity(1L);
		enterpriseDeta.setStreet(1L);
		enterpriseDeta.setTaxNo("123");
		enterpriseDeta.setLicenceNo("456");
		enterpriseDeta.setOrgCode("789");
		enterpriseDeta.setAddress("测试地址给");
		enterpriseDeta.setPostCode("100024");
		enterpriseDeta.setPrimaryBusiness(IndustryType.FINANCE);
		enterpriseDeta.setCorporation("联系人");
		enterpriseDeta.setCorpNo("110105198610094789");
		enterpriseDeta.setContact("联系人");
		enterpriseDeta.setContPhone("22222222222");
		enterpriseDeta.setContAddress("联系人地址");
		enterpriseDeta.setContPost("100089");
		enterpriseDeta.setContEmail(System.currentTimeMillis()+"@test.com");
		
		try {
			enterpriseService.registerApply(enterpriseDeta);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
