/* 
 * MemberPerfectionInfoService.java  
 * 
 * version TODO
 *
 * 2016年1月15日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.member;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;

/**
 * 会员完善信息服务
 *
 * @author Luxiaoshuai
 * @version
 * @date 2016年1月15日 下午2:52:16
 * @since 
 */
@Hessian(context = Context.API_V2, uri = "/remoting/rmiMemberPerfectionInfoService")
public interface IMemberPerfectionInfoService {
    
}
