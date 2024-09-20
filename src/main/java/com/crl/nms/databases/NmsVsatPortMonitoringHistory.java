package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 */
@Entity
@Table(name = "NMS_VSAT_PORT_MONITORING_HISTORY")
@XmlRootElement
public class NmsVsatPortMonitoringHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NmsVsatPortMonitoringHistoryPK nmsVsatPortMonitoringHistoryPK;
    @Column(name = "ROUTER_IP")
    private String routerIp;
    @Column(name = "ACTIVE_LINK")
    private String activeLink;
    @Column(name = "UPDATE_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateOn;
    @Column(name = "NEKEY")
    private String nekey;

    public NmsVsatPortMonitoringHistory() {
    }

    public NmsVsatPortMonitoringHistory(NmsVsatPortMonitoringHistoryPK nmsVsatPortMonitoringHistoryPK) {
        this.nmsVsatPortMonitoringHistoryPK = nmsVsatPortMonitoringHistoryPK;
    }

    public NmsVsatPortMonitoringHistory(int nodeId, int parentNodeId) {
        this.nmsVsatPortMonitoringHistoryPK = new NmsVsatPortMonitoringHistoryPK(nodeId, parentNodeId);
    }

    public NmsVsatPortMonitoringHistoryPK getNmsVsatPortMonitoringHistoryPK() {
        return nmsVsatPortMonitoringHistoryPK;
    }

    public void setNmsVsatPortMonitoringHistoryPK(NmsVsatPortMonitoringHistoryPK nmsVsatPortMonitoringHistoryPK) {
        this.nmsVsatPortMonitoringHistoryPK = nmsVsatPortMonitoringHistoryPK;
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
        hash += (nmsVsatPortMonitoringHistoryPK != null ? nmsVsatPortMonitoringHistoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsVsatPortMonitoringHistory)) {
            return false;
        }
        NmsVsatPortMonitoringHistory other = (NmsVsatPortMonitoringHistory) object;
        if ((this.nmsVsatPortMonitoringHistoryPK == null && other.nmsVsatPortMonitoringHistoryPK != null) || (this.nmsVsatPortMonitoringHistoryPK != null && !this.nmsVsatPortMonitoringHistoryPK.equals(other.nmsVsatPortMonitoringHistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.bo.NmsVsatPortMonitoringHistory[ nmsVsatPortMonitoringHistoryPK=" + nmsVsatPortMonitoringHistoryPK + " ]";
    }

}
