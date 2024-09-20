package com.crl.nms.service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.crl.nms.messages.IpRange;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/**
 * @author root
 */
@Service
public class LLDPDiscoveryThreadService implements Runnable {

    public static ConcurrentHashMap<String, String> neConnectivityHash = new ConcurrentHashMap(2, 0.9f, 2);
    public static ConcurrentHashMap<String, String> neDuplicateConnectivityHash = new ConcurrentHashMap(2, 0.9f, 2);
    // private final org.slf4j.Logger m_logger = LoggerFactory.getLogger(com.crl.nms.lldpdiscovery.LLDPDiscoveryThread.class);
    static ArrayList<Integer> AvailableNeID = new ArrayList();
    String neIp = null;
    IpRange ipRange;
    private DbHandlerService dbHandlerService;

    public LLDPDiscoveryThreadService() {

    }

    public LLDPDiscoveryThreadService(String neIp, DbHandlerService dbHandlerService, IpRange ipRange) {
        this.neIp = neIp;
        this.dbHandlerService = dbHandlerService;
        this.ipRange = ipRange;
    }

    public void run() {

      /*  try {

            MibSwitchLLDPARPDataService mibSwitchLLDPArpDataService = new MibSwitchLLDPARPDataService();
            int port = 161;
            mibSwitchLLDPArpDataService.getMibData(port, this.neIp);
        } catch (IOException ex) {
            Logger.getLogger(ex.getMessage());
        }*/
        try {
            MibSwitchLLDPDataService mibSwitchLLDPData = new MibSwitchLLDPDataService(dbHandlerService, ipRange);
            int port = 161;
            mibSwitchLLDPData.getMibData(port, this.neIp);
        } catch (IOException ex) {
            Logger.getLogger(ex.getMessage());
        }
    }

}
