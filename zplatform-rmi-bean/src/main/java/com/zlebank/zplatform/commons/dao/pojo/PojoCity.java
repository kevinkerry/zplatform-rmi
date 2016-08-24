/* 
 * PojoCity.java  
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
 * @date 2015年9月13日 下午4:41:27
 * @since 
 */

public class PojoCity implements Serializable{
   
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1708345878848972858L;

	private long cityId;
    
    private String cityName;
    
    private String cityZcode;
    
    private String cityPcode;
    
    private long pId;
    
    private String cityCode;
    
    private String xzCode;

	/**
	 * @return the cityId
	 */
	public long getCityId() {
		return cityId;
	}

	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the cityZcode
	 */
	public String getCityZcode() {
		return cityZcode;
	}

	/**
	 * @param cityZcode the cityZcode to set
	 */
	public void setCityZcode(String cityZcode) {
		this.cityZcode = cityZcode;
	}

	/**
	 * @return the cityPcode
	 */
	public String getCityPcode() {
		return cityPcode;
	}

	/**
	 * @param cityPcode the cityPcode to set
	 */
	public void setCityPcode(String cityPcode) {
		this.cityPcode = cityPcode;
	}

	/**
	 * @return the pId
	 */
	public long getpId() {
		return pId;
	}

	/**
	 * @param pId the pId to set
	 */
	public void setpId(long pId) {
		this.pId = pId;
	}

	/**
	 * @return the cityCode
	 */
	public String getCityCode() {
		return cityCode;
	}

	/**
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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
    
}
