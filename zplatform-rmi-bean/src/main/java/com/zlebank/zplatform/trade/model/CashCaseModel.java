package com.zlebank.zplatform.trade.model;


/**
 * TCashCase entity. @author MyEclipse Persistence Tools
 */

public class CashCaseModel implements java.io.Serializable {

	// Fields

	/**
     * serialVersionUID
     */
    private static final long serialVersionUID = -240036586606309538L;
    private Long id;
	private String cashver;
	private String cashcode;
	private String cashname;
	private String cashdesc;
	private String status;
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
	 * @return the cashver
	 */
	public String getCashver() {
		return cashver;
	}
	/**
	 * @param cashver the cashver to set
	 */
	public void setCashver(String cashver) {
		this.cashver = cashver;
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
	 * @return the cashname
	 */
	public String getCashname() {
		return cashname;
	}
	/**
	 * @param cashname the cashname to set
	 */
	public void setCashname(String cashname) {
		this.cashname = cashname;
	}
	/**
	 * @return the cashdesc
	 */
	public String getCashdesc() {
		return cashdesc;
	}
	/**
	 * @param cashdesc the cashdesc to set
	 */
	public void setCashdesc(String cashdesc) {
		this.cashdesc = cashdesc;
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