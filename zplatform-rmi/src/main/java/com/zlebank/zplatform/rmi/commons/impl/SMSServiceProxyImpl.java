/* 
 * SMSServiceProxyImpl.java  
 * 
 * version TODO
 *
 * 2016年8月26日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.commons.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.commons.SMSServiceProxy;
import com.zlebank.zplatform.sms.pojo.enums.ModuleTypeEnum;
import com.zlebank.zplatform.sms.service.ISMSService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月26日 上午9:05:49
 * @since 
 */
@Repository
public class SMSServiceProxyImpl extends HessianServlet implements SMSServiceProxy{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3829623218594692385L;
	
	@Autowired
	private ISMSService smsService;

	/**
	 *
	 * @param moduleType
	 * @param phoneNo
	 * @param orderNo
	 * @param args
	 * @return
	 */
	@Override
	public int sendSMS(String moduleType, String phoneNo,
			String orderNo, String... args) {
		// TODO Auto-generated method stub
		return smsService.sendSMS(ModuleTypeEnum.fromValue(moduleType), phoneNo, orderNo, args);
	}

	/**
	 *
	 * @param phoneNo
	 * @param orderNo
	 * @param code
	 * @return
	 */
	@Override
	public int verifyCode(String phoneNo, String orderNo, String code) {
		// TODO Auto-generated method stub
		return smsService.verifyCode(phoneNo, orderNo, code);
	}

	/**
	 *
	 * @param moduleType
	 * @param phoneNo
	 * @param code
	 * @return
	 */
	@Override
	public int verifyCodeByModuleType(String moduleType, String phoneNo, String code) {
		// TODO Auto-generated method stub
		return smsService.verifyCode(ModuleTypeEnum.fromValue(moduleType), phoneNo, code);
	}

	/**
	 *
	 * @param moduleType
	 * @param phoneNo
	 * @param orderNo
	 * @return
	 */
	@Override
	public String generateCode(String moduleType, String phoneNo,
			String orderNo) {
		// TODO Auto-generated method stub
		return smsService.generateCode(ModuleTypeEnum.fromValue(moduleType), phoneNo, orderNo);
	}

}
