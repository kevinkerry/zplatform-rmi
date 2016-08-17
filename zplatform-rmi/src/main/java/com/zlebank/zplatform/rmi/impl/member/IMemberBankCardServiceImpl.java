/* 
 * IMemberBankCardServiceImpl.java  
 * 
 * version TODO
 *
 * 2016年8月17日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.impl.member;

import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.commons.bean.PagedResult;
import com.zlebank.zplatform.member.bean.QuickpayCustBean;
import com.zlebank.zplatform.member.bean.RealNameBean;
import com.zlebank.zplatform.member.exception.DataCheckFailedException;
import com.zlebank.zplatform.member.exception.UnbindBankFailedException;
import com.zlebank.zplatform.rmi.interfaces.member.IMemberBankCardService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 上午10:59:52
 * @since 
 */
@Repository
public class IMemberBankCardServiceImpl extends HessianServlet implements IMemberBankCardService {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -6996841253734585413L;

    /**
     *
     * @param bean
     */
    @Override
    public void saveRealNameInfo(RealNameBean bean) {
        // TODO Auto-generated method stub

    }

    /**
     *
     * @param bean
     * @return
     */
    @Override
    public RealNameBean queryRealNameInfo(RealNameBean bean) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param bean
     * @return
     */
    @Override
    public long saveQuickPayCust(QuickpayCustBean bean) {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     *
     * @param bean
     * @throws DataCheckFailedException
     * @throws UnbindBankFailedException
     */
    @Override
    public void unbindQuickPayCust(QuickpayCustBean bean)
            throws DataCheckFailedException, UnbindBankFailedException {
        // TODO Auto-generated method stub

    }

    /**
     *
     * @param memberId
     * @param cardType
     * @param devId
     * @param offset
     * @param pageSize
     * @return
     */
    @Override
    public PagedResult<QuickpayCustBean> queryMemberBankCard(String memberId,
            String cardType,
            String devId,
            int offset,
            int pageSize) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param bean
     * @return
     */
    @Override
    public long saveQuickPayCustExt(QuickpayCustBean bean) {
        // TODO Auto-generated method stub
        return 0;
    }

}
