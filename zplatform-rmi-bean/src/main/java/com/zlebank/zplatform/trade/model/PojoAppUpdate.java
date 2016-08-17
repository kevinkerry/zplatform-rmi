/* 
 * PojoAppUpdate.java  
 * 
 * version TODO
 *
 * 2016年6月24日 
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
 * @date 2016年6月24日 下午4:07:00
 * @since 
 */

public class PojoAppUpdate implements Serializable{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6511221159252877212L;
	private Long id;
	private String appVersion;
	private String appChannelId;
	private String forceUpdate;
	private String dlUrl;
	private String reviewVersion;
	private String reviewUrl;
	private String note;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the appVersion
	 */
	public String getAppVersion() {
		return appVersion;
	}
	/**
	 * @param appVersion the appVersion to set
	 */
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	/**
	 * @return the appChannelId
	 */
	public String getAppChannelId() {
		return appChannelId;
	}
	/**
	 * @param appChannelId the appChannelId to set
	 */
	public void setAppChannelId(String appChannelId) {
		this.appChannelId = appChannelId;
	}
	/**
	 * @return the forceUpdate
	 */
	public String getForceUpdate() {
		return forceUpdate;
	}
	/**
	 * @param forceUpdate the forceUpdate to set
	 */
	public void setForceUpdate(String forceUpdate) {
		this.forceUpdate = forceUpdate;
	}
	/**
	 * @return the dlUrl
	 */
	public String getDlUrl() {
		return dlUrl;
	}
	/**
	 * @param dlUrl the dlUrl to set
	 */
	public void setDlUrl(String dlUrl) {
		this.dlUrl = dlUrl;
	}
	/**
	 * @return the reviewVersion
	 */
	public String getReviewVersion() {
		return reviewVersion;
	}
	/**
	 * @param reviewVersion the reviewVersion to set
	 */
	public void setReviewVersion(String reviewVersion) {
		this.reviewVersion = reviewVersion;
	}
	/**
	 * @return the reviewUrl
	 */
	public String getReviewUrl() {
		return reviewUrl;
	}
	/**
	 * @param reviewUrl the reviewUrl to set
	 */
	public void setReviewUrl(String reviewUrl) {
		this.reviewUrl = reviewUrl;
	}
	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}
	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}
	
	
	

}
