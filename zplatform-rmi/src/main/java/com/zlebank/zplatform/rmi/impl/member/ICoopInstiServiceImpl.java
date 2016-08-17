/* 
 * ICoopInstiServiceImpl.java  
 * 
 * version TODO
 *
 * 2016年8月17日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.impl.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.member.bean.CoopInsti;
import com.zlebank.zplatform.member.bean.CoopInstiMK;
import com.zlebank.zplatform.member.bean.enums.TerminalAccessType;
import com.zlebank.zplatform.member.exception.AbstractCoopInstiException;
import com.zlebank.zplatform.member.service.CoopInstiService;
import com.zlebank.zplatform.rmi.interfaces.member.ICoopInstiService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 上午10:58:08
 * @since 
 */
@Repository
public class ICoopInstiServiceImpl extends HessianServlet implements ICoopInstiService {
    @Autowired
    private CoopInstiService coopInstiService;
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1010989632167981171L;

    /**
     *
     * @param instiCode
     * @param terminalAccessType
     * @return
     */
    @Override
    public CoopInstiMK getCoopInstiMK(String instiCode,
            TerminalAccessType terminalAccessType) {
        return coopInstiService.getCoopInstiMK(instiCode, terminalAccessType);
    }

    /**
     *
     * @param instiName
     * @param userId
     * @return
     * @throws AbstractCoopInstiException
     */
    @Override
    public String createCoopInsti(String instiName, long userId)
            throws AbstractCoopInstiException {
        return coopInstiService.createCoopInsti(instiName, userId);
    }

    /**
     *
     * @return
     */
    @Override
    public List<CoopInsti> getAllCoopInsti() {
        return coopInstiService.getAllCoopInsti();
    }

    /**
     *
     * @param instiCode
     * @return
     */
    @Override
    public CoopInsti getInstiByInstiCode(String instiCode) {
        return coopInstiService.getInstiByInstiCode(instiCode);
    }

    /**
     *
     * @param instiId
     * @return
     */
    @Override
    public CoopInsti getInstiByInstiID(long instiId) {
        return coopInstiService.getInstiByInstiID(instiId);
    }

}
