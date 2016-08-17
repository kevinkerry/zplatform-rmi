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

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zlebank.zplatform.acc.service.AccEntryService;
import com.zlebank.zplatform.member.service.CoopInstiService;
import com.zlebank.zplatform.member.service.MemberAccountService;
import com.zlebank.zplatform.member.service.MemberBankCardService;
import com.zlebank.zplatform.member.service.MemberOperationService;
import com.zlebank.zplatform.member.service.MemberService;
import com.zlebank.zplatform.member.service.MerchMKService;

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
	    private MemberOperationService memberOperationServiceImpl;
	    @Autowired
	    private MemberService memberServiceImpl;
	    @Autowired
	    private MemberAccountService memberAccountServiceImpl;
		@Autowired
		private MemberBankCardService memberBankCardService;
	    @Autowired
	    private CoopInstiService coopInstiService;
	    @Autowired
		private MemberOperationService memberOperationService;
		@Autowired
		private MemberService memberService;
		@Autowired
		private MerchMKService merchMKService;
	    @Autowired
	    private AccEntryService accEntryService;
	   
		
	    
	    
}
