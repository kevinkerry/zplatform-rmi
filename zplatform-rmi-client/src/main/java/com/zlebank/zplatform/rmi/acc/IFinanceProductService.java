/* 
 * FinanceProductService.java  
 * 
 * version TODO
 *
 * 2016年7月20日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.acc;

import com.zlebank.zplatform.acc.bean.FinanceProductBean;
import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;

/**
 * 
 *
 * @author houyong
 * @version
 * @date 2016年7月20日 下午4:15:29
 * @since
 */
@Hessian(context = Context.API_V2, uri = "/remoting/rmiFinanceProductService")
public interface IFinanceProductService {
	/**
	 * 新增金融产品并开户
	 * 
	 * @param bean
	 * @throws Exception
	 */
	void openProduct(FinanceProductBean bean, long userId) throws Exception;
}
