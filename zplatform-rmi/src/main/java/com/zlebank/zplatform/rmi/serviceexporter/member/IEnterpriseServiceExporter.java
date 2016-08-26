/* 
 * IEnterpriseServiceExporter.java  
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

import com.zlebank.zplatform.rmi.impl.member.IEnterpriseServiceImpl;
import com.zlebank.zplatform.rmi.interfaces.member.IEnterpriseService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 下午5:26:36
 * @since 
 */
@Repository("/rmiEnterpriseService")
public class IEnterpriseServiceExporter extends HessianServiceExporter {
        @Autowired
        private IEnterpriseServiceImpl iEnterpriseServiceImpl;
        @Autowired
        public void setService() {
            super.setServiceInterface(IEnterpriseService.class);
            super.setService(iEnterpriseServiceImpl);
        }
}
