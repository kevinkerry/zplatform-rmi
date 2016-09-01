/* 
 * BankInfoServiceProxy.java  
 * 
 * version TODO
 *
 * 2016年8月31日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.commons;



import java.util.List;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.rmi.commons.bean.BankInfoBean;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月31日 上午11:58:42
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/bankInfoServiceProxy")
public interface BankInfoServiceProxy {

	/**
	 * 根据银行名称返回头十条银行信息
	 * @param bankName
	 * @return
	 */
	public List<BankInfoBean> queryBankInfo(String bankName);
}
