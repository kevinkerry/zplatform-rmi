/* 
 * IPersonServiceExporter.java  
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
import com.zlebank.zplatform.rmi.interfaces.member.IPersonService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 下午5:34:50
 * @since 
 */
@Repository("/rmiPersonService")
public class IPersonServiceExporter extends HessianServiceExporter {
        @Autowired
        private IPersonServiceImpl iPersonServiceImpl;
        @Autowired
        public void setService() {
            super.setServiceInterface(IPersonService.class);
            super.setService(iPersonServiceImpl);
        }
}
