/* 
 * IGateWayService.java  
 * 
 * version TODO
 *
 * 2016年8月16日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.trade.bean.ResultBean;
import com.zlebank.zplatform.trade.bean.wap.WapCardBean;
import com.zlebank.zplatform.trade.exception.TradeException;
import com.zlebank.zplatform.trade.model.TxnsOrderinfoModel;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月16日 下午4:33:29
 * @since 
 */
@Hessian(context = Context.API_V2, uri = "/remoting/gateway")
public interface IGateWayService {

	 /**
     * 发送短信验证码
     * @param json
     * @throws TradeException
     */
    public void sendSMSMessage(String json) throws TradeException;
    /**
     * 通过TN获取订单新
     * @param tn
     * @return
     */
    public TxnsOrderinfoModel getOrderinfoByTN(String tn) ;
    
    /**
     * 绑定银行卡
     * @param memberId 合作机构号/商户号
     * @param personMemberId 个人会员号
     * @param cardBean
     * @return
     */
    public ResultBean bindingBankCard(String memberId,String personMemberId,WapCardBean cardBean);
}
