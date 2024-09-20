package com.crl.nms.databases;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * @author meenuchhindra
 */
@Embeddable
public class SensorByteMeasurementPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private int nodeId;
    @Basic(optional = false)
    @Column(name = "REPORTING_SENSOR_ID")
    private short reportingSensorId;
    @Basic(optional = false)
    @Column(name = "RADAR_MEASUREMENT_ID")
    private short radarMeasurementId;

    public SensorByteMeasurementPK() {
    }

    public SensorByteMeasurementPK(int nodeId, short reportingSensorId, short radarMeasurementId) {
        this.nodeId = nodeId;
        this.reportingSensorId = reportingSensorId;
        this.radarMeasurementId = radarMeasurementId;
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public short getReportingSensorId() {
        return reportingSensorId;
    }

    public void setReportingSensorId(short reportingSensorId) {
        this.reportingSensorId = reportingSensorId;
    }

    public short getRadarMeasurementId() {
        return radarMeasurementId;
    }

    public void setRadarMeasurementId(short radarMeasurementId) {
        this.radarMeasurementId = radarMeasurementId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nodeId;
        hash += (int) reportingSensorId;
        hash += (int) radarMeasurementId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SensorByteMeasurementPK)) {
            return false;
        }
        SensorByteMeasurementPK other = (SensorByteMeasurementPK) object;
        if (this.nodeId != other.nodeId) {
            return false;
        }
        if (this.reportingSensorId != other.reportingSensorId) {
            return false;
        }
        if (this.radarMeasurementId != other.radarMeasurementId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nms.crl.bo.SensorByteMeasurementPK[ nodeId=" + nodeId + ", reportingSensorId=" + reportingSensorId + ", radarMeasurementId=" + radarMeasurementId + " ]";
    }

}
