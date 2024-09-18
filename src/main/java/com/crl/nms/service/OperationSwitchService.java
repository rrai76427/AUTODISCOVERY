/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.service;

//import main.java.com.crl.nms.HibernateDbConn.DbHandler;

//import main.java.com.crl.nms.lldpTable.lldpRemTable;

import com.crl.nms.CDTAUTODISCOVERY.Constants;
import com.crl.nms.CDTAUTODISCOVERY.Global;
import com.crl.nms.lldpTable.lldpRemTable;
//import com.crl.nms.lldpdiscovery.Constant;


import com.crl.nms.messages.IpRange;
import com.crl.nms.repository.NmsNeDetailRepository;
import com.crl.nms.repository.NmsNeSnmpConfigRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import static main.java.com.crl.nms.lldpdiscovery.LLDPDiscoveryThread.AvailableNeID;


/**
 *
 * @author root
 */
@Service
public class OperationSwitchService {



    @Autowired
    NmsNeDetailRepository nmsNeDetailRepo;

    @Autowired
    NmsNeSnmpConfigRepo nmsNeSnmpConfigRepo;

    // @Autowired
    private DbHandlerService dbHandlerService;
    IpRange ipRange;
    //StringBuilder sb;

    // private static final org.apache.log4j.Logger logger =
    // org.apache.log4j.Logger.getLogger(NeDetailPollThread.class);
    private static final Logger logger = LoggerFactory.getLogger(OperationSwitchService.class);


  public OperationSwitchService() {

    }
  public OperationSwitchService(DbHandlerService dbHandlerService, IpRange ipRange) {
        this.dbHandlerService = dbHandlerService;
        this.ipRange=ipRange;
        // dbObj = new DbHandlerService();
    }

    ArrayList<Object> lldpCatchIfIndex = new ArrayList();
    ArrayList<Object> lldpCatchDeviceIndex = new ArrayList();
    ArrayList<Object> lldpCatchAddressType = new ArrayList();
    ArrayList<Object> lldpCatchAddress = new ArrayList();
    ArrayList<Object> lldpCatchVersion = new ArrayList();
    ArrayList<Object> lldpCatchDeviceID = new ArrayList();
    ArrayList<Object> lldpCatchDevicePortNo = new ArrayList();
    String[] valuelist, value;
    String localmacaddress = "";

    String userName = "crlgad";
    DataInputStream din;
    InputStream is = null;
    int portCnt = 0;
   // private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(OperationSwitch.class);
  // private static final Logger logger = LoggerFactory.getLogger(OperationSwitchService.class);

