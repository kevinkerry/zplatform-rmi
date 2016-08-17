/* 
 * PojoMerchInstpayConf.java  
 * 
 * version TODO
 *
 * 2016年4月11日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.trade.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 商户代付配置表
 *
 * @author Luxiaoshuai
 * @version
 * @date 2016年4月11日 下午4:17:52
 * @since 
 */

public class PojoMerchInstpayConf implements Serializable{
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5361248812868982448L;
	/**标识**/
    private Long tid;
    /**会员Id**/
    private String memberId;
    /**是否检查实名认证 (0:不检查  1:检查)**/
    private String isCheckRealname;
    /**是否检查白名单 (0:不检查  1:检查)**/
    private String isCheckWhiteList;
    /**创建人**/
    private Long inUser;
    /**创建时间**/
    private Date inTime;
    /**修改人**/
    private Long upUser;
    /**修改时间**/
    private Date upTime;
    /**备注**/
    private String notes;
    /**备注**/
    private String remarks;
	/**
	 * @return the tid
	 */
	public Long getTid() {
		return tid;
	}
	/**
	 * @param tid the tid to set
	 */
	public void setTid(Long tid) {
		this.tid = tid;
	}
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @return the isCheckRealname
	 */
	public String getIsCheckRealname() {
		return isCheckRealname;
	}
	/**
	 * @param isCheckRealname the isCheckRealname to set
	 */
	public void setIsCheckRealname(String isCheckRealname) {
		this.isCheckRealname = isCheckRealname;
	}
	/**
	 * @return the isCheckWhiteList
	 */
	public String getIsCheckWhiteList() {
		return isCheckWhiteList;
	}
	/**
	 * @param isCheckWhiteList the isCheckWhiteList to set
	 */
	public void setIsCheckWhiteList(String isCheckWhiteList) {
		this.isCheckWhiteList = isCheckWhiteList;
	}
	/**
	 * @return the inUser
	 */
	public Long getInUser() {
		return inUser;
	}
	/**
	 * @param inUser the inUser to set
	 */
	public void setInUser(Long inUser) {
		this.inUser = inUser;
	}
	/**
	 * @return the inTime
	 */
	public Date getInTime() {
		return inTime;
	}
	/**
	 * @param inTime the inTime to set
	 */
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	/**
	 * @return the upUser
	 */
	public Long getUpUser() {
		return upUser;
	}
	/**
	 * @param upUser the upUser to set
	 */
	public void setUpUser(Long upUser) {
		this.upUser = upUser;
	}
	/**
	 * @return the upTime
	 */
	public Date getUpTime() {
		return upTime;
	}
	/**
	 * @param upTime the upTime to set
	 */
	public void setUpTime(Date upTime) {
		this.upTime = upTime;
	}
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
    
    
}
