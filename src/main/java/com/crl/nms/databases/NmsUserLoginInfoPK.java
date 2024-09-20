package com.crl.nms.databases;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * @author meenuchhindra
 */
@Embeddable
public class NmsUserLoginInfoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "ROLE")
    private short role;
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private int userId;
    @Basic(optional = false)
    @Column(name = "OWS_INDEX")
    private short owsIndex;

    public NmsUserLoginInfoPK() {
    }

    public NmsUserLoginInfoPK(String username, short role, int userId, short owsIndex) {
        this.username = username;
        this.role = role;
        this.userId = userId;
        this.owsIndex = owsIndex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public short getRole() {
        return role;
    }

    public void setRole(short role) {
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public short getOwsIndex() {
        return owsIndex;
    }

    public void setOwsIndex(short owsIndex) {
        this.owsIndex = owsIndex;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        hash += (int) role;
        hash += (int) userId;
        hash += (int) owsIndex;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsUserLoginInfoPK)) {
            return false;
        }
        NmsUserLoginInfoPK other = (NmsUserLoginInfoPK) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        if (this.role != other.role) {
            return false;
        }
        if (this.userId != other.userId) {
            return false;
        }
        if (this.owsIndex != other.owsIndex) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nms.crl.bo.NmsUserLoginInfoPK[ username=" + username + ", role=" + role + ", userId=" + userId + ", owsIndex=" + owsIndex + " ]";
    }

}
