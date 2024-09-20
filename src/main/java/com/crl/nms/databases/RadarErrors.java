package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Date;

/**
 * @author meenuchhindra
 */
@Entity
@Table(name = "RADAR_ERRORS")
@XmlRootElement

public class RadarErrors implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RadarErrorsPK radarErrorsPK;
    @Column(name = "ERROR")
    private String error;
    @Basic(optional = false)
    @Column(name = "UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedon;

    public RadarErrors() {
    }

    public RadarErrors(RadarErrorsPK radarErrorsPK) {
        this.radarErrorsPK = radarErrorsPK;
    }

    public RadarErrors(RadarErrorsPK radarErrorsPK, Date updatedon, short moduleid) {
        this.radarErrorsPK = radarErrorsPK;
        this.updatedon = updatedon;
        //this.moduleid = moduleid;
    }

    public RadarErrors(String nekey, short bitno) {
        this.radarErrorsPK = new RadarErrorsPK(nekey, bitno);
    }

    public RadarErrorsPK getRadarErrorsPK() {
        return radarErrorsPK;
    }

    public void setRadarErrorsPK(RadarErrorsPK radarErrorsPK) {
        this.radarErrorsPK = radarErrorsPK;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Date getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(Date updatedon) {
        this.updatedon = updatedon;
    }

    /* public short getModuleid() {
        return moduleid;
    }

    public void setModuleid(short moduleid) {
        this.moduleid = moduleid;
    }*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (radarErrorsPK != null ? radarErrorsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RadarErrors)) {
            return false;
        }
        RadarErrors other = (RadarErrors) object;
        if ((this.radarErrorsPK == null && other.radarErrorsPK != null) || (this.radarErrorsPK != null && !this.radarErrorsPK.equals(other.radarErrorsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nms.crl.bo.RadarErrors[ radarErrorsPK=" + radarErrorsPK + " ]";
    }

}
