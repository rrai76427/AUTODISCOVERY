package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Date;

/**
 * @author meenuchhindra
 */
@Entity
@Table(name = "SENSOR_BYTE_MEASUREMENT")
@XmlRootElement

public class SensorByteMeasurement implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SensorByteMeasurementPK sensorByteMeasurementPK;
    @Column(name = "REMOTE_STATION_ID")
    private Short remoteStationId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RADAR_MEASUREMENT_VALUE")
    private Double radarMeasurementValue;
    @Column(name = "UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedon;

    public SensorByteMeasurement() {
    }

    public SensorByteMeasurement(SensorByteMeasurementPK sensorByteMeasurementPK) {
        this.sensorByteMeasurementPK = sensorByteMeasurementPK;
    }

    public SensorByteMeasurement(int nodeId, short reportingSensorId, short radarMeasurementId) {
        this.sensorByteMeasurementPK = new SensorByteMeasurementPK(nodeId, reportingSensorId, radarMeasurementId);
    }

    public SensorByteMeasurementPK getSensorByteMeasurementPK() {
        return sensorByteMeasurementPK;
    }

    public void setSensorByteMeasurementPK(SensorByteMeasurementPK sensorByteMeasurementPK) {
        this.sensorByteMeasurementPK = sensorByteMeasurementPK;
    }

    public Short getRemoteStationId() {
        return remoteStationId;
    }

    public void setRemoteStationId(Short remoteStationId) {
        this.remoteStationId = remoteStationId;
    }

    public Double getRadarMeasurementValue() {
        return radarMeasurementValue;
    }

    public void setRadarMeasurementValue(Double radarMeasurementValue) {
        this.radarMeasurementValue = radarMeasurementValue;
    }

    public Date getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(Date updatedon) {
        this.updatedon = updatedon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sensorByteMeasurementPK != null ? sensorByteMeasurementPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SensorByteMeasurement)) {
            return false;
        }
        SensorByteMeasurement other = (SensorByteMeasurement) object;
        if ((this.sensorByteMeasurementPK == null && other.sensorByteMeasurementPK != null) || (this.sensorByteMeasurementPK != null && !this.sensorByteMeasurementPK.equals(other.sensorByteMeasurementPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nms.crl.bo.SensorByteMeasurement[ sensorByteMeasurementPK=" + sensorByteMeasurementPK + " ]";
    }

}
