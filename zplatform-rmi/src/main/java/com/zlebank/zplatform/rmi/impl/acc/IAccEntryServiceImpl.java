/* 
 * AccEntryServiceImpl.java  
 * 
 * version v1.0
 *
 * 2015年8月31日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.impl.acc;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.acc.bean.TradeInfo;
import com.zlebank.zplatform.acc.exception.AbstractBusiAcctException;
import com.zlebank.zplatform.acc.exception.AccBussinessException;
import com.zlebank.zplatform.acc.exception.IllegalEntryRequestException;
import com.zlebank.zplatform.acc.service.AccEntryService;
import com.zlebank.zplatform.acc.service.entry.EntryEvent;
import com.zlebank.zplatform.rmi.interfaces.acc.IAccEntryService;

/**
 * 
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 下午3:41:09
 * @since
 */
@Service
public class IAccEntryServiceImpl extends HessianServlet implements IAccEntryService {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 8993157683392730563L;

    @Autowired
    private AccEntryService accEntryService;
    /**
     *
     * @param fetchSize
     * @return
     * @throws AccBussinessException
     */
    @Override
    public List<Long> accountBatchPre(int fetchSize)
            throws AccBussinessException {
        return accEntryService.accountBatchPre(fetchSize);
    }

    /**
     *
     * @param accEntry
     * @throws AccBussinessException
     */
    @Override
    public void accountBatch(List<Long> accEntry) throws AccBussinessException {
        accEntryService.accountBatch(accEntry);
    }

    /**
     *
     * @param tradeInfo
     * @param entryEvent
     * @throws AccBussinessException
     * @throws AbstractBusiAcctException
     * @throws NumberFormatException
     * @throws IllegalEntryRequestException
     */
    @Override
    public void accEntryProcess(TradeInfo tradeInfo, EntryEvent entryEvent)
            throws AccBussinessException, AbstractBusiAcctException,
            NumberFormatException, IllegalEntryRequestException {
        accEntryService.accEntryProcess(tradeInfo, entryEvent);
    }
    
}
