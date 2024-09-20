package com.crl.nms.databases;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * @author Administrator
 */
@Embeddable
public class NmsVsatPortMonitoringHistoryPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private int nodeId;
    @Basic(optional = false)
    @Column(name = "PARENT_NODE_ID")
    private int parentNodeId;

    public NmsVsatPortMonitoringHistoryPK() {
    }

    public NmsVsatPortMonitoringHistoryPK(int nodeId, int parentNodeId) {
        this.nodeId = nodeId;
        this.parentNodeId = parentNodeId;
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public int getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(int parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nodeId;
        hash += (int) parentNodeId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsVsatPortMonitoringHistoryPK)) {
            return false;
        }
        NmsVsatPortMonitoringHistoryPK other = (NmsVsatPortMonitoringHistoryPK) object;
        if (this.nodeId != other.nodeId) {
            return false;
        }
        if (this.parentNodeId != other.parentNodeId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.bo.NmsVsatPortMonitoringHistoryPK[ nodeId=" + nodeId + ", parentNodeId=" + parentNodeId + " ]";
    }

}
