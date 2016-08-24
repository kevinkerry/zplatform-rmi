/* 
 * ProdCaseServiceProxy.java  
 * 
 * version TODO
 *
 * 2016年8月24日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.trade.bean.ResultBean;
import com.zlebank.zplatform.trade.bean.gateway.OrderBean;
import com.zlebank.zplatform.trade.bean.wap.WapOrderBean;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月24日 下午12:05:58
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/prodCaseServiceProxy")
public interface ProdCaseServiceProxy {
	/**
	 * 校验业务类型
	 * @param order
	 * @return
	 */
    public ResultBean verifyBusiness(OrderBean order);
    
    public void verifyWapBusiness(WapOrderBean order) throws Exception;
}
