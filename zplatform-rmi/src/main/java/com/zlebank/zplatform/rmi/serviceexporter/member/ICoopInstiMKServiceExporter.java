/* 
 * ICoopInstiMKServiceExporter.java  
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
import com.zlebank.zplatform.rmi.interfaces.member.ICoopInstiMKService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 下午5:25:18
 * @since 
 */
@Repository("/rmiCoopInstiMKService")
public class ICoopInstiMKServiceExporter extends HessianServiceExporter {
       @Autowired
       private ICoopInstiMKServiceImpl iCoopInstiMKServiceImpl;
       @Autowired
       public void setService() {
           super.setServiceInterface(ICoopInstiMKService.class);
           super.setService(iCoopInstiMKServiceImpl);
       }
}
