/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ashwinimehta
 */
@Entity
@Table(name = "LINK_COM_PORT_DETAIL")
@XmlRootElement
public class LinkComPortDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LinkComPortDetailPK linkComPortDetailPK;
    @Column(name = "UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedon;
    @JoinColumn(name = "NODE_ID", referencedColumnName = "NODE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private LinkConfigurationData linkConfigurationData;

    public LinkComPortDetail() {
    }

    public LinkComPortDetail(LinkComPortDetailPK linkComPortDetailPK) {
        this.linkComPortDetailPK = linkComPortDetailPK;
    }

    public LinkComPortDetail(String nodeId, short comPort) {
        this.linkComPortDetailPK = new LinkComPortDetailPK(nodeId, comPort);
    }

    public LinkComPortDetailPK getLinkComPortDetailPK() {
        return linkComPortDetailPK;
    }

    public void setLinkComPortDetailPK(LinkComPortDetailPK linkComPortDetailPK) {
        this.linkComPortDetailPK = linkComPortDetailPK;
    }

    public Date getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(Date updatedon) {
        this.updatedon = updatedon;
    }

    public LinkConfigurationData getLinkConfigurationData() {
        return linkConfigurationData;
    }

    public void setLinkConfigurationData(LinkConfigurationData linkConfigurationData) {
        this.linkConfigurationData = linkConfigurationData;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (linkComPortDetailPK != null ? linkComPortDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LinkComPortDetail)) {
            return false;
        }
        LinkComPortDetail other = (LinkComPortDetail) object;
        if ((this.linkComPortDetailPK == null && other.linkComPortDetailPK != null) || (this.linkComPortDetailPK != null && !this.linkComPortDetailPK.equals(other.linkComPortDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.LinkComPortDetail[ linkComPortDetailPK=" + linkComPortDetailPK + " ]";
    }

}
