package com.zlebank.zplatform.trade.model;


/**
 * TTxnsRefund entity. @author MyEclipse Persistence Tools
 */

public class TxnsRefundModel implements java.io.Serializable {

	// Fields

	/**
     * serialVersionUID
     */
    private static final long serialVersionUID = 4768281398006737392L;
    private Long id;
	private String refundorderno;
	private String oldorderno;
	private String oldtxnseqno;
	private String merchno;
	private String submerchno;
	private String memberid;
	private Long amount;
	private Long oldamount;
	private String refundtype;
	private String refunddesc;
	private String reltxnseqno;
	private String txntime;
	private String finishtime;
	private String refundinstid;
	private String status;
	private String retcode;
	private String retinfo;
	private String notes;
	private String remarks;
	private String stexaopt;
	private String relorderno;
	  /**通过还是拒绝*/
   private String flag; 
	 //Constructors
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
	 * @return the refundorderno
	 */
	public String getRefundorderno() {
		return refundorderno;
	}
	/**
	 * @param refundorderno the refundorderno to set
	 */
	public void setRefundorderno(String refundorderno) {
		this.refundorderno = refundorderno;
	}
	/**
	 * @return the oldorderno
	 */
	public String getOldorderno() {
		return oldorderno;
	}
	/**
	 * @param oldorderno the oldorderno to set
	 */
	public void setOldorderno(String oldorderno) {
		this.oldorderno = oldorderno;
	}
	/**
	 * @return the oldtxnseqno
	 */
	public String getOldtxnseqno() {
		return oldtxnseqno;
	}
	/**
	 * @param oldtxnseqno the oldtxnseqno to set
	 */
	public void setOldtxnseqno(String oldtxnseqno) {
		this.oldtxnseqno = oldtxnseqno;
	}
	/**
	 * @return the merchno
	 */
	public String getMerchno() {
		return merchno;
	}
	/**
	 * @param merchno the merchno to set
	 */
	public void setMerchno(String merchno) {
		this.merchno = merchno;
	}
	/**
	 * @return the submerchno
	 */
	public String getSubmerchno() {
		return submerchno;
	}
	/**
	 * @param submerchno the submerchno to set
	 */
	public void setSubmerchno(String submerchno) {
		this.submerchno = submerchno;
	}
	/**
	 * @return the memberid
	 */
	public String getMemberid() {
		return memberid;
	}
	/**
	 * @param memberid the memberid to set
	 */
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	/**
	 * @return the amount
	 */
	public Long getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	/**
	 * @return the oldamount
	 */
	public Long getOldamount() {
		return oldamount;
	}
	/**
	 * @param oldamount the oldamount to set
	 */
	public void setOldamount(Long oldamount) {
		this.oldamount = oldamount;
	}
	/**
	 * @return the refundtype
	 */
	public String getRefundtype() {
		return refundtype;
	}
	/**
	 * @param refundtype the refundtype to set
	 */
	public void setRefundtype(String refundtype) {
		this.refundtype = refundtype;
	}
	/**
	 * @return the refunddesc
	 */
	public String getRefunddesc() {
		return refunddesc;
	}
	/**
	 * @param refunddesc the refunddesc to set
	 */
	public void setRefunddesc(String refunddesc) {
		this.refunddesc = refunddesc;
	}
	/**
	 * @return the reltxnseqno
	 */
	public String getReltxnseqno() {
		return reltxnseqno;
	}
	/**
	 * @param reltxnseqno the reltxnseqno to set
	 */
	public void setReltxnseqno(String reltxnseqno) {
		this.reltxnseqno = reltxnseqno;
	}
	/**
	 * @return the txntime
	 */
	public String getTxntime() {
		return txntime;
	}
	/**
	 * @param txntime the txntime to set
	 */
	public void setTxntime(String txntime) {
		this.txntime = txntime;
	}
	/**
	 * @return the finishtime
	 */
	public String getFinishtime() {
		return finishtime;
	}
	/**
	 * @param finishtime the finishtime to set
	 */
	public void setFinishtime(String finishtime) {
		this.finishtime = finishtime;
	}
	/**
	 * @return the refundinstid
	 */
	public String getRefundinstid() {
		return refundinstid;
	}
	/**
	 * @param refundinstid the refundinstid to set
	 */
	public void setRefundinstid(String refundinstid) {
		this.refundinstid = refundinstid;
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
	 * @return the retcode
	 */
	public String getRetcode() {
		return retcode;
	}
	/**
	 * @param retcode the retcode to set
	 */
	public void setRetcode(String retcode) {
		this.retcode = retcode;
	}
	/**
	 * @return the retinfo
	 */
	public String getRetinfo() {
		return retinfo;
	}
	/**
	 * @param retinfo the retinfo to set
	 */
	public void setRetinfo(String retinfo) {
		this.retinfo = retinfo;
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
	 * @return the stexaopt
	 */
	public String getStexaopt() {
		return stexaopt;
	}
	/**
	 * @param stexaopt the stexaopt to set
	 */
	public void setStexaopt(String stexaopt) {
		this.stexaopt = stexaopt;
	}
	/**
	 * @return the relorderno
	 */
	public String getRelorderno() {
		return relorderno;
	}
	/**
	 * @param relorderno the relorderno to set
	 */
	public void setRelorderno(String relorderno) {
		this.relorderno = relorderno;
	}
	/**
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	
}
