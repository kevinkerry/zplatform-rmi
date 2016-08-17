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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.acc.exception.AbstractBusiAcctException;
import com.zlebank.zplatform.member.bean.Person;
import com.zlebank.zplatform.member.bean.PersonManager;
import com.zlebank.zplatform.member.exception.MemberBussinessException;
import com.zlebank.zplatform.member.pojo.PojoPersonDeta;
import com.zlebank.zplatform.member.service.PersonService;
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
     * serialVersionUID
     */
    private static final long serialVersionUID = -6095229655103155643L;
    
    @Autowired
    private PersonService personService;
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
        return personService.save(pers, userId);
    }

    /**
     *
     * @param phone
     * @return
     */
    @Override
    public PojoPersonDeta getPersonByPhone(String phone) {
       return personService.getPersonByPhone(phone);
    }

    /**
     *
     * @param email
     * @return
     */
    @Override
    public PojoPersonDeta getPersonByEmail(String email) {
        return personService.getPersonByEmail(email);
    }

    /**
     *
     * @param memberId
     * @return
     */
    @Override
    public PersonManager getPersonBeanByMemberId(String memberId) {
        return personService.getPersonBeanByMemberId(memberId);
    }

    /**
     *
     * @param memberId
     * @return
     */
    @Override
    public PojoPersonDeta getPersonByMemberId(String memberId) {
        return personService.getPersonByMemberId(memberId);
    }

}
