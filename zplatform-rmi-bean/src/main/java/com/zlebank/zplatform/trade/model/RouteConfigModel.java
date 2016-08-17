package com.zlebank.zplatform.trade.model;

import java.util.Date;

/**
 * TRouteConfig entity. @author MyEclipse Persistence Tools
 */

public class RouteConfigModel implements java.io.Serializable {

 // Fields

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 56898438589616289L;
    private Long rid;
    private String cashcode;
    private String stime;
    private String etime;
    private Long minamt;
    private Long maxamt;
    private String bankcode;
    private String busicode;
    private String cardtype;
    private String routver;
    private String status;
    private Date intime;
    private Long inuser;
    private Date uptime;
    private Long upuser;
    private Long ordertype;
    private Long orders;
    private String isdef;
    private String notes;
    private String remarks;
    private String merchRoutver;
    // Constructors
	/**
	 * @return the rid
	 */
	public Long getRid() {
		return rid;
	}
	/**
	 * @param rid the rid to set
	 */
	public void setRid(Long rid) {
		this.rid = rid;
	}
	/**
	 * @return the cashcode
	 */
	public String getCashcode() {
		return cashcode;
	}
	/**
	 * @param cashcode the cashcode to set
	 */
	public void setCashcode(String cashcode) {
		this.cashcode = cashcode;
	}
	/**
	 * @return the stime
	 */
	public String getStime() {
		return stime;
	}
	/**
	 * @param stime the stime to set
	 */
	public void setStime(String stime) {
		this.stime = stime;
	}
	/**
	 * @return the etime
	 */
	public String getEtime() {
		return etime;
	}
	/**
	 * @param etime the etime to set
	 */
	public void setEtime(String etime) {
		this.etime = etime;
	}
	/**
	 * @return the minamt
	 */
	public Long getMinamt() {
		return minamt;
	}
	/**
	 * @param minamt the minamt to set
	 */
	public void setMinamt(Long minamt) {
		this.minamt = minamt;
	}
	/**
	 * @return the maxamt
	 */
	public Long getMaxamt() {
		return maxamt;
	}
	/**
	 * @param maxamt the maxamt to set
	 */
	public void setMaxamt(Long maxamt) {
		this.maxamt = maxamt;
	}
	/**
	 * @return the bankcode
	 */
	public String getBankcode() {
		return bankcode;
	}
	/**
	 * @param bankcode the bankcode to set
	 */
	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
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
	 * @return the cardtype
	 */
	public String getCardtype() {
		return cardtype;
	}
	/**
	 * @param cardtype the cardtype to set
	 */
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	/**
	 * @return the routver
	 */
	public String getRoutver() {
		return routver;
	}
	/**
	 * @param routver the routver to set
	 */
	public void setRoutver(String routver) {
		this.routver = routver;
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
	 * @return the intime
	 */
	public Date getIntime() {
		return intime;
	}
	/**
	 * @param intime the intime to set
	 */
	public void setIntime(Date intime) {
		this.intime = intime;
	}
	/**
	 * @return the inuser
	 */
	public Long getInuser() {
		return inuser;
	}
	/**
	 * @param inuser the inuser to set
	 */
	public void setInuser(Long inuser) {
		this.inuser = inuser;
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
	 * @return the upuser
	 */
	public Long getUpuser() {
		return upuser;
	}
	/**
	 * @param upuser the upuser to set
	 */
	public void setUpuser(Long upuser) {
		this.upuser = upuser;
	}
	/**
	 * @return the ordertype
	 */
	public Long getOrdertype() {
		return ordertype;
	}
	/**
	 * @param ordertype the ordertype to set
	 */
	public void setOrdertype(Long ordertype) {
		this.ordertype = ordertype;
	}
	/**
	 * @return the orders
	 */
	public Long getOrders() {
		return orders;
	}
	/**
	 * @param orders the orders to set
	 */
	public void setOrders(Long orders) {
		this.orders = orders;
	}
	/**
	 * @return the isdef
	 */
	public String getIsdef() {
		return isdef;
	}
	/**
	 * @param isdef the isdef to set
	 */
	public void setIsdef(String isdef) {
		this.isdef = isdef;
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
	/**
	 * @return the merchRoutver
	 */
	public String getMerchRoutver() {
		return merchRoutver;
	}
	/**
	 * @param merchRoutver the merchRoutver to set
	 */
	public void setMerchRoutver(String merchRoutver) {
		this.merchRoutver = merchRoutver;
	}

    

}