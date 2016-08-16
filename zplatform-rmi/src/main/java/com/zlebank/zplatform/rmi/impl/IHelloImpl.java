/* 
 * IHelloImpl.java  
 * 
 * version TODO
 *
 * 2016年1月12日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.member.service.MemberService;
import com.zlebank.zplatform.rmi.IHello;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年1月12日 下午3:55:36
 * @since 
 */
public class IHelloImpl extends HessianServlet implements IHello {

    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1048296475017153927L;
	
	
	@Autowired
	private MemberService memberService;
	//private ICMBCTransferService cmbcTransferService;
	@Override
    public String sayHello() {
        // TODO Auto-generated method stub
        return ""; //cmbcTransferService.singleTransfer(null).getResultObj().toString();
    }

}
