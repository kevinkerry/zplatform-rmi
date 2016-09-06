/* 
 * IAccEntryServiceExporter.java  
 * 
 * version TODO
 *
 * 2016年8月17日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.serviceexporter.acc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.stereotype.Repository;

import com.zlebank.zplatform.rmi.impl.acc.IAccEntryServiceImpl;
import com.zlebank.zplatform.rmi.interfaces.acc.IAccEntryService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 下午5:12:20
 * @since 
 */
@Repository("/rmiAccEntryService")
public class IAccEntryServiceExporter extends HessianServiceExporter{
    @Autowired
    private IAccEntryServiceImpl iAccEntryServiceImpl;
    @Autowired
    public void setService() {
        super.setServiceInterface(IAccEntryService.class);
        super.setService(iAccEntryServiceImpl);
    }
}
