/* 
 * IMerchMKServiceImpl.java  
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
import com.zlebank.zplatform.member.bean.MerchMK;
import com.zlebank.zplatform.rmi.interfaces.member.IMerchMKService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 上午11:04:18
 * @since 
 */
@Repository
public class IMerchMKServiceImpl extends HessianServlet implements IMerchMKService {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 2889889180090677202L;

    /**
     *
     * @param memberId
     * @return
     */
    @Override
    public MerchMK get(String memberId) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param memberId
     * @param signedData
     * @param originData
     * @return
     */
    @Override
    public boolean verify(String memberId, String signedData, String originData) {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     *
     * @param memberId
     * @param originData
     * @return
     */
    @Override
    public String sign(String memberId, String originData) {
        // TODO Auto-generated method stub
        return null;
    }

}
