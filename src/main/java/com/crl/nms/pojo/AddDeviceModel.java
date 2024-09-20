package com.crl.nms.pojo;

import lombok.*;

/**
 * @author Sneha Prajapati
 */

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddDeviceModel {

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

    public String privacyPassPhrase;

    public String securityType;

    public String authProtocol;

    public String privacyProtocol;

    public String community;

    public String snmpProfileStatus;

    public String profileId;

    public String profileName;
    public String templateName;
    public boolean templateFlag;
    private short neId;
    private int isSnmpFlag;
    private short groupNo;
    private String userName;
    private short isIPChange;
    private String threshLimit;
    private String url;
    private boolean autoDisc = false;


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
        return privacyPassPhrase;
    }

    public void setPrivacyPassPhrase(String privacyPassPhrase) {
        this.privacyPassPhrase = privacyPassPhrase;
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

    public int isSnmpFlag() {
        return isSnmpFlag;
    }
}
