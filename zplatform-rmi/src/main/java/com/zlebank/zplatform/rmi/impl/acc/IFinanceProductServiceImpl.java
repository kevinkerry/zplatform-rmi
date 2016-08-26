/* 
 * FinanceProductServiceImpl.java  
 * 
 * version TODO
 *
 * 2016年7月20日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.impl.acc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlebank.zplatform.acc.bean.FinanceProductBean;
import com.zlebank.zplatform.acc.service.FinanceProductService;
import com.zlebank.zplatform.rmi.interfaces.acc.IFinanceProductService;

/**
 * 金融产品
 *
 * @author houyong
 * @version
 * @date 2016年7月20日 下午4:24:21
 * @since 
 */
@Service
public class IFinanceProductServiceImpl implements IFinanceProductService {
    @Autowired
    private FinanceProductService financeProductService;
    /**
     *
     * @param bean
     * @throws Exception 
     */
    public void openProduct(FinanceProductBean bean,long userId) throws Exception {
            financeProductService.openProduct(bean, userId);
    }
}
