/* 
 * AccEntryService.java  
 * 
 * version v1.0
 *
 * 2015年8月31日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.interfaces.acc;
import java.util.List;

import com.zlebank.zplatform.acc.bean.TradeInfo;
import com.zlebank.zplatform.acc.exception.AbstractBusiAcctException;
import com.zlebank.zplatform.acc.exception.AccBussinessException;
import com.zlebank.zplatform.acc.exception.IllegalEntryRequestException;
import com.zlebank.zplatform.acc.service.entry.EntryEvent;

/**
 * Class Description
 *
 * @author Luxiaoshuai
 * @version
 * @date 2015年8月31日 上午11:34:19
 * @since
 */
public interface IAccEntryService {
     
    /**
     * 批处理记账【预处理】<br/>
     * 从分录流水中取出需待记账的记录【02-待记账】<br/>
     * 注意：如果预计处理成功而执行失败的话，数据库（T_ACC_ENTRY）的的数据将会被锁定，此时需要人工去解锁。<br/>
     * 
     * @param fetchSize
     *            每次批处理从数据库里取的条数
     * @return
     */
    public List<Long> accountBatchPre(int fetchSize)
            throws Exception;
    /**
     * 批处理记账【执行】
     * 
     * @param accountAmount
     *            【预处理】中返回的值
     * @return
     */
    public void accountBatch(List<Long> accEntry) throws Exception;

    /**
     * 分录处理
     * 
     * @param tradeInfo
     * @throws AccBussinessException
     * @throws NumberFormatException
     * @throws AbstractBusiAcctException
     * @throws BussinessException
     */
    public void accEntryProcess(TradeInfo tradeInfo, EntryEvent entryEvent)
            throws Exception;
}
