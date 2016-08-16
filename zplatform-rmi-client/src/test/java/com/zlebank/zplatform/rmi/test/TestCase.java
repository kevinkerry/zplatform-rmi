/* 
 * TestCase.java  
 * 
 * version TODO
 *
 * 2016年8月16日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
**
* Class Description
*
* @author guojia
* @version
* @date 2016年1月12日 下午3:56:56
* @since 
*/
public class TestCase extends BaseTest{
	@Autowired
	private IHello hello;
	
	@Autowired
	private ITestCase testCase;
	
	@Test
	public void test(){
		System.out.println(testCase.test("1"));
	}
}