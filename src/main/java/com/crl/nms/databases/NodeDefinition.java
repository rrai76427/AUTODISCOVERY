package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 */
@Entity
@Table(name = "NODE_DEFINITION")
@XmlRootElement
@Data
@Builder

@AllArgsConstructor

public class NodeDefinition implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "LEVEL_ID")
    private short levelId;
    @Column(name = "TYPE")
    private String type;
    @Basic(optional = false)
    @Column(name = "UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;
    @Basic(optional = false)
    @Column(name = "UPDATED_BY")
    private String updatedBy;
    @Id
    @Basic(optional = false)
    @Column(name = "NODE_KEY")
    private Integer nodeKey;
    @Basic(optional = false)
    @Column(name = "NMS_FLAG")
    private short nmsFlag;

    public NodeDefinition() {
    }

    public NodeDefinition(Integer nodeKey) {
        this.nodeKey = nodeKey;
    }

    public NodeDefinition(Integer nodeKey, String description, short levelId, Date updatedOn, String updatedBy, short nmsFlag) {
        this.nodeKey = nodeKey;
        this.description = description;
        this.levelId = levelId;
        this.updatedOn = updatedOn;
        this.updatedBy = updatedBy;
        this.nmsFlag = nmsFlag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getLevelId() {
        return levelId;
    }

    public void setLevelId(short levelId) {
        this.levelId = levelId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Integer getNodeKey() {
        return nodeKey;
    }

    public void setNodeKey(Integer nodeKey) {
        this.nodeKey = nodeKey;
    }

    public short getNmsFlag() {
        return nmsFlag;
    }

    public void setNmsFlag(short nmsFlag) {
        this.nmsFlag = nmsFlag;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nodeKey != null ? nodeKey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NodeDefinition)) {
            return false;
        }
        NodeDefinition other = (NodeDefinition) object;
        if ((this.nodeKey == null && other.nodeKey != null) || (this.nodeKey != null && !this.nodeKey.equals(other.nodeKey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.NodeDefinition[ nodeKey=" + nodeKey + " ]";
    }

}
