/* 
 * FinanceProductAccountServiceImpl.java  
 * 
 * version TODO
 *
 * 2016年8月24日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.impl.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zlebank.zplatform.acc.bean.enums.Usage;
import com.zlebank.zplatform.member.bean.FinanceProductAccountBean;
import com.zlebank.zplatform.member.bean.FinanceProductQueryBean;
import com.zlebank.zplatform.member.service.FinanceProductAccountService;
import com.zlebank.zplatform.rmi.interfaces.member.IFinanceProductAccountService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月24日 下午4:03:10
 * @since 
 */
@Repository
public class IFinanceProductAccountServiceImpl implements IFinanceProductAccountService {
    
    @Autowired
    private FinanceProductAccountService financeProductAccountService;
    /**
     *
     * @param bean
     * @param usage
     * @return
     * @throws Exception
     */
    @Override
    public FinanceProductAccountBean queryBalance(FinanceProductQueryBean bean,
            Usage usage) throws Exception {
        return financeProductAccountService.queryBalance(bean, usage);
    }
    
}
