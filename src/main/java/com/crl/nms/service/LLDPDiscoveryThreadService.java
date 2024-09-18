package com.crl.nms.service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import com.crl.nms.messages.IpRange;
import com.crl.nms.pojo.MibSwitchLLDPDataPojo;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author root
 */
@Service
public class LLDPDiscoveryThreadService implements Runnable {

   // private final org.slf4j.Logger m_logger = LoggerFactory.getLogger(com.crl.nms.lldpdiscovery.LLDPDiscoveryThread.class);
    static ArrayList<Integer> AvailableNeID = new ArrayList();
    private DbHandlerService dbHandlerService;
    public static ConcurrentHashMap<String, String> neConnectivityHash = new ConcurrentHashMap(2, 0.9f, 2);
    public static ConcurrentHashMap<String, String> neDuplicateConnectivityHash = new ConcurrentHashMap(2, 0.9f, 2);
    String neIp = null;
    IpRange ipRange;
    public LLDPDiscoveryThreadService() {

    }

    public LLDPDiscoveryThreadService(String neIp,DbHandlerService dbHandlerService,IpRange ipRange) {
        this.neIp = neIp;
        this.dbHandlerService=dbHandlerService;
        this.ipRange=ipRange;
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
            MibSwitchLLDPDataService mibSwitchLLDPData = new MibSwitchLLDPDataService(dbHandlerService,ipRange);
           int port = 161;
            mibSwitchLLDPData.getMibData(port, this.neIp);
        } catch (IOException ex) {
            Logger.getLogger(ex.getMessage());
        }
    }

}
