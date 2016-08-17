/* 
 * MenchService.java  
 * 
 * version TODO
 *
 * 2015年9月11日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.member;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.member.bean.EnterpriseBean;

/**
 * 
 * 企业服务类
 *
 * @author Luxiaoshuai
 * @version
 * @date 2016年3月21日 下午2:06:21
 * @since
 */
@Hessian(context = Context.API_V2, uri = "/remoting/rmiEnterpriseService")
public interface IEnterpriseService { 

    
    /**
     * 根据memberId得到企业信息
     * @param memberId
     * @return
     */
   public  EnterpriseBean  getEnterpriseByMemberId(String memberId); 
}
