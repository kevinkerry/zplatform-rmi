package com.zlebank.zplatform.member.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
/**
 * 
 * A POJO represent cooperative institution
 *
 * @author yangying
 * @version
 * @date 2016年1月12日 下午2:59:49
 * @since
 */
public class PojoCoopInsti implements Serializable{
    private long id;
    private String instiCode;
    private String instiName;
    private List<ProductModel> products;
    private List<PojoInstiMK> instisMKs;
    private String status;
    private Timestamp inTime;
    private long inUserId;
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
	 * @return the instiCode
	 */
	public String getInstiCode() {
		return instiCode;
	}
	/**
	 * @param instiCode the instiCode to set
	 */
	public void setInstiCode(String instiCode) {
		this.instiCode = instiCode;
	}
	/**
	 * @return the instiName
	 */
	public String getInstiName() {
		return instiName;
	}
	/**
	 * @param instiName the instiName to set
	 */
	public void setInstiName(String instiName) {
		this.instiName = instiName;
	}
	/**
	 * @return the products
	 */
	public List<ProductModel> getProducts() {
		return products;
	}
	/**
	 * @param products the products to set
	 */
	public void setProducts(List<ProductModel> products) {
		this.products = products;
	}
	/**
	 * @return the instisMKs
	 */
	public List<PojoInstiMK> getInstisMKs() {
		return instisMKs;
	}
	/**
	 * @param instisMKs the instisMKs to set
	 */
	public void setInstisMKs(List<PojoInstiMK> instisMKs) {
		this.instisMKs = instisMKs;
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
	 * @return the inTime
	 */
	public Timestamp getInTime() {
		return inTime;
	}
	/**
	 * @param inTime the inTime to set
	 */
	public void setInTime(Timestamp inTime) {
		this.inTime = inTime;
	}
	/**
	 * @return the inUserId
	 */
	public long getInUserId() {
		return inUserId;
	}
	/**
	 * @param inUserId the inUserId to set
	 */
	public void setInUserId(long inUserId) {
		this.inUserId = inUserId;
	}

    
}
