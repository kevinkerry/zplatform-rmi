/* 
 * IMemberServiceImpl.java  
 * 
 * version TODO
 *
 * 2016年8月17日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.impl.member;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.acc.bean.AccEntry;
import com.zlebank.zplatform.acc.bean.BusiAcct;
import com.zlebank.zplatform.acc.bean.BusiAcctQuery;
import com.zlebank.zplatform.acc.bean.QueryAccount;
import com.zlebank.zplatform.acc.exception.AbstractBusiAcctException;
import com.zlebank.zplatform.commons.bean.PagedResult;
import com.zlebank.zplatform.member.bean.MemberQuery;
import com.zlebank.zplatform.member.bean.enums.MemberType;
import com.zlebank.zplatform.member.exception.MemberBussinessException;
import com.zlebank.zplatform.member.pojo.PojoMember;
import com.zlebank.zplatform.rmi.interfaces.member.IMemberService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 上午11:03:52
 * @since 
 */
@Repository
public class IMemberServiceImpl extends HessianServlet implements IMemberService {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1628340300167363304L;

    /**
     *
     * @param busiAcctCode
     * @return
     */
    @Override
    public BusiAcctQuery getBusiQueryBybCode(String busiAcctCode) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param memberId
     * @return
     */
    @Override
    public List<BusiAcctQuery> getAllBusiByMId(String memberId) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param page
     * @param pageSize
     * @param mQuery
     * @return
     * @throws MemberBussinessException
     */
    @Override
    public PagedResult<AccEntry> getAccEntryByQuery(int page,
            int pageSize,
            MemberQuery mQuery) throws MemberBussinessException {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param name
     * @param memberId
     * @param userId
     * @return
     * @throws AbstractBusiAcctException
     * @throws MemberBussinessException
     */
    @Override
    public List<BusiAcct> openBusiAcct(String name, String memberId, long userId)
            throws AbstractBusiAcctException, MemberBussinessException {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param memberId
     * @param type
     * @return
     */
    @Override
    public PojoMember getMbmberByMemberId(String memberId, MemberType type) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param email
     * @return
     */
    @Override
    public PojoMember getMemberByEmail(String email) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param phone
     * @return
     */
    @Override
    public PojoMember getMemberByphone(String phone) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param busiCode
     * @return
     */
    @Override
    public String getMemberIdByBusiCode(String busiCode) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param page
     * @param pageSize
     * @param mQuery
     * @return
     */
    @Override
    public PagedResult<AccEntry> getAccEntryByQueryN(int page,
            int pageSize,
            MemberQuery mQuery) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param qa
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PagedResult<BusiAcctQuery> getBusiAccount(QueryAccount qa,
            Integer page,
            Integer pageSize) {
        // TODO Auto-generated method stub
        return null;
    }

}
