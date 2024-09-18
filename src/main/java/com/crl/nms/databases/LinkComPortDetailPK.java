/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  com.crl.nms.databases;
import java.io.Serializable;

import jakarta.persistence.*;

/**
 *
 * @author ashwinimehta
 */
@Embeddable
public class LinkComPortDetailPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;
    @Basic(optional = false)
    @Column(name = "COM_PORT")
    private short comPort;

    public LinkComPortDetailPK() {
    }

    public LinkComPortDetailPK(String nodeId, short comPort) {
        this.nodeId = nodeId;
        this.comPort = comPort;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public short getComPort() {
        return comPort;
    }

    public void setComPort(short comPort) {
        this.comPort = comPort;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nodeId != null ? nodeId.hashCode() : 0);
        hash += (int) comPort;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LinkComPortDetailPK)) {
            return false;
        }
        LinkComPortDetailPK other = (LinkComPortDetailPK) object;
        if ((this.nodeId == null && other.nodeId != null) || (this.nodeId != null && !this.nodeId.equals(other.nodeId))) {
            return false;
        }
        if (this.comPort != other.comPort) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.LinkComPortDetailPK[ nodeId=" + nodeId + ", comPort=" + comPort + " ]";
    }
    
}
