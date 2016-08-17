/* 
 * ITestCaseServiceExporter.java  
 * 
 * version TODO
 *
 * 2016年8月17日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.ServiceExporter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.stereotype.Repository;

import com.zlebank.zplatform.rmi.ITestCase;
import com.zlebank.zplatform.rmi.impl.TestCaseImpl;

/**
 * 测试使用
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 上午9:58:35
 * @since 
 */
@Repository("/testcase")
public class ITestCaseServiceExporter extends HessianServiceExporter {
        @Autowired
        private TestCaseImpl testcase;
        @Autowired
        public void setService() {
            super.setServiceInterface(ITestCase.class);
            super.setService(testcase);
        }
}
