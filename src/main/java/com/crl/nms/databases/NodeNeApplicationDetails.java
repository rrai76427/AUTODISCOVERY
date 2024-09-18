package  com.crl.nms.databases;
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

/**
 *
 * @author meenuchhindra
 */
@Entity
@Table(name = "NODE_NE_APPLICATION_DETAILS")
public class NodeNeApplicationDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NodeNeApplicationDetailsPK nodeNeApplicationDetailsPK;
    @Column(name = "UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedon;
    @JoinColumns({
        @JoinColumn(name = "TEMPLATE_ID", referencedColumnName = "TEMPLATE_ID", insertable = false, updatable = false),
        @JoinColumn(name = "APP_NAME", referencedColumnName = "APP_NAME", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private NodeNeApplicationTemplate nodeNeApplicationTemplate;

    public NodeNeApplicationDetails() {
    }

    public NodeNeApplicationDetails(NodeNeApplicationDetailsPK nodeNeApplicationDetailsPK) {
        this.nodeNeApplicationDetailsPK = nodeNeApplicationDetailsPK;
    }

    public NodeNeApplicationDetails(int nodeId, String neName, int templateId, String appName) {
        this.nodeNeApplicationDetailsPK = new NodeNeApplicationDetailsPK(nodeId, neName, templateId, appName);
    }

    public NodeNeApplicationDetailsPK getNodeNeApplicationDetailsPK() {
        return nodeNeApplicationDetailsPK;
    }

    public void setNodeNeApplicationDetailsPK(NodeNeApplicationDetailsPK nodeNeApplicationDetailsPK) {
        this.nodeNeApplicationDetailsPK = nodeNeApplicationDetailsPK;
    }

    public Date getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(Date updatedon) {
        this.updatedon = updatedon;
    }

    public NodeNeApplicationTemplate getNodeNeApplicationTemplate() {
        return nodeNeApplicationTemplate;
    }

    public void setNodeNeApplicationTemplate(NodeNeApplicationTemplate nodeNeApplicationTemplate) {
        this.nodeNeApplicationTemplate = nodeNeApplicationTemplate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nodeNeApplicationDetailsPK != null ? nodeNeApplicationDetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NodeNeApplicationDetails)) {
            return false;
        }
        NodeNeApplicationDetails other = (NodeNeApplicationDetails) object;
        if ((this.nodeNeApplicationDetailsPK == null && other.nodeNeApplicationDetailsPK != null) || (this.nodeNeApplicationDetailsPK != null && !this.nodeNeApplicationDetailsPK.equals(other.nodeNeApplicationDetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.bo.NodeNeApplicationDetails[ nodeNeApplicationDetailsPK=" + nodeNeApplicationDetailsPK + " ]";
    }
    
}
