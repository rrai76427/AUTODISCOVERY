package  com.crl.nms.databases;
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NODE_HEALTH")
@XmlRootElement

public class NodeHealth implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private Integer nodeId;
    @Column(name = "NODE_HEALTH")
    private Short nodeHealth;
    @Column(name = "UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedon;
    @JoinColumn(name = "NODE_ID", referencedColumnName = "NODE_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private OrbatDetails orbatDetails;
    @JoinColumn(name = "NODE_ID", referencedColumnName = "SENSOR_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private SensorDeployment sensorDeployment;

    public NodeHealth() {
    }

    public NodeHealth(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public Short getNodeHealth() {
        return nodeHealth;
    }

    public void setNodeHealth(Short nodeHealth) {
        this.nodeHealth = nodeHealth;
    }

    public Date getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(Date updatedon) {
        this.updatedon = updatedon;
    }

    public OrbatDetails getOrbatDetails() {
        return orbatDetails;
    }

    public void setOrbatDetails(OrbatDetails orbatDetails) {
        this.orbatDetails = orbatDetails;
    }

    public SensorDeployment getSensorDeployment() {
        return sensorDeployment;
    }

    public void setSensorDeployment(SensorDeployment sensorDeployment) {
        this.sensorDeployment = sensorDeployment;
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
        if (!(object instanceof NodeHealth)) {
            return false;
        }
        NodeHealth other = (NodeHealth) object;
        if ((this.nodeId == null && other.nodeId != null) || (this.nodeId != null && !this.nodeId.equals(other.nodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NodeHealth[ nodeId=" + nodeId + " ]";
    }
    
}
