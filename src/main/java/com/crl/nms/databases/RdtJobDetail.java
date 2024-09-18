package  com.crl.nms.databases;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "RDT_JOB_DETAIL")
@XmlRootElement

public class RdtJobDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "TECHNICIAN_NAME")
    private String technicianName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ALARM_TAGNO")
    private BigDecimal alarmTagno;
    @Basic(optional = false)
    @Column(name = "TASK_STATUS")
    private short taskStatus;
    @Basic(optional = false)
    @Column(name = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetime;
    @Basic(optional = false)
    @Column(name = "WRKSHPNAME")
    private String wrkshpname;
    @Column(name = "REMEDIAL_ACTION")
    private String remedialAction;
    @Column(name = "CLOSE_REMARKS")
    private String closeRemarks;
    @Basic(optional = false)
    @Column(name = "DIGNOSIS_TYPE")
    private short dignosisType;
    @Column(name = "CLOSING_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date closingDatetime;
    @JoinColumn(name = "ALARM_TAGNO", referencedColumnName = "TAGNO", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private NmsAlarms nmsAlarms;

    public RdtJobDetail() {
    }

    public RdtJobDetail(BigDecimal alarmTagno) {
        this.alarmTagno = alarmTagno;
    }

    public RdtJobDetail(BigDecimal alarmTagno, String technicianName, short taskStatus, Date datetime, String wrkshpname, short dignosisType) {
        this.alarmTagno = alarmTagno;
        this.technicianName = technicianName;
        this.taskStatus = taskStatus;
        this.datetime = datetime;
        this.wrkshpname = wrkshpname;
        this.dignosisType = dignosisType;
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName;
    }

    public BigDecimal getAlarmTagno() {
        return alarmTagno;
    }

    public void setAlarmTagno(BigDecimal alarmTagno) {
        this.alarmTagno = alarmTagno;
    }

    public short getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(short taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getWrkshpname() {
        return wrkshpname;
    }

    public void setWrkshpname(String wrkshpname) {
        this.wrkshpname = wrkshpname;
    }

    public String getRemedialAction() {
        return remedialAction;
    }

    public void setRemedialAction(String remedialAction) {
        this.remedialAction = remedialAction;
    }

    public String getCloseRemarks() {
        return closeRemarks;
    }

    public void setCloseRemarks(String closeRemarks) {
        this.closeRemarks = closeRemarks;
    }

    public short getDignosisType() {
        return dignosisType;
    }

    public void setDignosisType(short dignosisType) {
        this.dignosisType = dignosisType;
    }

    public Date getClosingDatetime() {
        return closingDatetime;
    }

    public void setClosingDatetime(Date closingDatetime) {
        this.closingDatetime = closingDatetime;
    }

    public NmsAlarms getNmsAlarms() {
        return nmsAlarms;
    }

    public void setNmsAlarms(NmsAlarms nmsAlarms) {
        this.nmsAlarms = nmsAlarms;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alarmTagno != null ? alarmTagno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RdtJobDetail)) {
            return false;
        }
        RdtJobDetail other = (RdtJobDetail) object;
        if ((this.alarmTagno == null && other.alarmTagno != null) || (this.alarmTagno != null && !this.alarmTagno.equals(other.alarmTagno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crl.nms.bo.RdtJobDetail[ alarmTagno=" + alarmTagno + " ]";
    }
    
}
