package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

/**
 * @author meenuchhindra
 */
@Entity
@Table(name = "SENSOR_DEPLOYMENT")
@XmlRootElement

public class SensorDeployment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SENSOR_ID")
    private Integer sensorId;
    @Column(name = "SENSOR_LOCATION")
    private String sensorLocation;
    @Column(name = "SENSOR_LOC_CODE")
    private String sensorLocCode;
    @Column(name = "RESERVE1")
    private Short reserve1;
    @Column(name = "SENSOR_LAT")
    private String sensorLat;
    @Column(name = "SENSOR_LAT_DIR")
    private String sensorLatDir;
    @Column(name = "SENSOR_LONGITUDE")
    private String sensorLongitude;
    @Column(name = "SENSOR_LONG_DIR")
    private String sensorLongDir;
    @Column(name = "SENSOR_PARENT_NODE_ID")
    private Integer sensorParentNodeId;
    @JoinColumn(name = "SENSOR_TYPE", referencedColumnName = "SENSOR_TYPE")
    @ManyToOne(optional = false)
    private SensorInfo sensorType;

    public SensorDeployment() {
    }

    public SensorDeployment(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorLocation() {
        return sensorLocation;
    }

    public void setSensorLocation(String sensorLocation) {
        this.sensorLocation = sensorLocation;
    }

    public String getSensorLocCode() {
        return sensorLocCode;
    }

    public void setSensorLocCode(String sensorLocCode) {
        this.sensorLocCode = sensorLocCode;
    }

    public Short getReserve1() {
        return reserve1;
    }

    public void setReserve1(Short reserve1) {
        this.reserve1 = reserve1;
    }

    public String getSensorLat() {
        return sensorLat;
    }

    public void setSensorLat(String sensorLat) {
        this.sensorLat = sensorLat;
    }

    public String getSensorLatDir() {
        return sensorLatDir;
    }

    public void setSensorLatDir(String sensorLatDir) {
        this.sensorLatDir = sensorLatDir;
    }

    public String getSensorLongitude() {
        return sensorLongitude;
    }

    public void setSensorLongitude(String sensorLongitude) {
        this.sensorLongitude = sensorLongitude;
    }

    public String getSensorLongDir() {
        return sensorLongDir;
    }

    public void setSensorLongDir(String sensorLongDir) {
        this.sensorLongDir = sensorLongDir;
    }

    public Integer getSensorParentNodeId() {
        return sensorParentNodeId;
    }

    public void setSensorParentNodeId(Integer sensorParentNodeId) {
        this.sensorParentNodeId = sensorParentNodeId;
    }

    public SensorInfo getSensorType() {
        return sensorType;
    }

    public void setSensorType(SensorInfo sensorType) {
        this.sensorType = sensorType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sensorId != null ? sensorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SensorDeployment)) {
            return false;
        }
        SensorDeployment other = (SensorDeployment) object;
        if ((this.sensorId == null && other.sensorId != null) || (this.sensorId != null && !this.sensorId.equals(other.sensorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nms.crl.bo.SensorDeployment[ sensorId=" + sensorId + " ]";
    }

}
