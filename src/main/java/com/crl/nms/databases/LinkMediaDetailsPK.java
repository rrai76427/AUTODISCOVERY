package com.crl.nms.databases;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * @author ashwinimehta
 */
@Embeddable
public class LinkMediaDetailsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;
    @Basic(optional = false)
    @Column(name = "DEST_NODE_ID")
    private String destNodeId;

    public LinkMediaDetailsPK() {
    }

    public LinkMediaDetailsPK(String nodeId, String destNodeId) {
        this.nodeId = nodeId;
        this.destNodeId = destNodeId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getDestNodeId() {
        return destNodeId;
    }

    public void setDestNodeId(String destNodeId) {
        this.destNodeId = destNodeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nodeId != null ? nodeId.hashCode() : 0);
        hash += (destNodeId != null ? destNodeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LinkMediaDetailsPK)) {
            return false;
        }
        LinkMediaDetailsPK other = (LinkMediaDetailsPK) object;
        if ((this.nodeId == null && other.nodeId != null) || (this.nodeId != null && !this.nodeId.equals(other.nodeId))) {
            return false;
        }
        if ((this.destNodeId == null && other.destNodeId != null) || (this.destNodeId != null && !this.destNodeId.equals(other.destNodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.LinkMediaDetailsPK[ nodeId=" + nodeId + ", destNodeId=" + destNodeId + " ]";
    }

}
