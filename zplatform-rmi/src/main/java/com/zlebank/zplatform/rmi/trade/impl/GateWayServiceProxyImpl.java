/* 
 * GateWayServiceImpl.java  
 * 
 * version TODO
 *
 * 2016年8月16日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.trade.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.caucho.hessian.server.HessianServlet;
import com.zlebank.zplatform.rmi.trade.GateWayServiceProxy;
import com.zlebank.zplatform.trade.bean.ResultBean;
import com.zlebank.zplatform.trade.bean.gateway.OrderBean;
import com.zlebank.zplatform.trade.bean.wap.WapCardBean;
import com.zlebank.zplatform.trade.exception.TradeException;
import com.zlebank.zplatform.trade.model.TxnsLogModel;
import com.zlebank.zplatform.trade.model.TxnsOrderinfoModel;
import com.zlebank.zplatform.trade.service.IGateWayService;
import com.zlebank.zplatform.trade.service.ITxnsLogService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月16日 下午4:36:07
 * @since 
 */
@Repository
public class GateWayServiceProxyImpl extends HessianServlet implements GateWayServiceProxy{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3471789345770777318L;
	@Autowired
	private IGateWayService gateWayService;
@Autowired
private ITxnsLogService txnsLogService;
	/**
	 *
	 * @param json
	 * @throws TradeException
	 */
	@Override
	public void sendSMSMessage(String json) throws TradeException {
		// TODO Auto-generated method stub
		gateWayService.sendSMSMessage(json);
	}

	/**
	 *
	 * @param tn
	 * @return
	 */
	@Override
	public TxnsOrderinfoModel getOrderinfoByTN(String tn) {
		// TODO Auto-generated method stub
		return gateWayService.getOrderinfoByTN(tn);
	}

	/**
	 *
	 * @param memberId
	 * @param personMemberId
	 * @param cardBean
	 * @return
	 */
	@Override
	public ResultBean bindingBankCard(String memberId, String personMemberId,
			WapCardBean cardBean) {
		// TODO Auto-generated method stub
		return gateWayService.bindingBankCard(memberId, personMemberId, cardBean);
	}

	/**
	 *
	 * @param memberId
	 * @param beginDate
	 * @param endDate
	 * @param page
	 * @param rows
	 * @return
	 */
	@Override
	public List<Map<String, Object>> queryOrderInfo(String memberId,
			String beginDate, String endDate, int page, int rows) {
		// TODO Auto-generated method stub
		return gateWayService.queryOrderInfo(memberId, beginDate, endDate, page, rows);
	}

	/**
	 *
	 * @param memberId
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	@Override
	public long queryOrderInfoCount(String memberId, String beginDate,
			String endDate) {
		// TODO Auto-generated method stub
		return gateWayService.queryOrderInfoCount(memberId, beginDate, endDate);
	}

	/**
	 *
	 * @param order
	 * @return
	 */
	@Override
	public String dealWithWapOrder(OrderBean order) {
		// TODO Auto-generated method stub
		try {
			return gateWayService.dealWithWapOrder(order);
		} catch (TradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 *
	 * @param json
	 */
	@Override
	public void accountPay(String json) {
		// TODO Auto-generated method stub
		try {
			gateWayService.accountPay(json);
		} catch (TradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *
	 * @param json
	 */
	@Override
	public void submitPay(String json) {
		// TODO Auto-generated method stub
		try {
			gateWayService.submitPay(json);
		} catch (TradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *
	 * @param json
	 * @return
	 */
	@Override
	public String refund(String json) {
		// TODO Auto-generated method stub
		try {
			return gateWayService.refund(json);
		} catch (TradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 *
	 * @param txnseqno
	 * @param merchNo
	 * @param txnAmt
	 * @param busicode
	 * @return
	 */
	@Override
	public Long getRefundFee(String txnseqno, String merchNo, String txnAmt,
			String busicode) {
		// TODO Auto-generated method stub
		return gateWayService.getRefundFee(txnseqno, merchNo, txnAmt, busicode);
	}

	/**
	 *
	 * @param txnseqno
	 * @return
	 */
	@Override
	public ResultBean generateAsyncRespMessage(String txnseqno) {
		// TODO Auto-generated method stub
		return gateWayService.generateAsyncRespMessage(txnseqno);
	}

	/**
	 *
	 * @param json
	 * @return
	 */
	@Override
	public String withdraw(String json) {
		// TODO Auto-generated method stub
		try {
			return gateWayService.withdraw(json);
		} catch (TradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 *
	 * @param orderNo
	 * @param txntime
	 * @param amount
	 * @param merchId
	 * @param memberId
	 * @throws TradeException
	 */
	@Override
	public void verifyRepeatWebOrder(String orderNo, String txntime,
			String amount, String merchId, String memberId)
			throws TradeException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				TxnsOrderinfoModel orderInfo = gateWayService.getOrderinfoByOrderNoAndMerch(
						orderNo, merchId);
				if (orderInfo != null) {
					TxnsLogModel txnsLog = txnsLogService
							.getTxnsLogByTxnseqno(orderInfo.getRelatetradetxn());
					if ("00".equals(orderInfo.getStatus())) {// 交易成功订单不可二次支付
						throw new TradeException("T004");
					}
					if ("02".equals(orderInfo.getStatus())) {
						throw new TradeException("T009");
					}
					if ("04".equals(orderInfo.getStatus())) {
						throw new TradeException("T012");
					}
					if (!amount.equals(orderInfo.getOrderamt().toString())) {
						throw new TradeException("T014");
					}
					if (!txntime.equals(orderInfo.getOrdercommitime())) {// 订单存在，提交日期也一致，二次支付订单,
						throw new TradeException("T013");
					}
					if (!merchId.equals(orderInfo.getFirmemberno())) {
						throw new TradeException("T015");
					}
					if (!"999999999999999".equals(txnsLog.getAccmemberid())) {// 非匿名支付
						if (!txnsLog.getAccmemberid().equals(memberId)) {
							throw new TradeException("T036");
						}
					}

				}

	}

}
