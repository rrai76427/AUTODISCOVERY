package  com.crl.nms.databases;
import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Builder;

/**
 *
 * @author ashwinimehta
 */
@Embeddable
@Builder
public class NmsLevelPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private int nodeId;
    @Basic(optional = false)
    @Column(name = "NMS_IP")
    private String nmsIp;

    public NmsLevelPK() {
    }

    public NmsLevelPK(int nodeId, String nmsIp) {
        this.nodeId = nodeId;
        this.nmsIp = nmsIp;
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public String getNmsIp() {
        return nmsIp;
    }

    public void setNmsIp(String nmsIp) {
        this.nmsIp = nmsIp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nodeId;
        hash += (nmsIp != null ? nmsIp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsLevelPK)) {
            return false;
        }
        NmsLevelPK other = (NmsLevelPK) object;
        if (this.nodeId != other.nodeId) {
            return false;
        }
        if ((this.nmsIp == null && other.nmsIp != null) || (this.nmsIp != null && !this.nmsIp.equals(other.nmsIp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NmsLevelPK[ nodeId=" + nodeId + ", nmsIp=" + nmsIp + " ]";
    }
    
}
