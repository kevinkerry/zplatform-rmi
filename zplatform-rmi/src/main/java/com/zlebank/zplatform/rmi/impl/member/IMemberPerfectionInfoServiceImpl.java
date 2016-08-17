/* 
 * IMemberPerfectionInfoServiceImpl.java  
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
import com.zlebank.zplatform.rmi.interfaces.member.IMemberPerfectionInfoService;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月17日 上午11:03:23
 * @since 
 */
@Repository
public class IMemberPerfectionInfoServiceImpl extends HessianServlet implements IMemberPerfectionInfoService {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -28790727378266406L;

}
