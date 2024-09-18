package com.crl.nms.messages;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.springframework.context.annotation.Bean;

/**
 *
 * @author Sneha Prajapati
 */
public class IpRange {

    public String fromIp = "";
    public String toIp = "";

    public String deviceName = "";

    public String deviceType = "";

    public String deviceIP = "";

    public String deviceStatus;

    public String nodeId;

    public String neKey;   //ne element of agency

    public String neGroupNo;  // Ne Group

    public String snmpVersion;

    public String port;

    public String retries;

    public String timeout;

    public String usernameSNMP;

    public String snmpContext;

    public String authPassphrase;

    public String privacyPassword;

    public String securityType;

    public String authProtocol;

    public String privacyProtocol;

    public String community;

    public String snmpProfileStatus;

    public String profileId;

    public String profileName;

    private short neId;

    private int isSnmpFlag;

    private short groupNo;

    private String userName;

    private short isIPChange;

    private String threshLimit;

    public String templateName;

    private String url;

    public boolean templateFlag;

    private boolean autoDisc = false;

    public int isSnmpFlag() {
        return isSnmpFlag;
    }


    public IpRange() {
    }

    public IpRange(String fromIp, String toIp) {
        this.fromIp = fromIp;
        this.toIp = toIp;
    }

    public IpRange(String fromIp, String toIp, String deviceName, String deviceType, String deviceIP, String deviceStatus, String nodeId, String neKey, String neGroupNo, String snmpVersion, String port, String retries, String timeout, String usernameSNMP, String snmpContext, String authPassphrase, String privacyPassword, String securityType, String authProtocol, String privacyProtocol, String community, String snmpProfileStatus, String profileId, String profileName, short neId, int isSnmpFlag, short groupNo, String userName, short isIPChange, String threshLimit, String templateName, String url, boolean templateFlag, boolean autoDisc) {
        this.fromIp = fromIp;
        this.toIp = toIp;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.deviceIP = deviceIP;
        this.deviceStatus = deviceStatus;
        this.nodeId = nodeId;
        this.neKey = neKey;
        this.neGroupNo = neGroupNo;
        this.snmpVersion = snmpVersion;
        this.port = port;
        this.retries = retries;
        this.timeout = timeout;
        this.usernameSNMP = usernameSNMP;
        this.snmpContext = snmpContext;
        this.authPassphrase = authPassphrase;
        this.privacyPassword = privacyPassword;
        this.securityType = securityType;
        this.authProtocol = authProtocol;
        this.privacyProtocol = privacyProtocol;
        this.community = community;
        this.snmpProfileStatus = snmpProfileStatus;
        this.profileId = profileId;
        this.profileName = profileName;
        this.neId = neId;
        this.isSnmpFlag = isSnmpFlag;
        this.groupNo = groupNo;
        this.userName = userName;
        this.isIPChange = isIPChange;
        this.threshLimit = threshLimit;
        this.templateName = templateName;
        this.url = url;
        this.templateFlag = templateFlag;
        this.autoDisc = autoDisc;
    }

    public String getFromIp() {
        return fromIp;
    }

    public void setFromIp(String fromIp) {
        this.fromIp = fromIp;
    }

    public String getToIp() {
        return toIp;
    }

    public void setToIp(String toIp) {
        this.toIp = toIp;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceIP() {
        return deviceIP;
    }

    public void setDeviceIP(String deviceIP) {
        this.deviceIP = deviceIP;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNeKey() {
        return neKey;
    }

    public void setNeKey(String neKey) {
        this.neKey = neKey;
    }

    public String getNeGroupNo() {
        return neGroupNo;
    }

    public void setNeGroupNo(String neGroupNo) {
        this.neGroupNo = neGroupNo;
    }

    public String getSnmpVersion() {
        return snmpVersion;
    }

    public void setSnmpVersion(String snmpVersion) {
        this.snmpVersion = snmpVersion;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getRetries() {
        return retries;
    }

    public void setRetries(String retries) {
        this.retries = retries;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getUsernameSNMP() {
        return usernameSNMP;
    }

    public void setUsernameSNMP(String usernameSNMP) {
        this.usernameSNMP = usernameSNMP;
    }

    public String getSnmpContext() {
        return snmpContext;
    }

    public void setSnmpContext(String snmpContext) {
        this.snmpContext = snmpContext;
    }

    public String getAuthPassphrase() {
        return authPassphrase;
    }

    public void setAuthPassphrase(String authPassphrase) {
        this.authPassphrase = authPassphrase;
    }

    public String getPrivacyPassPhrase() {
        return privacyPassword;
    }

    public void setPrivacyPassPhrase(String privacyPassword) {
        this.privacyPassword = privacyPassword;
    }

    public String getSecurityType() {
        return securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    public String getAuthProtocol() {
        return authProtocol;
    }

    public void setAuthProtocol(String authProtocol) {
        this.authProtocol = authProtocol;
    }

    public String getPrivacyProtocol() {
        return privacyProtocol;
    }

    public void setPrivacyProtocol(String privacyProtocol) {
        this.privacyProtocol = privacyProtocol;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getSnmpProfileStatus() {
        return snmpProfileStatus;
    }

    public void setSnmpProfileStatus(String snmpProfileStatus) {
        this.snmpProfileStatus = snmpProfileStatus;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public short getNeId() {
        return neId;
    }

    public void setNeId(short neId) {
        this.neId = neId;
    }

    public int getIsSnmpFlag() {
        return isSnmpFlag;
    }

    public void setIsSnmpFlag(int isSnmpFlag) {
        this.isSnmpFlag = isSnmpFlag;
    }

    public short getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(short groupNo) {
        this.groupNo = groupNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public short getIsIPChange() {
        return isIPChange;
    }

    public void setIsIPChange(short isIPChange) {
        this.isIPChange = isIPChange;
    }

    public String getThreshLimit() {
        return threshLimit;
    }

    public void setThreshLimit(String threshLimit) {
        this.threshLimit = threshLimit;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isTemplateFlag() {
        return templateFlag;
    }

    public void setTemplateFlag(boolean templateFlag) {
        this.templateFlag = templateFlag;
    }

    public boolean isAutoDisc() {
        return autoDisc;
    }

    public void setAutoDisc(boolean autoDisc) {
        this.autoDisc = autoDisc;
    }
}
