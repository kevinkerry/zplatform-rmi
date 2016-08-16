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
package com.zlebank.zplatform.rmi.ServiceExporter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.caucho.HessianServiceExporter;

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
public class IMemberAccountServiceExporter extends HessianServiceExporter {
       @Autowired
       private IMemberAccountServiceImpl iMemberAccountServiceImpl;
       @Autowired
       public void setSer() {
           super.setServiceInterface(IMemberAccountService.class);
           super.setService(iMemberAccountServiceImpl);
       };
       
}
