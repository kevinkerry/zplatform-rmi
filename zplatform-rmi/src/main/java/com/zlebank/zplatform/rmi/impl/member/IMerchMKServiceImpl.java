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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.member.bean.MerchMK;
import com.zlebank.zplatform.member.service.MerchMKService;
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
    @Autowired
    private MerchMKService merchMkService;
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
        return merchMkService.get(memberId);
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
        return merchMkService.verify(memberId, signedData, originData);
    }

    /**
     *
     * @param memberId
     * @param originData
     * @return
     */
    @Override
    public String sign(String memberId, String originData) {
        return merchMkService.sign(memberId, originData);
    }

    /**
     *
     * @param merchMK
     */
    @Override
    public void updateMerchMK(MerchMK merchMK) {
        merchMkService.updateMerchMK(merchMK);
    }

}
