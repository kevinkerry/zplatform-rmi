/* 
 * ICoopInstiServiceExporter.java  
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

import com.zlebank.zplatform.rmi.impl.member.ICoopInstiServiceImpl;
import com.zlebank.zplatform.rmi.interfaces.member.ICoopInstiService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 下午5:26:10
 * @since 
 */
@Repository("/rmiCoopInstiService")
public class ICoopInstiServiceExporter extends HessianServiceExporter {
    @Autowired
    private ICoopInstiServiceImpl iCoopInstiServiceImpl;
    @Autowired
    public void setService() {
        super.setServiceInterface(ICoopInstiService.class);
        super.setService(iCoopInstiServiceImpl);
    }
}
