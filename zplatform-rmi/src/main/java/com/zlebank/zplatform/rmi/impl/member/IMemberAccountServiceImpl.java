/* 
 * MemberAccountServiceImpl.java  
 * 
 * version TODO
 *
 * 2016年1月15日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.impl.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.acc.bean.enums.Usage;
import com.zlebank.zplatform.commons.bean.PagedResult;
import com.zlebank.zplatform.member.bean.MemberAccountBean;
import com.zlebank.zplatform.member.bean.MemberBalanceDetailBean;
import com.zlebank.zplatform.member.bean.MemberBean;
import com.zlebank.zplatform.member.bean.enums.MemberType;
import com.zlebank.zplatform.member.exception.DataCheckFailedException;
import com.zlebank.zplatform.member.exception.GetAccountFailedException;
import com.zlebank.zplatform.member.service.MemberAccountService;
import com.zlebank.zplatform.rmi.member.IMemberAccountService;

/**
 * 
 * 会员账户相关服务
 *
 * @author houyong
 * @version
 * @date 2016年8月16日 下午6:16:38
 * @since
 */
@Repository
public class IMemberAccountServiceImpl extends HessianServlet implements IMemberAccountService {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -5529999359012903477L;
    @Autowired 
    private MemberAccountService memberAccountService;
    /**
     *
     * @param memberType
     * @param member
     * @param usage
     * @return
     * @throws DataCheckFailedException
     * @throws GetAccountFailedException
     */
    @Override
    public MemberAccountBean queryBalance(MemberType memberType,
            MemberBean member,
            Usage usage) throws DataCheckFailedException,
            GetAccountFailedException {
        return memberAccountService.queryBalance(memberType, member, usage);
    }

    /**
     *
     * @param memberType
     * @param member
     * @param page
     * @param pageSize
     * @return
     * @throws GetAccountFailedException
     */
    @Override
    public PagedResult<MemberBalanceDetailBean> queryBalanceDetail(MemberType memberType,
            MemberBean member,
            int page,
            int pageSize) throws GetAccountFailedException {
        return memberAccountService.queryBalanceDetail(memberType, member, page, pageSize);
    }
    
}
