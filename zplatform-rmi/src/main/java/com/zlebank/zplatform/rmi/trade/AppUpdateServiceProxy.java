/* 
 * AppUpdateService.java  
 * 
 * version TODO
 *
 * 2016年6月24日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.trade.model.PojoAppUpdate;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年6月24日 下午4:25:58
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/appUpdateServiceProxy")
public interface AppUpdateServiceProxy {

	public PojoAppUpdate getAppUpdate(String appVersion,String appChannelId);
}
