/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.CDTAUTODISCOVERY;


/*import com.crl.nms.NeInfo.CurrInfo;
import com.crl.nms.NeInfo.NeObject;
import com.crl.nms.NeInfo.NeTypeClass;*/

import com.crl.nms.databases.NmsNeTypes;
import com.crl.nms.pojo.CurrInfoPojo;
import com.crl.nms.pojo.NeObjectPojo;
import com.crl.nms.pojo.NeTypeClassPojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Defines the constant values and variables defined in the global scope of the
 * project.
 *
 * @author root
 */
public class Global {
//

    public final static ArrayList<NeObjectPojo> newElementList = new ArrayList();
    public final static ArrayList<NeObjectPojo> editElementList = new ArrayList();
    public final static ArrayList<String> delElementList = new ArrayList();
    public final static ConcurrentHashMap<String, NeObjectPojo> neHashMap = new ConcurrentHashMap();

    public final static Map<Short, Short> result = new HashMap<>();
    public final static ArrayList<byte[]> udpBufferList = new ArrayList();
    //lldpRemChassisIdSubtype-
    //lldpRemPortIdSubtype-
    public static final byte chassisComponent = 1;
    public static final byte interfaceAlias = 2;
    public static final byte portComponent = 3;
    public static final byte macAddress = 4;
    public static final byte networkAddress = 5;
    public static final byte interfaceName = 6;
    public static final byte local = 7;
    public static final String STATRT_AUTO_DISCOVERY = "start_autodiscovery";
    public static final String ADD_DEVICE = "add_device";
    public static final ConcurrentHashMap<Short, String> hardwareID_Name_Map = new ConcurrentHashMap(8, 0.9f, 8);
    public final static ConcurrentHashMap<String, String> ne_Ip_Key_HashMap = new ConcurrentHashMap(16, 0.9f, 1);
    public final static ConcurrentHashMap<String, String> ne_mac_ipAddress_HashMap = new ConcurrentHashMap(16, 0.9f, 1);
    public final static ConcurrentHashMap<String, String> ne_srcmac_dest_mac_HashMap = new ConcurrentHashMap(16, 0.9f, 1);
    public final static ConcurrentHashMap<String, String> ne_mac_Hostname_HashMap = new ConcurrentHashMap(16, 0.9f, 1);
    public final static ConcurrentHashMap<String, String> ne_name_Key_HashMap = new ConcurrentHashMap(16, 0.9f, 1);
    public final static ConcurrentHashMap<String, String> ne_hwId_Key_HashMap = new ConcurrentHashMap(16, 0.9f, 1);
    public final static ConcurrentHashMap<String, String> ne_MAC_IP_HashMap = new ConcurrentHashMap(16, 0.9f, 1);
    public static String dbIp;
    public static String dbPort;
    public static String dbSID;
    public static String dbUser;
    public static String dbPasswd;
    public static String dbUrl;
    public static String l_dbIp;
    public static String l_dbPort;
    public static String l_dbSID;
    public static String l_dbUser;
    public static String l_dbPasswd;
    public static String l_driverClass;
    public static String l_dbUrl;
    public static String l_dialect;
    public static String s_dbDriver;
    public static String s_dbUser;
    public static String s_dbPass;
    public static String s_dbSchema;
    public static String l_dbUrlDbPrimary;
    public static String l_dbUrlDbSecondary;
    public static String hostsFile;
    public static boolean SYNC_WAIT_FLAG = true;
    public static CurrInfoPojo currObj = new CurrInfoPojo();
    public static ConcurrentHashMap<String, NeTypeClassPojo> neTypeMap = new ConcurrentHashMap();
    public static ScheduledExecutorService ipListscheduledThreadPool = Executors.newScheduledThreadPool(200);
    public static ScheduledExecutorService neDetailscheduledThreadPool = Executors.newScheduledThreadPool(200);
    public static ScheduledExecutorService pktscheduledThreadPool = Executors.newScheduledThreadPool(100);
    public static String lldpRemChassisId = ".1.0.8802.1.1.2.1.4.1.1.5";
    public static String lldpRemPortIdSubtype = ".1.0.8802.1.1.2.1.4.1.1.6";
    public static String lldpRemPortId = ".1.0.8802.1.1.2.1.4.1.1.7";
    public static String lldpRemPortDesc = ".1.0.8802.1.1.2.1.4.1.1.8";
    public static String lldpRemSysName = ".1.0.8802.1.1.2.1.4.1.1.9";
    public static String lldpRemSysDesc = ".1.0.8802.1.1.2.1.4.1.1.10";
    public static String lldpRemSysCapSupported = ".1.0.8802.1.1.2.1.4.1.1.11";
    public static String lldpRemSysCapEnabled = ".1.0.8802.1.1.2.1.4.1.1.12";
    public static byte agencyType;
    public static String ipconfigFile;
    public static String hadwarefile;
    public static String snmpTrap_port;
    // public final static ConcurrentHashMap<String, NeObject> neHashMap = new ConcurrentHashMap(16, 0.9f, 1);
    public static ConcurrentHashMap<String, String> ipKeyHash = new ConcurrentHashMap(2, 0.9f, 2);
    public static String s_amsmcliDirectory = "//usr/local/atms/bin/AMSM_CLI/bin";


}
