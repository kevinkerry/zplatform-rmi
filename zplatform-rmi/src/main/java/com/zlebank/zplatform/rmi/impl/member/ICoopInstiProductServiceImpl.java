/* 
 * ICoopInstiProductServiceImpl.java  
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
import com.zlebank.zplatform.commons.dao.pojo.ProductModel;
import com.zlebank.zplatform.member.exception.AbstractCoopInstiException;
import com.zlebank.zplatform.member.service.CoopInstiProductService;
import com.zlebank.zplatform.rmi.interfaces.member.ICoopInstiProductService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 上午10:56:54
 * @since 
 */
@Repository
public class ICoopInstiProductServiceImpl extends HessianServlet implements ICoopInstiProductService {
    @Autowired
    private CoopInstiProductService coopInstiProductService;
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 579608963475157313L;

    /**
     *
     * @param coopInstiId
     * @return
     * @throws AbstractCoopInstiException
     */
    @Override
    public List<ProductModel> getProducts(long coopInstiId)
            throws AbstractCoopInstiException {
        return coopInstiProductService.getProducts(coopInstiId);
    }
    
    public String getDefaultVerInfo(String instiCode, String busicode,int verType){
    	return coopInstiProductService.getDefaultVerInfo(instiCode, busicode, verType);
    }
}
