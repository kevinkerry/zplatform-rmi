package com.zlebank.zplatform.business.individual.bean;

import java.io.Serializable;

import com.zlebank.zplatform.commons.bean.Bean;

/**
 * bank card bean
 * @author yangying
 *
 */
public class BankCardInfo implements Bean,Serializable{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2244325493404492900L;
	/**绑卡标示**/
	private String bindcardid;
    private Bank bank;
	private IndividualRealInfo bankCardInfo;
	private String status;

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public String getBindcardid() {
		return bindcardid;
	}

	public void setBindcardid(String bindcardid) {
		this.bindcardid = bindcardid;
	}

	public IndividualRealInfo getBankCardInfo() {
		return bankCardInfo;
	}

	public void setBankCardInfo(IndividualRealInfo bankCardInfo) {
		this.bankCardInfo = bankCardInfo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
