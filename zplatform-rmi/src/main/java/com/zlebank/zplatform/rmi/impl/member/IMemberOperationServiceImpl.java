/* 
 * IMemberOperationServiceImpl.java  
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
import com.zlebank.zplatform.member.bean.MemberBean;
import com.zlebank.zplatform.member.bean.enums.MemberType;
import com.zlebank.zplatform.member.exception.CreateBusiAcctFailedException;
import com.zlebank.zplatform.member.exception.CreateMemberFailedException;
import com.zlebank.zplatform.member.exception.DataCheckFailedException;
import com.zlebank.zplatform.member.exception.InvalidMemberDataException;
import com.zlebank.zplatform.member.exception.LoginFailedException;
import com.zlebank.zplatform.rmi.interfaces.member.IMemberOperationService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 上午11:02:23
 * @since 
 */
@Repository
public class IMemberOperationServiceImpl extends HessianServlet implements IMemberOperationService {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -8247501970618413623L;

    /**
     *
     * @param memberType
     * @param member
     * @return
     * @throws InvalidMemberDataException
     * @throws CreateMemberFailedException
     * @throws CreateBusiAcctFailedException
     */
    @Override
    public String registMember(MemberType memberType, MemberBean member)
            throws InvalidMemberDataException, CreateMemberFailedException,
            CreateBusiAcctFailedException {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param memberType
     * @param member
     * @return
     * @throws DataCheckFailedException
     * @throws LoginFailedException
     */
    @Override
    public String login(MemberType memberType, MemberBean member)
            throws DataCheckFailedException, LoginFailedException {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param memberType
     * @param member
     * @return
     * @throws DataCheckFailedException
     */
    @Override
    public boolean verifyPayPwd(MemberType memberType, MemberBean member)
            throws DataCheckFailedException {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     *
     * @param memberType
     * @param member
     * @param newPwd
     * @param isCheckOldPassword
     * @return
     * @throws DataCheckFailedException
     */
    @Override
    public boolean resetLoginPwd(MemberType memberType,
            MemberBean member,
            String newPwd,
            boolean isCheckOldPassword) throws DataCheckFailedException {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     *
     * @param memberType
     * @param member
     * @param newPayPwd
     * @param isCheckOldPassword
     * @return
     * @throws DataCheckFailedException
     */
    @Override
    public boolean resetPayPwd(MemberType memberType,
            MemberBean member,
            String newPayPwd,
            boolean isCheckOldPassword) throws DataCheckFailedException {
        // TODO Auto-generated method stub
        return false;
    }

}
