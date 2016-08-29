/* 
 * SMSServiceProxy.java  
 * 
 * version TODO
 *
 * 2016年8月26日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.commons;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.sms.pojo.enums.ModuleTypeEnum;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月26日 上午9:04:55
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/smsServiceProxy")
public interface SMSServiceProxy {

	/**
	 * 发送短信
	 * @param moduleType 短信模板类型
	 * @param phoneNo 手机号
	 * @param orderNo 订单号
	 * @param args 短信参数
	 * @return
	 */
	public int sendSMS(String moduleType,String phoneNo,String orderNo,String... args);
	
	/**
	 * 校验短信验证码
	 * @param phoneNo 手机号
	 * @param orderNo 订单号
	 * @param code 验证码
	 * @return 1:验证成功 2：验证码错误，3验证码失效
	 */
	public int verifyCode(String phoneNo,String orderNo,String code);
	
	/**
	 * 校验短信验证码
	 * @param moduleType 短信模板类型
	 * @param phoneNo 手机号
	 * @param code 验证码
	 * @return
	 */
	public int verifyCodeByModuleType(String moduleType,String phoneNo,String code);
	
	/**
	 * 生成短信验证码（不发送短信，短信由第三方发送）
	 * @param moduleType
	 * @param phoneNo
	 * @param orderNo
	 * @return
	 */
	public String generateCode(String moduleType,String phoneNo,String orderNo);
}
