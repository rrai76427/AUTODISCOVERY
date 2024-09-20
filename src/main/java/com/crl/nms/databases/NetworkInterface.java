package com.crl.nms.databases;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Entity
//@Table(name = "network_interface")
public class NetworkInterface {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Sno;

    @Column(name = "host_group")
    private String hostGroup;

    @Column(name = "device_type")
    private String deviceType;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "interface_id")
    private String interfaceId;

    @Column(name = "interface_operation")
    private String interfaceOperation;

    @Column(name = "workstation_ip")
    private String workstationIp;

    @Column(name = "workstation_name")
    private String workstationName;


    public Long getId() {
        return Sno;
    }

    public void setId(Long id) {
        this.Sno = id;
    }

    public String getHostGroup() {
        return hostGroup;
    }

    public void setHostGroup(String hostGroup) {
        this.hostGroup = hostGroup;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }


    public String getWorkstationIp() {
        return workstationIp;
    }

    public void setWorkstationIp(String workstationIp) {
        this.workstationIp = workstationIp;
    }

    public String getWorkstationName() {
        return workstationName;
    }

    public void setWorkstationName(String workstationName) {
        this.workstationName = workstationName;
    }
}

