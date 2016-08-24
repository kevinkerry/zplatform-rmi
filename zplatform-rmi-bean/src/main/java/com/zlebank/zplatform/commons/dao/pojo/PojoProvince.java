
/* 
 * PojoProvince.java  
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
 * @date 2015年9月13日 下午4:40:59
 * @since 
 */
/* 
 * PojoProvince.java  
 * 
 * version TODO
 *
 * 2015年9月13日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年9月13日 下午4:40:59
 * @since 
 */

public class PojoProvince implements Serializable{
    
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4534621356920666598L;

	private long provinceId;
    
    private String provinceName;
    
    private String provinceCode;
    
    private String xzCode;

	/**
	 * @return the provinceId
	 */
	public long getProvinceId() {
		return provinceId;
	}

	/**
	 * @param provinceId the provinceId to set
	 */
	public void setProvinceId(long provinceId) {
		this.provinceId = provinceId;
	}

	/**
	 * @return the provinceName
	 */
	public String getProvinceName() {
		return provinceName;
	}

	/**
	 * @param provinceName the provinceName to set
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	/**
	 * @return the provinceCode
	 */
	public String getProvinceCode() {
		return provinceCode;
	}

	/**
	 * @param provinceCode the provinceCode to set
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
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
