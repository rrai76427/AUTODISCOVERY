package  com.crl.nms.databases;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_ALARMS_BACKUP")
@XmlRootElement
public class NmsAlarmsBackup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "NEKEY")
    private String nekey;
    @Column(name = "NODE_ID")
    private Integer nodeId;
    
    @Column(name = "ALARM_ID")
    private Short alarmId;
    @Column(name = "SEVERITY")
    private Short severity;
    @Column(name = "ALARM_DESC")
    private String alarmDesc;
    @Column(name = "RECEIVING_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivingDateTime;
    @Column(name = "CLEARING_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clearingDateTime;
    @Column(name = "FAULT_STATUS")
    private Short faultStatus;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "TAGNO")
    private BigDecimal tagno;
    @Column(name = "ACK_FLG")
    private Short ackFlg;
    @Column(name = "ALARM_COUNT")
    private BigInteger alarmCount;
    @Column(name = "NOTIFY")
    private Short notify;
    @Column(name = "SUPPRESSION")
    private Short suppression;
    @Column(name = "REMARK")
    private String remark;
    @Column(name = "TRAP_OID")
    private String trapOid;
    @Column(name = "NODE_KEY")
    private Integer nodeKey;
    @Column(name = "RDT_CLOSE_REMARK")
    private String rdtCloseRemark;
    @Column(name = "RDT_REMADIAL_ACTION")
    private String rdtRemadialAction;
    @Column(name = "RDT_FLAG")
    private Short rdtFlag;

    public NmsAlarmsBackup() {
    }

    public NmsAlarmsBackup(BigDecimal tagno) {
        this.tagno = tagno;
    }

    public String getNekey() {
        return nekey;
    }

    public void setNekey(String nekey) {
        this.nekey = nekey;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    
    public Short getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(Short alarmId) {
        this.alarmId = alarmId;
    }

    public Short getSeverity() {
        return severity;
    }

    public void setSeverity(Short severity) {
        this.severity = severity;
    }

    public String getAlarmDesc() {
        return alarmDesc;
    }

    public void setAlarmDesc(String alarmDesc) {
        this.alarmDesc = alarmDesc;
    }

    public Date getReceivingDateTime() {
        return receivingDateTime;
    }

    public void setReceivingDateTime(Date receivingDateTime) {
        this.receivingDateTime = receivingDateTime;
    }

    public Date getClearingDateTime() {
        return clearingDateTime;
    }

    public void setClearingDateTime(Date clearingDateTime) {
        this.clearingDateTime = clearingDateTime;
    }

    public Short getFaultStatus() {
        return faultStatus;
    }

    public void setFaultStatus(Short faultStatus) {
        this.faultStatus = faultStatus;
    }

    public BigDecimal getTagno() {
        return tagno;
    }

    public void setTagno(BigDecimal tagno) {
        this.tagno = tagno;
    }

    public Short getAckFlg() {
        return ackFlg;
    }

    public void setAckFlg(Short ackFlg) {
        this.ackFlg = ackFlg;
    }

    public BigInteger getAlarmCount() {
        return alarmCount;
    }

    public void setAlarmCount(BigInteger alarmCount) {
        this.alarmCount = alarmCount;
    }

    public Short getNotify() {
        return notify;
    }

    public void setNotify(Short notify) {
        this.notify = notify;
    }

    public Short getSuppression() {
        return suppression;
    }

    public void setSuppression(Short suppression) {
        this.suppression = suppression;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTrapOid() {
        return trapOid;
    }

    public void setTrapOid(String trapOid) {
        this.trapOid = trapOid;
    }

    public Integer getNodeKey() {
        return nodeKey;
    }

    public void setNodeKey(Integer nodeKey) {
        this.nodeKey = nodeKey;
    }

    public String getRdtCloseRemark() {
        return rdtCloseRemark;
    }

    public void setRdtCloseRemark(String rdtCloseRemark) {
        this.rdtCloseRemark = rdtCloseRemark;
    }

    public String getRdtRemadialAction() {
        return rdtRemadialAction;
    }

    public void setRdtRemadialAction(String rdtRemadialAction) {
        this.rdtRemadialAction = rdtRemadialAction;
    }

    public Short getRdtFlag() {
        return rdtFlag;
    }

    public void setRdtFlag(Short rdtFlag) {
        this.rdtFlag = rdtFlag;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tagno != null ? tagno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsAlarmsBackup)) {
            return false;
        }
        NmsAlarmsBackup other = (NmsAlarmsBackup) object;
        if ((this.tagno == null && other.tagno != null) || (this.tagno != null && !this.tagno.equals(other.tagno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NmsAlarmsBackup[ tagno=" + tagno + " ]";
    }
    
}
