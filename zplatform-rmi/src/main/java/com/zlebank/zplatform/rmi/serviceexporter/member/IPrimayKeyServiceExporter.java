/* 
 * IPrimayKeyServiceExporter.java  
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

import com.zlebank.zplatform.rmi.impl.member.IPersonServiceImpl;
import com.zlebank.zplatform.rmi.impl.member.IPrimayKeyServiceImpl;
import com.zlebank.zplatform.rmi.interfaces.member.IPersonService;
import com.zlebank.zplatform.rmi.interfaces.member.IPrimayKeyService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 下午5:35:10
 * @since 
 */
@Repository("/rmiPrimayKeyService")
public class IPrimayKeyServiceExporter extends HessianServiceExporter {
        @Autowired
        private IPrimayKeyServiceImpl iPrimayKeyServiceImpl;
        @Autowired
        public void setService() {
            super.setServiceInterface(IPrimayKeyService.class);
            super.setService(iPrimayKeyServiceImpl);
        }
}
