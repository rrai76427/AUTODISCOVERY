package  com.crl.nms.databases;
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "PERFDATA_NETWORK")
@XmlRootElement
public class PerfdataNetwork implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PerfdataNetworkPK perfdataNetworkPK;
    @Column(name = "PORTSPEED")
    private String portspeed;
    @Column(name = "THROUGHPUT")
    private String throughput;
    @Column(name = "INLINKUTIL")
    private String inlinkutil;
    @Column(name = "INLINKUTIL_PERC")
    private String inlinkutilPerc;
    @Column(name = "OUTLINKUTIL")
    private String outlinkutil;
    @Column(name = "OUTLINKUTIL_PERC")
    private String outlinkutilPerc;
    @Column(name = "BANDWIDTH")
    private String bandwidth;
    @Column(name = "BANDWIDTH_PERC")
    private String bandwidthPerc;
    @Column(name = "INERRRATE")
    private String inerrrate;
    @Column(name = "OUTERRRATE")
    private String outerrrate;
    @Column(name = "PACKETLOSS")
    private String packetloss;
    @Column(name = "PACKETLOSSRATIO")
    private String packetlossratio;
    @Column(name = "UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    public PerfdataNetwork() {
    }

    public PerfdataNetwork(PerfdataNetworkPK perfdataNetworkPK) {
        this.perfdataNetworkPK = perfdataNetworkPK;
    }

    public PerfdataNetwork(String nekey, int ifindex) {
        this.perfdataNetworkPK = new PerfdataNetworkPK(nekey, ifindex);
    }

    public PerfdataNetworkPK getPerfdataNetworkPK() {
        return perfdataNetworkPK;
    }

    public void setPerfdataNetworkPK(PerfdataNetworkPK perfdataNetworkPK) {
        this.perfdataNetworkPK = perfdataNetworkPK;
    }

    public String getPortspeed() {
        return portspeed;
    }

    public void setPortspeed(String portspeed) {
        this.portspeed = portspeed;
    }

    public String getThroughput() {
        return throughput;
    }

    public void setThroughput(String throughput) {
        this.throughput = throughput;
    }

    public String getInlinkutil() {
        return inlinkutil;
    }

    public void setInlinkutil(String inlinkutil) {
        this.inlinkutil = inlinkutil;
    }

    public String getInlinkutilPerc() {
        return inlinkutilPerc;
    }

    public void setInlinkutilPerc(String inlinkutilPerc) {
        this.inlinkutilPerc = inlinkutilPerc;
    }

    public String getOutlinkutil() {
        return outlinkutil;
    }

    public void setOutlinkutil(String outlinkutil) {
        this.outlinkutil = outlinkutil;
    }

    public String getOutlinkutilPerc() {
        return outlinkutilPerc;
    }

    public void setOutlinkutilPerc(String outlinkutilPerc) {
        this.outlinkutilPerc = outlinkutilPerc;
    }

    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getBandwidthPerc() {
        return bandwidthPerc;
    }

    public void setBandwidthPerc(String bandwidthPerc) {
        this.bandwidthPerc = bandwidthPerc;
    }

    public String getInerrrate() {
        return inerrrate;
    }

    public void setInerrrate(String inerrrate) {
        this.inerrrate = inerrrate;
    }

    public String getOuterrrate() {
        return outerrrate;
    }

    public void setOuterrrate(String outerrrate) {
        this.outerrrate = outerrrate;
    }

    public String getPacketloss() {
        return packetloss;
    }

    public void setPacketloss(String packetloss) {
        this.packetloss = packetloss;
    }

    public String getPacketlossratio() {
        return packetlossratio;
    }

    public void setPacketlossratio(String packetlossratio) {
        this.packetlossratio = packetlossratio;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perfdataNetworkPK != null ? perfdataNetworkPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfdataNetwork)) {
            return false;
        }
        PerfdataNetwork other = (PerfdataNetwork) object;
        if ((this.perfdataNetworkPK == null && other.perfdataNetworkPK != null) || (this.perfdataNetworkPK != null && !this.perfdataNetworkPK.equals(other.perfdataNetworkPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.PerfdataNetwork[ perfdataNetworkPK=" + perfdataNetworkPK + " ]";
    }
    
}
