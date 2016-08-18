/* 
 * IMerchServiceExporter.java  
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

import com.zlebank.zplatform.rmi.impl.member.IMerchMKServiceImpl;
import com.zlebank.zplatform.rmi.impl.member.IMerchServiceImpl;
import com.zlebank.zplatform.rmi.interfaces.member.IMerchMKService;
import com.zlebank.zplatform.rmi.interfaces.member.IMerchService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 下午5:34:29
 * @since 
 */
@Repository("/rmiMerchService")
public class IMerchServiceExporter extends HessianServiceExporter{
        @Autowired
        private IMerchServiceImpl iMerchServiceImpl;
        @Autowired
        public void setService() {
            super.setServiceInterface(IMerchService.class);
            super.setService(iMerchServiceImpl);
        }
}
