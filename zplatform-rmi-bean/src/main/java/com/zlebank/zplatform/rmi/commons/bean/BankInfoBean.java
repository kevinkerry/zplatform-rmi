/* 
 * BankInfoBean.java  
 * 
 * version TODO
 *
 * 2016年8月31日 
 * 
 * Copyright (c) 2016;zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.rmi.commons.bean;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月31日 下午12:02:14
 * @since
 */
public class BankInfoBean implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6534565863382050577L;
	@JSONField(name="BANK_NODE")
	private String bankNode;
	@JSONField(name="BANK_CODE")
	private String bankCode;
	@JSONField(name="BANK_CITY")
	private String bankCity;
	@JSONField(name="BANK_NAME")
	private String bankName;
	@JSONField(name="BANK_SNAME")
	private String bankSname;
	@JSONField(name="BANK_ADDRESS")
	private String bankAddress;
	@JSONField(name="MAIN_BANK_SCODE")
	private String mainBankScode;
	@JSONField(name="MAIN_BANK_SNAME")
	private String mainBankSname;
	@JSONField(name="BANK_LEVEL")
	private String bankLevel;
	@JSONField(name="PARENT_NODE")
	private String parentNode;
	/**
	 * @return the bankNode
	 */
	public String getBankNode() {
		return bankNode;
	}
	/**
	 * @param bankNode the bankNode to set
	 */
	public void setBankNode(String bankNode) {
		this.bankNode = bankNode;
	}
	/**
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}
	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	/**
	 * @return the bankCity
	 */
	public String getBankCity() {
		return bankCity;
	}
	/**
	 * @param bankCity the bankCity to set
	 */
	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the bankSname
	 */
	public String getBankSname() {
		return bankSname;
	}
	/**
	 * @param bankSname the bankSname to set
	 */
	public void setBankSname(String bankSname) {
		this.bankSname = bankSname;
	}
	/**
	 * @return the bankAddress
	 */
	public String getBankAddress() {
		return bankAddress;
	}
	/**
	 * @param bankAddress the bankAddress to set
	 */
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	/**
	 * @return the mainBankScode
	 */
	public String getMainBankScode() {
		return mainBankScode;
	}
	/**
	 * @param mainBankScode the mainBankScode to set
	 */
	public void setMainBankScode(String mainBankScode) {
		this.mainBankScode = mainBankScode;
	}
	/**
	 * @return the mainBankSname
	 */
	public String getMainBankSname() {
		return mainBankSname;
	}
	/**
	 * @param mainBankSname the mainBankSname to set
	 */
	public void setMainBankSname(String mainBankSname) {
		this.mainBankSname = mainBankSname;
	}
	/**
	 * @return the bankLevel
	 */
	public String getBankLevel() {
		return bankLevel;
	}
	/**
	 * @param bankLevel the bankLevel to set
	 */
	public void setBankLevel(String bankLevel) {
		this.bankLevel = bankLevel;
	}
	/**
	 * @return the parentNode
	 */
	public String getParentNode() {
		return parentNode;
	}
	/**
	 * @param parentNode the parentNode to set
	 */
	public void setParentNode(String parentNode) {
		this.parentNode = parentNode;
	}
	
	
	

}
