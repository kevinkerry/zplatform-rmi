/* 
 * Member.java  
 * 
 * version TODO
 *
 * 2016年1月19日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.business.individual.bean;

import java.util.List;

import com.zlebank.zplatform.member.bean.Person;

/**
 * a bean represent a individual member
 *
 * @author guojia
 * @version
 * @date 2016年1月19日 上午10:02:01
 * @since
 */
public class Individual extends Person{
	 
	private List<BankCardInfo> bankCardList;
	private List<Order> orders; 

	public List<BankCardInfo> getBankCardList() {
		return bankCardList;
	}

	public void setBankCardList(List<BankCardInfo> bankCardList) {
		this.bankCardList = bankCardList;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
