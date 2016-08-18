/* 
 * TxnsNotifyTaskService.java  
 * 
 * version TODO
 *
 * 2016年8月18日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.trade.model.TxnsNotifyTaskModel;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月18日 上午10:55:11
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/txnsNotifyTaskService")
public interface TxnsNotifyTaskServiceProxy {
	/**
	 * 保存异步通知信息
	 * @param task
	 */
    public void saveTask(TxnsNotifyTaskModel task);
}
