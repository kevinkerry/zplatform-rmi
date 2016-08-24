/* 
 * IFinanceProductAccountServiceExporter.java  
 * 
 * version TODO
 *
 * 2016年8月24日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.serviceexporter.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.stereotype.Repository;

import com.zlebank.zplatform.rmi.impl.member.IFinanceProductAccountServiceImpl;
import com.zlebank.zplatform.rmi.interfaces.member.IFinanceProductAccountService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月24日 下午4:35:34
 * @since 
 */
@Repository("/rmiFinanceProductAccountService")
public class IFinanceProductAccountServiceExporter extends HessianServiceExporter{
    @Autowired
    private IFinanceProductAccountServiceImpl iFinanceProductAccountServiceImpl;
    @Autowired
    public void setService() {
        super.setServiceInterface(IFinanceProductAccountService.class);
        super.setService(iFinanceProductAccountServiceImpl);
    }
}
