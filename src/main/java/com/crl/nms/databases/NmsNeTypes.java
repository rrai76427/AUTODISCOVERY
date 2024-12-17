package  com.crl.nms.databases;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

/**
 *
 * @author ashwinimehta
 */
@Entity
@Table(name = "NMS_NE_TYPES")
@XmlRootElement
@Getter
@Setter
public class NmsNeTypes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "NE_TYPE")
    private Short neType;

    @Basic(optional = false)
    @Column(name = "NE_DESC")
    private String neDesc;

    @Basic(optional = false)
    @Column(name = "NE_ICON")
    private String neIcon;

    @Column(name = "SPECIFIC_HW")
    private Short specificHw;

    @Column(name = "POLL_TYPE")
    private Short pollType;

    @Column(name = "IP_FLG")
    private Short ipFlg;

    @Column(name = "POLLING_INTERVAL")
    private Short pollingInterval;

    @Column(name = "GROUP_NO")
    private Short groupNo;

    @Basic(optional = false)
    @Column(name = "SNMP_PORT")
    private int snmpPort;

    @Column(name = "IS_SNMP_DEVICE")
    private Short isSnmpDevice;

    @Column(name = "IS_RAM_APPLICABLE")
    private Short isRamApplicable;

    @Column(name = "IS_CPU_APPLICABLE")
    private Short isCpuApplicable;

    @Column(name = "IS_HDD_APPLICABLE")
    private Short isHddApplicable;

    @Column(name = "IS_PORT_APPLICABLE")
    private Short isPortApplicable;

    @Column(name = "IS_CONNECTIVITY_APPLICABLE")
    private Short isConnectivityApplicable;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "neType")
    private List<NmsNeDetail> nmsNeDetailList;


    public NmsNeTypes() {
    }


    public NmsNeTypes(Short neType, String neDesc, String neIcon, Short specificHw, Short pollType, Short ipFlg, Short pollingInterval, Short groupNo, int snmpPort, Short isSnmpDevice, Short isRamApplicable, Short isCpuApplicable, Short isHddApplicable, Short isPortApplicable, Short isConnectivityApplicable, List<NmsNeDetail> nmsNeDetailList) {
        this.neType = neType;
        this.neDesc = neDesc;
        this.neIcon = neIcon;
        this.specificHw = specificHw;
        this.pollType = pollType;
        this.ipFlg = ipFlg;
        this.pollingInterval = pollingInterval;
        this.groupNo = groupNo;
        this.snmpPort = snmpPort;
        this.isSnmpDevice = isSnmpDevice;
        this.isRamApplicable = isRamApplicable;
        this.isCpuApplicable = isCpuApplicable;
        this.isHddApplicable = isHddApplicable;
        this.isPortApplicable = isPortApplicable;
        this.isConnectivityApplicable = isConnectivityApplicable;
        this.nmsNeDetailList = nmsNeDetailList;
    }

    public Short getNeType() {
        return neType;
    }

    public void setNeType(Short neType) {
        this.neType = neType;
    }

    public String getNeDesc() {
        return neDesc;
    }

    public void setNeDesc(String neDesc) {
        this.neDesc = neDesc;
    }

    public String getNeIcon() {
        return neIcon;
    }

    public void setNeIcon(String neIcon) {
        this.neIcon = neIcon;
    }

    public Short getSpecificHw() {
        return specificHw;
    }

    public void setSpecificHw(Short specificHw) {
        this.specificHw = specificHw;
    }

    public Short getPollType() {
        return pollType;
    }

    public void setPollType(Short pollType) {
        this.pollType = pollType;
    }

    public Short getIpFlg() {
        return ipFlg;
    }

    public void setIpFlg(Short ipFlg) {
        this.ipFlg = ipFlg;
    }

    public Short getPollingInterval() {
        return pollingInterval;
    }

    public void setPollingInterval(Short pollingInterval) {
        this.pollingInterval = pollingInterval;
    }

    public Short getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(Short groupNo) {
        this.groupNo = groupNo;
    }

    public int getSnmpPort() {
        return snmpPort;
    }

    public void setSnmpPort(int snmpPort) {
        this.snmpPort = snmpPort;
    }

    public Short getIsSnmpDevice() {
        return isSnmpDevice;
    }

    public void setIsSnmpDevice(Short isSnmpDevice) {
        this.isSnmpDevice = isSnmpDevice;
    }

    public Short getIsRamApplicable() {
        return isRamApplicable;
    }

    public void setIsRamApplicable(Short isRamApplicable) {
        this.isRamApplicable = isRamApplicable;
    }

    public Short getIsCpuApplicable() {
        return isCpuApplicable;
    }

    public void setIsCpuApplicable(Short isCpuApplicable) {
        this.isCpuApplicable = isCpuApplicable;
    }

    public Short getIsHddApplicable() {
        return isHddApplicable;
    }

    public void setIsHddApplicable(Short isHddApplicable) {
        this.isHddApplicable = isHddApplicable;
    }

    public Short getIsPortApplicable() {
        return isPortApplicable;
    }

    public void setIsPortApplicable(Short isPortApplicable) {
        this.isPortApplicable = isPortApplicable;
    }

    public Short getIsConnectivityApplicable() {
        return isConnectivityApplicable;
    }

    public void setIsConnectivityApplicable(Short isConnectivityApplicable) {
        this.isConnectivityApplicable = isConnectivityApplicable;
    }

    public List<NmsNeDetail> getNmsNeDetailList() {
        return nmsNeDetailList;
    }

    public void setNmsNeDetailList(List<NmsNeDetail> nmsNeDetailList) {
        this.nmsNeDetailList = nmsNeDetailList;
    }
}
