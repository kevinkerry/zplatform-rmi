/* 
 * ITestCase.java  
 * 
 * version TODO
 *
 * 2016年8月16日 
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
 * @date 2016年8月16日 上午11:32:42
 * @since 
 */
@Hessian(context = Context.API_V2, uri = "/remoting/testcase")
public interface ITestCase {

	public String test(String para);
}
