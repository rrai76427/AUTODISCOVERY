package com.crl.nms.databases;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

/**
 * @author meenuchhindra
 */
@Embeddable
public class NodeNeApplicationDetailsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private int nodeId;
    @Basic(optional = false)
    @Column(name = "NE_NAME")
    private String neName;
    @Basic(optional = false)
    @Column(name = "TEMPLATE_ID")
    private int templateId;
    @Basic(optional = false)
    @Column(name = "APP_NAME")
    private String appName;

    public NodeNeApplicationDetailsPK() {
    }

    public NodeNeApplicationDetailsPK(int nodeId, String neName, int templateId, String appName) {
        this.nodeId = nodeId;
        this.neName = neName;
        this.templateId = templateId;
        this.appName = appName;
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public String getNeName() {
        return neName;
    }

    public void setNeName(String neName) {
        this.neName = neName;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nodeId;
        hash += (neName != null ? neName.hashCode() : 0);
        hash += (int) templateId;
        hash += (appName != null ? appName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NodeNeApplicationDetailsPK)) {
            return false;
        }
        NodeNeApplicationDetailsPK other = (NodeNeApplicationDetailsPK) object;
        if (this.nodeId != other.nodeId) {
            return false;
        }
        if ((this.neName == null && other.neName != null) || (this.neName != null && !this.neName.equals(other.neName))) {
            return false;
        }
        if (this.templateId != other.templateId) {
            return false;
        }
        if ((this.appName == null && other.appName != null) || (this.appName != null && !this.appName.equals(other.appName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.bo.NodeNeApplicationDetailsPK[ nodeId=" + nodeId + ", neName=" + neName + ", templateId=" + templateId + ", appName=" + appName + " ]";
    }

}
