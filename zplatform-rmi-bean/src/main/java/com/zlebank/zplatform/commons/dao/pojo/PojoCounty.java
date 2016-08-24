/* 
 * PojoCounty.java  
 * 
 * version TODO
 *
 * 2015年9月13日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.dao.pojo;

import java.io.Serializable;

/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年9月13日 下午4:42:30
 * @since 
 */

public class PojoCounty implements Serializable{
    
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 476359294258130927L;

	private Long countyId;
    
    private String countyName;
    
    private String countyZCode;
    
    private String countPCode;
    
    private Long  Cid;
    
    private String countCode;
    
    private String xzCode;
    
    private String cxzCode;
    
    private String pxzCode;

	/**
	 * @return the countyId
	 */
	public Long getCountyId() {
		return countyId;
	}

	/**
	 * @param countyId the countyId to set
	 */
	public void setCountyId(Long countyId) {
		this.countyId = countyId;
	}

	/**
	 * @return the countyName
	 */
	public String getCountyName() {
		return countyName;
	}

	/**
	 * @param countyName the countyName to set
	 */
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	/**
	 * @return the countyZCode
	 */
	public String getCountyZCode() {
		return countyZCode;
	}

	/**
	 * @param countyZCode the countyZCode to set
	 */
	public void setCountyZCode(String countyZCode) {
		this.countyZCode = countyZCode;
	}

	/**
	 * @return the countPCode
	 */
	public String getCountPCode() {
		return countPCode;
	}

	/**
	 * @param countPCode the countPCode to set
	 */
	public void setCountPCode(String countPCode) {
		this.countPCode = countPCode;
	}

	/**
	 * @return the cid
	 */
	public Long getCid() {
		return Cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(Long cid) {
		Cid = cid;
	}

	/**
	 * @return the countCode
	 */
	public String getCountCode() {
		return countCode;
	}

	/**
	 * @param countCode the countCode to set
	 */
	public void setCountCode(String countCode) {
		this.countCode = countCode;
	}

	/**
	 * @return the xzCode
	 */
	public String getXzCode() {
		return xzCode;
	}

	/**
	 * @param xzCode the xzCode to set
	 */
	public void setXzCode(String xzCode) {
		this.xzCode = xzCode;
	}

	/**
	 * @return the cxzCode
	 */
	public String getCxzCode() {
		return cxzCode;
	}

	/**
	 * @param cxzCode the cxzCode to set
	 */
	public void setCxzCode(String cxzCode) {
		this.cxzCode = cxzCode;
	}

	/**
	 * @return the pxzCode
	 */
	public String getPxzCode() {
		return pxzCode;
	}

	/**
	 * @param pxzCode the pxzCode to set
	 */
	public void setPxzCode(String pxzCode) {
		this.pxzCode = pxzCode;
	}
    

   
    

}
