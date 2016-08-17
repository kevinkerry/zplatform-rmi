/* 
 * MemberAccountService.java  
 * 
 * version TODO
 *
 * 2016年1月15日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.interfaces.member;

import com.zlebank.zplatform.acc.bean.enums.Usage;
import com.zlebank.zplatform.commons.bean.PagedResult;
import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.member.bean.MemberAccountBean;
import com.zlebank.zplatform.member.bean.MemberBalanceDetailBean;
import com.zlebank.zplatform.member.bean.MemberBean;
import com.zlebank.zplatform.member.bean.enums.MemberType;
import com.zlebank.zplatform.member.exception.DataCheckFailedException;
import com.zlebank.zplatform.member.exception.GetAccountFailedException;

/**
 * 会员账户相关服务
 *
 * @author houyong
 * @version
 * @date 2016年8月16日 下午6:16:38
 * @since
 */
//@Hessian(context = Context.API_V2, uri = "/remoting/rmiMemberAccountService")
public interface IMemberAccountService {
    /**
     * 查询余额
     * @param memberType
     * @param member
     * @return
     * @throws DataCheckFailedException 
     * @throws GetAccountFailedException 
     */
    public MemberAccountBean queryBalance (MemberType memberType, MemberBean member, Usage usage) throws DataCheckFailedException, GetAccountFailedException ;
    /**
     * 查询收支明细
     * @param memberType
     * @param member
     * @param page
     * @param pageSize
     * @return
     * @throws GetAccountFailedException 
     */
    public PagedResult<MemberBalanceDetailBean> queryBalanceDetail (MemberType memberType, MemberBean member, int page, int pageSize) throws GetAccountFailedException ;
}
