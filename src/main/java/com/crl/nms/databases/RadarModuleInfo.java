package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author meenuchhindra
 */
@Entity
@Table(name = "RADAR_MODULE_INFO")
@XmlRootElement

public class RadarModuleInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MODULE_ID")
    private Short moduleId;
    @Column(name = "MODULE_NAME")
    private String moduleName;
    @OneToMany(mappedBy = "radarModuleId")
    private Collection<RadarErrorWarning> radarErrorWarningCollection;

    public RadarModuleInfo() {
    }

    public RadarModuleInfo(Short moduleId) {
        this.moduleId = moduleId;
    }

    public Short getModuleId() {
        return moduleId;
    }

    public void setModuleId(Short moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @XmlTransient
    public Collection<RadarErrorWarning> getRadarErrorWarningCollection() {
        return radarErrorWarningCollection;
    }

    public void setRadarErrorWarningCollection(Collection<RadarErrorWarning> radarErrorWarningCollection) {
        this.radarErrorWarningCollection = radarErrorWarningCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (moduleId != null ? moduleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RadarModuleInfo)) {
            return false;
        }
        RadarModuleInfo other = (RadarModuleInfo) object;
        if ((this.moduleId == null && other.moduleId != null) || (this.moduleId != null && !this.moduleId.equals(other.moduleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nms.crl.bo.RadarModuleInfo[ moduleId=" + moduleId + " ]";
    }

}
