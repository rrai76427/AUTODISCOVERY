///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package  com.crl.nms.databases;
//import java.io.Serializable;
//import java.util.Date;
//import jakarta.persistence.Basic;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;
//import jakarta.xml.bind.annotation.XmlRootElement;
//
///**
// *
// * @author meenuchhindra
// */
//@Entity
//@Table(name = "GEM_RADAR_STATUS")
//@XmlRootElement
//
//public class GemRadarStatus implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @Basic(optional = false)
//    @Column(name = "NODE_ID")
//    private String nodeId;
//    @Column(name = "GEM_MODE")
//    private Short gemMode;
//    @Column(name = "TRANSMISSION_MODE")
//    private Short transmissionMode;
//    @Column(name = "ANTENNA_SPEED")
//    private Short antennaSpeed;
//    @Column(name = "ANTENNA_ROTATION_SPEED")
//    private Short antennaRotationSpeed;
//    @Column(name = "TX_TIME")
//    private Short txTime;
//    @Column(name = "MAGNETRON_CURRENT_LEVEL")
//    private Short magnetronCurrentLevel;
//    @Column(name = "ALARM_ACP")
//    private Short alarmAcp;
//    @Column(name = "SYSTEM_READINESS")
//    private Short systemReadiness;
//    @Column(name = "COMMUNICATION")
//    private Short communication;
//    @Column(name = "TARGET_OVERFLOW")
//    private Short targetOverflow;
//    @Column(name = "EXTRACTOR_STATE")
//    private Short extractorState;
//    @Column(name = "TRACKER_STATE")
//    private Short trackerState;
//    @Column(name = "FULL_ACQUIRE")
//    private Short fullAcquire;
//    @Column(name = "ALARM_ARP")
//    private Short alarmArp;
//    @Column(name = "ALARM_TRIGGER")
//    private Short alarmTrigger;
//    @Column(name = "ALARM_SAFETY_SWITCH")
//    private Short alarmSafetySwitch;
//    @Column(name = "ALARM_MAGNETRON")
//    private Short alarmMagnetron;
//    @Column(name = "DISPLAY_MODE_UPDATEON")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date displayModeUpdateon;
//    @Column(name = "TRANSMIT_MODE_UPDATEON")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date transmitModeUpdateon;
//    @Column(name = "ANTENA_SPEED_UPDATEON")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date antenaSpeedUpdateon;
//    @Column(name = "ANTENA_ROTATION_UPDATEON")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date antenaRotationUpdateon;
//    @Column(name = "TRANMISSION_TIME_UPDATEON")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date tranmissionTimeUpdateon;
//    @Column(name = "MAGNETRON_UPDATEON")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date magnetronUpdateon;
//    @Column(name = "RADAR_ALARM_UPDATEON")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date radarAlarmUpdateon;
//    @Column(name = "READINESS_UPDATEDON")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date readinessUpdatedon;
//    @Column(name = "BIST_UPDATEDON")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date bistUpdatedon;
//
//    public GemRadarStatus() {
//    }
//
//    public GemRadarStatus(String nodeId) {
//        this.nodeId = nodeId;
//    }
//
//    public String getNodeId() {
//        return nodeId;
//    }
//
//    public void setNodeId(String nodeId) {
//        this.nodeId = nodeId;
//    }
//
//    public Short getGemMode() {
//        return gemMode;
//    }
//
//    public void setGemMode(Short gemMode) {
//        this.gemMode = gemMode;
//    }
//
//    public Short getTransmissionMode() {
//        return transmissionMode;
//    }
//
//    public void setTransmissionMode(Short transmissionMode) {
//        this.transmissionMode = transmissionMode;
//    }
//
//    public Short getAntennaSpeed() {
//        return antennaSpeed;
//    }
//
//    public void setAntennaSpeed(Short antennaSpeed) {
//        this.antennaSpeed = antennaSpeed;
//    }
//
//    public Short getAntennaRotationSpeed() {
//        return antennaRotationSpeed;
//    }
//
//    public void setAntennaRotationSpeed(Short antennaRotationSpeed) {
//        this.antennaRotationSpeed = antennaRotationSpeed;
//    }
//
//    public Short getTxTime() {
//        return txTime;
//    }
//
//    public void setTxTime(Short txTime) {
//        this.txTime = txTime;
//    }
//
//    public Short getMagnetronCurrentLevel() {
//        return magnetronCurrentLevel;
//    }
//
//    public void setMagnetronCurrentLevel(Short magnetronCurrentLevel) {
//        this.magnetronCurrentLevel = magnetronCurrentLevel;
//    }
//
//    public Short getAlarmAcp() {
//        return alarmAcp;
//    }
//
//    public void setAlarmAcp(Short alarmAcp) {
//        this.alarmAcp = alarmAcp;
//    }
//
//    public Short getSystemReadiness() {
//        return systemReadiness;
//    }
//
//    public void setSystemReadiness(Short systemReadiness) {
//        this.systemReadiness = systemReadiness;
//    }
//
//    public Short getCommunication() {
//        return communication;
//    }
//
//    public void setCommunication(Short communication) {
//        this.communication = communication;
//    }
//
//    public Short getTargetOverflow() {
//        return targetOverflow;
//    }
//
//    public void setTargetOverflow(Short targetOverflow) {
//        this.targetOverflow = targetOverflow;
//    }
//
//    public Short getExtractorState() {
//        return extractorState;
//    }
//
//    public void setExtractorState(Short extractorState) {
//        this.extractorState = extractorState;
//    }
//
//    public Short getTrackerState() {
//        return trackerState;
//    }
//
//    public void setTrackerState(Short trackerState) {
//        this.trackerState = trackerState;
//    }
//
//    public Short getFullAcquire() {
//        return fullAcquire;
//    }
//
//    public void setFullAcquire(Short fullAcquire) {
//        this.fullAcquire = fullAcquire;
//    }
//
//    public Short getAlarmArp() {
//        return alarmArp;
//    }
//
//    public void setAlarmArp(Short alarmArp) {
//        this.alarmArp = alarmArp;
//    }
//
//    public Short getAlarmTrigger() {
//        return alarmTrigger;
//    }
//
//    public void setAlarmTrigger(Short alarmTrigger) {
//        this.alarmTrigger = alarmTrigger;
//    }
//
//    public Short getAlarmSafetySwitch() {
//        return alarmSafetySwitch;
//    }
//
//    public void setAlarmSafetySwitch(Short alarmSafetySwitch) {
//        this.alarmSafetySwitch = alarmSafetySwitch;
//    }
//
//    public Short getAlarmMagnetron() {
//        return alarmMagnetron;
//    }
//
//    public void setAlarmMagnetron(Short alarmMagnetron) {
//        this.alarmMagnetron = alarmMagnetron;
//    }
//
//    public Date getDisplayModeUpdateon() {
//        return displayModeUpdateon;
//    }
//
//    public void setDisplayModeUpdateon(Date displayModeUpdateon) {
//        this.displayModeUpdateon = displayModeUpdateon;
//    }
//
//    public Date getTransmitModeUpdateon() {
//        return transmitModeUpdateon;
//    }
//
//    public void setTransmitModeUpdateon(Date transmitModeUpdateon) {
//        this.transmitModeUpdateon = transmitModeUpdateon;
//    }
//
//    public Date getAntenaSpeedUpdateon() {
//        return antenaSpeedUpdateon;
//    }
//
//    public void setAntenaSpeedUpdateon(Date antenaSpeedUpdateon) {
//        this.antenaSpeedUpdateon = antenaSpeedUpdateon;
//    }
//
//    public Date getAntenaRotationUpdateon() {
//        return antenaRotationUpdateon;
//    }
//
//    public void setAntenaRotationUpdateon(Date antenaRotationUpdateon) {
//        this.antenaRotationUpdateon = antenaRotationUpdateon;
//    }
//
//    public Date getTranmissionTimeUpdateon() {
//        return tranmissionTimeUpdateon;
//    }
//
//    public void setTranmissionTimeUpdateon(Date tranmissionTimeUpdateon) {
//        this.tranmissionTimeUpdateon = tranmissionTimeUpdateon;
//    }
//
//    public Date getMagnetronUpdateon() {
//        return magnetronUpdateon;
//    }
//
//    public void setMagnetronUpdateon(Date magnetronUpdateon) {
//        this.magnetronUpdateon = magnetronUpdateon;
//    }
//
//    public Date getRadarAlarmUpdateon() {
//        return radarAlarmUpdateon;
//    }
//
//    public void setRadarAlarmUpdateon(Date radarAlarmUpdateon) {
//        this.radarAlarmUpdateon = radarAlarmUpdateon;
//    }
//
//    public Date getReadinessUpdatedon() {
//        return readinessUpdatedon;
//    }
//
//    public void setReadinessUpdatedon(Date readinessUpdatedon) {
//        this.readinessUpdatedon = readinessUpdatedon;
//    }
//
//    public Date getBistUpdatedon() {
//        return bistUpdatedon;
//    }
//
//    public void setBistUpdatedon(Date bistUpdatedon) {
//        this.bistUpdatedon = bistUpdatedon;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (nodeId != null ? nodeId.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof GemRadarStatus)) {
//            return false;
//        }
//        GemRadarStatus other = (GemRadarStatus) object;
//        if ((this.nodeId == null && other.nodeId != null) || (this.nodeId != null && !this.nodeId.equals(other.nodeId))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.crl.nms.bo.GemRadarStatus[ nodeId=" + nodeId + " ]";
//    }
//
//}
