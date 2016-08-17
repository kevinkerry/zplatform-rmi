/* 
 * IMemberServiceExporter.java  
 * 
 * version TODO
 *
 * 2016年8月17日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.serviceexporter.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.stereotype.Repository;

import com.zlebank.zplatform.rmi.impl.member.IMemberBankCardServiceImpl;
import com.zlebank.zplatform.rmi.impl.member.IMemberServiceImpl;
import com.zlebank.zplatform.rmi.interfaces.member.IMemberBankCardService;
import com.zlebank.zplatform.rmi.interfaces.member.IMemberService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 下午5:33:49
 * @since 
 */
@Repository("/rmiMemberService")
public class IMemberServiceExporter extends HessianServiceExporter {
        @Autowired
        private IMemberServiceImpl iMemberServiceImpl;
        @Autowired
        public void setService() {
            super.setServiceInterface(IMemberService.class);
            super.setService(iMemberServiceImpl);
        }
}
