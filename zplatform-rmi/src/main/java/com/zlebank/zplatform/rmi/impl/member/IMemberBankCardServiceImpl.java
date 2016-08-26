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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.commons.bean.PagedResult;
import com.zlebank.zplatform.member.bean.QuickpayCustBean;
import com.zlebank.zplatform.member.bean.RealNameBean;
import com.zlebank.zplatform.member.exception.DataCheckFailedException;
import com.zlebank.zplatform.member.exception.UnbindBankFailedException;
import com.zlebank.zplatform.member.service.MemberBankCardService;
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
    @Autowired
    private MemberBankCardService memberBankCardService;
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
        memberBankCardService.saveRealNameInfo(bean);
        
    }

    /**
     *
     * @param bean
     * @return
     */
    @Override
    public RealNameBean queryRealNameInfo(RealNameBean bean) {
        return memberBankCardService.queryRealNameInfo(bean);
    }

    /**
     *
     * @param bean
     * @return
     */
    @Override
    public long saveQuickPayCust(QuickpayCustBean bean) {
        return memberBankCardService.saveQuickPayCust(bean);
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
        memberBankCardService.unbindQuickPayCust(bean);
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
        return memberBankCardService.queryMemberBankCard(memberId, cardType, devId, offset, pageSize);
    }

    /**
     *
     * @param bean
     * @return
     */
    @Override
    public long saveQuickPayCustExt(QuickpayCustBean bean) {
        return memberBankCardService.saveQuickPayCustExt(bean);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public QuickpayCustBean getMemberBankCardById(Long id) {
        return memberBankCardService.getMemberBankCardById(id);
    }

    /**
     *
     * @param cardNo
     * @param accName
     * @param phone
     * @param cerId
     * @param memberId
     * @return
     */
    @Override
    public QuickpayCustBean getCardList(String cardNo,
            String accName,
            String phone,
            String cerId,
            String memberId) {
        return memberBankCardService.getCardList(cardNo, accName, phone, cerId, memberId);
    }

}
