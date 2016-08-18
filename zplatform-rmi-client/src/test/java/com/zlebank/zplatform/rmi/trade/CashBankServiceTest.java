/* 
 * CashBankServiceTest.java  
 * 
 * version TODO
 *
 * 2016年8月18日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zlebank.zplatform.trade.common.page.PageVo;
import com.zlebank.zplatform.trade.model.CashBankModel;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 下午12:23:13
 * @since 
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("/remoting-client.xml")  
public class CashBankServiceTest {

	@Autowired
	private CashBankServiceProxy bankServiceProxy;
	
	
	public void test_findBankByCashCode(){
		List<CashBankModel> findBankByCashCode = bankServiceProxy.findBankByCashCode("96000001");
		
		System.out.println(JSON.toJSONString(findBankByCashCode));
	}
	
	public void test_findBankByPaytype(){
		List<CashBankModel> findBankByPaytype = bankServiceProxy.findBankByPaytype("01");
		System.out.println(JSON.toJSONString(findBankByPaytype));
	}
	
	public void test_findBankCount(){
		long findBankCount = bankServiceProxy.findBankCount();
		System.out.println(findBankCount);
	}
	
	public void test_findBankPage(){
		List<CashBankModel> findBankPage = bankServiceProxy.findBankPage(0, 10);
		System.out.println(JSON.toJSONString(findBankPage));
	}
	
	@Test
	public void test_(){
		PageVo<CashBankModel> cardList = bankServiceProxy.getCardList(null, 0, 10);
		System.out.println(JSON.toJSONString(cardList));
	}
}
