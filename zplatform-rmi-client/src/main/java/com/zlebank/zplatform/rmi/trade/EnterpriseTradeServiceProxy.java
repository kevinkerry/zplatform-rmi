/* 
 * EnterpriseTradeServiceProxy.java  
 * 
 * version TODO
 *
 * 2016年8月22日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.member.bean.EnterpriseRealNameBean;
import com.zlebank.zplatform.member.bean.EnterpriseRealNameConfirmBean;
import com.zlebank.zplatform.trade.bean.OffLineChargeBean;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月22日 下午2:57:00
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/enterpriseTradeServiceProxy")
public interface EnterpriseTradeServiceProxy {

	/**
	 * 创建企业实名认证订单
	 * @param enterpriseRealNameBean
	 * @return
	 */
	public String createEnterpriseRealNameOrder(EnterpriseRealNameBean enterpriseRealNameBean) throws Exception;
	
	/**
	 * 企业实名认证确认
	 * @param enterpriseRealNameConfirmBean
	 * @throws InvalidMemberDataException
	 */
	public void realNameConfirm(EnterpriseRealNameConfirmBean enterpriseRealNameConfirmBean) throws Exception;
	
	/**
	 * 线下充值订单
	 * @param offLineChargeBean
	 * @return
	 */
	public String offLineCharge(OffLineChargeBean offLineChargeBean);
}
