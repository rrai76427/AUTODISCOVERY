package com.crl.nms.service;


import com.crl.nms.databases.AuthenticationProtocolEnum;
import com.crl.nms.databases.PrivacyProtocolEnum;
import com.crl.nms.messages.IpRange;
import com.crl.nms.pojo.AuthenticationProtocolEnumPojo;
import com.crl.nms.pojo.MibSwitchLLDPDataPojo;
import com.crl.nms.pojo.NeObjectPojo;
import com.crl.nms.pojo.PrivacyProtocolEnumPojo;
import org.springframework.stereotype.Service;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class MibSwitchLLDPDataService {
    IpRange ipRange;
    private DbHandlerService dbHandlerService;

    public MibSwitchLLDPDataService() {
    }


    MibSwitchLLDPDataService(DbHandlerService dbHandlerService, IpRange ipRange) {
        this.dbHandlerService = dbHandlerService;
        this.ipRange = ipRange;
    }

    public NeObjectPojo getMibData(int port, String ne_ip) throws IOException {

        String userName = "user1";
        DataInputStream din;
        InputStream is = null;
        int portCnt = 0;
        //.1.3.8802.1.1.2.1.3.2.0
        String AuthAlgo = "MD5";
        String AuthAlgoUser = "crl@123456";
        String privAlgoUser = "crl@123456";
        String PrivAlgo = "DES";
        final ConcurrentHashMap<String, String> oidhp = new ConcurrentHashMap(5, 0.9f, 5);
        String switchPortStatusEntryOID = ".1.0.8802.1.1.2.1.4.1.1";
        String switchDescEntryOID = ".1.0.8802.1.1.2.1.4.2";
        String lldpLocChassisIdOID = ".1.0.8802.1.1.2.1.3.2.0";


//.1.0.8802.1.1.2.1.4.2
        //OperationSwitch op = new OperationSwitch();
        Process process = null;
        String cmd = "";

        if (ipRange.getSnmpVersion().equals("2")) {

        /*        String cmd = new StringBuilder("snmpwalk -v2c  -On -c ").append(userName).append(" ").
                append(ne_ip).append(":").append(port).append(" .1.0.8802.1.1.2.1").toString();
        */
            cmd = new StringBuilder("snmpwalk -v").append(ipRange.getSnmpVersion()).append("c  -On -c ").append(ipRange.getCommunity()).append(" ").
                    append(ne_ip).append(":").append(ipRange.getPort()).append(" .1.0.8802.1.1.2.1").toString();
            System.out.println(cmd);

        } else {
            Optional<AuthenticationProtocolEnum> authenticationProtocolEnum = dbHandlerService.findAuthenticationProtocolEnum(ipRange);

            Optional<PrivacyProtocolEnum> privacyProtocolEnum = dbHandlerService.findPrivacyProtocolEnum(ipRange);

            AuthenticationProtocolEnumPojo authenticationProtocolEnumPojo = new AuthenticationProtocolEnumPojo();
            authenticationProtocolEnumPojo.setProtocol(authenticationProtocolEnum.get().getProtocol());

            PrivacyProtocolEnumPojo privacyProtocolEnumPojo = new PrivacyProtocolEnumPojo();
            privacyProtocolEnumPojo.setProtocol(privacyProtocolEnum.get().getProtocol());

        /*        String cmd = new StringBuilder("snmpwalk -v3 -On -u ").append(userName).append(" -a ").
                append(AuthAlgo).append(" -A ").append(AuthAlgoUser).append(" -x ").append(PrivAlgo)
                .append(" -X ").append(privAlgoUser).append(" -l AuthPriv ").
                append(ne_ip).append(":").append(port).append(" .1.0.8802.1.1.2.1").toString();
        System.out.println(cmd);*/

            cmd = new StringBuilder("snmpwalk -v").append(ipRange.getSnmpVersion()).append(" -On -u ").append(ipRange.getUsernameSNMP()).append(" -a ").
                    append(authenticationProtocolEnumPojo.getProtocol()).append(" -A ").append(ipRange.getUsernameSNMP()).append(" -x ").append(privacyProtocolEnumPojo.getProtocol())
                    .append(" -X ").append(ipRange.getUsernameSNMP()).append(" -l AuthPriv ").
                    append(ne_ip).append(":").append(ipRange.getPort()).append(" .1.3.6.1.2.1.4.22.1").toString();
            System.out.println(cmd);
        }

        Runtime runtime = Runtime.getRuntime();
        try {
            process = runtime.exec(cmd);
            process.waitFor();
        } catch (IOException | InterruptedException ex) {

        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {

        }
        if (process != null) {
            is = process.getInputStream();

        }
        if (is == null) {
            return null;
        }
        din = new DataInputStream(is);
        String s;
        int i = 0;

        try {
            if (din.available() == 0) {
                return null;

            }

            while ((s = din.readLine()) != null) {
                String[] list = s.split(" ");

                if (list.length < 3) {

                    synchronized (oidhp) {
                        oidhp.put(list[0], "Data not found");
                    }
                } else if (list.length > 3) {
                    String value = list[3];

                    int len = list.length;

                    for (int l = 4; l < len; l++) {
                        value = value + " " + list[l];
                    }

                    synchronized (oidhp) {
                        oidhp.put(list[0], value);
                    }
                }

                if (list[0].contains(switchPortStatusEntryOID)) {

                    portCnt++;

                    if (list.length < 3) {

                        synchronized (oidhp) {
                            oidhp.put(list[0], "Data not found");
                        }
                    } else if (list.length > 3) {
                        String value = list[3];

                        int len = list.length;

                        for (int l = 4; l < len; l++) {
                            value = value + " " + list[l];
                        }
                        synchronized (oidhp) {
                            oidhp.put(list[0], value);
                        }
                    }
                } else if (list[0].contains(switchDescEntryOID)) {
                    portCnt++;

                    if (list.length < 3) {

                        synchronized (oidhp) {
                            oidhp.put(list[0], "Data not found");
                        }
                    } else if (list.length > 3) {
                        String value = list[3];
                        int len = list.length;
                        for (int l = 4; l < len; l++) {
                            value = value + " " + list[l];
                        }
                        synchronized (oidhp) {
                            oidhp.put(list[0], value);
                        }
                    }
                } else if (list[0].contains(lldpLocChassisIdOID)) {
                    portCnt++;

                    if (list.length < 3) {

                        synchronized (oidhp) {
                            oidhp.put(list[0], "Data not found");
                        }
                    } else if (list.length > 3) {
                        String value = list[3];
                        int len = list.length;
                        for (int l = 4; l < len; l++) {
                            value = value + " " + list[l];
                        }
                        synchronized (oidhp) {
                            oidhp.put(list[0], value);
                        }
                    }
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(MibSwitchLLDPDataPojo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            is.close();
            din.close();

        }
        OperationSwitchService op = new OperationSwitchService(dbHandlerService, ipRange);
        op.fillSwitchInfo(ne_ip, portCnt, oidhp);

        return null;

    }

}
