package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 */
@Entity
@Table(name = "NMS_NE_SNMP_CONFIG")
@XmlRootElement

public class NmsNeSnmpConfig implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NmsNeSnmpConfigPK nmsNeSnmpConfigPK;
    @Basic(optional = false)
    @Column(name = "UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "PROFILE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SnmpProfileTemplate snmpProfileTemplate;

    public NmsNeSnmpConfig() {
    }

    public NmsNeSnmpConfig(NmsNeSnmpConfigPK nmsNeSnmpConfigPK) {
        this.nmsNeSnmpConfigPK = nmsNeSnmpConfigPK;
    }

    public NmsNeSnmpConfig(NmsNeSnmpConfigPK nmsNeSnmpConfigPK, Date updatedOn) {
        this.nmsNeSnmpConfigPK = nmsNeSnmpConfigPK;
        this.updatedOn = updatedOn;
    }

    public NmsNeSnmpConfig(String nekey, short profileId) {
        this.nmsNeSnmpConfigPK = new NmsNeSnmpConfigPK(nekey, profileId);
    }

    public NmsNeSnmpConfigPK getNmsNeSnmpConfigPK() {
        return nmsNeSnmpConfigPK;
    }

    public void setNmsNeSnmpConfigPK(NmsNeSnmpConfigPK nmsNeSnmpConfigPK) {
        this.nmsNeSnmpConfigPK = nmsNeSnmpConfigPK;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public SnmpProfileTemplate getSnmpProfileTemplate() {
        return snmpProfileTemplate;
    }

    public void setSnmpProfileTemplate(SnmpProfileTemplate snmpProfileTemplate) {
        this.snmpProfileTemplate = snmpProfileTemplate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nmsNeSnmpConfigPK != null ? nmsNeSnmpConfigPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsNeSnmpConfig)) {
            return false;
        }
        NmsNeSnmpConfig other = (NmsNeSnmpConfig) object;
        if ((this.nmsNeSnmpConfigPK == null && other.nmsNeSnmpConfigPK != null) || (this.nmsNeSnmpConfigPK != null && !this.nmsNeSnmpConfigPK.equals(other.nmsNeSnmpConfigPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.bo.NmsNeSnmpConfig[ nmsNeSnmpConfigPK=" + nmsNeSnmpConfigPK + " ]";
    }

}
