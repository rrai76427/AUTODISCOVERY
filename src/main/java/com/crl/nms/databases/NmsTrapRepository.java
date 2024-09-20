package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

/**
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_TRAP_REPOSITORY")
@XmlRootElement

public class NmsTrapRepository implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NmsTrapRepositoryPK nmsTrapRepositoryPK;
    @Basic(optional = false)
    @Column(name = "TYPE")
    private short type;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "SEVERITY")
    private short severity;
    @Basic(optional = false)
    @Column(name = "NOTIFICATION")
    private short notification;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "LOG_MESG")
    private String logMesg;
    @Basic(optional = false)
    @Column(name = "FWD_VALUE")
    private short fwdValue;
    @Basic(optional = false)
    @Column(name = "ALARM_ID")
    private short alarmId;
    @Basic(optional = false)
    @Column(name = "NE_TYPE")
    private short neType;

    public NmsTrapRepository() {
    }

    public NmsTrapRepository(NmsTrapRepositoryPK nmsTrapRepositoryPK) {
        this.nmsTrapRepositoryPK = nmsTrapRepositoryPK;
    }

    public NmsTrapRepository(NmsTrapRepositoryPK nmsTrapRepositoryPK, short type, String name, short severity, short notification, String description, String logMesg, short fwdValue, short alarmId, short neType) {
        this.nmsTrapRepositoryPK = nmsTrapRepositoryPK;
        this.type = type;
        this.name = name;
        this.severity = severity;
        this.notification = notification;
        this.description = description;
        this.logMesg = logMesg;
        this.fwdValue = fwdValue;
        this.alarmId = alarmId;
        this.neType = neType;
    }

    public NmsTrapRepository(String oid, short genericValue, long specificValue) {
        this.nmsTrapRepositoryPK = new NmsTrapRepositoryPK(oid, genericValue, specificValue);
    }

    public NmsTrapRepositoryPK getNmsTrapRepositoryPK() {
        return nmsTrapRepositoryPK;
    }

    public void setNmsTrapRepositoryPK(NmsTrapRepositoryPK nmsTrapRepositoryPK) {
        this.nmsTrapRepositoryPK = nmsTrapRepositoryPK;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getSeverity() {
        return severity;
    }

    public void setSeverity(short severity) {
        this.severity = severity;
    }

    public short getNotification() {
        return notification;
    }

    public void setNotification(short notification) {
        this.notification = notification;
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

    public short getFwdValue() {
        return fwdValue;
    }

    public void setFwdValue(short fwdValue) {
        this.fwdValue = fwdValue;
    }

    public short getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(short alarmId) {
        this.alarmId = alarmId;
    }

    public short getNeType() {
        return neType;
    }

    public void setNeType(short neType) {
        this.neType = neType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nmsTrapRepositoryPK != null ? nmsTrapRepositoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NmsTrapRepository)) {
            return false;
        }
        NmsTrapRepository other = (NmsTrapRepository) object;
        if ((this.nmsTrapRepositoryPK == null && other.nmsTrapRepositoryPK != null) || (this.nmsTrapRepositoryPK != null && !this.nmsTrapRepositoryPK.equals(other.nmsTrapRepositoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "shm_bo.NmsTrapRepository[ nmsTrapRepositoryPK=" + nmsTrapRepositoryPK + " ]";
    }

}
