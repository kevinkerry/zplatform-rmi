package com.zlebank.zplatform.trade.model;


/**
 * TRspmsg entity. @author MyEclipse Persistence Tools
 */
public class PojoRspmsg implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 857572510389451791L;
	private String rspid;
	private String webrspcode;
	private String waprspcode;
	private String kind;
	private String reason;
	private String chnltype;
	private String chnlrspcode;
	private String rspinfo;
	private String notes;

	// Constructors

	/** default constructor */
	public PojoRspmsg() {
	}

	/** minimal constructor */
	public PojoRspmsg(String rspid) {
		this.rspid = rspid;
	}

	/** full constructor */
	public PojoRspmsg(String rspid, String webrspcode, String waprspcode,
			String kind, String reason, String chnltype, String chnlrspcode,
			String rspinfo, String notes) {
		this.rspid = rspid;
		this.webrspcode = webrspcode;
		this.waprspcode = waprspcode;
		this.kind = kind;
		this.reason = reason;
		this.chnltype = chnltype;
		this.chnlrspcode = chnlrspcode;
		this.rspinfo = rspinfo;
		this.notes = notes;
	}

	/**
	 * @return the rspid
	 */
	public String getRspid() {
		return rspid;
	}

	/**
	 * @param rspid the rspid to set
	 */
	public void setRspid(String rspid) {
		this.rspid = rspid;
	}

	/**
	 * @return the webrspcode
	 */
	public String getWebrspcode() {
		return webrspcode;
	}

	/**
	 * @param webrspcode the webrspcode to set
	 */
	public void setWebrspcode(String webrspcode) {
		this.webrspcode = webrspcode;
	}

	/**
	 * @return the waprspcode
	 */
	public String getWaprspcode() {
		return waprspcode;
	}

	/**
	 * @param waprspcode the waprspcode to set
	 */
	public void setWaprspcode(String waprspcode) {
		this.waprspcode = waprspcode;
	}

	/**
	 * @return the kind
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * @param kind the kind to set
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * @return the chnltype
	 */
	public String getChnltype() {
		return chnltype;
	}

	/**
	 * @param chnltype the chnltype to set
	 */
	public void setChnltype(String chnltype) {
		this.chnltype = chnltype;
	}

	/**
	 * @return the chnlrspcode
	 */
	public String getChnlrspcode() {
		return chnlrspcode;
	}

	/**
	 * @param chnlrspcode the chnlrspcode to set
	 */
	public void setChnlrspcode(String chnlrspcode) {
		this.chnlrspcode = chnlrspcode;
	}

	/**
	 * @return the rspinfo
	 */
	public String getRspinfo() {
		return rspinfo;
	}

	/**
	 * @param rspinfo the rspinfo to set
	 */
	public void setRspinfo(String rspinfo) {
		this.rspinfo = rspinfo;
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

	

}