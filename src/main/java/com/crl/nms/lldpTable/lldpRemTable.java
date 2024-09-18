/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.lldpTable;

/**
 *
 * @author root
 */
public class lldpRemTable {

    //KEY--lldpRemTimeMark.lldpRemLocalPortNum.lldpRemIndex
    public int lldpRemTimeMark;
    public int lldpRemLocalPortNum;
    public int lldpRemIndex;
    public String lldpRemChassisIdSubtype;
    /* INTEGER {chassisComponent(1),interfaceAlias(2),portComponent(3),macAddress(4),networkAddress(5),interfaceName(6),local(7)*/

    public String lldpRemChassisId;
    public String lldpRemPortIdSubtype;
    /* INTEGER {chassisComponent(1),interfaceAlias(2),portComponent(3),macAddress(4),networkAddress(5),interfaceName(6),local(7)*/
    public String lldpRemPortId;
    public String lldpRemPortDesc;
    public String lldpRemSysName;
    public String lldpRemSysDesc;
    public String lldpRemSysCapSupported;
    /* BITS {other(0), repeater(1),bridge(2),wlanAccessPoint(3),router(4),telephone(5),docsisCableDevice(6),stationOnly(7)*/

    public String lldpRemSysCapEnabled;
    /* BITS {other(0), repeater(1),bridge(2),wlanAccessPoint(3),router(4),telephone(5),docsisCableDevice(6),stationOnly(7)*/
}
