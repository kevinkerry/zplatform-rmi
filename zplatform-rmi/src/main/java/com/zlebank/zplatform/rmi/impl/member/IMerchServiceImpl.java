/* 
 * IMerchServiceImpl.java  
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
import com.zlebank.zplatform.acc.exception.AbstractBusiAcctException;
import com.zlebank.zplatform.member.bean.MerchantBean;
import com.zlebank.zplatform.member.exception.MemberBussinessException;
import com.zlebank.zplatform.member.pojo.PojoMerchDeta;
import com.zlebank.zplatform.rmi.interfaces.member.IMerchService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 上午11:05:40
 * @since 
 */
@Repository
public class IMerchServiceImpl extends HessianServlet implements IMerchService {

    /**
     *
     * @param mb
     * @param userId
     * @return
     * @throws MemberBussinessException
     * @throws AbstractBusiAcctException
     */
    @Override
    public String createMinorMerchant(MerchantBean mb, Long userId)
            throws MemberBussinessException, AbstractBusiAcctException {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param memberId
     * @return
     */
    @Override
    public PojoMerchDeta getParentMerch(String memberId) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param taxno
     * @return
     */
    @Override
    public PojoMerchDeta getMerchByTaxno(String taxno) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param licenceNo
     * @return
     */
    @Override
    public PojoMerchDeta getMerchByLicenceNo(String licenceNo) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param email
     * @return
     */
    @Override
    public PojoMerchDeta getMerchByEmail(String email) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param phone
     * @return
     */
    @Override
    public PojoMerchDeta getMerchByPhone(String phone) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param memberId
     * @return
     */
    @Override
    public PojoMerchDeta getMerchBymemberId(String memberId) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param pojoMerchDeta
     */
    @Override
    public void update(PojoMerchDeta pojoMerchDeta) {
        // TODO Auto-generated method stub

    }

}
