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

import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.member.bean.CoopInsti;
import com.zlebank.zplatform.member.bean.CoopInstiMK;
import com.zlebank.zplatform.member.bean.enums.TerminalAccessType;
import com.zlebank.zplatform.member.exception.AbstractCoopInstiException;
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
        // TODO Auto-generated method stub
        return null;
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
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public List<CoopInsti> getAllCoopInsti() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param instiCode
     * @return
     */
    @Override
    public CoopInsti getInstiByInstiCode(String instiCode) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param instiId
     * @return
     */
    @Override
    public CoopInsti getInstiByInstiID(long instiId) {
        // TODO Auto-generated method stub
        return null;
    }

}
