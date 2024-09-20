package com.crl.nms.service;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * @author root
 */
//import main.java.com.crl.nms.CDTAUTODISCOVERY.Global;

import com.crl.nms.CDTAUTODISCOVERY.Global;
import com.crl.nms.messages.IpRange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 *
 * @author root
 */
//@Component

@Service
public class NeFpingPollThreadService extends Thread {

    //private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(NeFpingPollThread.class);
    private static final Logger logger = LoggerFactory.getLogger(NeFpingPollThreadService.class);
    boolean pollStart = true;
    String ipStartRange;
    String ipEndRange;
    IpRange ipRange;
    // @Autowired
    private DbHandlerService dbHandlerService;

    public NeFpingPollThreadService() {

    }

    public NeFpingPollThreadService(String ipStartRange, String ipEndRange, IpRange ipRange, DbHandlerService dbHandlerService) {
        this.ipStartRange = ipStartRange;
        this.ipEndRange = ipEndRange;
        this.dbHandlerService = dbHandlerService;
        this.ipRange = ipRange;
    }

    @Override
    public void run() {

        //Find Range
        byte startipOCtet;

        String[] ipStartOctetByte;
        String[] ipEndOCtetByte;
        ipStartOctetByte = this.ipStartRange.split("\\.");
        ipEndOCtetByte = this.ipEndRange.split("\\.");

        if (!ipStartOctetByte[0].equals(ipEndOCtetByte[0])) {

            startipOCtet = 0;
        } else if (!ipStartOctetByte[1].equals(ipEndOCtetByte[1])) {
            startipOCtet = 1;
        } else if (!ipStartOctetByte[2].equals(ipEndOCtetByte[2])) {
            startipOCtet = 2;
        } else {
            startipOCtet = 3;
        }

        checkPollStatus(startipOCtet, ipStartOctetByte, ipEndOCtetByte);
    }

    public void checkPollStatus(byte startipOCtet, String[] ipStartOctetByte, String[] ipEndOCtetByte) {

        switch (startipOCtet) {
            case 0:
                for (short i0 = Short.valueOf(ipStartOctetByte[0]); i0 <= Short.valueOf(ipEndOCtetByte[0]); i0++) {
                    for (short i1 = Short.valueOf(ipStartOctetByte[1]); i1 < 256; i1++) {
                        for (short i2 = Short.valueOf(ipStartOctetByte[2]); i2 < 256; i2++) {
                            for (short i3 = Short.valueOf(ipStartOctetByte[3]); i3 <= Short.valueOf(ipEndOCtetByte[3]); i3++) {
                                String neIpAddress = new StringBuilder("").append(i0).append(".").append(i1).append(".").append(i2).append(".").append(i3).toString();
                                checkNewUpdates(neIpAddress, ipRange);
                            }
                        }
                    }
                }
                break;
            case 1:
                for (short i0 = Short.valueOf(ipStartOctetByte[0]); i0 <= Short.valueOf(ipEndOCtetByte[0]); i0++) {
                    for (short i1 = Short.valueOf(ipStartOctetByte[1]); i1 <= Short.valueOf(ipEndOCtetByte[1]); i1++) {
                        for (short i2 = Short.valueOf(ipStartOctetByte[2]); i2 < 256; i2++) {
                            for (short i3 = Short.valueOf(ipStartOctetByte[3]); i3 <= Short.valueOf(ipEndOCtetByte[3]); i3++) {
                                String neIpAddress = new StringBuilder("").append(i0).append(".").append(i1).append(".").append(i2).append(".").append(i3).toString();
                                checkNewUpdates(neIpAddress, ipRange);
                            }
                        }
                    }
                }
                break;
            case 2:
                for (short i0 = Short.valueOf(ipStartOctetByte[0]); i0 <= Short.valueOf(ipEndOCtetByte[0]); i0++) {
                    for (short i1 = Short.valueOf(ipStartOctetByte[1]); i1 <= Short.valueOf(ipEndOCtetByte[1]); i1++) {
                        for (short i2 = Short.valueOf(ipStartOctetByte[2]); i2 <= Short.valueOf(ipEndOCtetByte[2]); i2++) {
                            for (short i3 = Short.valueOf(ipStartOctetByte[3]); i3 <= Short.valueOf(ipEndOCtetByte[3]); i3++) {
                                String neIpAddress = new StringBuilder("").append(i0).append(".").append(i1).append(".").append(i2).append(".").append(i3).toString();
                                checkNewUpdates(neIpAddress, ipRange);
                            }
                        }
                    }
                }
                break;
            case 3:
                for (short i0 = Short.valueOf(ipStartOctetByte[0]); i0 <= Short.valueOf(ipEndOCtetByte[0]); i0++) {
                    for (short i1 = Short.valueOf(ipStartOctetByte[1]); i1 <= Short.valueOf(ipEndOCtetByte[1]); i1++) {
                        for (short i2 = Short.valueOf(ipStartOctetByte[2]); i2 <= Short.valueOf(ipEndOCtetByte[2]); i2++) {
                            for (short i3 = Short.valueOf(ipStartOctetByte[3]); i3 <= Short.valueOf(ipEndOCtetByte[3]); i3++) {
                                String neIpAddress = new StringBuilder("").append(i0).append(".").append(i1).append(".").append(i2).append(".").append(i3).toString();
                                checkNewUpdates(neIpAddress, ipRange);
                            }
                        }
                    }
                }
                break;
        }
        if (startipOCtet == 0) {

        }
    }

    private void checkNewUpdates(String neIpAddress, IpRange ipRange) {

        StringBuilder sb = new StringBuilder("fping -a -r 2 ").append(neIpAddress);
        System.out.println(sb.toString());

        NePingSubPollThreadService worker = new NePingSubPollThreadService(sb, dbHandlerService, ipRange);
        Global.ipListscheduledThreadPool.submit(worker);//schedule(w
    }

}
