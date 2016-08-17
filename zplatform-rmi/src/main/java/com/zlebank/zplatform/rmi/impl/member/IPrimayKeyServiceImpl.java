/* 
 * IPrimayKeyServiceImpl.java  
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
import com.zlebank.zplatform.member.exception.MemberBussinessException;
import com.zlebank.zplatform.member.exception.PrimaykeyGeneratedException;
import com.zlebank.zplatform.rmi.interfaces.member.IPrimayKeyService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 上午11:06:27
 * @since 
 */
@Repository
public class IPrimayKeyServiceImpl extends HessianServlet implements IPrimayKeyService {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -7071698251859580380L;


    /**
     *
     * @param paraType
     * @param seqName
     * @return
     * @throws PrimaykeyGeneratedException
     */
    @Override
    public String getNexId(String paraType, String seqName)
            throws PrimaykeyGeneratedException {
        // TODO Auto-generated method stub
        return null;
    }


    /**
     *
     * @param paraType
     * @return
     * @throws MemberBussinessException
     * @deprecated
     */
    @Override
    public String getNexId(String paraType) throws MemberBussinessException {
        // TODO Auto-generated method stub
        return null;
    }

}
