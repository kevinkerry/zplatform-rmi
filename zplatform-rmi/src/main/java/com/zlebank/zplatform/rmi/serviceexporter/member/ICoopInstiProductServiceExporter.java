/* 
 * ICoopInstiProductServiceExporter.java  
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

import com.zlebank.zplatform.rmi.impl.member.ICoopInstiMKServiceImpl;
import com.zlebank.zplatform.rmi.impl.member.ICoopInstiProductServiceImpl;
import com.zlebank.zplatform.rmi.interfaces.member.ICoopInstiMKService;
import com.zlebank.zplatform.rmi.interfaces.member.ICoopInstiProductService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 下午5:25:45
 * @since 
 */
@Repository("/rmiCoopInstiProductService")
public class ICoopInstiProductServiceExporter extends HessianServiceExporter {
        @Autowired
        private ICoopInstiProductServiceImpl iCoopInstiProductServiceImpl;
        @Autowired
        public void setService() {
            super.setServiceInterface(ICoopInstiProductService.class);
            super.setService(iCoopInstiProductServiceImpl);
        }
}
