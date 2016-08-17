/* 
 * IMerchMKServiceExporter.java  
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
import com.zlebank.zplatform.rmi.impl.member.IMerchMKServiceImpl;
import com.zlebank.zplatform.rmi.interfaces.member.IMemberBankCardService;
import com.zlebank.zplatform.rmi.interfaces.member.IMerchMKService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 下午5:34:14
 * @since 
 */
@Repository("/rmiMerchMKService")
public class IMerchMKServiceExporter extends HessianServiceExporter {
        @Autowired
        private IMerchMKServiceImpl iMerchMKServiceImpl;
        @Autowired
        public void setService() {
            super.setServiceInterface(IMerchMKService.class);
            super.setService(iMerchMKServiceImpl);
        }
}
