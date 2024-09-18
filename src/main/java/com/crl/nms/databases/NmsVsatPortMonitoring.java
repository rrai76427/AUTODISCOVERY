package  com.crl.nms.databases;
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "NMS_VSAT_PORT_MONITORING")
@XmlRootElement

public class NmsVsatPortMonitoring implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NmsVsatPortMonitoringPK nmsVsatPortMonitoringPK;
    @Column(name = "ROUTER_IP")
    private String routerIp;
    @Column(name = "ACTIVE_LINK")
    private String activeLink;
    @Column(name = "UPDATE_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateOn;
    @Column(name = "NEKEY")
    private String nekey;

    public NmsVsatPortMonitoring() {
    }

    public NmsVsatPortMonitoring(NmsVsatPortMonitoringPK nmsVsatPortMonitoringPK) {
        this.nmsVsatPortMonitoringPK = nmsVsatPortMonitoringPK;
    }

    public NmsVsatPortMonitoring(int nodeId, int parentNodeId) {
        this.nmsVsatPortMonitoringPK = new NmsVsatPortMonitoringPK(nodeId, parentNodeId);
    }

    public NmsVsatPortMonitoringPK getNmsVsatPortMonitoringPK() {
        return nmsVsatPortMonitoringPK;
    }

    public void setNmsVsatPortMonitoringPK(NmsVsatPortMonitoringPK nmsVsatPortMonitoringPK) {
        this.nmsVsatPortMonitoringPK = nmsVsatPortMonitoringPK;
    }

    public String getRouterIp() {
        return routerIp;
    }

    public void setRouterIp(String routerIp) {
        this.routerIp = routerIp;
    }

    public String getActiveLink() {
        return activeLink;
    }

    public void setActiveLink(String activeLink) {
        this.activeLink = activeLink;
    }

    public Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Date updateOn) {
        this.updateOn = updateOn;
    }

    public String getNekey() {
        return nekey;
    }

    public void setNekey(String nekey) {
        this.nekey = nekey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nmsVsatPortMonitoringPK != null ? nmsVsatPortMonitoringPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsVsatPortMonitoring)) {
            return false;
        }
        NmsVsatPortMonitoring other = (NmsVsatPortMonitoring) object;
        if ((this.nmsVsatPortMonitoringPK == null && other.nmsVsatPortMonitoringPK != null) || (this.nmsVsatPortMonitoringPK != null && !this.nmsVsatPortMonitoringPK.equals(other.nmsVsatPortMonitoringPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.NmsVsatPortMonitoring[ nmsVsatPortMonitoringPK=" + nmsVsatPortMonitoringPK + " ]";
    }
    
}
