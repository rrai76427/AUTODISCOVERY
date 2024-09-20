package com.crl.nms.databases;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * @author meenuchhindra
 */
@Embeddable
public class RadarErrorWarningPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private int nodeId;
    @Basic(optional = false)
    @Column(name = "REMOTE_STATION_ID")
    private short remoteStationId;

    public RadarErrorWarningPK() {
    }

    public RadarErrorWarningPK(int nodeId, short remoteStationId) {
        this.nodeId = nodeId;
        this.remoteStationId = remoteStationId;
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public short getRemoteStationId() {
        return remoteStationId;
    }

    public void setRemoteStationId(short remoteStationId) {
        this.remoteStationId = remoteStationId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nodeId;
        hash += (int) remoteStationId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RadarErrorWarningPK)) {
            return false;
        }
        RadarErrorWarningPK other = (RadarErrorWarningPK) object;
        if (this.nodeId != other.nodeId) {
            return false;
        }
        if (this.remoteStationId != other.remoteStationId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nms.crl.bo.RadarErrorWarningPK[ nodeId=" + nodeId + ", remoteStationId=" + remoteStationId + " ]";
    }

}
