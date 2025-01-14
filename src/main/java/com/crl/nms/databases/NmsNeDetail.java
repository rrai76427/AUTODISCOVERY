package  com.crl.nms.databases;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_NE_DETAIL")
@XmlRootElement
@Getter
@Setter
@AllArgsConstructor
public class NmsNeDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "NEKEY")
    private String nekey;

    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private int nodeId;

    @Basic(optional = false)
    @Column(name = "NE_ID")
    private short neId;

    @Column(name = "NE_IP")
    private String neIp;

    @Column(name = "NE_GROUP")
    private String neGroup;

    @Column(name = "NE_DESC")
    private String neDesc;

    @Column(name = "NE_HOSTNAME")
    private String neHostname;

    @Column(name = "NE_STATUS")
    private Short neStatus;

    @Column(name = "NE_UPTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date neUptime;

    @Column(name = "NE_DOWNTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date neDowntime;

    @Column(name = "SNMP_VERSION")
    private Short snmpVersion;

    @Column(name = "SNMP_PROFILE_STATUS")
    private Short snmpProfileStatus;

    @Basic(optional = false)
    @Column(name = "HARDWARE_ID")
    private long hardwareId;

    @Column(name = "RAM_LIMIT")
    private Short ramLimit;

    @Column(name = "CPU_LIMIT")
    private Short cpuLimit;

    @Column(name = "HDD_LIMIT")
    private Short hddLimit;

    @Column(name = "CSCI_ID")
    private Short csciId;

    @Column(name = "X_POS")
    private String xPos;

    @Column(name = "Y_POS")
    private String yPos;

    @Column(name = "IS_CRITICAL_SERVER")
    private short isCriticalServer;

    @Column(name = "URL")
    private String URL;

    @Column(name = "UPDATED_BY")
    private String updatedBy;

    @JoinColumns({
            @JoinColumn(name = "LOCATION_CODE", referencedColumnName = "locationCode"),
            @JoinColumn(name = "LINE_ID", referencedColumnName = "lineId")
    })
    @ManyToOne
    private LocationData locationData;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nmsNeDetail")
    private List<NmsPerfIftable> nmsPerfIftableList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nekey")
    private List<NmsNeHdd> nmsNeHddList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nekey")
    private List<NmsNeCpu> nmsNeCpuList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nmsNeDetail")
    private List<NmsNeRam> nmsNeRam;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nmsNeDetail")
    private List<NmsNeProcesses> nmsNeProcessesList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nmsNeDetail")
    private List<NmsNeDeviceStats> nmsNeDeviceStats;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nmsNeDetail")
    private List<NmsNeDeviceInterfaceDetail> nmsNeDeviceInterfaceDetail;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nmsNeDetail")
    private List<NmsAlarms> nmsAlarms;

    @JoinColumn(name = "NE_TYPE", referencedColumnName = "NE_TYPE")
    @ManyToOne(optional = false)
    private NmsNeTypes neType;

    @JoinColumn(name = "NODE_KEY", referencedColumnName = "NODE_KEY")
    @ManyToOne
    private NodeDefinition nodeKey;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nmsNeDetail")
    private List<NmsTrapConfiguration> nmsTrapConfigurationList;

    public NmsNeDetail(String nekey) {
        this.nekey = nekey;
    }

    public NmsNeDetail(String nekey, int nodeId, short neId, long hardwareId,short isCriticalServer) {

        this.nekey = nekey;
        this.nodeId = nodeId;
        this.neId = neId;
        this.hardwareId = hardwareId;
        this.isCriticalServer = isCriticalServer;
    }

    public NmsNeDetail() {
    }

    public String getNekey() {
        return nekey;
    }

    public void setNekey(String nekey) {
        this.nekey = nekey;
    }

    public List<NmsTrapConfiguration> getNmsTrapConfigurationList() {
        return nmsTrapConfigurationList;
    }

    public void setNmsTrapConfigurationList(List<NmsTrapConfiguration> nmsTrapConfigurationList) {
        this.nmsTrapConfigurationList = nmsTrapConfigurationList;
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public short getNeId() {
        return neId;
    }

    public void setNeId(short neId) {
        this.neId = neId;
    }

    public String getNeIp() {
        return neIp;
    }

    public void setNeIp(String neIp) {
        this.neIp = neIp;
    }

    public String getNeGroup() {
        return neGroup;
    }

    public void setNeGroup(String neGroup) {
        this.neGroup = neGroup;
    }

    public String getNeDesc() {
        return neDesc;
    }

    public void setNeDesc(String neDesc) {
        this.neDesc = neDesc;
    }

    public String getNeHostname() {
        return neHostname;
    }

    public void setNeHostname(String neHostname) {
        this.neHostname = neHostname;
    }

    public Short getNeStatus() {
        return neStatus;
    }

    public void setNeStatus(Short neStatus) {
        this.neStatus = neStatus;
    }

    public Date getNeUptime() {
        return neUptime;
    }

    public void setNeUptime(Date neUptime) {
        this.neUptime = neUptime;
    }

    public Date getNeDowntime() {
        return neDowntime;
    }

    public void setNeDowntime(Date neDowntime) {
        this.neDowntime = neDowntime;
    }

    public Short getSnmpVersion() {
        return snmpVersion;
    }

    public void setSnmpVersion(Short snmpVersion) {
        this.snmpVersion = snmpVersion;
    }

    public Short getSnmpProfileStatus() {
        return snmpProfileStatus;
    }

    public void setSnmpProfileStatus(Short snmpProfileStatus) {
        this.snmpProfileStatus = snmpProfileStatus;
    }

    public long getHardwareId() {
        return hardwareId;
    }

    public void setHardwareId(long hardwareId) {
        this.hardwareId = hardwareId;
    }

    public Short getRamLimit() {
        return ramLimit;
    }

    public void setRamLimit(Short ramLimit) {
        this.ramLimit = ramLimit;
    }

    public Short getCpuLimit() {
        return cpuLimit;
    }

    public void setCpuLimit(Short cpuLimit) {
        this.cpuLimit = cpuLimit;
    }

    public Short getHddLimit() {
        return hddLimit;
    }

    public void setHddLimit(Short hddLimit) {
        this.hddLimit = hddLimit;
    }

    public Short getCsciId() {
        return csciId;
    }

    public void setCsciId(Short csciId) {
        this.csciId = csciId;
    }

    public String getxPos() {
        return xPos;
    }

    public void setxPos(String xPos) {
        this.xPos = xPos;
    }

    public String getyPos() {
        return yPos;
    }

    public void setyPos(String yPos) {
        this.yPos = yPos;
    }

    public short getIsCriticalServer() {
        return isCriticalServer;
    }

    public void setIsCriticalServer(short isCriticalServer) {
        this.isCriticalServer = isCriticalServer;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocationData getLocationData() {
        return locationData;
    }

    public void setLocationData(LocationData locationData) {
        this.locationData = locationData;
    }

    public List<NmsPerfIftable> getNmsPerfIftableList() {
        return nmsPerfIftableList;
    }

    public void setNmsPerfIftableList(List<NmsPerfIftable> nmsPerfIftableList) {
        this.nmsPerfIftableList = nmsPerfIftableList;
    }

    public List<NmsNeHdd> getNmsNeHddList() {
        return nmsNeHddList;
    }

    public void setNmsNeHddList(List<NmsNeHdd> nmsNeHddList) {
        this.nmsNeHddList = nmsNeHddList;
    }

    public List<NmsNeCpu> getNmsNeCpuList() {
        return nmsNeCpuList;
    }

    public void setNmsNeCpuList(List<NmsNeCpu> nmsNeCpuList) {
        this.nmsNeCpuList = nmsNeCpuList;
    }

    public List<NmsNeRam> getNmsNeRam() {
        return nmsNeRam;
    }

    public void setNmsNeRam(List<NmsNeRam> nmsNeRam) {
        this.nmsNeRam = nmsNeRam;
    }

    public List<NmsNeProcesses> getNmsNeProcessesList() {
        return nmsNeProcessesList;
    }

    public void setNmsNeProcessesList(List<NmsNeProcesses> nmsNeProcessesList) {
        this.nmsNeProcessesList = nmsNeProcessesList;
    }

    public List<NmsNeDeviceStats> getNmsNeDeviceStats() {
        return nmsNeDeviceStats;
    }

    public void setNmsNeDeviceStats(List<NmsNeDeviceStats> nmsNeDeviceStats) {
        this.nmsNeDeviceStats = nmsNeDeviceStats;
    }

    public List<NmsNeDeviceInterfaceDetail> getNmsNeDeviceInterfaceDetail() {
        return nmsNeDeviceInterfaceDetail;
    }

    public void setNmsNeDeviceInterfaceDetail(List<NmsNeDeviceInterfaceDetail> nmsNeDeviceInterfaceDetail) {
        this.nmsNeDeviceInterfaceDetail = nmsNeDeviceInterfaceDetail;
    }

    public List<NmsAlarms> getNmsAlarms() {
        return nmsAlarms;
    }

    public void setNmsAlarms(List<NmsAlarms> nmsAlarms) {
        this.nmsAlarms = nmsAlarms;
    }

    public NmsNeTypes getNeType() {
        return neType;
    }

    public void setNeType(NmsNeTypes neType) {
        this.neType = neType;
    }

    public NodeDefinition getNodeKey() {
        return nodeKey;
    }

    public void setNodeKey(NodeDefinition nodeKey) {
        this.nodeKey = nodeKey;
    }
}
