/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.pojo;

//import main.java.com.crl.nms.CDTAUTODISCOVERY.Constants;

/**
 *
 * @author root
 */
public class NeObjectPojo {

    public String sysUpHrs;
    public String linuxRelease;
    public String kernelInfo;
    public String vendorInfo;
    public String product;
    public String productSNo;

    //Processor Information
    public byte totalCPU;
    public String CPUModel;
    public String CPUVendor;
    public String CPUSpeed;
    public String CPUCache;
    public short csciId = 0;
    public String csciName = "";
    public short csciState = 0;
    public byte lan_1 = 1;
    public byte lan_2 = 2;
    public byte lan_3 = 3;

   // public byte lan_status1 = Constants.DOWN;
  //  public byte lan_status2 = Constants.DOWN;
   // public byte lan_status3 = Constants.DOWN;

    public byte lan_status1_down_cnt = 0;
    public byte lan_status2_down_cnt = 0;
    public byte lan_status3_down_cnt = 0;

    public short neStatusDownCnt = 0;

    public short pollAgencyId;
    public String nodekey;
    public short nodeId;
    public short neType;
    public short neId;
    public short hardwareId;
    public byte timedOutCnt;

    public short clientPollType;

    public String neDesc;
    public String neIpAddr;
    public String neIpmacAddress = "a1:b1:c1:d1:e1:f1";
    public String neMgtIpAddress = "0.0.0.0";
    public byte hwType = 0;
    public String neKey;
    public short neRamTrendCnt;
    public short neCPUTrendCnt;
    public short neLoadTrendCnt;
    public short neEthTrendCnt;

}
