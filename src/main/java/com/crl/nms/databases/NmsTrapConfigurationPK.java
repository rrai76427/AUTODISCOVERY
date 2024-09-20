package com.crl.nms.databases;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * @author ashwinimehta
 */
@Embeddable
public class NmsTrapConfigurationPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;
    @Basic(optional = false)
    @Column(name = "TRAP_OID")
    private String trapOid;

    public NmsTrapConfigurationPK() {
    }

    public NmsTrapConfigurationPK(String nekey, String trapOid) {
        this.nekey = nekey;
        this.trapOid = trapOid;
    }

    public String getNekey() {
        return nekey;
    }

    public void setNekey(String nekey) {
        this.nekey = nekey;
    }

    public String getTrapOid() {
        return trapOid;
    }

    public void setTrapOid(String trapOid) {
        this.trapOid = trapOid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nekey != null ? nekey.hashCode() : 0);
        hash += (trapOid != null ? trapOid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsTrapConfigurationPK)) {
            return false;
        }
        NmsTrapConfigurationPK other = (NmsTrapConfigurationPK) object;
        if ((this.nekey == null && other.nekey != null) || (this.nekey != null && !this.nekey.equals(other.nekey))) {
            return false;
        }
        if ((this.trapOid == null && other.trapOid != null) || (this.trapOid != null && !this.trapOid.equals(other.trapOid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NmsTrapConfigurationPK[ nekey=" + nekey + ", trapOid=" + trapOid + " ]";
    }

}
