package com.zlebank.zplatform.trade.model;


/**
 * TTxnsLog entity. @author MyEclipse Persistence Tools
 */

public class TxnsLogModel implements java.io.Serializable {

 // Fields

    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 294757514028433150L;
	private String txnseqno;
    private String txndate;
    private String txntime;
    private String apptype;
    private String busitype;
    private String busicode;
    private Long amount;
    private Long tradcomm;
    private Long txnfee;
    private String riskver;
    private String splitver;
    private String feever;
    private String prdtver;
    private String checkstandver;
    private String routver;
    private String pan;
    private String cardtype;
    private String cardinstino;
    private String inpan;
    private String incardtype;
    private String incardinstino;
    private String accordno;
    private String accordinst;
    private String accsecmerno;
    private String accfirmerno;
    private String accsettledate;
    private String accordcommitime;
    private String accordfintime;
    private String paytype;
    private String payordno;
    private String payinst;
    private String payfirmerno;
    private String paysecmerno;
    private String payordcomtime;
    private String payordfintime;
    private String payrettsnseqno;
    private String payretcode;
    private String payretinfo;
    private String appordno;
    private String appinst;
    private String appordcommitime;
    private String appordfintime;
    private String tradeseltxn;
    private String retcode;
    private String retinfo;
    private String tradestatflag;
    private String tradetxnflag;
    private String txncode;
    private String cashcode;
    private String relate;
    private String retdatetime;
    private String txnseqnoOg;
    private String notes;
    private String remarks;

