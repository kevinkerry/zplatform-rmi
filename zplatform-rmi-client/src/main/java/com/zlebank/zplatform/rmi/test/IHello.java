/* 
 * IHello.java  
 * 
 * version TODO
 *
 * 2016年1月12日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.test;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年1月12日 下午3:54:59
 * @since 
 */
@Hessian(context = Context.API_V2, uri = "/remoting")
public interface IHello {

	public String sayHello();
}
