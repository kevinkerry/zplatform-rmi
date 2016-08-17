/* 
 * IEnterpriseServiceImpl.java  
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
import com.zlebank.zplatform.member.bean.EnterpriseBean;
import com.zlebank.zplatform.rmi.interfaces.member.IEnterpriseService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 上午10:58:53
 * @since 
 */
@Repository
public class IEnterpriseServiceImpl extends HessianServlet implements IEnterpriseService {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 5666416215942453723L;

    /**
     *
     * @param memberId
     * @return
     */
    @Override
    public EnterpriseBean getEnterpriseByMemberId(String memberId) {
        // TODO Auto-generated method stub
        return null;
    }

}
