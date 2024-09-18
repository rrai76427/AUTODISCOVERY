package  com.crl.nms.databases;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "SENSOR_INFO")
@XmlRootElement

public class SensorInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SENSOR_TYPE")
    private Short sensorType;
    @Column(name = "SENSOR_NAME")
    private String sensorName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sensorType")
    private List<SensorDeployment> sensorDeploymentList;

    public SensorInfo() {
    }

    public SensorInfo(Short sensorType) {
        this.sensorType = sensorType;
    }

    public Short getSensorType() {
        return sensorType;
    }

    public void setSensorType(Short sensorType) {
        this.sensorType = sensorType;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    @XmlTransient
    public List<SensorDeployment> getSensorDeploymentList() {
        return sensorDeploymentList;
    }

    public void setSensorDeploymentList(List<SensorDeployment> sensorDeploymentList) {
        this.sensorDeploymentList = sensorDeploymentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sensorType != null ? sensorType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SensorInfo)) {
            return false;
        }
        SensorInfo other = (SensorInfo) object;
        if ((this.sensorType == null && other.sensorType != null) || (this.sensorType != null && !this.sensorType.equals(other.sensorType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.SensorInfo[ sensorType=" + sensorType + " ]";
    }
    
}
