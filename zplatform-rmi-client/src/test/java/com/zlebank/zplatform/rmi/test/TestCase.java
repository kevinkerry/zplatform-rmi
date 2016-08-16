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
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
**
* Class Description
*
* @author guojia
* @version
* @date 2016年1月12日 下午3:56:56
* @since 
*/
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("/remoting-client.xml")  
public class TestCase{
	@Autowired
	private IHello hello;
	
	@Test
	public void test(){
		System.out.println(hello.sayHello());
	}
}