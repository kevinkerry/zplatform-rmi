package com.zlebank.zplatform.trade.model;


/**
 * TTxnsGatewaypay entity. @author MyEclipse Persistence Tools
 */

public class TxnsGatewaypayModel implements java.io.Serializable {

	// Fields

	/**
     * serialVersionUID
     */
    private static final long serialVersionUID = 5136085938296304922L;
    private Long id;
	private String institution;
	private String payorderno;
	private Long payamt;
	private String paycommtime;
	private String relatetradetxn;
	private String firmemberno;
	private String firmembername;
	private String firmembershortname;
	private String secmemberno;
	private String secmembername;
	private String secmembershortname;
	private String payname;
	private Long paynum;
	private String paycode;
	private String paydescr;
	private String paytype;
	private String status;
	private String notes;
	private String remarks;
	private String payfinshtime;
	
	private String payretcode;
	private String payretinfo;
	private String payrettxnseqno;
	private String bankcode;
	private String closetime;
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
	 * @return the institution
	 */
	public String getInstitution() {
		return institution;
	}
	/**
	 * @param institution the institution to set
	 */
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	/**
	 * @return the payorderno
	 */
	public String getPayorderno() {
		return payorderno;
	}
	/**
	 * @param payorderno the payorderno to set
	 */
	public void setPayorderno(String payorderno) {
		this.payorderno = payorderno;
	}
	/**
	 * @return the payamt
	 */
	public Long getPayamt() {
		return payamt;
	}
	/**
	 * @param payamt the payamt to set
	 */
	public void setPayamt(Long payamt) {
		this.payamt = payamt;
	}
	/**
	 * @return the paycommtime
	 */
	public String getPaycommtime() {
		return paycommtime;
	}
	/**
	 * @param paycommtime the paycommtime to set
	 */
	public void setPaycommtime(String paycommtime) {
		this.paycommtime = paycommtime;
	}
	/**
	 * @return the relatetradetxn
	 */
	public String getRelatetradetxn() {
		return relatetradetxn;
	}
	/**
	 * @param relatetradetxn the relatetradetxn to set
	 */
	public void setRelatetradetxn(String relatetradetxn) {
		this.relatetradetxn = relatetradetxn;
	}
	/**
	 * @return the firmemberno
	 */
	public String getFirmemberno() {
		return firmemberno;
	}
	/**
	 * @param firmemberno the firmemberno to set
	 */
	public void setFirmemberno(String firmemberno) {
		this.firmemberno = firmemberno;
	}
	/**
	 * @return the firmembername
	 */
	public String getFirmembername() {
		return firmembername;
	}
	/**
	 * @param firmembername the firmembername to set
	 */
	public void setFirmembername(String firmembername) {
		this.firmembername = firmembername;
	}
	/**
	 * @return the firmembershortname
	 */
	public String getFirmembershortname() {
		return firmembershortname;
	}
	/**
	 * @param firmembershortname the firmembershortname to set
	 */
	public void setFirmembershortname(String firmembershortname) {
		this.firmembershortname = firmembershortname;
	}
	/**
	 * @return the secmemberno
	 */
	public String getSecmemberno() {
		return secmemberno;
	}
	/**
	 * @param secmemberno the secmemberno to set
	 */
	public void setSecmemberno(String secmemberno) {
		this.secmemberno = secmemberno;
	}
	/**
	 * @return the secmembername
	 */
	public String getSecmembername() {
		return secmembername;
	}
	/**
	 * @param secmembername the secmembername to set
	 */
	public void setSecmembername(String secmembername) {
		this.secmembername = secmembername;
	}
	/**
	 * @return the secmembershortname
	 */
	public String getSecmembershortname() {
		return secmembershortname;
	}
	/**
	 * @param secmembershortname the secmembershortname to set
	 */
	public void setSecmembershortname(String secmembershortname) {
		this.secmembershortname = secmembershortname;
	}
	/**
	 * @return the payname
	 */
	public String getPayname() {
		return payname;
	}
	/**
	 * @param payname the payname to set
	 */
	public void setPayname(String payname) {
		this.payname = payname;
	}
	/**
	 * @return the paynum
	 */
	public Long getPaynum() {
		return paynum;
	}
	/**
	 * @param paynum the paynum to set
	 */
	public void setPaynum(Long paynum) {
		this.paynum = paynum;
	}
	/**
	 * @return the paycode
	 */
	public String getPaycode() {
		return paycode;
	}
	/**
	 * @param paycode the paycode to set
	 */
	public void setPaycode(String paycode) {
		this.paycode = paycode;
	}
	/**
	 * @return the paydescr
	 */
	public String getPaydescr() {
		return paydescr;
	}
	/**
	 * @param paydescr the paydescr to set
	 */
	public void setPaydescr(String paydescr) {
		this.paydescr = paydescr;
	}
	/**
	 * @return the paytype
	 */
	public String getPaytype() {
		return paytype;
	}
	/**
	 * @param paytype the paytype to set
	 */
	public void setPaytype(String paytype) {
		this.paytype = paytype;
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
	/**
	 * @return the payfinshtime
	 */
	public String getPayfinshtime() {
		return payfinshtime;
	}
	/**
	 * @param payfinshtime the payfinshtime to set
	 */
	public void setPayfinshtime(String payfinshtime) {
		this.payfinshtime = payfinshtime;
	}
	/**
	 * @return the payretcode
	 */
	public String getPayretcode() {
		return payretcode;
	}
	/**
	 * @param payretcode the payretcode to set
	 */
	public void setPayretcode(String payretcode) {
		this.payretcode = payretcode;
	}
	/**
	 * @return the payretinfo
	 */
	public String getPayretinfo() {
		return payretinfo;
	}
	/**
	 * @param payretinfo the payretinfo to set
	 */
	public void setPayretinfo(String payretinfo) {
		this.payretinfo = payretinfo;
	}
	/**
	 * @return the payrettxnseqno
	 */
	public String getPayrettxnseqno() {
		return payrettxnseqno;
	}
	/**
	 * @param payrettxnseqno the payrettxnseqno to set
	 */
	public void setPayrettxnseqno(String payrettxnseqno) {
		this.payrettxnseqno = payrettxnseqno;
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
	 * @return the closetime
	 */
	public String getClosetime() {
		return closetime;
	}
	/**
	 * @param closetime the closetime to set
	 */
	public void setClosetime(String closetime) {
		this.closetime = closetime;
	}
	
	
	
}