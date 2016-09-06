/* 
 * IMemberBankCardServiceExporter.java  
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
import com.zlebank.zplatform.rmi.interfaces.member.IMemberBankCardService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 下午5:31:23
 * @since 
 */
@Repository("/rmiMemberBankCardService")
public class IMemberBankCardServiceExporter extends HessianServiceExporter{
        @Autowired
        private IMemberBankCardServiceImpl iMemberBankCardServiceImpl;
        @Autowired
        public void setService() {
            super.setServiceInterface(IMemberBankCardService.class);
            super.setService(iMemberBankCardServiceImpl);
        }
}
