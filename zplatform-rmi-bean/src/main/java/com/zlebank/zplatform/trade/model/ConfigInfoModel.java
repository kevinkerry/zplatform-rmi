package com.zlebank.zplatform.trade.model;

import java.util.Date;

/**
 * TConfigInfo entity. @author MyEclipse Persistence Tools
 */

public class ConfigInfoModel implements java.io.Serializable {

	// Fields

	/**
     * serialVersionUID
     */
    private static final long serialVersionUID = -6214615116334705954L;
    private Long id;
	private String paraname;
	private String para;
	private String busicode;
	private String businame;
	private String status;
	private Date creatime;
	private Date uptime;
	private String notes;
	private String remarks;
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
	 * @return the paraname
	 */
	public String getParaname() {
		return paraname;
	}
	/**
	 * @param paraname the paraname to set
	 */
	public void setParaname(String paraname) {
		this.paraname = paraname;
	}
	/**
	 * @return the para
	 */
	public String getPara() {
		return para;
	}
	/**
	 * @param para the para to set
	 */
	public void setPara(String para) {
		this.para = para;
	}
	/**
	 * @return the busicode
	 */
	public String getBusicode() {
		return busicode;
	}
	/**
	 * @param busicode the busicode to set
	 */
	public void setBusicode(String busicode) {
		this.busicode = busicode;
	}
	/**
	 * @return the businame
	 */
	public String getBusiname() {
		return businame;
	}
	/**
	 * @param businame the businame to set
	 */
	public void setBusiname(String businame) {
		this.businame = businame;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the creatime
	 */
	public Date getCreatime() {
		return creatime;
	}
	/**
	 * @param creatime the creatime to set
	 */
	public void setCreatime(Date creatime) {
		this.creatime = creatime;
	}
	/**
	 * @return the uptime
	 */
	public Date getUptime() {
		return uptime;
	}
	/**
	 * @param uptime the uptime to set
	 */
	public void setUptime(Date uptime) {
		this.uptime = uptime;
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