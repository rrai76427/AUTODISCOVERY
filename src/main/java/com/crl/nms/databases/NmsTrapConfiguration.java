package  com.crl.nms.databases;
import java.io.Serializable;
import java.math.BigInteger;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_TRAP_CONFIGURATION")
@XmlRootElement

public class NmsTrapConfiguration implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NmsTrapConfigurationPK nmsTrapConfigurationPK;
    @Column(name = "NE_TYPE")
    private Short neType;
    @Column(name = "TRAP_TYPE")
    private Short trapType;
    @Column(name = "SEVERITY")
    private Short severity;
    @Column(name = "NOTIFY")
    private Short notify;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LOG_MESG")
    private String logMesg;
    @Column(name = "NWKEY")
    private BigInteger nwkey;
    @Column(name = "ADDC_NW_ID")
    private Short addcNwId;
    @Basic(optional = false)
    @Column(name = "ALARM_ID")
    private short alarmId;
    @Column(name = "NODE_KEY")
    private Integer nodeKey;
    @JoinColumn(name = "NEKEY", referencedColumnName = "NEKEY", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NmsNeDetail nmsNeDetail;

    public NmsTrapConfiguration() {
    }

    public NmsTrapConfiguration(NmsTrapConfigurationPK nmsTrapConfigurationPK) {
        this.nmsTrapConfigurationPK = nmsTrapConfigurationPK;
    }

    public NmsTrapConfiguration(NmsTrapConfigurationPK nmsTrapConfigurationPK, short alarmId) {
        this.nmsTrapConfigurationPK = nmsTrapConfigurationPK;
        this.alarmId = alarmId;
    }

    public NmsTrapConfiguration(String nekey, String trapOid) {
        this.nmsTrapConfigurationPK = new NmsTrapConfigurationPK(nekey, trapOid);
    }

    public NmsTrapConfigurationPK getNmsTrapConfigurationPK() {
        return nmsTrapConfigurationPK;
    }

    public void setNmsTrapConfigurationPK(NmsTrapConfigurationPK nmsTrapConfigurationPK) {
        this.nmsTrapConfigurationPK = nmsTrapConfigurationPK;
    }

    public Short getNeType() {
        return neType;
    }

    public void setNeType(Short neType) {
        this.neType = neType;
    }

    public Short getTrapType() {
        return trapType;
    }

    public void setTrapType(Short trapType) {
        this.trapType = trapType;
    }

    public Short getSeverity() {
        return severity;
    }

    public void setSeverity(Short severity) {
        this.severity = severity;
    }

    public Short getNotify() {
        return notify;
    }

    public void setNotify(Short notify) {
        this.notify = notify;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogMesg() {
        return logMesg;
    }

    public void setLogMesg(String logMesg) {
        this.logMesg = logMesg;
    }

    public BigInteger getNwkey() {
        return nwkey;
    }

    public void setNwkey(BigInteger nwkey) {
        this.nwkey = nwkey;
    }

    public Short getAddcNwId() {
        return addcNwId;
    }

    public void setAddcNwId(Short addcNwId) {
        this.addcNwId = addcNwId;
    }

    public short getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(short alarmId) {
        this.alarmId = alarmId;
    }

    public Integer getNodeKey() {
        return nodeKey;
    }

    public void setNodeKey(Integer nodeKey) {
        this.nodeKey = nodeKey;
    }

    public NmsNeDetail getNmsNeDetail() {
        return nmsNeDetail;
    }

    public void setNmsNeDetail(NmsNeDetail nmsNeDetail) {
        this.nmsNeDetail = nmsNeDetail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nmsTrapConfigurationPK != null ? nmsTrapConfigurationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsTrapConfiguration)) {
            return false;
        }
        NmsTrapConfiguration other = (NmsTrapConfiguration) object;
        if ((this.nmsTrapConfigurationPK == null && other.nmsTrapConfigurationPK != null) || (this.nmsTrapConfigurationPK != null && !this.nmsTrapConfigurationPK.equals(other.nmsTrapConfigurationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NmsTrapConfiguration[ nmsTrapConfigurationPK=" + nmsTrapConfigurationPK + " ]";
    }
    
}
