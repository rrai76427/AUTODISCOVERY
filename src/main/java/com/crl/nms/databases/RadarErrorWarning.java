package  com.crl.nms.databases;
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author meenuchhindra
 */
@Entity
@Table(name = "RADAR_ERROR_WARNING")
@XmlRootElement

public class RadarErrorWarning implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RadarErrorWarningPK radarErrorWarningPK;
    @Column(name = "CSS_REPORTING_SENSOR")
    private Short cssReportingSensor;
    @Column(name = "ERROR_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date errorDatetime;
    @Column(name = "ERROR_WARNING_MSB")
    private Long errorWarningMsb;
    @Column(name = "ERROR_WARNING_LSB")
    private Long errorWarningLsb;
    @Column(name = "UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedon;
    @Column(name = "NEKEY")
    private String nekey;
    @JoinColumn(name = "RADAR_MODULE_ID", referencedColumnName = "MODULE_ID")
    @ManyToOne
    private RadarModuleInfo radarModuleId;

    public RadarErrorWarning() {
    }

    public RadarErrorWarning(RadarErrorWarningPK radarErrorWarningPK) {
        this.radarErrorWarningPK = radarErrorWarningPK;
    }

    public RadarErrorWarning(int nodeId, short remoteStationId) {
        this.radarErrorWarningPK = new RadarErrorWarningPK(nodeId, remoteStationId);
    }

    public RadarErrorWarningPK getRadarErrorWarningPK() {
        return radarErrorWarningPK;
    }

    public void setRadarErrorWarningPK(RadarErrorWarningPK radarErrorWarningPK) {
        this.radarErrorWarningPK = radarErrorWarningPK;
    }

    public Short getCssReportingSensor() {
        return cssReportingSensor;
    }

    public void setCssReportingSensor(Short cssReportingSensor) {
        this.cssReportingSensor = cssReportingSensor;
    }

    public Date getErrorDatetime() {
        return errorDatetime;
    }

    public void setErrorDatetime(Date errorDatetime) {
        this.errorDatetime = errorDatetime;
    }

    public Long getErrorWarningMsb() {
        return errorWarningMsb;
    }

    public void setErrorWarningMsb(Long errorWarningMsb) {
        this.errorWarningMsb = errorWarningMsb;
    }

    public Long getErrorWarningLsb() {
        return errorWarningLsb;
    }

    public void setErrorWarningLsb(Long errorWarningLsb) {
        this.errorWarningLsb = errorWarningLsb;
    }

    public Date getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(Date updatedon) {
        this.updatedon = updatedon;
    }

    public String getNekey() {
        return nekey;
    }

    public void setNekey(String nekey) {
        this.nekey = nekey;
    }

    public RadarModuleInfo getRadarModuleId() {
        return radarModuleId;
    }

    public void setRadarModuleId(RadarModuleInfo radarModuleId) {
        this.radarModuleId = radarModuleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (radarErrorWarningPK != null ? radarErrorWarningPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RadarErrorWarning)) {
            return false;
        }
        RadarErrorWarning other = (RadarErrorWarning) object;
        if ((this.radarErrorWarningPK == null && other.radarErrorWarningPK != null) || (this.radarErrorWarningPK != null && !this.radarErrorWarningPK.equals(other.radarErrorWarningPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.nms.crl.bo.RadarErrorWarning[ radarErrorWarningPK=" + radarErrorWarningPK + " ]";
    }

}
