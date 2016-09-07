package com.zlebank.zplatform.member.pojo;

import java.io.Serializable;

import com.zlebank.zplatform.member.bean.enums.EncryptAlgorithm;
import com.zlebank.zplatform.member.bean.enums.TerminalAccessType;
/**
 * 
 * A POJO represent cooperative institution encrypt key pairs
 *
 * @author yangying
 * @version
 * @date 2016年1月13日 上午10:13:45
 * @since
 */
public class PojoInstiMK implements Serializable{
    private long id;
    private PojoCoopInsti coopInsti;
    private TerminalAccessType terminalAccessType;
    private EncryptAlgorithm encryptAlgorithm;
    private String zplatformPriKey;
    private String zplatformPubKey;
    private String instiPriKey;
    private String instiPubKey;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the coopInsti
	 */
	public PojoCoopInsti getCoopInsti() {
		return coopInsti;
	}
	/**
	 * @param coopInsti the coopInsti to set
	 */
	public void setCoopInsti(PojoCoopInsti coopInsti) {
		this.coopInsti = coopInsti;
	}
	/**
	 * @return the terminalAccessType
	 */
	public TerminalAccessType getTerminalAccessType() {
		return terminalAccessType;
	}
	/**
	 * @param terminalAccessType the terminalAccessType to set
	 */
	public void setTerminalAccessType(TerminalAccessType terminalAccessType) {
		this.terminalAccessType = terminalAccessType;
	}
	/**
	 * @return the encryptAlgorithm
	 */
	public EncryptAlgorithm getEncryptAlgorithm() {
		return encryptAlgorithm;
	}
	/**
	 * @param encryptAlgorithm the encryptAlgorithm to set
	 */
	public void setEncryptAlgorithm(EncryptAlgorithm encryptAlgorithm) {
		this.encryptAlgorithm = encryptAlgorithm;
	}
	/**
	 * @return the zplatformPriKey
	 */
	public String getZplatformPriKey() {
		return zplatformPriKey;
	}
	/**
	 * @param zplatformPriKey the zplatformPriKey to set
	 */
	public void setZplatformPriKey(String zplatformPriKey) {
		this.zplatformPriKey = zplatformPriKey;
	}
	/**
	 * @return the zplatformPubKey
	 */
	public String getZplatformPubKey() {
		return zplatformPubKey;
	}
	/**
	 * @param zplatformPubKey the zplatformPubKey to set
	 */
	public void setZplatformPubKey(String zplatformPubKey) {
		this.zplatformPubKey = zplatformPubKey;
	}
	/**
	 * @return the instiPriKey
	 */
	public String getInstiPriKey() {
		return instiPriKey;
	}
	/**
	 * @param instiPriKey the instiPriKey to set
	 */
	public void setInstiPriKey(String instiPriKey) {
		this.instiPriKey = instiPriKey;
	}
	/**
	 * @return the instiPubKey
	 */
	public String getInstiPubKey() {
		return instiPubKey;
	}
	/**
	 * @param instiPubKey the instiPubKey to set
	 */
	public void setInstiPubKey(String instiPubKey) {
		this.instiPubKey = instiPubKey;
	}
    
   
}
