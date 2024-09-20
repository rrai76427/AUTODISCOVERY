package com.crl.nms.databases;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Date;

/**
 * @author crl
 */
@Entity
@Table(name = "SHARP_EYE_STATUS")
@XmlRootElement

public class SharpEyeStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;
    @Column(name = "VSWR")
    private Short vswr;
    @Column(name = "TX_POWER")
    private Short txPower;
    @Column(name = "PLO_LOCK")
    private Short ploLock;
    @Column(name = "SYNTHESIZER_LOCK")
    private Short synthesizerLock;
    @Column(name = "OVER_TEMPERATURE")
    private Short overTemperature;
    @Column(name = "TURN_INFO_LOST")
    private Short turnInfoLost;
    @Column(name = "HL_NOT_DEFECTED")
    private Short hlNotDefected;
    @Column(name = "AZIMUTH_STATUS")
    private Short azimuthStatus;
    @Column(name = "FPGA2_FAILED")
    private Short fpga2Failed;
    @Column(name = "FIBRE_LINK_FAILED")
    private Short fibreLinkFailed;
    @Column(name = "ETHERNET_FAILED")
    private Short ethernetFailed;
    @Column(name = "SERVO_FAILED")
    private Short servoFailed;
    @Column(name = "OTHER_FAILURE")
    private Short otherFailure;
    @Column(name = "MAC_ADDRESS")
    private String macAddress;
    @Column(name = "FPGA_ONE_TEMPERTURE")
    private String fpgaOneTemperture;
    @Column(name = "FPGA_TWO_TEMPERTURE")
    private String fpgaTwoTemperture;
    @Column(name = "FPGA_THREE_TEMPERTURE")
    private String fpgaThreeTemperture;
    @Column(name = "CONFIGURATION_ERROR")
    private Integer configurationError;
    @Column(name = "PLO2")
    private Short plo2;
    @Column(name = "SOFTWARE_VERSION_MISMATCH")
    private Short softwareVersionMismatch;
    @Column(name = "FPGA1_VERSION_MISMATCH")
    private Short fpga1VersionMismatch;
    @Column(name = "FPGA2_VERSION_MISMATCH")
    private Short fpga2VersionMismatch;
    @Column(name = "FPGA3_VERSION_MISMATCH")
    private Short fpga3VersionMismatch;
    @Column(name = "BAND_MISMATCH")
    private Short bandMismatch;
    @Column(name = "BOARD_TYPE_MISMATCH")
    private Short boardTypeMismatch;
    @Column(name = "REQUESTED_HLS")
    private Integer requestedHls;
    @Column(name = "APPLIED_HLS")
    private Integer appliedHls;
    @Column(name = "PORT_NUMBER")
    private Long portNumber;
    @Column(name = "IP_ADDRESS")
    private String ipAddress;
    @Column(name = "CONTROLLER_ETHERNET")
    private Short controllerEthernet;
    @Column(name = "CONTROLLER_SERIAL")
    private Short controllerSerial;
    @Column(name = "CONTROLLER_CAN_BUS")
    private Short controllerCanBus;
    @Column(name = "MOTOR_SERVO_STATUS")
    private String motorServoStatus;
    @Column(name = "SERVO_SOFTWARE_STATUS")
    private Short servoSoftwareStatus;
    @Column(name = "MOTOR_STATUS")
    private Short motorStatus;
    @Column(name = "ON_TIME_DURATION")
    private Long onTimeDuration;
    @Column(name = "RUN_TIME_DURATION")
    private Long runTimeDuration;
    @Column(name = "ON_RUN_TIME_UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date onRunTimeUpdatedon;
    @Column(name = "MOTOR_STATUS_UPDATEON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date motorStatusUpdateon;
    @Column(name = "MASTERSHIP_STATUS_UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mastershipStatusUpdatedon;
    @Column(name = "HEADING_LINE_SKEW_UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date headingLineSkewUpdatedon;
    @Column(name = "ALARM_BITS_STATUS_UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date alarmBitsStatusUpdatedon;
    @Column(name = "CORE_TEMP_STATUS_UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date coreTempStatusUpdatedon;
    @Column(name = "MAC_ADDRESS_STATUS_UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date macAddressStatusUpdatedon;
    @Column(name = "ALARM_PACKED_UPDATEDON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date alarmPackedUpdatedon;
    @Column(name = "RX_SENSITIVITY")
    private Short rxSensitivity;
    @Column(name = "COMMS_FAIL")
    private Short commsFail;
    @Column(name = "CPU_EXCEPTION")
    private Short cpuException;
    @Column(name = "PROGRAM_ERROR")
    private Short programError;
    @Column(name = "MOTOR_STUCK")
    private Short motorStuck;
    @Column(name = "PEED_TRACKING_ERROR")
    private Short peedTrackingError;
    @Column(name = "MOTOR_FAIL_TO_START")
    private Short motorFailToStart;
    @Column(name = "SPEED_TRACK_ERROR")
    private Short speedTrackError;
    @Column(name = "SPEED_LIMIT_EXCEED")
    private Short speedLimitExceed;
    @Column(name = "ENCODE_FEEDBACK_ERROR")
    private Short encodeFeedbackError;
    @Column(name = "PEAK_CURRENT_EXCEED")
    private Short peakCurrentExceed;
    @Column(name = "CURRENT_TOO_LOW")
    private Short currentTooLow;
    @Column(name = "RSTART_REQUIRED")
    private Short rstartRequired;

    public SharpEyeStatus() {
    }

    public SharpEyeStatus(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Short getVswr() {
        return vswr;
    }

    public void setVswr(Short vswr) {
        this.vswr = vswr;
    }

    public Short getTxPower() {
        return txPower;
    }

    public void setTxPower(Short txPower) {
        this.txPower = txPower;
    }

    public Short getPloLock() {
        return ploLock;
    }

    public void setPloLock(Short ploLock) {
        this.ploLock = ploLock;
    }

    public Short getSynthesizerLock() {
        return synthesizerLock;
    }

    public void setSynthesizerLock(Short synthesizerLock) {
        this.synthesizerLock = synthesizerLock;
    }

    public Short getOverTemperature() {
        return overTemperature;
    }

    public void setOverTemperature(Short overTemperature) {
        this.overTemperature = overTemperature;
    }

    public Short getTurnInfoLost() {
        return turnInfoLost;
    }

    public void setTurnInfoLost(Short turnInfoLost) {
        this.turnInfoLost = turnInfoLost;
    }

    public Short getHlNotDefected() {
        return hlNotDefected;
    }

    public void setHlNotDefected(Short hlNotDefected) {
        this.hlNotDefected = hlNotDefected;
    }

    public Short getAzimuthStatus() {
        return azimuthStatus;
    }

    public void setAzimuthStatus(Short azimuthStatus) {
        this.azimuthStatus = azimuthStatus;
    }

    public Short getFpga2Failed() {
        return fpga2Failed;
    }

    public void setFpga2Failed(Short fpga2Failed) {
        this.fpga2Failed = fpga2Failed;
    }

    public Short getFibreLinkFailed() {
        return fibreLinkFailed;
    }

    public void setFibreLinkFailed(Short fibreLinkFailed) {
        this.fibreLinkFailed = fibreLinkFailed;
    }

    public Short getEthernetFailed() {
        return ethernetFailed;
    }

    public void setEthernetFailed(Short ethernetFailed) {
        this.ethernetFailed = ethernetFailed;
    }

    public Short getServoFailed() {
        return servoFailed;
    }

    public void setServoFailed(Short servoFailed) {
        this.servoFailed = servoFailed;
    }

    public Short getOtherFailure() {
        return otherFailure;
    }

    public void setOtherFailure(Short otherFailure) {
        this.otherFailure = otherFailure;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getFpgaOneTemperture() {
        return fpgaOneTemperture;
    }

    public void setFpgaOneTemperture(String fpgaOneTemperture) {
        this.fpgaOneTemperture = fpgaOneTemperture;
    }

    public String getFpgaTwoTemperture() {
        return fpgaTwoTemperture;
    }

    public void setFpgaTwoTemperture(String fpgaTwoTemperture) {
        this.fpgaTwoTemperture = fpgaTwoTemperture;
    }

    public String getFpgaThreeTemperture() {
        return fpgaThreeTemperture;
    }

    public void setFpgaThreeTemperture(String fpgaThreeTemperture) {
        this.fpgaThreeTemperture = fpgaThreeTemperture;
    }

    public Integer getConfigurationError() {
        return configurationError;
    }

    public void setConfigurationError(Integer configurationError) {
        this.configurationError = configurationError;
    }

    public Short getPlo2() {
        return plo2;
    }

    public void setPlo2(Short plo2) {
        this.plo2 = plo2;
    }

    public Short getSoftwareVersionMismatch() {
        return softwareVersionMismatch;
    }

    public void setSoftwareVersionMismatch(Short softwareVersionMismatch) {
        this.softwareVersionMismatch = softwareVersionMismatch;
    }

    public Short getFpga1VersionMismatch() {
        return fpga1VersionMismatch;
    }

    public void setFpga1VersionMismatch(Short fpga1VersionMismatch) {
        this.fpga1VersionMismatch = fpga1VersionMismatch;
    }

    public Short getFpga2VersionMismatch() {
        return fpga2VersionMismatch;
    }

    public void setFpga2VersionMismatch(Short fpga2VersionMismatch) {
        this.fpga2VersionMismatch = fpga2VersionMismatch;
    }

    public Short getFpga3VersionMismatch() {
        return fpga3VersionMismatch;
    }

    public void setFpga3VersionMismatch(Short fpga3VersionMismatch) {
        this.fpga3VersionMismatch = fpga3VersionMismatch;
    }

    public Short getBandMismatch() {
        return bandMismatch;
    }

    public void setBandMismatch(Short bandMismatch) {
        this.bandMismatch = bandMismatch;
    }

    public Short getBoardTypeMismatch() {
        return boardTypeMismatch;
    }

    public void setBoardTypeMismatch(Short boardTypeMismatch) {
        this.boardTypeMismatch = boardTypeMismatch;
    }

    public Integer getRequestedHls() {
        return requestedHls;
    }

    public void setRequestedHls(Integer requestedHls) {
        this.requestedHls = requestedHls;
    }

    public Integer getAppliedHls() {
        return appliedHls;
    }

    public void setAppliedHls(Integer appliedHls) {
        this.appliedHls = appliedHls;
    }

    public Long getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(Long portNumber) {
        this.portNumber = portNumber;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Short getControllerEthernet() {
        return controllerEthernet;
    }

    public void setControllerEthernet(Short controllerEthernet) {
        this.controllerEthernet = controllerEthernet;
    }

    public Short getControllerSerial() {
        return controllerSerial;
    }

    public void setControllerSerial(Short controllerSerial) {
        this.controllerSerial = controllerSerial;
    }

    public Short getControllerCanBus() {
        return controllerCanBus;
    }

    public void setControllerCanBus(Short controllerCanBus) {
        this.controllerCanBus = controllerCanBus;
    }

    public String getMotorServoStatus() {
        return motorServoStatus;
    }

    public void setMotorServoStatus(String motorServoStatus) {
        this.motorServoStatus = motorServoStatus;
    }

    public Short getServoSoftwareStatus() {
        return servoSoftwareStatus;
    }

    public void setServoSoftwareStatus(Short servoSoftwareStatus) {
        this.servoSoftwareStatus = servoSoftwareStatus;
    }

    public Short getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(Short motorStatus) {
        this.motorStatus = motorStatus;
    }

    public Long getOnTimeDuration() {
        return onTimeDuration;
    }

    public void setOnTimeDuration(Long onTimeDuration) {
        this.onTimeDuration = onTimeDuration;
    }

    public Long getRunTimeDuration() {
        return runTimeDuration;
    }

    public void setRunTimeDuration(Long runTimeDuration) {
        this.runTimeDuration = runTimeDuration;
    }

    public Date getOnRunTimeUpdatedon() {
        return onRunTimeUpdatedon;
    }

    public void setOnRunTimeUpdatedon(Date onRunTimeUpdatedon) {
        this.onRunTimeUpdatedon = onRunTimeUpdatedon;
    }

    public Date getMotorStatusUpdateon() {
        return motorStatusUpdateon;
    }

    public void setMotorStatusUpdateon(Date motorStatusUpdateon) {
        this.motorStatusUpdateon = motorStatusUpdateon;
    }

    public Date getMastershipStatusUpdatedon() {
        return mastershipStatusUpdatedon;
    }

    public void setMastershipStatusUpdatedon(Date mastershipStatusUpdatedon) {
        this.mastershipStatusUpdatedon = mastershipStatusUpdatedon;
    }

    public Date getHeadingLineSkewUpdatedon() {
        return headingLineSkewUpdatedon;
    }

    public void setHeadingLineSkewUpdatedon(Date headingLineSkewUpdatedon) {
        this.headingLineSkewUpdatedon = headingLineSkewUpdatedon;
    }

    public Date getAlarmBitsStatusUpdatedon() {
        return alarmBitsStatusUpdatedon;
    }

    public void setAlarmBitsStatusUpdatedon(Date alarmBitsStatusUpdatedon) {
        this.alarmBitsStatusUpdatedon = alarmBitsStatusUpdatedon;
    }

    public Date getCoreTempStatusUpdatedon() {
        return coreTempStatusUpdatedon;
    }

    public void setCoreTempStatusUpdatedon(Date coreTempStatusUpdatedon) {
        this.coreTempStatusUpdatedon = coreTempStatusUpdatedon;
    }

    public Date getMacAddressStatusUpdatedon() {
        return macAddressStatusUpdatedon;
    }

    public void setMacAddressStatusUpdatedon(Date macAddressStatusUpdatedon) {
        this.macAddressStatusUpdatedon = macAddressStatusUpdatedon;
    }

    public Date getAlarmPackedUpdatedon() {
        return alarmPackedUpdatedon;
    }

    public void setAlarmPackedUpdatedon(Date alarmPackedUpdatedon) {
        this.alarmPackedUpdatedon = alarmPackedUpdatedon;
    }

    public Short getRxSensitivity() {
        return rxSensitivity;
    }

    public void setRxSensitivity(Short rxSensitivity) {
        this.rxSensitivity = rxSensitivity;
    }

    public Short getCommsFail() {
        return commsFail;
    }

    public void setCommsFail(Short commsFail) {
        this.commsFail = commsFail;
    }

    public Short getCpuException() {
        return cpuException;
    }

    public void setCpuException(Short cpuException) {
        this.cpuException = cpuException;
    }

    public Short getProgramError() {
        return programError;
    }

    public void setProgramError(Short programError) {
        this.programError = programError;
    }

    public Short getMotorStuck() {
        return motorStuck;
    }

    public void setMotorStuck(Short motorStuck) {
        this.motorStuck = motorStuck;
    }

    public Short getPeedTrackingError() {
        return peedTrackingError;
    }

    public void setPeedTrackingError(Short peedTrackingError) {
        this.peedTrackingError = peedTrackingError;
    }

    public Short getMotorFailToStart() {
        return motorFailToStart;
    }

    public void setMotorFailToStart(Short motorFailToStart) {
        this.motorFailToStart = motorFailToStart;
    }

    public Short getSpeedTrackError() {
        return speedTrackError;
    }

    public void setSpeedTrackError(Short speedTrackError) {
        this.speedTrackError = speedTrackError;
    }

    public Short getSpeedLimitExceed() {
        return speedLimitExceed;
    }

    public void setSpeedLimitExceed(Short speedLimitExceed) {
        this.speedLimitExceed = speedLimitExceed;
    }

    public Short getEncodeFeedbackError() {
        return encodeFeedbackError;
    }

    public void setEncodeFeedbackError(Short encodeFeedbackError) {
        this.encodeFeedbackError = encodeFeedbackError;
    }

    public Short getPeakCurrentExceed() {
        return peakCurrentExceed;
    }

    public void setPeakCurrentExceed(Short peakCurrentExceed) {
        this.peakCurrentExceed = peakCurrentExceed;
    }

    public Short getCurrentTooLow() {
        return currentTooLow;
    }

    public void setCurrentTooLow(Short currentTooLow) {
        this.currentTooLow = currentTooLow;
    }

    public Short getRstartRequired() {
        return rstartRequired;
    }

    public void setRstartRequired(Short rstartRequired) {
        this.rstartRequired = rstartRequired;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nodeId != null ? nodeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SharpEyeStatus)) {
            return false;
        }
        SharpEyeStatus other = (SharpEyeStatus) object;
        if ((this.nodeId == null && other.nodeId != null) || (this.nodeId != null && !this.nodeId.equals(other.nodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bos.SharpEyeStatus[ nodeId=" + nodeId + " ]";
    }

}
