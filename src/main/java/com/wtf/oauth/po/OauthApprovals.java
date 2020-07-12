package com.wtf.oauth.po;

import java.util.Date;

public class OauthApprovals {
    private Long id;

    private String userid;

    private String clientid;

    private String scope;

    private String status;

    private Date expiresat;

    private Date lastmodifiedat;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return userId
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return clientId
     */
    public String getClientid() {
        return clientid;
    }

    /**
     * @param clientid
     */
    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    /**
     * @param scope
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return expiresAt
     */
    public Date getExpiresat() {
        return expiresat;
    }

    /**
     * @param expiresat
     */
    public void setExpiresat(Date expiresat) {
        this.expiresat = expiresat;
    }

    /**
     * @return lastModifiedAt
     */
    public Date getLastmodifiedat() {
        return lastmodifiedat;
    }

    /**
     * @param lastmodifiedat
     */
    public void setLastmodifiedat(Date lastmodifiedat) {
        this.lastmodifiedat = lastmodifiedat;
    }
}