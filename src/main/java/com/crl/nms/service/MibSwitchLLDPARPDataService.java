package com.crl.nms.service;




import com.crl.nms.pojo.MibSwitchLLDPDataPojo;
import com.crl.nms.pojo.NeObjectPojo;
import org.springframework.stereotype.Service;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class MibSwitchLLDPARPDataService {
    MibSwitchLLDPARPDataService() {

    }

    public void getMibData(int port, String ne_ip) throws IOException {

        String userName = "user1";
        DataInputStream din;
        InputStream is = null;
        int portCnt = 0;
        //.1.3.8802.1.1.2.1.3.2.0
        String AuthAlgo="MD5";
        String AuthAlgoUser="crl@123456";
        String privAlgoUser="crl@123456";
        String PrivAlgo="DES";
        final ConcurrentHashMap<String, String> oidhp = new ConcurrentHashMap(5, 0.9f, 5);
        String switchArpoid = "1.3.6.1.2.1.4.22.1";


        //OperationSwitch op = new OperationSwitch();
        Process process = null;
        String cmd = new StringBuilder("snmpwalk -v3 -On -u ").append(userName).append(" -a ").
                append(AuthAlgo).append(" -A ").append(AuthAlgoUser).append(" -x ").append(PrivAlgo)
                .append(" -X ").append(privAlgoUser).append(" -l AuthPriv ").
                append(ne_ip).append(":").append(port).append(" .1.3.6.1.2.1.4.22.1").toString();
        System.out.println(cmd);

/*        String cmd = new StringBuilder("snmpwalk -v2c  -On -c ").append(userName).append(" ").
                append(ne_ip).append(":").append(port).append(" .1.0.8802.1.1.2.1").toString();
*/
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

        }
        din = new DataInputStream(is);
        String s;
        int i = 0;

        try {
            if (din.available() == 0) {


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

                if (list[0].contains(switchArpoid)) {

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
        OperationSwitchArpService op =new OperationSwitchArpService();
        op.fillSwitchInfo(ne_ip, portCnt, oidhp);


    }

}