   public void fillSwitchInfo(String ipAddress, int portCnt, final ConcurrentHashMap<String, String> oidhp) {
        //  return false;
       if (ipAddress.equals("192.168.99.12")){

       }
        try {
            //  DbHandler db = new DbHandler();
            //    db.UpdateData(ipAddress, ne_macStr, nedescStr, neHostNameStr, hwType, hwSubType, neOperSys);
// //delete ne from database
            //   main.java.com.crl.nms.HibernateDbConn.Global.ne_Ip_Key_HashMap.remove(ipAddress);
            //   db.deleteNedetail(ipAddress);
            //    db.UpdateData(ipAddress, "", "", "", (short) Constants.SWITCH, (short) 0, (byte) 0);
        } catch (Exception e) {

        }
        // continue;
        Iterator itr;
        synchronized (oidhp) {
            itr = oidhp.keySet().iterator();
        }
        portCnt = 0;
        String s = oidhp.get(".1.0.8802.1.1.2.1.3.2.0");
        if (s != null) {
            localmacaddress = s;
            System.out.println("localmacaddress" + localmacaddress);
            Global.ne_MAC_IP_HashMap.put(localmacaddress,ipAddress);

            //  main.java.com.crl.nms.HibernateDbConn.Global.ne_mac_ipAddress_HashMap.put(localmacaddress, ipAddress);
        }

       String lldpRemChassisIdSubtype;
       String lldpRemChassisId ;
       String lldpRemPortIdSubtype;
       String lldpRemPortId;
       String lldpRemPortDesc ;
       String lldpRemSysName;
       String lldpRemSysDesc ;
       String lldpRemSysCapSupported ;
       String lldpRemSysCapEnabled ;


       String lldpRemPortIdSubtypevalue;//DEST MAC ADD OR IP ADDRESSS
       String lldpRemChassisIdvalue ;
       String lldpRemPortIdvalue ;//DEST MAC ADD OR IP ADDRESSS
       String lldpRemPortDescvalue;//DEST MAC ADD OR IP ADDRESSS
       String lldpRemSysDescvalue ;//DEST MAC ADD OR IP ADDRESSS
       String lldpRemSysNamevalue ;//DEST MAC ADD OR IP ADDRESSS
       String lldpRemSysCapSupportedvalue ;//DEST MAC ADD OR IP ADDRESSS
       String lldpRemSysCapEnabledvalue ;//DEST MAC ADD OR IP ADDRESSS
       lldpRemTable lldpRemTableEntry = new lldpRemTable();

       while (itr.hasNext()) {
            String OidKey;
            synchronized (itr) {
                OidKey = itr.next().toString();

                //  System.out.println("value" + value);
                int portNo = 0;
//.1.0.8802.1.1.2.1.4.2



                if (OidKey.contains(".1.0.8802.1.1.2.1.4.1.1.4")) {
                    String interfaceName = oidhp.get(OidKey);

                    //lldpRemTimeMark
                    //lldpRemLocalPortNum
                    //lldpRemIndex
                    //lldpRemChassisIdSubtype--lldpRemChassisIdSubtype
                    /* INTEGER {chassisComponent(1),
                    interfaceAlias(2),
                    portComponent(3),
                    macAddress(4),
                    networkAddress(5),
                    interfaceName(6),
                    local(7)
                    }*/
                    //lldpRemChassisId--/.1.0.8802.1.1.2.1.4.1.1.5
                    //lldpRemPortIdSubtype--.1.0.8802.1.1.2.1.4.1.1.6
                    /* INTEGER {interfaceAlias(1),
                        portComponent(2),
                        macAddress(3),
                        networkAddress(4),
                        interfaceName(5), ///what thing get getected
                        agentCircuitId(6),
                        local(7)
                        }*/
                    //lldpRemPortId-.1.0.8802.1.1.2.1.4.1.1.7
                    //lldpRemPortDesc-.1.0.8802.1.1.2.1.4.1.1.8
                    //lldpRemSysName-.1.0.8802.1.1.2.1.4.1.1.9
                    //lldpRemSysDesc-.1.0.8802.1.1.2.1.4.1.1.10
                    //lldpRemSysCapSupported-.1.0.8802.1.1.2.1.4.1.1.11
                    //lldpRemSysCapEnabled-.1.0.8802.1.1.2.1.4.1.1.12

                    String oidKeyData[] = OidKey.split(".1.0.8802.1.1.2.1.4.1.1.4");

                    String key = oidKeyData[1];
                    System.out.println("neKey-" + key);
                    String[] keyArr = oidKeyData[1].split("\\.");

                    int lldpRemTimeMark;
                    int lldpRemLocalPortNum;
                    int lldpRemIndex;
                    lldpRemTableEntry.lldpRemTimeMark = Integer.parseInt(keyArr[1]);
                    lldpRemTableEntry.lldpRemLocalPortNum = Integer.parseInt(keyArr[2]);
                    lldpRemTableEntry.lldpRemIndex = Integer.parseInt(keyArr[3]);
                                       //
                    lldpRemChassisIdSubtype = oidhp.get(OidKey);
                    lldpRemChassisId = new StringBuilder(Global.lldpRemChassisId).append(key).toString();
                    lldpRemPortIdSubtype = new StringBuilder(Global.lldpRemPortIdSubtype).append(key).toString();
                    lldpRemPortId = new StringBuilder(Global.lldpRemPortId).append(key).toString();
                    lldpRemPortDesc = new StringBuilder(Global.lldpRemPortDesc).append(key).toString();
                    lldpRemSysName = new StringBuilder(Global.lldpRemSysName).append(key).toString();
                    lldpRemSysDesc = new StringBuilder(Global.lldpRemSysDesc).append(key).toString();
                    lldpRemSysCapSupported = new StringBuilder(Global.lldpRemSysCapSupported).append(key).toString();
                    lldpRemSysCapEnabled = new StringBuilder(Global.lldpRemSysCapEnabled).append(key).toString();



                    //.1.0.8802.1.1.2.1.4.1.1.5.0.40.12 => 01 AC E5 3A 60
                    //.1.3.6.1.2.1.2.2.1.8.0.40.12
                    lldpRemPortIdSubtypevalue = oidhp.get(lldpRemPortIdSubtype);//DEST MAC ADD OR IP ADDRESSS
                    lldpRemChassisIdvalue = oidhp.get(lldpRemChassisId);
                    lldpRemPortIdvalue = oidhp.get(lldpRemPortId);//DEST MAC ADD OR IP ADDRESSS
                    lldpRemPortDescvalue = oidhp.get(lldpRemPortDesc);//DEST MAC ADD OR IP ADDRESSS
                    lldpRemSysDescvalue = oidhp.get(lldpRemSysDesc);//DEST MAC ADD OR IP ADDRESSS
                    lldpRemSysNamevalue = oidhp.get(lldpRemSysName);//DEST MAC ADD OR IP ADDRESSS
                    lldpRemSysCapSupportedvalue = oidhp.get(lldpRemSysCapSupported);//DEST MAC ADD OR IP ADDRESSS
                    lldpRemSysCapEnabledvalue = oidhp.get(lldpRemSysCapEnabled);//DEST MAC ADD OR IP ADDRESSS
//                    System.out.println(lldpRemPortIdSubtypevalue);
                    Short hardWareType = 0;

                    if (lldpRemSysCapSupportedvalue.contains("24 00")){
                        hardWareType=Constants.IP_PHONE;
                    }
                    if(lldpRemSysCapSupportedvalue.contains("20 00")){
                        hardWareType=Constants.SWITCH;
                    }

                    if(lldpRemSysCapSupportedvalue.contains("28 00")){
                        hardWareType=Constants.SWITCH;
                    }

                    if(lldpRemSysCapSupportedvalue.contains("39 00")){
                        hardWareType=Constants.SWITCH;
                    }
                    String hostname = "";
                    if (lldpRemSysNamevalue != null){
                        if (lldpRemSysNamevalue.startsWith("\"") && lldpRemSysNamevalue.endsWith("\"")) {
                            // Remove the leading and trailing double quotes and unescape the internal quotes
                            hostname = lldpRemSysNamevalue.substring(2, lldpRemSysNamevalue.length() - 2).replace("\\\"", "\"");
                            System.out.println(hostname);
                        } else {
                            hostname = lldpRemSysNamevalue;
                            // If quotes are not present at the beginning and end, print the original string
                            System.out.println(hostname);
                        }
                }
                    if (localmacaddress.length() > 1) {
                        //main.java.com.crl.nms.HibernateDbConn.Global.ne_mac_Hostname_HashMap.put(localmacaddress, hostname);
                    }
//                    System.out.println(lldpRemPortIdvalue);
//                    System.out.println(lldpRemPortIdSubtypevalue);
//                    System.out.println(lldpRemPortDescvalue);
//                    System.out.println(lldpRemSysDescvalue);
//                    System.out.println(lldpRemSysNamevalue);
//                    System.out.println(lldpRemSysCapSupportedvalue);
//                    System.out.println(lldpRemSysCapEnabledvalue);

                    //chassisComponent(1),interfaceAlias(2),portComponent(3),macAddress(4),networkAddress(5),interfaceName(6),local(7)
                    int lldpRemChassisIdSubtypevalue = Integer.parseInt(lldpRemChassisIdSubtype);
                    switch (lldpRemChassisIdSubtypevalue) {
                        case Global.chassisComponent://chassisComponent(1)
                            break;
                        case Global.interfaceAlias://interfaceAlias(2)
                            break;
                        case Global.portComponent://portComponent(3)
                            break;
                        case Global.macAddress://macAddress(4)
                            if (!lldpRemChassisIdvalue.equals(lldpRemPortIdvalue)){
                                // String destmacAddress = lldpRemChassisIdvalue.replaceAll("\\ ", "\\-");
                                String destmacAddress = lldpRemChassisIdvalue;
                                int localsrcport = lldpRemTableEntry.lldpRemLocalPortNum;
                                System.out.println("source port-" + lldpRemTableEntry.lldpRemLocalPortNum);
                                String destPort = lldpRemPortIdvalue.replaceAll("\"", "");

                                System.out.println("destmacAddress-" + destmacAddress);
                                if (Byte.parseByte(lldpRemPortIdSubtypevalue) == Global.local) {
                                    System.out.println("destPort-" + destPort);
                                    Pattern pattern = Pattern.compile("-?\\d+"); // Matches one or more digits with an optional negative sign
                                    Matcher matcher = pattern.matcher(destPort);

                                    if (matcher.find()) {

                                        String destportno = matcher.group().replaceFirst("^(-)?0+", "$1").replaceAll("^-", "");
                                        System.out.println(destportno);// Returns the matched number as a string
                                        Global.ne_srcmac_dest_mac_HashMap.put(localmacaddress + "_" + localsrcport, destmacAddress + "_" + destportno);
                                    }

                                } else {
                                    destPort = "1";
                                    Global.ne_srcmac_dest_mac_HashMap.put(localmacaddress + "_" + localsrcport, destmacAddress + "_" + destPort);

                                    System.out.println("destPort-" + destPort);
                                }
                                Iterator itr1;
                                synchronized (oidhp) {
                                    itr1 = oidhp.keySet().iterator();
                                }
                                while (itr1.hasNext()) {
                                    String OidKey1;
                                    synchronized (itr1) {
                                        OidKey1 = itr1.next().toString();

                                        String ipKey1=".1.0.8802.1.1.2.1.4.2.1.3.0."+ lldpRemTableEntry.lldpRemLocalPortNum+"."+lldpRemTableEntry.lldpRemIndex+".1.4.";
                                        String ipKey2=".1.0.8802.1.1.2.1.4.2.1.3.0."+ lldpRemTableEntry.lldpRemLocalPortNum+"."+lldpRemTableEntry.lldpRemIndex+".6.6.144.235.";

                                        System.out.println(OidKey + "==="+ipKey1);
                                        if (OidKey1.contains(ipKey1)){

                                            String ipArr[]= OidKey1.split(ipKey1);
                                            System.out.println("ip address"+ipArr[1]);
                                            Global.ne_MAC_IP_HashMap.put(destmacAddress,ipArr[1]);

                                        }
                                        if (OidKey1.contains(ipKey2) ){

                                            String ipArr[]= OidKey1.split(ipKey2);
                                            System.out.println("ip address"+ipArr[1]);
                                            Global.ne_MAC_IP_HashMap.put(destmacAddress,ipArr[1]);

                                        }
                                    }
                                }
                                if(hardWareType>0) {
                                    Short hwSubType=0;
                                    byte neOpesSys=0;
                                    dbHandlerService.updateData(Global.ne_MAC_IP_HashMap.get(destmacAddress), destmacAddress, lldpRemSysNamevalue, lldpRemSysNamevalue, hardWareType, hwSubType, neOpesSys);
                                }
                                checkforLinkUpdate();
                            }

                            break;
                        case Global.networkAddress: //networkAddress(5)
                            String srcIpAdd = Global.ne_MAC_IP_HashMap.get(localmacaddress);
                           int localsrcport = lldpRemTableEntry.lldpRemLocalPortNum;
                            //            if (value.length >= 2) {
                            StringBuilder DestIp = new StringBuilder();
                            String[] HexSubValue = lldpRemChassisIdvalue.split(" ");
                            for (int k = 1; k < HexSubValue.length; k++) {
                                HexSubValue[k] = HexSubValue[k].trim().replaceAll("\\W", "");
                                DestIp.append((String.valueOf(Integer.parseInt(HexSubValue[k], 16))));
                                if (k != HexSubValue.length - 1) {
                                    DestIp.append(".");
                                }
                            }
                            //    System.out.println("source port-" + lldpRemTableEntry.lldpRemLocalPortNum);
                            System.out.println(DestIp);

                            String destPort = "1";
                            System.out.println("destPort-" + destPort);

                            valuelist = lldpRemPortIdvalue.split("\\:");
                            valuelist[0] = valuelist[0].trim();
                            String mac = valuelist[0].replaceAll("\"", "");
                            char divisionChar = ':';
                            String deviceMac = mac.replaceAll("(.{2})", "$1" + divisionChar).substring(0, 17);
                            System.out.println(deviceMac);
                            Global.ne_MAC_IP_HashMap.put(deviceMac,DestIp.toString());

                            if(hardWareType>0) {
                                Short hwSubType=0;
                                byte neOpesSys=0;
                                dbHandlerService.updateData(String.valueOf(DestIp), deviceMac, lldpRemSysNamevalue, lldpRemSysNamevalue, hardWareType, hwSubType, neOpesSys);
                            }


                            Global.ne_srcmac_dest_mac_HashMap.put(localmacaddress + "_" + localsrcport, deviceMac + "_" + destPort);




                            checkforLinkUpdate();
                            break;
                        case Global.interfaceName: //interfaceName(6)
                            String destmacAddress1 = lldpRemChassisIdvalue;
                             localsrcport = lldpRemTableEntry.lldpRemLocalPortNum;

                            break;

                        case Global.local: //local(7)
                            String destmacAddress2 = lldpRemChassisIdvalue;
                             localsrcport = lldpRemTableEntry.lldpRemLocalPortNum;


                            break;
                    }

                }


            }


           //.1.0.8802.1.1.2.1.4.2.1

        }



           }
       public void checkforLinkUpdate () {



            for (Map.Entry<String, String> entry :Global.ne_srcmac_dest_mac_HashMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                System.out.println("Key: " + key + ", Value: " + value);
                //split source mac_port
                String srcMacData[] = key.split("_");
                String srcMacAdd = srcMacData[0];
                String srcport = srcMacData[1];
                //split dest mac_port
                String destMacData[] = value.split("_");

                String destMacAdd = destMacData[0];
                String destport = destMacData[1];

                //check for ip address
                String srcIpAdd = Global.ne_MAC_IP_HashMap.get(srcMacAdd);
                String destIpAdd =Global.ne_MAC_IP_HashMap.get(destMacAdd);
                System.out.println(srcport);
                System.out.println(destport);
                System.out.println("srcIpAdd-" + srcIpAdd);
                System.out.println("destIpAdd-" + destIpAdd);

                if (Global.ipKeyHash.get(destIpAdd)==null){

                    StringBuilder sb = new StringBuilder("fping -a -r 2 ").append(destIpAdd);
                    System.out.println(sb.toString());
                    NePingSubPollThreadService worker = new NePingSubPollThreadService(sb,dbHandlerService,ipRange);
                    Global.ipListscheduledThreadPool.submit(worker);//schedule(w
                }
                else {short sPort = Short.parseShort(srcport);
                    short dPort = Short.parseShort(destport);
                    if (srcIpAdd != null && destIpAdd != null && sPort > 0 && dPort > 0) {
                        // DbHandler db = new DbHandler();
                        System.out.println("srcIpAdd "+srcIpAdd+" =======> "+" destIpAdd "+destIpAdd+" ===========> "+" sPort"+sPort+" dPort "+dPort);
                        dbHandlerService.insertConnectivity(srcIpAdd, srcport, destIpAdd, destport);
                        Global.ne_srcmac_dest_mac_HashMap.remove(key);
                    }
                }


            }
        }

/*        public static String returnCurrUtilDate_Sec () {
            try {
                SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy");
                Date date1 = new Date();
                String dateforamte1 = f.format(date1);
                // return dateforamte1;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return null;
        }*/

/*    public void updateDeviceName(String ip, String DeviceName) {
     *//*   String query = new StringBuilder("update NMS_NE_DETAIL set NE_DESC='")
                .append(DeviceName).append("' where NE_IP='").append(ip).append("' and NE_DESC='null'").toString();*//*


        nmsNeDetailRepo.updateNeDescByIp(DeviceName,ip);
        //System.out.println(" Update Query" + query);
       // executeQuery(query);
    }*/

