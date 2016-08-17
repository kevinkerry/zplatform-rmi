/* 
 * ICoopInstiMKServiceImpl.java  
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
import com.zlebank.zplatform.member.bean.enums.TerminalAccessType;
import com.zlebank.zplatform.member.service.CoopInstiMKService;
import com.zlebank.zplatform.rmi.interfaces.member.ICoopInstiMKService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 上午10:54:56
 * @since 
 */
@Repository
public class ICoopInstiMKServiceImpl extends HessianServlet implements ICoopInstiMKService{
    @Autowired
    private CoopInstiMKService coopInstiMkService;
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 308240766422927842L;

    /**
     *
     * @param instiCode
     * @param signedData
     * @param originData
     * @param terminalAccessType
     * @return
     */
    @Override
    public boolean verify(String instiCode,
            String signedData,
            String originData,
            TerminalAccessType terminalAccessType) {
        return coopInstiMkService.verify(instiCode, signedData, originData, terminalAccessType);
    }

    /**
     *
     * @param instiCode
     * @param originData
     * @param terminalAccessType
     * @return
     */
    @Override
    public String sign(String instiCode,
            String originData,
            TerminalAccessType terminalAccessType) {
        return coopInstiMkService.sign(instiCode, originData, terminalAccessType);
    }

    /**
     *
     * @param instiCode
     * @param originData
     * @param terminalAccessType
     * @return
     */
    @Override
    public String decryptByPrivateKey(String instiCode,
            String originData,
            TerminalAccessType terminalAccessType) {
        return coopInstiMkService.decryptByPrivateKey(instiCode, originData, terminalAccessType);
    }

    /**
     *
     * @param instiCode
     * @param originData
     * @param terminalAccessType
     * @return
     */
    @Override
    public String encryptByPublicKey(String instiCode,
            String originData,
            TerminalAccessType terminalAccessType) {
        return coopInstiMkService.encryptByPublicKey(instiCode, originData, terminalAccessType);
    }

}
