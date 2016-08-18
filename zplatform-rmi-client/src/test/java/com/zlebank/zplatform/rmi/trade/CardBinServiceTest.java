/* 
 * CardBinServiceTest.java  
 * 
 * version TODO
 *
 * 2016年8月18日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zlebank.zplatform.commons.bean.CardBin;
import com.zlebank.zplatform.trade.model.TxnsOrderinfoModel;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 上午11:26:59
 * @since 
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("/remoting-client.xml")
public class CardBinServiceTest {

	@Autowired
	private CardBinServiceProxy cardBinServiceProxy;
	@Autowired
	private GateWayServiceProxy gateWayServiceProxy;
	
	@Test
	public void test_get(){
		CardBin card = cardBinServiceProxy.getCard("6225768749734008");
		System.out.println(JSON.toJSONString(card));
		//TxnsOrderinfoModel orderinfoByTN = gateWayServiceProxy.getOrderinfoByTN("151114044300000503");
		//System.out.println(JSON.toJSONString(orderinfoByTN));
	}
}
