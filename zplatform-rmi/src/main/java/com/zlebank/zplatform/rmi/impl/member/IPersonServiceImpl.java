/* 
 * IPersonServiceImpl.java  
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
import com.zlebank.zplatform.member.bean.Person;
import com.zlebank.zplatform.member.bean.PersonManager;
import com.zlebank.zplatform.member.exception.MemberBussinessException;
import com.zlebank.zplatform.member.pojo.PojoPersonDeta;
import com.zlebank.zplatform.rmi.interfaces.member.IPersonService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 上午11:06:07
 * @since 
 */
@Repository
public class IPersonServiceImpl extends HessianServlet implements IPersonService {

    /**
     *
     * @param pers
     * @param userId
     * @return
     * @throws AbstractBusiAcctException
     * @throws MemberBussinessException
     */
    @Override
    public String save(Person pers, long userId)
            throws AbstractBusiAcctException, MemberBussinessException {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param phone
     * @return
     */
    @Override
    public PojoPersonDeta getPersonByPhone(String phone) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param email
     * @return
     */
    @Override
    public PojoPersonDeta getPersonByEmail(String email) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param memberId
     * @return
     */
    @Override
    public PersonManager getPersonBeanByMemberId(String memberId) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param memberId
     * @return
     */
    @Override
    public PojoPersonDeta getPersonByMemberId(String memberId) {
        // TODO Auto-generated method stub
        return null;
    }

}
