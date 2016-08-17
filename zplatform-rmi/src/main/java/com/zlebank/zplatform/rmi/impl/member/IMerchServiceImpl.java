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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.acc.exception.AbstractBusiAcctException;
import com.zlebank.zplatform.member.bean.MerchantBean;
import com.zlebank.zplatform.member.exception.MemberBussinessException;
import com.zlebank.zplatform.member.pojo.PojoMerchDeta;
import com.zlebank.zplatform.member.service.MerchService;
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
     * serialVersionUID
     */
    private static final long serialVersionUID = 3083698000521228387L;
    
    @Autowired 
    private MerchService merchService;
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
        return merchService.createMinorMerchant(mb, userId);
    }

    /**
     *
     * @param memberId
     * @return
     */
    @Override
    public PojoMerchDeta getParentMerch(String memberId) {
       return merchService.getParentMerch(memberId);
    }

    /**
     *
     * @param taxno
     * @return
     */
    @Override
    public PojoMerchDeta getMerchByTaxno(String taxno) {
        return merchService.getMerchByTaxno(taxno);
    }

    /**
     *
     * @param licenceNo
     * @return
     */
    @Override
    public PojoMerchDeta getMerchByLicenceNo(String licenceNo) {
        return merchService.getMerchByLicenceNo(licenceNo);
    }

    /**
     *
     * @param email
     * @return
     */
    @Override
    public PojoMerchDeta getMerchByEmail(String email) {
        return merchService.getMerchByEmail(email);
    }

    /**
     *
     * @param phone
     * @return
     */
    @Override
    public PojoMerchDeta getMerchByPhone(String phone) {
        return merchService.getMerchByPhone(phone);
    }

    /**
     *
     * @param memberId
     * @return
     */
    @Override
    public PojoMerchDeta getMerchBymemberId(String memberId) {
        return merchService.getMerchBymemberId(memberId);
    }

    /**
     *
     * @param pojoMerchDeta
     */
    @Override
    public void update(PojoMerchDeta pojoMerchDeta) {
        merchService.update(pojoMerchDeta);
    }

}
