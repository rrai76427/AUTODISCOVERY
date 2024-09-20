package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ashwinimehta
 */
@Entity
@Table(name = "VHF_RADIO_DETAIL_INFO")
@XmlRootElement
public class VhfRadioDetailInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VhfRadioDetailInfoPK vhfRadioDetailInfoPK;
    @Column(name = "PARAM_STATUS")
    private Short paramStatus;
    @Column(name = "UPDATEON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateon;

    public VhfRadioDetailInfo() {
    }

    public VhfRadioDetailInfo(VhfRadioDetailInfoPK vhfRadioDetailInfoPK) {
        this.vhfRadioDetailInfoPK = vhfRadioDetailInfoPK;
    }

    public VhfRadioDetailInfo(String paramName, String nekey) {
        this.vhfRadioDetailInfoPK = new VhfRadioDetailInfoPK(paramName, nekey);
    }

    public VhfRadioDetailInfoPK getVhfRadioDetailInfoPK() {
        return vhfRadioDetailInfoPK;
    }

    public void setVhfRadioDetailInfoPK(VhfRadioDetailInfoPK vhfRadioDetailInfoPK) {
        this.vhfRadioDetailInfoPK = vhfRadioDetailInfoPK;
    }

    public Short getParamStatus() {
        return paramStatus;
    }

    public void setParamStatus(Short paramStatus) {
        this.paramStatus = paramStatus;
    }

    public Date getUpdateon() {
        return updateon;
    }

    public void setUpdateon(Date updateon) {
        this.updateon = updateon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vhfRadioDetailInfoPK != null ? vhfRadioDetailInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VhfRadioDetailInfo)) {
            return false;
        }
        VhfRadioDetailInfo other = (VhfRadioDetailInfo) object;
        if ((this.vhfRadioDetailInfoPK == null && other.vhfRadioDetailInfoPK != null) || (this.vhfRadioDetailInfoPK != null && !this.vhfRadioDetailInfoPK.equals(other.vhfRadioDetailInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.VhfRadioDetailInfo[ vhfRadioDetailInfoPK=" + vhfRadioDetailInfoPK + " ]";
    }

}
