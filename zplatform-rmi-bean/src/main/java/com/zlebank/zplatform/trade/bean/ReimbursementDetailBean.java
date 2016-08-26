/* 
 * ReimbursementDetailBean.java  
 * 
 * version TODO
 *
 * 2016年8月26日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.trade.bean;

import java.io.Serializable;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月26日 下午12:08:24
 * @since
 */
public class ReimbursementDetailBean implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -942904129154285120L;
	private String oderId; // 订单号
	private String investors; // 投资人
	private String txnAmt; // 本金
	private String interest; // 利息
	/**
	 * @return the oderId
	 */
	public String getOderId() {
		return oderId;
	}
	/**
	 * @param oderId the oderId to set
	 */
	public void setOderId(String oderId) {
		this.oderId = oderId;
	}
	/**
	 * @return the investors
	 */
	public String getInvestors() {
		return investors;
	}
	/**
	 * @param investors the investors to set
	 */
	public void setInvestors(String investors) {
		this.investors = investors;
	}
	/**
	 * @return the txnAmt
	 */
	public String getTxnAmt() {
		return txnAmt;
	}
	/**
	 * @param txnAmt the txnAmt to set
	 */
	public void setTxnAmt(String txnAmt) {
		this.txnAmt = txnAmt;
	}
	/**
	 * @return the interest
	 */
	public String getInterest() {
		return interest;
	}
	/**
	 * @param interest the interest to set
	 */
	public void setInterest(String interest) {
		this.interest = interest;
	}
	
	
}
