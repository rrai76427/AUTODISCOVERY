package com.crl.nms.databases;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * @author meenuchhindra
 */
@Embeddable
public class EnterpriseRepositoryPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRAP_OID")
    private String trapOid;
    @Basic(optional = false)
    @Column(name = "TEMPLATE_NAME")
    private String templateName;

    public EnterpriseRepositoryPK() {
    }

    public EnterpriseRepositoryPK(String trapOid, String templateName) {
        this.trapOid = trapOid;
        this.templateName = templateName;
    }

    public String getTrapOid() {
        return trapOid;
    }

    public void setTrapOid(String trapOid) {
        this.trapOid = trapOid;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trapOid != null ? trapOid.hashCode() : 0);
        hash += (templateName != null ? templateName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnterpriseRepositoryPK)) {
            return false;
        }
        EnterpriseRepositoryPK other = (EnterpriseRepositoryPK) object;
        if ((this.trapOid == null && other.trapOid != null) || (this.trapOid != null && !this.trapOid.equals(other.trapOid))) {
            return false;
        }
        if ((this.templateName == null && other.templateName != null) || (this.templateName != null && !this.templateName.equals(other.templateName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.bo.EnterpriseRepositoryPK[ trapOid=" + trapOid + ", templateName=" + templateName + " ]";
    }

}
