/* 
 * InsteadPayService.java  
 * 
 * version v1.0
 *
 * 2015年11月25日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade.insteadpay;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.trade.insteadPay.message.RealnameAuthFile;
import com.zlebank.zplatform.trade.insteadPay.message.RealnameAuthQuery_Request;
import com.zlebank.zplatform.trade.insteadPay.message.RealnameAuthQuery_Response;
import com.zlebank.zplatform.trade.insteadPay.message.RealnameAuth_Request;

/**
 * 实名认证业务
 *
 * @author Luxiaoshuai
 * @version
 * @date 2015年11月25日 上午10:47:55
 * @since 
 */
@Hessian(context=Context.API_V2,uri="/remoting/realNameAuthServiceProxy")
public interface RealNameAuthServiceProxy {

    /**
     *  实名认证处理
     * @param request 
     * @return 错误代码，如果没有错误则返回NULL
     * @throws MessageDecryptFailException 
     * @throws RealNameAuthFailException 
     * @throws BalanceNotEnoughException 
     */
    public boolean realNameAuth(RealnameAuth_Request request, RealnameAuthFile realNameAuth, Long orderId) throws Exception;

    /**
     * 实名认证查询处理
     * @param requestBean
     * @param responseBean 
     */
    public void realNameAuthQuery(RealnameAuthQuery_Request requestBean, RealnameAuthQuery_Response responseBean);
    
    /**
     * 保存实名认证订单
     * @param request
     * @param realNameAuth
     * @return
     * @throws DuplicateOrderIdException 
     */
    public Long saveRealNameAuthOrder(RealnameAuth_Request request, RealnameAuthFile realNameAuth) throws Exception;
}
