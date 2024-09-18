/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.service;

//import main.java.com.crl.nms.HibernateDbConn.DbHandler;

//import main.java.com.crl.nms.lldpTable.lldpRemTable;

import com.crl.nms.CDTAUTODISCOVERY.Global;
//import com.crl.nms.lldpdiscovery.Constant;
import com.crl.nms.repository.NmsNeDetailRepository;
import com.crl.nms.repository.NmsNeSnmpConfigRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
//import static main.java.com.crl.nms.lldpdiscovery.LLDPDiscoveryThread.AvailableNeID;


/**
 *
 * @author root
 */
@Service
public class OperationSwitchArpService {



    @Autowired
    NmsNeDetailRepository nmsNeDetailRepo;

    @Autowired
    NmsNeSnmpConfigRepo nmsNeSnmpConfigRepo;

    @Autowired
    private DbHandlerService dbHandlerService;


   // private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(OperationSwitch.class);
   private static final Logger logger = LoggerFactory.getLogger(OperationSwitchArpService.class);

   public void fillSwitchInfo(String ipAddress, int portCnt, final ConcurrentHashMap<String, String> oidhp) {


        // continue;
        Iterator itr;
        synchronized (oidhp) {
            itr = oidhp.keySet().iterator();
        }


        while (itr.hasNext()) {
            String OidKey;
            synchronized (itr) {
                OidKey = itr.next().toString();

                //  System.out.println("value" + value);
                int portNo = 0;

                if (OidKey.contains(".1.3.6.1.2.1.4.22.1.3.64.")) {
                    String interfaceName = oidhp.get(OidKey);


                    String oidKeyData[] = OidKey.split(".1.3.6.1.2.1.4.22.1.3.64.");

                    String ipaddress = oidKeyData[1];
                    String macAddKey=".1.3.6.1.2.1.4.22.1.2.64."+ipaddress;
                    String macaddess = oidhp.get(macAddKey);



                    int lldpRemTimeMark;
                    Global.ne_MAC_IP_HashMap.put(macaddess,ipaddress);
                }
}
        }
   }
}
