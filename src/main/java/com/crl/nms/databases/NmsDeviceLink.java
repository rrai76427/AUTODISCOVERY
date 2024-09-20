package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

/**
 * @author meenuchhindra
 */
@Entity
@Table(name = "NMS_DEVICE_LINK")
@XmlRootElement

public class NmsDeviceLink implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;
    @Column(name = "DEVICE_LINK")
    private String deviceLink;
    @JoinColumn(name = "NEKEY", referencedColumnName = "NEKEY", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private NmsNeDetail nmsNeDetail;

    public NmsDeviceLink() {
    }

    public NmsDeviceLink(String nekey) {
        this.nekey = nekey;
    }

    public String getNekey() {
        return nekey;
    }

    public void setNekey(String nekey) {
        this.nekey = nekey;
    }

    public String getDeviceLink() {
        return deviceLink;
    }

    public void setDeviceLink(String deviceLink) {
        this.deviceLink = deviceLink;
    }

    public NmsNeDetail getNmsNeDetail() {
        return nmsNeDetail;
    }

    public void setNmsNeDetail(NmsNeDetail nmsNeDetail) {
        this.nmsNeDetail = nmsNeDetail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nekey != null ? nekey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsDeviceLink)) {
            return false;
        }
        NmsDeviceLink other = (NmsDeviceLink) object;
        if ((this.nekey == null && other.nekey != null) || (this.nekey != null && !this.nekey.equals(other.nekey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.bo.NmsDeviceLink[ nekey=" + nekey + " ]";
    }

}
