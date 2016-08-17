/* 
 * PojoCardBind.java  
 * 
 * version TODO
 *
 * 2016年6月22日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.trade.model;

import java.io.Serializable;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年6月22日 下午4:11:24
 * @since 
 */

public class PojoCardBind implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -9056064113431145143L;
	private Long tid;
    private Long cardId;
    private String chnlCode;
    private String bindId;
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
	 * @return the cardId
	 */
	public Long getCardId() {
		return cardId;
	}
	/**
	 * @param cardId the cardId to set
	 */
	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}
	/**
	 * @return the chnlCode
	 */
	public String getChnlCode() {
		return chnlCode;
	}
	/**
	 * @param chnlCode the chnlCode to set
	 */
	public void setChnlCode(String chnlCode) {
		this.chnlCode = chnlCode;
	}
	/**
	 * @return the bindId
	 */
	public String getBindId() {
		return bindId;
	}
	/**
	 * @param bindId the bindId to set
	 */
	public void setBindId(String bindId) {
		this.bindId = bindId;
	}
    
}