 /*   public void updateIpDeviceName(String ip, String DeviceName) {
//        String query = new StringBuilder("update NMS_NE_DETAIL set NE_DESC='")
//                .append(DeviceName).append("' where NE_DESC='").append(ip).append("'").toString();
//        System.out.println(" Update Query" + query);

        nmsNeDetailRepo.updateNeDescByIP(DeviceName,ip);
        //executeQuery(query);
    }*/
    /*public void insertSwitch(String DestIp) {
        int deviceTypeSwitch = 34;
        int agency_id = 1;
        int neID = 1;
        *//*if (AvailableNeID.size() > 0) {
            neID = AvailableNeID.get(0);
        }*//*

        String neKey = agency_id + "_" + neID + "_" + deviceTypeSwitch;
        Random rn = new Random();
        int n = 600;
        int x = rn.nextInt() % n;
        int y = rn.nextInt() % n;

//        String query = new StringBuilder("insert into NMS_NE_DETAIL values('")
//                .append(neKey).append("',").append("1").append(",")
//                .append(deviceTypeSwitch).append(",").append(neID).append(",'").append(DestIp)
//                .append("','").append(DestIp).append("',").append("null,1,null,null,2,1,0,0,0,0,").append(x).append(",").append(y).append(",null)").toString();
//        System.out.println(query);

        NmsNeDetail entity = new NmsNeDetail();
        entity.setNekey(neKey);
        //entity.setColumn2(1); // Replace with the actual values
       // entity.setDeviceTypeSwitch(deviceTypeSwitch);
        entity.setNeId((short) neID);
        //entity.setDestIp(DestIp);
        entity.setNeIp(DestIp); // Assuming neIp is the same as destIp
    //    entity.setColumn7(null); // Replace with the actual values
    //    entity.setColumn8(1); // Replace with the actual values
    //    entity.setColumn9(null); // Replace with the actual values
    //    entity.setColumn10(null); // Replace with the actual values
    //    entity.setColumn11(2); // Replace with the actual values
    //    entity.setColumn12(1); // Replace with the actual values
    //    entity.setColumn13(0); // Replace with the actual values
    //    entity.setColumn14(0); // Replace with the actual values
    //    entity.setColumn15(0); // Replace with the actual values
        entity.setXPos(String.valueOf(x));
        entity.setYPos(String.valueOf(y));
        //entity.setColumn18(null); // Replace with the actual values

        nmsNeDetailRepo.save(entity);


      //  boolean returnFlag = executeQuery(query);
       *//* if (returnFlag) {
            System.out.println(" **********************insert device " + DestIp + " successful ");

            AvailableNeID.remove(0);
            query = new StringBuilder("Insert into NMS_NE_SNMP_CONFIG values('")
                    .append(neKey).append("',").append("2").append(",").append("161").append(",")
                    .append("3").append(",").append("5").append(",'").append(Constant.community).append("',")
                    .append("'NA','NOTAPPLICABLE','NOTAPPLICABLE','NA','NA',-1,to_timestamp('15-OCT-20 00.00.00.000000000','DD-MON-RR HH24.MI.SS.FF'),'admin',1,'NA','SWITCH_V2_NMS','1_34')").toString();
            //      System.out.println("Insert Profile ->" + query);
           // returnFlag = executeQuery(query);
            if (returnFlag) {
                System.out.println(" #######################profile for  " + neKey + "  successful ");
            }

        } else {
            System.out.println(" #######################insert device " + DestIp + " un successful ");
        }*//*




        NmsNeSnmpConfig nmsNeSnmpConfig = new NmsNeSnmpConfig();
     //   nmsNeSnmpConfig.setColumn3(161); // Replace with the actual values
      //  nmsNeSnmpConfig.setColumn4(3); // Replace with the actual values
       // nmsNeSnmpConfig.setColumn5(5); // Replace with the actual values
      // nmsNeSnmpConfig.setColumn2(2); // Replace with the actual values

        SnmpProfileTemplate snmpProfileTemplate=new SnmpProfileTemplate();
        snmpProfileTemplate.setSnmpCommunity(Constant.community);
        nmsNeSnmpConfig.setSnmpProfileTemplate(snmpProfileTemplate); // Assuming Constant.community is a constant value

        NmsNeSnmpConfigPK nmsNeSnmpConfigPK=new NmsNeSnmpConfigPK();
        nmsNeSnmpConfigPK.setNekey(neKey);
        nmsNeSnmpConfig.setNmsNeSnmpConfigPK(nmsNeSnmpConfigPK);
       // nmsNeSnmpConfig.setColumn7("NA"); // Replace with the actual values
       // nmsNeSnmpConfig.setColumn8("NOTAPPLICABLE"); // Replace with the actual values
       // nmsNeSnmpConfig.setColumn9("NOTAPPLICABLE"); // Replace with the actual values
        //nmsNeSnmpConfig.setColumn10("NA"); // Replace with the actual values
        //nmsNeSnmpConfig.setColumn11("NA"); // Replace with the actual values
        //sNeSnmpConfig.setColumn12(-1); // Replace with the actual values
       // nmsNeSnmpConfig.setTimestamp(Timestamp.valueOf("2020-10-15 00:00:00.000")); // Replace with the actual timestamp

        nmsNeSnmpConfig.setUpdatedOn(new Date());
//        nmsNeSnmpConfig.setColumn14("admin"); // Replace with the actual values
//        nmsNeSnmpConfig.setColumn15(1); // Replace with the actual values
//        nmsNeSnmpConfig.setColumn16("NA"); // Replace with the actual values
//        nmsNeSnmpConfig.setColumn17("SWITCH_V2_NMS"); // Replace with the actual values
//        nmsNeSnmpConfig.setColumn18("1_34"); // Replace with the actual values
//        nmsNeSnmpConfig.setColumn19(null); // Replace with the actual values

        nmsNeSnmpConfigRepo.save(nmsNeSnmpConfig);

    }*/

/*    private boolean executeQuery(String query) {
        boolean flag = false;
        HibernateWrapper hibernateWrapper = new HibernateWrapper();
        try {
            flag = hibernateWrapper.executeSqlQuery(query);

        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {

        } finally {
            hibernateWrapper.destroy();
        }
        return flag;
    }*/


}
