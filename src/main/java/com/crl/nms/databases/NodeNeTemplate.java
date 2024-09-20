package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlTransient;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * @author meenuchhindra
 */
@Entity
@Table(name = "NODE_NE_TEMPLATE")

public class NodeNeTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NODE_NE_TEMPLATE_ID_SEQ_NO")
    @SequenceGenerator(sequenceName = "NODE_NE_TEMPLATE_ID_SEQ_NO", initialValue = 1, allocationSize = 1, name = "NODE_NE_TEMPLATE_ID_SEQ_NO")
    @Id
    @Basic(optional = false)
    @Column(name = "TEMPLATE_ID")
    private Integer templateId;
    @Basic(optional = false)
    @Column(name = "TEMPLATE_NAME")
    private String templateName;
    @Column(name = "CPU_THRESHOLD")
    private String cpuThreshold;
    @Column(name = "RAM_THRESHOLD")
    private String ramThreshold;
    @Column(name = "HDD_THRESHOLD")
    private String hddThreshold;
    @Column(name = "UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "templateId")
    private Collection<NodeNeConfigDetails> nodeNeConfigDetailsCollection;

    public NodeNeTemplate() {
    }

    public NodeNeTemplate(Integer templateId) {
        this.templateId = templateId;
    }

    public NodeNeTemplate(Integer templateId, String templateName) {
        this.templateId = templateId;
        this.templateName = templateName;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getCpuThreshold() {
        return cpuThreshold;
    }

    public void setCpuThreshold(String cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
    }

    public String getRamThreshold() {
        return ramThreshold;
    }

    public void setRamThreshold(String ramThreshold) {
        this.ramThreshold = ramThreshold;
    }

    public String getHddThreshold() {
        return hddThreshold;
    }

    public void setHddThreshold(String hddThreshold) {
        this.hddThreshold = hddThreshold;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @XmlTransient
    public Collection<NodeNeConfigDetails> getNodeNeConfigDetailsCollection() {
        return nodeNeConfigDetailsCollection;
    }

    public void setNodeNeConfigDetailsCollection(Collection<NodeNeConfigDetails> nodeNeConfigDetailsCollection) {
        this.nodeNeConfigDetailsCollection = nodeNeConfigDetailsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (templateId != null ? templateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NodeNeTemplate)) {
            return false;
        }
        NodeNeTemplate other = (NodeNeTemplate) object;
        if ((this.templateId == null && other.templateId != null) || (this.templateId != null && !this.templateId.equals(other.templateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.bo.NodeNeTemplate[ templateId=" + templateId + " ]";
    }

}
