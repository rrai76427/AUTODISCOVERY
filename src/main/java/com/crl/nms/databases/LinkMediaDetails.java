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
@Table(name = "LINK_MEDIA_DETAILS")
@XmlRootElement
public class LinkMediaDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LinkMediaDetailsPK linkMediaDetailsPK;
    @Column(name = "NODE_TYPE")
    private Short nodeType;
    @Column(name = "PRIM_MEDIA_TYPE")
    private Short primMediaType;
    @Column(name = "PRIM_MEDIA_IP")
    private String primMediaIp;
    @Column(name = "SEC_MEDIA_TYPE")
    private Short secMediaType;
    @Column(name = "SEC_MEDIA_IP")
    private String secMediaIp;
    @Column(name = "PRIM_MEDIA_PORT")
    private Short primMediaPort;
    @Column(name = "SEC_MEDIA_PORT")
    private Short secMediaPort;
    @Column(name = "DEST_NODE_TYPE")
    private Short destNodeType;
    @Column(name = "UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedon;
    @Column(name = "PRIMARY_LINK_STATUS")
    private Short primaryLinkStatus;
    @Column(name = "PRIMARY_LINK_QUALITY")
    private Short primaryLinkQuality;
    @Column(name = "SECONDARY_LINK_STATUS")
    private Short secondaryLinkStatus;
    @Column(name = "SECONDARY_LINK_QUALITY")
    private Short secondaryLinkQuality;
    @JoinColumn(name = "NODE_ID", referencedColumnName = "NODE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private LinkConfigurationData linkConfigurationData;

    public LinkMediaDetails() {
    }

    public LinkMediaDetails(LinkMediaDetailsPK linkMediaDetailsPK) {
        this.linkMediaDetailsPK = linkMediaDetailsPK;
    }

    public LinkMediaDetails(String nodeId, String destNodeId) {
        this.linkMediaDetailsPK = new LinkMediaDetailsPK(nodeId, destNodeId);
    }

    public LinkMediaDetailsPK getLinkMediaDetailsPK() {
        return linkMediaDetailsPK;
    }

    public void setLinkMediaDetailsPK(LinkMediaDetailsPK linkMediaDetailsPK) {
        this.linkMediaDetailsPK = linkMediaDetailsPK;
    }

    public Short getNodeType() {
        return nodeType;
    }

    public void setNodeType(Short nodeType) {
        this.nodeType = nodeType;
    }

    public Short getPrimMediaType() {
        return primMediaType;
    }

    public void setPrimMediaType(Short primMediaType) {
        this.primMediaType = primMediaType;
    }

    public String getPrimMediaIp() {
        return primMediaIp;
    }

    public void setPrimMediaIp(String primMediaIp) {
        this.primMediaIp = primMediaIp;
    }

    public Short getSecMediaType() {
        return secMediaType;
    }

    public void setSecMediaType(Short secMediaType) {
        this.secMediaType = secMediaType;
    }

    public String getSecMediaIp() {
        return secMediaIp;
    }

    public void setSecMediaIp(String secMediaIp) {
        this.secMediaIp = secMediaIp;
    }

    public Short getPrimMediaPort() {
        return primMediaPort;
    }

    public void setPrimMediaPort(Short primMediaPort) {
        this.primMediaPort = primMediaPort;
    }

    public Short getSecMediaPort() {
        return secMediaPort;
    }

    public void setSecMediaPort(Short secMediaPort) {
        this.secMediaPort = secMediaPort;
    }

    public Short getDestNodeType() {
        return destNodeType;
    }

    public void setDestNodeType(Short destNodeType) {
        this.destNodeType = destNodeType;
    }

    public Date getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(Date updatedon) {
        this.updatedon = updatedon;
    }

    public Short getPrimaryLinkStatus() {
        return primaryLinkStatus;
    }

    public void setPrimaryLinkStatus(Short primaryLinkStatus) {
        this.primaryLinkStatus = primaryLinkStatus;
    }

    public Short getPrimaryLinkQuality() {
        return primaryLinkQuality;
    }

    public void setPrimaryLinkQuality(Short primaryLinkQuality) {
        this.primaryLinkQuality = primaryLinkQuality;
    }

    public Short getSecondaryLinkStatus() {
        return secondaryLinkStatus;
    }

    public void setSecondaryLinkStatus(Short secondaryLinkStatus) {
        this.secondaryLinkStatus = secondaryLinkStatus;
    }

    public Short getSecondaryLinkQuality() {
        return secondaryLinkQuality;
    }

    public void setSecondaryLinkQuality(Short secondaryLinkQuality) {
        this.secondaryLinkQuality = secondaryLinkQuality;
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
        hash += (linkMediaDetailsPK != null ? linkMediaDetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LinkMediaDetails)) {
            return false;
        }
        LinkMediaDetails other = (LinkMediaDetails) object;
        if ((this.linkMediaDetailsPK == null && other.linkMediaDetailsPK != null) || (this.linkMediaDetailsPK != null && !this.linkMediaDetailsPK.equals(other.linkMediaDetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.LinkMediaDetails[ linkMediaDetailsPK=" + linkMediaDetailsPK + " ]";
    }

}
