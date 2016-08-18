/* 
 * A.java  
 * 
 * version TODO
 *
 * 2016年8月18日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.pojo;

import java.util.Date;

/**
 * Class Description
 *
 * @author houyong
 * @version
 * @date 2016年8月18日 上午11:30:25
 * @since 
 */
public class ProductModel implements java.io.Serializable {

    // Fields

    /**
     * 
     */
    private static final long serialVersionUID = 7773417241591102956L;
    private String prdtver;
    private Long prdtid;
    private String prdtname;
    private String status;
    private Date intime;
    private Long inuser;
    private Date uptime;
    private Long upuser;
    private String notes;
    private String remarks;

    // Constructors

    /** default constructor */
    public ProductModel() {
    }

    /** minimal constructor */
    public ProductModel(String prdtver, Long prdtid, String prdtname, Date intime) {
        this.prdtver = prdtver;
        this.prdtid = prdtid;
        this.prdtname = prdtname;
        this.intime = intime;
    }

    /** full constructor */
    public ProductModel(String prdtver, Long prdtid, String prdtname,
            String status, Date intime, Long inuser, Date uptime, Long upuser,
            String notes, String remarks) {
        this.prdtver = prdtver;
        this.prdtid = prdtid;
        this.prdtname = prdtname;
        this.status = status;
        this.intime = intime;
        this.inuser = inuser;
        this.uptime = uptime;
        this.upuser = upuser;
        this.notes = notes;
        this.remarks = remarks;
    }

    // Property accessors
    
    public String getPrdtver() {
        return this.prdtver;
    }

    public void setPrdtver(String prdtver) {
        this.prdtver = prdtver;
    }

  
    public Long getPrdtid() {
        return this.prdtid;
    }

    public void setPrdtid(Long prdtid) {
        this.prdtid = prdtid;
    }

    
    public String getPrdtname() {
        return this.prdtname;
    }

    public void setPrdtname(String prdtname) {
        this.prdtname = prdtname;
    }

   
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public Date getIntime() {
        return this.intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    
    public Long getInuser() {
        return this.inuser;
    }

    public void setInuser(Long inuser) {
        this.inuser = inuser;
    }
    public Date getUptime() {
        return this.uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

   
    public Long getUpuser() {
        return this.upuser;
    }

    public void setUpuser(Long upuser) {
        this.upuser = upuser;
    }

  
    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
   
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
