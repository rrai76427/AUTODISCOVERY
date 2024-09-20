package com.crl.nms.databases;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author meenuchhindra
 */
@Entity
@Table(name = "NODE_NE_CONFIG_DETAILS")

public class NodeNeConfigDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NodeNeConfigDetailsPK nodeNeConfigDetailsPK;
    @Column(name = "NE_TYPE")
    private Short neType;
    @Column(name = "NE_IP")
    private String neIp;
    @Column(name = "STATUS")
    private BigInteger status;
    @Column(name = "UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedon;
    @JoinColumn(name = "TEMPLATE_ID", referencedColumnName = "TEMPLATE_ID")
    @ManyToOne(optional = false)
    private NodeNeTemplate templateId;

    public NodeNeConfigDetails() {
    }

    public NodeNeConfigDetails(NodeNeConfigDetailsPK nodeNeConfigDetailsPK) {
        this.nodeNeConfigDetailsPK = nodeNeConfigDetailsPK;
    }

    public NodeNeConfigDetails(int nodeId, String neName) {
        this.nodeNeConfigDetailsPK = new NodeNeConfigDetailsPK(nodeId, neName);
    }

    public NodeNeConfigDetailsPK getNodeNeConfigDetailsPK() {
        return nodeNeConfigDetailsPK;
    }

    public void setNodeNeConfigDetailsPK(NodeNeConfigDetailsPK nodeNeConfigDetailsPK) {
        this.nodeNeConfigDetailsPK = nodeNeConfigDetailsPK;
    }

    public Short getNeType() {
        return neType;
    }

    public void setNeType(Short neType) {
        this.neType = neType;
    }

    public String getNeIp() {
        return neIp;
    }

    public void setNeIp(String neIp) {
        this.neIp = neIp;
    }

    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    public Date getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(Date updatedon) {
        this.updatedon = updatedon;
    }

    public NodeNeTemplate getTemplateId() {
        return templateId;
    }

    public void setTemplateId(NodeNeTemplate templateId) {
        this.templateId = templateId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nodeNeConfigDetailsPK != null ? nodeNeConfigDetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NodeNeConfigDetails)) {
            return false;
        }
        NodeNeConfigDetails other = (NodeNeConfigDetails) object;
        if ((this.nodeNeConfigDetailsPK == null && other.nodeNeConfigDetailsPK != null) || (this.nodeNeConfigDetailsPK != null && !this.nodeNeConfigDetailsPK.equals(other.nodeNeConfigDetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.database.NodeNeConfigDetails[ nodeNeConfigDetailsPK=" + nodeNeConfigDetailsPK + " ]";
    }

}
