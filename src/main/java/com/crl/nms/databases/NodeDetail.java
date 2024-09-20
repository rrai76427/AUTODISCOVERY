package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ashwinimehta
 */
@Entity
@Table(name = "NODE_DETAIL")
@XmlRootElement
@Data
@Builder
@AllArgsConstructor
public class NodeDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NodeDetailPK nodeDetailPK;
    @Basic(optional = false)
    @Column(name = "NMS_IP")
    private String nmsIp;
    @Basic(optional = false)
    @Column(name = "NODE_STATUS")
    private short nodeStatus;
    @Basic(optional = false)
    @Column(name = "LINK_STATUS")
    private short linkStatus;
    @Basic(optional = false)
    @Column(name = "LOCATION")
    private String location;
    @Basic(optional = false)
    @Column(name = "RESERVE_TWO")
    private String reserveTwo;
    @Basic(optional = false)
    @Column(name = "UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;
    @Basic(optional = false)
    @Column(name = "UPDATED_BY")
    private String updatedBy;
    @Column(name = "POLL_INTERVAL")
    private Long pollInterval;
    @JoinColumn(name = "NODE_KEY", referencedColumnName = "NODE_KEY")
    @ManyToOne(optional = false)
    private NodeDefinition nodeKey;

    public NodeDetail() {
    }

    public NodeDetail(NodeDetailPK nodeDetailPK) {
        this.nodeDetailPK = nodeDetailPK;
    }

    public NodeDetail(NodeDetailPK nodeDetailPK, String nmsIp, short nodeStatus, short linkStatus, String location, String reserveTwo, Date updatedOn, String updatedBy) {
        this.nodeDetailPK = nodeDetailPK;
        this.nmsIp = nmsIp;
        this.nodeStatus = nodeStatus;
        this.linkStatus = linkStatus;
        this.location = location;
        this.reserveTwo = reserveTwo;
        this.updatedOn = updatedOn;
        this.updatedBy = updatedBy;
    }

    public NodeDetail(String nodeId, String parentId) {
        this.nodeDetailPK = new NodeDetailPK(nodeId, parentId);
    }

    public NodeDetailPK getNodeDetailPK() {
        return nodeDetailPK;
    }

    public void setNodeDetailPK(NodeDetailPK nodeDetailPK) {
        this.nodeDetailPK = nodeDetailPK;
    }

    public String getNmsIp() {
        return nmsIp;
    }

    public void setNmsIp(String nmsIp) {
        this.nmsIp = nmsIp;
    }

    public short getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(short nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    public short getLinkStatus() {
        return linkStatus;
    }

    public void setLinkStatus(short linkStatus) {
        this.linkStatus = linkStatus;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReserveTwo() {
        return reserveTwo;
    }

    public void setReserveTwo(String reserveTwo) {
        this.reserveTwo = reserveTwo;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Long getPollInterval() {
        return pollInterval;
    }

    public void setPollInterval(Long pollInterval) {
        this.pollInterval = pollInterval;
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
        hash += (nodeDetailPK != null ? nodeDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NodeDetail)) {
            return false;
        }
        NodeDetail other = (NodeDetail) object;
        if ((this.nodeDetailPK == null && other.nodeDetailPK != null) || (this.nodeDetailPK != null && !this.nodeDetailPK.equals(other.nodeDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NodeDetail[ nodeDetailPK=" + nodeDetailPK + " ]";
    }

}
