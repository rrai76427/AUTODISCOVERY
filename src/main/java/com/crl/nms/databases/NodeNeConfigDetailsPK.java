package com.crl.nms.databases;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * @author meenuchhindra
 */
@Embeddable
public class NodeNeConfigDetailsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private int nodeId;
    @Basic(optional = false)
    @Column(name = "NE_NAME")
    private String neName;

    public NodeNeConfigDetailsPK() {
    }

    public NodeNeConfigDetailsPK(int nodeId, String neName) {
        this.nodeId = nodeId;
        this.neName = neName;
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public String getNeName() {
        return neName;
    }

    public void setNeName(String neName) {
        this.neName = neName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nodeId;
        hash += (neName != null ? neName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NodeNeConfigDetailsPK)) {
            return false;
        }
        NodeNeConfigDetailsPK other = (NodeNeConfigDetailsPK) object;
        if (this.nodeId != other.nodeId) {
            return false;
        }
        if ((this.neName == null && other.neName != null) || (this.neName != null && !this.neName.equals(other.neName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.database.NodeNeConfigDetailsPK[ nodeId=" + nodeId + ", neName=" + neName + " ]";
    }

}