    private String accmemberid;
    private String apporderstatus;
    private String apporderinfo;
    private String accbusicode;
    private String acccoopinstino;
    private String panName;
    // Constructors
	/**
	 * @return the txnseqno
	 */
	public String getTxnseqno() {
		return txnseqno;
	}
	/**
	 * @param txnseqno the txnseqno to set
	 */
	public void setTxnseqno(String txnseqno) {
		this.txnseqno = txnseqno;
	}
	/**
	 * @return the txndate
	 */
	public String getTxndate() {
		return txndate;
	}
	/**
	 * @param txndate the txndate to set
	 */
	public void setTxndate(String txndate) {
		this.txndate = txndate;
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
	 * @return the apptype
	 */
	public String getApptype() {
		return apptype;
	}
	/**
	 * @param apptype the apptype to set
	 */
	public void setApptype(String apptype) {
		this.apptype = apptype;
	}
	/**
	 * @return the busitype
	 */
	public String getBusitype() {
		return busitype;
	}
	/**
	 * @param busitype the busitype to set
	 */
	public void setBusitype(String busitype) {
		this.busitype = busitype;
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
	 * @return the tradcomm
	 */
	public Long getTradcomm() {
		return tradcomm;
	}
	/**
	 * @param tradcomm the tradcomm to set
	 */
	public void setTradcomm(Long tradcomm) {
		this.tradcomm = tradcomm;
	}
	/**
	 * @return the txnfee
	 */
	public Long getTxnfee() {
		return txnfee;
	}
	/**
	 * @param txnfee the txnfee to set
	 */
	public void setTxnfee(Long txnfee) {
		this.txnfee = txnfee;
	}
	/**
	 * @return the riskver
	 */
	public String getRiskver() {
		return riskver;
	}
	/**
	 * @param riskver the riskver to set
	 */
	public void setRiskver(String riskver) {
		this.riskver = riskver;
	}
	/**
	 * @return the splitver
	 */
	public String getSplitver() {
		return splitver;
	}
	/**
	 * @param splitver the splitver to set
	 */
	public void setSplitver(String splitver) {
		this.splitver = splitver;
	}
	/**
	 * @return the feever
	 */
	public String getFeever() {
		return feever;
	}
	/**
	 * @param feever the feever to set
	 */
	public void setFeever(String feever) {
		this.feever = feever;
	}
	/**
	 * @return the prdtver
	 */
	public String getPrdtver() {
		return prdtver;
	}
	/**
	 * @param prdtver the prdtver to set
	 */
	public void setPrdtver(String prdtver) {
		this.prdtver = prdtver;
	}
	/**
	 * @return the checkstandver
	 */
	public String getCheckstandver() {
		return checkstandver;
	}
	/**
	 * @param checkstandver the checkstandver to set
	 */
	public void setCheckstandver(String checkstandver) {
		this.checkstandver = checkstandver;
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
	 * @return the pan
	 */
	public String getPan() {
		return pan;
	}
	/**
	 * @param pan the pan to set
	 */
	public void setPan(String pan) {
		this.pan = pan;
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
	 * @return the cardinstino
	 */
	public String getCardinstino() {
		return cardinstino;
	}
	/**
	 * @param cardinstino the cardinstino to set
	 */
	public void setCardinstino(String cardinstino) {
		this.cardinstino = cardinstino;
	}
	/**
	 * @return the inpan
	 */
	public String getInpan() {
		return inpan;
	}
	/**
	 * @param inpan the inpan to set
	 */
	public void setInpan(String inpan) {
		this.inpan = inpan;
	}
	/**
	 * @return the incardtype
	 */
	public String getIncardtype() {
		return incardtype;
	}
	/**
	 * @param incardtype the incardtype to set
	 */
	public void setIncardtype(String incardtype) {
		this.incardtype = incardtype;
	}
	/**
	 * @return the incardinstino
	 */
	public String getIncardinstino() {
		return incardinstino;
	}
	/**
	 * @param incardinstino the incardinstino to set
	 */
	public void setIncardinstino(String incardinstino) {
		this.incardinstino = incardinstino;
	}
	/**
	 * @return the accordno
	 */
	public String getAccordno() {
		return accordno;
	}
	/**
	 * @param accordno the accordno to set
	 */
	public void setAccordno(String accordno) {
		this.accordno = accordno;
	}
	/**
	 * @return the accordinst
	 */
	public String getAccordinst() {
		return accordinst;
	}
	/**
	 * @param accordinst the accordinst to set
	 */
	public void setAccordinst(String accordinst) {
		this.accordinst = accordinst;
	}
	/**
	 * @return the accsecmerno
	 */
	public String getAccsecmerno() {
		return accsecmerno;
	}
	/**
	 * @param accsecmerno the accsecmerno to set
	 */
	public void setAccsecmerno(String accsecmerno) {
		this.accsecmerno = accsecmerno;
	}
	/**
	 * @return the accfirmerno
	 */
	public String getAccfirmerno() {
		return accfirmerno;
	}
	/**
	 * @param accfirmerno the accfirmerno to set
	 */
	public void setAccfirmerno(String accfirmerno) {
		this.accfirmerno = accfirmerno;
	}
	/**
	 * @return the accsettledate
	 */
	public String getAccsettledate() {
		return accsettledate;
	}
	/**
	 * @param accsettledate the accsettledate to set
	 */
	public void setAccsettledate(String accsettledate) {
		this.accsettledate = accsettledate;
	}
	/**
	 * @return the accordcommitime
	 */
	public String getAccordcommitime() {
		return accordcommitime;
	}
	/**
	 * @param accordcommitime the accordcommitime to set
	 */
	public void setAccordcommitime(String accordcommitime) {
		this.accordcommitime = accordcommitime;
	}
	/**
	 * @return the accordfintime
	 */
	public String getAccordfintime() {
		return accordfintime;
	}
	/**
	 * @param accordfintime the accordfintime to set
	 */
	public void setAccordfintime(String accordfintime) {
		this.accordfintime = accordfintime;
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
	 * @return the payordno
	 */
	public String getPayordno() {
		return payordno;
	}
	/**
	 * @param payordno the payordno to set
	 */
	public void setPayordno(String payordno) {
		this.payordno = payordno;
	}
	/**
	 * @return the payinst
	 */
	public String getPayinst() {
		return payinst;
	}
	/**
	 * @param payinst the payinst to set
	 */
	public void setPayinst(String payinst) {
		this.payinst = payinst;
	}
	/**
	 * @return the payfirmerno
	 */
	public String getPayfirmerno() {
		return payfirmerno;
	}
	/**
	 * @param payfirmerno the payfirmerno to set
	 */
	public void setPayfirmerno(String payfirmerno) {
		this.payfirmerno = payfirmerno;
	}
	/**
	 * @return the paysecmerno
	 */
	public String getPaysecmerno() {
		return paysecmerno;
	}
	/**
	 * @param paysecmerno the paysecmerno to set
	 */
	public void setPaysecmerno(String paysecmerno) {
		this.paysecmerno = paysecmerno;
	}
	/**
	 * @return the payordcomtime
	 */
	public String getPayordcomtime() {
		return payordcomtime;
	}
	/**
	 * @param payordcomtime the payordcomtime to set
	 */
	public void setPayordcomtime(String payordcomtime) {
		this.payordcomtime = payordcomtime;
	}
	/**
	 * @return the payordfintime
	 */
	public String getPayordfintime() {
		return payordfintime;
	}
	/**
	 * @param payordfintime the payordfintime to set
	 */
	public void setPayordfintime(String payordfintime) {
		this.payordfintime = payordfintime;
	}
	/**
	 * @return the payrettsnseqno
	 */
	public String getPayrettsnseqno() {
		return payrettsnseqno;
	}
	/**
	 * @param payrettsnseqno the payrettsnseqno to set
	 */
	public void setPayrettsnseqno(String payrettsnseqno) {
		this.payrettsnseqno = payrettsnseqno;
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
	 * @return the appordno
	 */
	public String getAppordno() {
		return appordno;
	}
	/**
	 * @param appordno the appordno to set
	 */
	public void setAppordno(String appordno) {
		this.appordno = appordno;
	}
	/**
	 * @return the appinst
	 */
	public String getAppinst() {
		return appinst;
	}
	/**
	 * @param appinst the appinst to set
	 */
	public void setAppinst(String appinst) {
		this.appinst = appinst;
	}
	/**
	 * @return the appordcommitime
	 */
	public String getAppordcommitime() {
		return appordcommitime;
	}
	/**
	 * @param appordcommitime the appordcommitime to set
	 */
	public void setAppordcommitime(String appordcommitime) {
		this.appordcommitime = appordcommitime;
	}
	/**
	 * @return the appordfintime
	 */
	public String getAppordfintime() {
		return appordfintime;
	}
	/**
	 * @param appordfintime the appordfintime to set
	 */
	public void setAppordfintime(String appordfintime) {
		this.appordfintime = appordfintime;
	}
	/**
	 * @return the tradeseltxn
	 */
	public String getTradeseltxn() {
		return tradeseltxn;
	}
	/**
	 * @param tradeseltxn the tradeseltxn to set
	 */
	public void setTradeseltxn(String tradeseltxn) {
		this.tradeseltxn = tradeseltxn;
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
	 * @return the tradestatflag
	 */
	public String getTradestatflag() {
		return tradestatflag;
	}
	/**
	 * @param tradestatflag the tradestatflag to set
	 */
	public void setTradestatflag(String tradestatflag) {
		this.tradestatflag = tradestatflag;
	}
	/**
	 * @return the tradetxnflag
	 */
	public String getTradetxnflag() {
		return tradetxnflag;
	}
	/**
	 * @param tradetxnflag the tradetxnflag to set
	 */
	public void setTradetxnflag(String tradetxnflag) {
		this.tradetxnflag = tradetxnflag;
	}
	/**
	 * @return the txncode
	 */
	public String getTxncode() {
		return txncode;
	}
	/**
	 * @param txncode the txncode to set
	 */
	public void setTxncode(String txncode) {
		this.txncode = txncode;
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
	 * @return the relate
	 */
	public String getRelate() {
		return relate;
	}
	/**
	 * @param relate the relate to set
	 */
	public void setRelate(String relate) {
		this.relate = relate;
	}
	/**
	 * @return the retdatetime
	 */
	public String getRetdatetime() {
		return retdatetime;
	}
	/**
	 * @param retdatetime the retdatetime to set
	 */
	public void setRetdatetime(String retdatetime) {
		this.retdatetime = retdatetime;
	}
	/**
	 * @return the txnseqnoOg
	 */
	public String getTxnseqnoOg() {
		return txnseqnoOg;
	}
	/**
	 * @param txnseqnoOg the txnseqnoOg to set
	 */
	public void setTxnseqnoOg(String txnseqnoOg) {
		this.txnseqnoOg = txnseqnoOg;
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
	 * @return the accmemberid
	 */
	public String getAccmemberid() {
		return accmemberid;
	}
	/**
	 * @param accmemberid the accmemberid to set
	 */
	public void setAccmemberid(String accmemberid) {
		this.accmemberid = accmemberid;
	}
	/**
	 * @return the apporderstatus
	 */
	public String getApporderstatus() {
		return apporderstatus;
	}
	/**
	 * @param apporderstatus the apporderstatus to set
	 */
	public void setApporderstatus(String apporderstatus) {
		this.apporderstatus = apporderstatus;
	}
	/**
	 * @return the apporderinfo
	 */
	public String getApporderinfo() {
		return apporderinfo;
	}
	/**
	 * @param apporderinfo the apporderinfo to set
	 */
	public void setApporderinfo(String apporderinfo) {
		this.apporderinfo = apporderinfo;
	}
	/**
	 * @return the accbusicode
	 */
	public String getAccbusicode() {
		return accbusicode;
	}
	/**
	 * @param accbusicode the accbusicode to set
	 */
	public void setAccbusicode(String accbusicode) {
		this.accbusicode = accbusicode;
	}
	/**
	 * @return the acccoopinstino
	 */
	public String getAcccoopinstino() {
		return acccoopinstino;
	}
	/**
	 * @param acccoopinstino the acccoopinstino to set
	 */
	public void setAcccoopinstino(String acccoopinstino) {
		this.acccoopinstino = acccoopinstino;
	}
	/**
	 * @return the panName
	 */
	public String getPanName() {
		return panName;
	}
	/**
	 * @param panName the panName to set
	 */
	public void setPanName(String panName) {
		this.panName = panName;
	}

    
	
    
}