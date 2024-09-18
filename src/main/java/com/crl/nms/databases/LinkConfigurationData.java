/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  com.crl.nms.databases;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "LINK_CONFIGURATION_DATA")
@XmlRootElement
public class LinkConfigurationData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;
    @Column(name = "NODE_TYPE")
    private Short nodeType;
    @Column(name = "SELF_IP_VSAT")
    private String selfIpVsat;
    @Column(name = "SELF_IP_ADN")
    private String selfIpAdn;
    @Column(name = "SELP_IP_RADIO1")
    private String selpIpRadio1;
    @Column(name = "SELP_IP_RADIO2")
    private String selpIpRadio2;
    @Column(name = "SELP_IP_RADIO3")
    private String selpIpRadio3;
    @Column(name = "UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedon;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "linkConfigurationData")
    private List<LinkComPortDetail> linkComPortDetailList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "linkConfigurationData")
    private List<LinkMediaDetails> linkMediaDetailsList;

    public LinkConfigurationData() {
    }

    public LinkConfigurationData(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Short getNodeType() {
        return nodeType;
    }

    public void setNodeType(Short nodeType) {
        this.nodeType = nodeType;
    }

    public String getSelfIpVsat() {
        return selfIpVsat;
    }

    public void setSelfIpVsat(String selfIpVsat) {
        this.selfIpVsat = selfIpVsat;
    }

    public String getSelfIpAdn() {
        return selfIpAdn;
    }

    public void setSelfIpAdn(String selfIpAdn) {
        this.selfIpAdn = selfIpAdn;
    }

    public String getSelpIpRadio1() {
        return selpIpRadio1;
    }

    public void setSelpIpRadio1(String selpIpRadio1) {
        this.selpIpRadio1 = selpIpRadio1;
    }

    public String getSelpIpRadio2() {
        return selpIpRadio2;
    }

    public void setSelpIpRadio2(String selpIpRadio2) {
        this.selpIpRadio2 = selpIpRadio2;
    }

    public String getSelpIpRadio3() {
        return selpIpRadio3;
    }

    public void setSelpIpRadio3(String selpIpRadio3) {
        this.selpIpRadio3 = selpIpRadio3;
    }

    public Date getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(Date updatedon) {
        this.updatedon = updatedon;
    }

    @XmlTransient
    public List<LinkComPortDetail> getLinkComPortDetailList() {
        return linkComPortDetailList;
    }

    public void setLinkComPortDetailList(List<LinkComPortDetail> linkComPortDetailList) {
        this.linkComPortDetailList = linkComPortDetailList;
    }

    @XmlTransient
    public List<LinkMediaDetails> getLinkMediaDetailsList() {
        return linkMediaDetailsList;
    }

    public void setLinkMediaDetailsList(List<LinkMediaDetails> linkMediaDetailsList) {
        this.linkMediaDetailsList = linkMediaDetailsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nodeId != null ? nodeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LinkConfigurationData)) {
            return false;
        }
        LinkConfigurationData other = (LinkConfigurationData) object;
        if ((this.nodeId == null && other.nodeId != null) || (this.nodeId != null && !this.nodeId.equals(other.nodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.LinkConfigurationData[ nodeId=" + nodeId + " ]";
    }
    
}
