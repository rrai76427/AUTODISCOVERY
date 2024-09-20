package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Date;

/**
 * @author meenuchhindra
 */
@Entity
@Table(name = "NMS_USER_LOGIN_INFO")
@XmlRootElement

public class NmsUserLoginInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "LOGIN_STATE")
    private Short loginState;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "ROLE")
    private short role;
    @Column(name = "LOGIN_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginTimestamp;
    @Column(name = "ENABLED")
    private Short enabled;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "MOBILE_NO")
    private Long mobileNo;
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NMS_USER_ID_SEQ_NO_P")
    @SequenceGenerator(sequenceName = "NMS_USER_ID_SEQ_NO_P", initialValue = 1, allocationSize = 1, name = "NMS_USER_ID_SEQ_NO_P")
    @Id
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private Integer userId;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "LOGOUT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logoutTimestamp;
    @Basic(optional = false)
    @Column(name = "OWS_INDEX")
    private short owsIndex;

    public NmsUserLoginInfo() {
    }

    public NmsUserLoginInfo(Integer userId) {
        this.userId = userId;
    }

    public NmsUserLoginInfo(Integer userId, String username, short role, short owsIndex) {
        this.userId = userId;
        this.username = username;
        this.role = role;
        this.owsIndex = owsIndex;
    }

    public Short getLoginState() {
        return loginState;
    }

    public void setLoginState(Short loginState) {
        this.loginState = loginState;
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

    public Date getLoginTimestamp() {
        return loginTimestamp;
    }

    public void setLoginTimestamp(Date loginTimestamp) {
        this.loginTimestamp = loginTimestamp;
    }

    public Short getEnabled() {
        return enabled;
    }

    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getLogoutTimestamp() {
        return logoutTimestamp;
    }

    public void setLogoutTimestamp(Date logoutTimestamp) {
        this.logoutTimestamp = logoutTimestamp;
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
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsUserLoginInfo)) {
            return false;
        }
        NmsUserLoginInfo other = (NmsUserLoginInfo) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nms.crl.bo.NmsUserLoginInfo[ userId=" + userId + " ]";
    }

}
