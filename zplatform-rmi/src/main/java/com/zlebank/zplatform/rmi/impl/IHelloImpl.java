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
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.member.dao.MemberDAO;
import com.zlebank.zplatform.member.dao.ParaDicDAO;
import com.zlebank.zplatform.member.pojo.PojoMember;
import com.zlebank.zplatform.member.service.MemberAccountService;
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
	private ParaDicDAO paraDicDAO;
	@Override
    public String sayHello() {
        // TODO Auto-generated method stub
		
		String seqNextval = paraDicDAO.getSeqNextval("seq_checkstandver");
        return seqNextval; //cmbcTransferService.singleTransfer(null).getResultObj().toString();
    }

}
