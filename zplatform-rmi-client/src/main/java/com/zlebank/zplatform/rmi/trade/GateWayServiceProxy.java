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

import java.util.List;
import java.util.Map;

import com.zlebank.zplatform.hessian.core.Context;
import com.zlebank.zplatform.hessian.core.Hessian;
import com.zlebank.zplatform.trade.bean.ResultBean;
import com.zlebank.zplatform.trade.bean.gateway.OrderBean;
import com.zlebank.zplatform.trade.bean.wap.WapCardBean;
import com.zlebank.zplatform.trade.model.TxnsOrderinfoModel;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月16日 下午4:33:29
 * @since 
 */
@Hessian(context = Context.API_V2, uri = "/remoting/gateWayServiceProxy")
public interface GateWayServiceProxy {

	 /**
     * 发送短信验证码
     * @param json
     * @throws TradeException
     */
    public void sendSMSMessage(String json);
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
    
    /**
     * 
     * @param memberId 会员号
     * @param beginDate 开始时间
     * @param endDate 结束时间
     * @param page 页数
     * @param rows 行数
     * @return
     */
    public List<Map<String, Object>> queryOrderInfo(String memberId,String beginDate,String endDate,int page,int rows);
    
    /**
     * 
     * @param memberId
     * @param beginDate
     * @param endDate
     * @return
     */
    public long queryOrderInfoCount(String memberId,String beginDate,String endDate);
    
    public String dealWithWapOrder(OrderBean order);
    /**
     * 账户支付
     * @param json
     * @throws TradeException
     */
    public void accountPay(String json);
    /**
     * 确认支付
     * @param json
     * @throws TradeException
     */
    public void submitPay(String json) ;
    
    /**
     * 退款
     * @param json
     * @return
     * @throws TradeException
     */
    public String refund(String json);
    
    /**
     * 获取退款手续费
     * @param txnseqno
     * @param merchNo
     * @param txnAmt
     * @param busicode
     * @return
     */
    public Long getRefundFee(String txnseqno,String merchNo,String txnAmt,String busicode);
    
    /**
     * 生成异步通知报文
     * @param txnseqno
     * @return
     */
    public ResultBean generateAsyncRespMessage(String txnseqno);
}
