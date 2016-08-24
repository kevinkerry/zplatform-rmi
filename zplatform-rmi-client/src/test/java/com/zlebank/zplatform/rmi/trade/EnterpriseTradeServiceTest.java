/* 
 * EnterpriseTradeServiceTest.java  
 * 
 * version TODO
 *
 * 2016年8月22日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade;

import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zlebank.zplatform.member.bean.EnterpriseRealNameBean;
import com.zlebank.zplatform.member.bean.EnterpriseRealNameConfirmBean;
import com.zlebank.zplatform.rmi.test.BaseTest;
import com.zlebank.zplatform.trade.bean.OffLineChargeBean;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月22日 下午3:30:58
 * @since 
 */
public class EnterpriseTradeServiceTest extends BaseTest{

	@Autowired
	private EnterpriseTradeServiceProxy enterpriseTradeServiceProxy;
	
	
	@Test
	@Ignore
	public void test_createOrder(){
		EnterpriseRealNameBean enterpriseRealNameBean = new EnterpriseRealNameBean();
		enterpriseRealNameBean.setTxnType("04");// 交易类型
		enterpriseRealNameBean.setTxnSubType("00");// 交易子类
		enterpriseRealNameBean.setBizType("000207");// 产品类型
		enterpriseRealNameBean.setChannelType("00");// 渠道类型
		enterpriseRealNameBean.setMemberId("200000000000683");;// 企业会员ID
		enterpriseRealNameBean.setEnterpriseName("测试企业");;// 企业名称
		enterpriseRealNameBean.setLicenceNo("123456789");;// 工商营业执照号
		enterpriseRealNameBean.setCorporation("法人");;// 法人姓名
		enterpriseRealNameBean.setContactsTelNo("18600508561");;// 联系人电话
		enterpriseRealNameBean.setFrontURL("http://www.baidu.com");;// 前台通知地址
		enterpriseRealNameBean.setCoopInsti("300000000000004");;//合作机构

		
		enterpriseRealNameBean.setOrgCode("123456789");;// 组织机构代码
		enterpriseRealNameBean.setTaxNo("123456789");;// 企业税务登记号
		enterpriseRealNameBean.setCorpNo("110105198610079632");;// 法人代表身份证号
		enterpriseRealNameBean.setContact("联系人姓");;// 企业联系人姓名
		enterpriseRealNameBean.setAccNum("111111111111111");;// 银行账号
		enterpriseRealNameBean.setAccName("测试对公账号");;// 银行账户名
		enterpriseRealNameBean.setBankNode("102221000382");;// 银行账户开户网点(开户行号)
		try {
			String tn = enterpriseTradeServiceProxy.createEnterpriseRealNameOrder(enterpriseRealNameBean);
			System.out.println("TN:"+tn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	@Ignore
	public void test_confirm(){
		//160823000400055861
		EnterpriseRealNameConfirmBean bean = new EnterpriseRealNameConfirmBean();
		bean.setMemberId("200000000000683");
		bean.setPayPWD("123456");
		bean.setSmsCode("123456");
		bean.setTn("160823000400055861");
		bean.setTxnamt("1");
		bean.setCoopInsti("300000000000027");
		try {
			enterpriseTradeServiceProxy.realNameConfirm(bean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_offlinecharge(){
		OffLineChargeBean offLineChargeBean = new OffLineChargeBean();
		offLineChargeBean.setMemberId("200000000000683");
		offLineChargeBean.setBackURL("www.baidu.com");
		offLineChargeBean.setBizType("000207");
		offLineChargeBean.setChannelType("00");
		offLineChargeBean.setChargeCode("123455");
		offLineChargeBean.setCoopInsti("300000000000027");
		offLineChargeBean.setOrderId("M"+new Date().getTime());
		offLineChargeBean.setTxnAmt("10000");
		offLineChargeBean.setTxnSubType("00");
		offLineChargeBean.setTxnType("25");
		String tn = enterpriseTradeServiceProxy.offLineCharge(offLineChargeBean);
		System.out.println(tn);
	}
	
}
