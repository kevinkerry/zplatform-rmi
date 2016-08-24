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
package com.zlebank.zplatform.rmi.member;

import com.zlebank.zplatform.acc.bean.enums.Usage;
import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.member.bean.FinanceProductAccountBean;
import com.zlebank.zplatform.member.bean.FinanceProductQueryBean;

/**
 * 会员账户相关服务
 *
 * @author Luxiaoshuai
 * @version 
 * @date 2016年1月15日 下午2:51:54
 * @since 
 */
@Hessian(context = Context.API_V2, uri = "/remoting/rmiFinanceProductAccountService")
public interface IFinanceProductAccountService {
    /**
     * 查询余额
     * @param memberType
     * @param member
     * @return
     * @throws DataCheckFailedException 
     * @throws GetAccountFailedException 
     */
    public FinanceProductAccountBean queryBalance (FinanceProductQueryBean bean, Usage usage) throws Exception ;
    /**
     * 查询收支明细
     * @param memberType
     * @param member
     * @param page
     * @param pageSize
     * @return
     * @throws GetAccountFailedException 
     */
    //public PagedResult<MemberBalanceDetailBean> queryBalanceDetail (MemberType memberType, MemberBean member, int page, int pageSize) throws GetAccountFailedException ;
}
