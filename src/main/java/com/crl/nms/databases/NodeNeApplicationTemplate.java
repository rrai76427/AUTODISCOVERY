package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * @author meenuchhindra
 */
@Entity
@Table(name = "NODE_NE_APPLICATION_TEMPLATE")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "NodeNeApplicationTemplate.findAll", query = "SELECT n FROM NodeNeApplicationTemplate n"),
        @NamedQuery(name = "NodeNeApplicationTemplate.findByTemplateId", query = "SELECT n FROM NodeNeApplicationTemplate n WHERE n.nodeNeApplicationTemplatePK.templateId = :templateId"),
        @NamedQuery(name = "NodeNeApplicationTemplate.findByAppName", query = "SELECT n FROM NodeNeApplicationTemplate n WHERE n.nodeNeApplicationTemplatePK.appName = :appName"),
        @NamedQuery(name = "NodeNeApplicationTemplate.findByAppPath", query = "SELECT n FROM NodeNeApplicationTemplate n WHERE n.appPath = :appPath"),
        @NamedQuery(name = "NodeNeApplicationTemplate.findByUpdatedOn", query = "SELECT n FROM NodeNeApplicationTemplate n WHERE n.updatedOn = :updatedOn"),
        @NamedQuery(name = "NodeNeApplicationTemplate.findByTemplateName", query = "SELECT n FROM NodeNeApplicationTemplate n WHERE n.templateName = :templateName")})
public class NodeNeApplicationTemplate implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NodeNeApplicationTemplatePK nodeNeApplicationTemplatePK;
    @Column(name = "APP_PATH")
    private String appPath;
    @Column(name = "UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;
    @Basic(optional = false)
    @Column(name = "TEMPLATE_NAME")
    private String templateName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nodeNeApplicationTemplate")
    private Collection<NodeNeApplicationDetails> nodeNeApplicationDetailsCollection;

    public NodeNeApplicationTemplate() {
    }

    public NodeNeApplicationTemplate(NodeNeApplicationTemplatePK nodeNeApplicationTemplatePK) {
        this.nodeNeApplicationTemplatePK = nodeNeApplicationTemplatePK;
    }

    public NodeNeApplicationTemplate(NodeNeApplicationTemplatePK nodeNeApplicationTemplatePK, String templateName) {
        this.nodeNeApplicationTemplatePK = nodeNeApplicationTemplatePK;
        this.templateName = templateName;
    }

    public NodeNeApplicationTemplate(int templateId, String appName) {
        this.nodeNeApplicationTemplatePK = new NodeNeApplicationTemplatePK(templateId, appName);
    }

    public NodeNeApplicationTemplatePK getNodeNeApplicationTemplatePK() {
        return nodeNeApplicationTemplatePK;
    }

    public void setNodeNeApplicationTemplatePK(NodeNeApplicationTemplatePK nodeNeApplicationTemplatePK) {
        this.nodeNeApplicationTemplatePK = nodeNeApplicationTemplatePK;
    }

    public String getAppPath() {
        return appPath;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    @XmlTransient
    public Collection<NodeNeApplicationDetails> getNodeNeApplicationDetailsCollection() {
        return nodeNeApplicationDetailsCollection;
    }

    public void setNodeNeApplicationDetailsCollection(Collection<NodeNeApplicationDetails> nodeNeApplicationDetailsCollection) {
        this.nodeNeApplicationDetailsCollection = nodeNeApplicationDetailsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nodeNeApplicationTemplatePK != null ? nodeNeApplicationTemplatePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NodeNeApplicationTemplate)) {
            return false;
        }
        NodeNeApplicationTemplate other = (NodeNeApplicationTemplate) object;
        if ((this.nodeNeApplicationTemplatePK == null && other.nodeNeApplicationTemplatePK != null) || (this.nodeNeApplicationTemplatePK != null && !this.nodeNeApplicationTemplatePK.equals(other.nodeNeApplicationTemplatePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.bo.NodeNeApplicationTemplate[ nodeNeApplicationTemplatePK=" + nodeNeApplicationTemplatePK + " ]";
    }

}
