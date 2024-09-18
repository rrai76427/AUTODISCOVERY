package  com.crl.nms.databases;
import java.io.Serializable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_LEVEL")
@Data
@AllArgsConstructor
@Builder
public class NmsLevel implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NmsLevelPK nmsLevelPK;
    @Basic(optional = false)
    @Column(name = "NODE_TYPE")
    private short nodeType;
    @JoinColumn(name = "NODE_KEY", referencedColumnName = "NODE_KEY")
    @ManyToOne
    private NodeDefinition nodeKey;

    public NmsLevel() {
    }

    public NmsLevel(NmsLevelPK nmsLevelPK) {
        this.nmsLevelPK = nmsLevelPK;
    }

    public NmsLevel(NmsLevelPK nmsLevelPK, short nodeType) {
        this.nmsLevelPK = nmsLevelPK;
        this.nodeType = nodeType;
    }

    public NmsLevel(int nodeId, String nmsIp) {
        this.nmsLevelPK = new NmsLevelPK(nodeId, nmsIp);
    }

    public NmsLevelPK getNmsLevelPK() {
        return nmsLevelPK;
    }

    public void setNmsLevelPK(NmsLevelPK nmsLevelPK) {
        this.nmsLevelPK = nmsLevelPK;
    }

    public short getNodeType() {
        return nodeType;
    }

    public void setNodeType(short nodeType) {
        this.nodeType = nodeType;
    }

    public NodeDefinition getNodeKey() {
        return nodeKey;
    }

    public void setNodeKey(NodeDefinition nodeKey) {
        this.nodeKey = nodeKey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nmsLevelPK != null ? nmsLevelPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsLevel)) {
            return false;
        }
        NmsLevel other = (NmsLevel) object;
        if ((this.nmsLevelPK == null && other.nmsLevelPK != null) || (this.nmsLevelPK != null && !this.nmsLevelPK.equals(other.nmsLevelPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NmsLevel[ nmsLevelPK=" + nmsLevelPK + " ]";
    }
    
}
