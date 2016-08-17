/* 
 * RmiMemberAccountService.java  
 * 
 * version TODO
 *
 * 2016年8月16日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.serviceexporter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.stereotype.Repository;

import com.zlebank.zplatform.rmi.IMemberAccountService;
import com.zlebank.zplatform.rmi.impl.IMemberAccountServiceImpl;

/**
 * 会员账户
 *
 * @author houyong
 * @version
 * @date 2016年8月16日 下午4:29:03
 * @since 
 */
@Repository("/rmiMemberAccountService")
public class IMemberAccountServiceExporter extends HessianServiceExporter {
       @Autowired
       private IMemberAccountServiceImpl iMemberAccountServiceImpl;
       @Autowired
       public void setService() {
           super.setServiceInterface(IMemberAccountService.class);
           super.setService(iMemberAccountServiceImpl);
       }
       
}
