/*
package com.crl.nms.service;

import com.crl.nms.CDTAUTODISCOVERY.Constants;
import com.crl.nms.CDTAUTODISCOVERY.Global;

import com.crl.nms.messages.IpRange;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*


//import main.java.com.crl.nms.HibernateDbConn.DbHandler;
//import main.java.com.crl.nms.CDTAUTODISCOVERY.Constants;
//import main.java.com.crl.nms.CDTAUTODISCOVERY.Global;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import main.java.com.crl.nms.lldpdiscovery.LLDPDiscoveryThread;

import com.crl.nms.CDTAUTODISCOVERY.Constants;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

*/
/**
 * @author root
 *//*

@Service
public class NeDetailPollThreadService extends Thread implements Constants {

    // @Autowired
    private DbHandlerService dbHandlerService;
    StringBuilder sb;

    // private static final org.apache.log4j.Logger logger =
    // org.apache.log4j.Logger.getLogger(NeDetailPollThread.class);
    private static final Logger logger = LoggerFactory.getLogger(NeDetailPollThreadService.class);

    IpRange ipRange;
    NeDetailPollThreadService() {

    }
    NeDetailPollThreadService(StringBuilder sb, DbHandlerService dbHandlerService,IpRange ipRange) {
        this.sb = sb;
        this.dbHandlerService = dbHandlerService;
        this.ipRange=ipRange;
        // dbObj = new DbHandlerService();
    }

    @Override
    public void run() {

        logger.info("NePingSubPollThread Running" + Thread.currentThread().getName());
        Runtime runtime = Runtime.getRuntime();
        String cmd = sb.toString();
        String inputLine;
        Process process = null;
        List linelist;
        ArrayList<String> liveIpList = new ArrayList();
        try {
            process = runtime.exec(cmd);
            process.waitFor();
            linelist = IOUtils.readLines(process.getInputStream());
            try {
                process.getInputStream().close();
                process.getOutputStream().close();
            } catch (IOException | NullPointerException | ArrayIndexOutOfBoundsException e) {

            }

            for (int i = linelist.size() - 1; i >= 0; i--) {
                inputLine = (String) linelist.remove(i);
                if (inputLine.length() > 4) {
                    liveIpList.add(inputLine);
                }
                System.out.println(inputLine);

            }
        } catch (InterruptedException | IOException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            logger.info("function:executeFping  Exception=" + e.getMessage());

        } finally {
            if (process != null) {
                process.destroy();
                process.destroyForcibly();
                process = null;
            }
            if (runtime != null) {
                runtime = null;
            }
        }

        if (liveIpList.size() > 0) {
            checkChangeInAliveHosts(liveIpList);
        }

    }

    private void checkChangeInAliveHosts(ArrayList<String> liveIpList) {
        try {
            String neipStr = "";
            String ne_macStr = "";
            String nedescStr = "";
            String neHostNameStr = "";
            short hwType = Constants.WS;//
            short hwSubType = Constants.HW_SUB_TYPE_HP;
            byte neOperSys = Constants.OS_TYPE_LINUX;

            for (int i = 0; i < liveIpList.size(); i++) {

                String result = liveIpList.get(i);
                if (result.contains("MAC Address:")) {
                    String[] data = result.split("MAC Address:");
                    String[] data2 = data[1].split(" ");
                    ne_macStr = data2[1].trim();
                    System.out.println(ne_macStr);
                }
                if (result.contains("Service Info:")) {
                    // Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows
                    // Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel
                    // Service Info: Host: ADNMDA; OS: Windows; CPE:
                    // cpe:/o:microsoft:windows_server_2008:r2, cpe:/o:microsoft:windows
                    // Service Info: Device: switch
                    // Service Info: Host: CITRIX; OS: Windows; CPE: cpe:/o:microsoft:windows
                    // Service Info: OS: Unix
                    // Service Info: OS: Linux; CPE: cpe:/h:hp:integrated_lights-out,
                    // cpe:/o:linux:linux_kernel
                    // Service Info: Host: CRL-PC; OS: Windows; CPE: cpe:/o:microsoft:windows
                    // Service Info: OS: IOS; Device: router; CPE: cpe:/o:cisco:ios
                    // Service Info: Host: NASQNAP; OS: FreeBSD; CPE: cpe:/o:freebsd:freebsd
                    // Service Info: Host: idrac; Device: remote management; CPE: cpe:/h:dell:idrac7
                    // Service Info: Host: idrac; Device: remote management; CPE: cpe:/h:dell:idrac7

                    // byte OS_TYPE_WIN = 1;
                    // byte OS_TYPE_LINUX = 2;
                    // byte OS_TYPE_IOS = 3;
                    if (result.equalsIgnoreCase("cisco:ios") || result.equalsIgnoreCase("switch")) {
                        neOperSys = Constants.OS_TYPE_IOS;
                        hwSubType = Constants.HW_SUB_TYPE_CISCO;
                        hwType = Constants.SWITCH;

                    } else if (result.equalsIgnoreCase("linux") || result.equalsIgnoreCase("FreeBSD")
                            || result.equalsIgnoreCase("Unix")) {
                        neOperSys = Constants.OS_TYPE_LINUX;

                    } else if (result.equalsIgnoreCase("windows")) {
                        neOperSys = Constants.OS_TYPE_WIN;

                    }

                    // switch (result) {
                    // case "Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows":
                    // case "Service Info: Host: ADNMDA; OS: Windows; CPE:
                    // cpe:/o:microsoft:windows_server_2008:r2, cpe:/o:microsoft:windows":
                    // case "Service Info: Host: CITRIX; OS: Windows; CPE:
                    // cpe:/o:microsoft:windows":
                    // case "Service Info: Host: CRL-PC; OS: Windows; CPE:
                    // cpe:/o:microsoft:windows":
                    // case "Service Info: Host: idrac; Device: remote management; CPE:
                    // cpe:/h:dell:idrac7":
                    // break;
                    // case "Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel":
                    // case "Service Info: OS: Unix":
                    // case "Service Info: OS: Linux; CPE: cpe:/h:hp:integrated_lights-out,
                    // cpe:/o:linux:linux_kernel":
                    // case "Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel":
                    // case "Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel":
                    //
                    // break;
                    // case "Service Info: Device: switch":
                    // case "Service Info: OS: IOS; Device: router; CPE: cpe:/o:cisco:ios":
                    // break;
                    // case "Service Info: Host: NASQNAP; OS: FreeBSD; CPE: cpe:/o:freebsd:freebsd":
                    // break;
                    //
                    // }
                    System.out.println(result);

                }
                if (result.contains("OS details") || result.contains("OS guess") || result.contains("CPE")) {
                    if (result.contains("Cisco") || result.contains("cisco")) {
                        hwType = Constants.SWITCH;
                        hwSubType = Constants.HW_SUB_TYPE_CISCO;
                        System.out.println(" hwSubType = Constants.HW_SUB_TYPE_CISCO;");
                    } else if (result.contains("Juniper")) {
                        hwType = Constants.SWITCH;
                        hwSubType = Constants.HW_SUB_TYPE_JUNIPER;
                        System.out.println(" hwSubType = Constants.HW_SUB_TYPE_JUNIPER;");
                    } else if (result.contains("HP") && result.contains("Switch")) {
                        hwType = Constants.SWITCH;
                        hwSubType = Constants.HW_SUB_TYPE_HP;
                        System.out.println(" hwSubType = Constants.HW_SUB_TYPE_HP;");
                    } else if (result.contains("dell")) {

                        hwSubType = Constants.HW_SUB_TYPE_DELL;
                        System.out.println(" hwSubType = Constants.HW_SUB_TYPE_DELL;");

                    }

                    // OS details: Cisco Aironet 1141N (IOS 12.4) or 3602I (IOS 15.3) WAP
                    // OS details: Cisco Aironet 2600-series WAP (IOS 15.2(2))
                    // OS details: Cisco 2950, 2960, 3550, 3560, 3750, or 4500 switch or 6500 router
                    // (IOS 12.1 - 15.0); or Adaptive Security Appliance firewall
                    // OS details: Linux 3.2 - 4.9
                    // OS details: Linux 2.6.32 - 3.10
                    // OS details: Juniper EX2200 switch (JUNOS 12), Juniper Networks J2320 or MX5-T
                    // router; or EX2200, EX3200, EX4200, or EX8200 switch (JUNOS 8.5 - 11.2)
                    // OS details: HP GbW2c Ethernet Blade Switch
                    // OS details: Microsoft Windows Server 2008 SP2 or Windows 10 or Xbox One,
                    // Microsoft Windows 7 SP0 - SP1, Windows Server 2008 SP1, Windows Server 2008
                    // R2, Windows 8,
                    // OS details: Microsoft Windows 10 1507 - 1607
                    // //OS details: HP LaserJet M451dn, CM1415fnw, or CP4525
                    // OS details: Microsoft Windows Server 2008 SP2, Microsoft Windows Server 2008
                    // SP2 or Windows 10 or Xbox One, M
                    // OS details: HP iLO 4 remote management interface
                    // OS details: Cisco Aironet 2600-series WAP (IOS 15.2(2))
                    System.out.println(result);

                }
                if (result.contains("Device type:")) {
                    System.out.println(result);

                    // Device type: switch
                    // Device type: general purpose|media device
                    // Device type: printer
                    // Device type: remote management
                    switch (result) {
                        case "Device type: WAP":
                            hwType = Constants.SWITCH;
                            System.out.println("Device type: WAP");
                            break;
                        case "Device type: general purpose":
                            hwType = Constants.WS;
                            System.out.println(" Device type: general purpose");
                            break;
                        case "Device type: switch":
                            hwType = Constants.SWITCH;
                            System.out.println("Device type: SWITCH");

                            break;
                        case "Device type: printer":
                            if (hwType != Constants.SWITCH) {
                                hwType = Constants.PRINTER;
                                System.out.println("Device type: printer");
                            }
                            break;
                        case "remote management":
                            hwType = Constants.SERVER;
                            System.out.println("remote management");
                            break;
                        default:
                            hwType = Constants.WS;
                            System.out.println("Default:remote management");
                            break;
                    }

                }
                if (result.contains("Nmap scan report for")) {
                    String[] data = result.split("Nmap scan report for");
                    neipStr = data[1].trim();

                    String[] parts = neipStr.split("\\s+|\\(|\\)");

                    if (parts.length >= 3) {
                        nedescStr = parts[0];
                        neipStr = parts[2].trim();

                        System.out.println("Hostname: " + nedescStr);
                        System.out.println("IP Address: " + neipStr);
                    } else {
                        System.out.println("Invalid input format.");
                        nedescStr = neipStr;
                    }

                }


                // UpdateData(String neipStr, String ne_macStr, String nedescStr, String
                // neHostNameStr, short hwType, short hwSubType, String neOperSys) ;
            }
            // DbHandlerService db =new DbHandlerService();
            if(ne_macStr.length()>0) {
                Global.ne_MAC_IP_HashMap.put(ne_macStr, neipStr);
            }
         //   if(hwType==Constants.ROUTERS || hwType==Constants.SWITCH) {
                LLDPDiscoveryThreadService lLDPDiscoveryThread = new LLDPDiscoveryThreadService(neipStr,dbHandlerService,ipRange);
                Global.neDetailscheduledThreadPool.submit(lLDPDiscoveryThread);
        //    }
            dbHandlerService.updateData(neipStr, ne_macStr, nedescStr, neHostNameStr, hwType, hwSubType, neOperSys);

         //   LLDPDiscoveryThreadService lLDPDiscoveryThread = new LLDPDiscoveryThreadService(neipStr);

        } catch (Exception ex) {
            logger.info("NePollingThread checkChangeInAliveHosts=" + ex.getMessage());
        }
    }

}
*/
package com.crl.nms.service;

import com.crl.nms.CDTAUTODISCOVERY.Constants;
import com.crl.nms.CDTAUTODISCOVERY.Global;
import com.crl.nms.messages.IpRange;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class NeDetailPollThreadService extends Thread implements Constants {

    private static final Logger logger = LoggerFactory.getLogger(NeDetailPollThreadService.class);

    @Autowired
    private DbHandlerService dbHandlerService;

    private StringBuilder sb;
    private IpRange ipRange;

    public NeDetailPollThreadService() {
    }

    public NeDetailPollThreadService(StringBuilder sb, DbHandlerService dbHandlerService, IpRange ipRange) {
        this.sb = sb;
        this.dbHandlerService = dbHandlerService;
        this.ipRange = ipRange;
    }

    @Override
    public void run() {
        logger.info("NeDetailPollThreadService running on thread: {}", Thread.currentThread().getName());
        Runtime runtime = Runtime.getRuntime();
        String cmd = sb.toString();
        List<String> linelist = new ArrayList<>();
        List<String> liveIpList = new ArrayList<>();

        Process process = null;

        try {
            process = runtime.exec(cmd);
            process.waitFor();
            linelist = IOUtils.readLines(process.getInputStream(), "UTF-8");
            IOUtils.closeQuietly(process.getInputStream());
            IOUtils.closeQuietly(process.getOutputStream());

            for (String inputLine : linelist) {
                if (inputLine.length() > 4) {
                    liveIpList.add(inputLine);
                    logger.debug("Line: {}", inputLine);
                }
            }
        } catch (InterruptedException | IOException e) {
            logger.error("Exception during command execution: {}", e.getMessage(), e);
        } finally {
            if (process != null) {
                process.destroy();
                process.destroyForcibly();
            }
        }

        if (!liveIpList.isEmpty()) {
            checkChangeInAliveHosts(liveIpList);
        }
    }

    private void checkChangeInAliveHosts(List<String> liveIpList) {
        try {
            String neipStr = "";
            String ne_macStr = "";
            String nedescStr = "";
            String neHostNameStr = "";
            Short hwType = Constants.UNKNOWN;
            Short hwSubType = Constants.HW_SUB_TYPE_HP;
            byte neOperSys = Constants.OS_TYPE_LINUX;

            for (String result : liveIpList) {
                try {
                    if (result.contains("MAC Address:")) {
                        ne_macStr = extractMacAddress(result);
                        logger.debug("MAC Address: {}", ne_macStr);
                    }
                    if (result.contains("Service Info:")) {
                        neOperSys = determineOperatingSystem(result);
                        hwType = determineHardwareType(result);
                        hwSubType = determineHardwareSubType(result);
                    }
                    if (result.contains("Device type:")) {
                        hwType = determineDeviceType(result);
                    }
                    if (result.contains("Nmap scan report for")) {
                        String[] data = result.split("Nmap scan report for ");
                        neipStr = extractIpAddress(data);
                        String[] parts = neipStr.split("\\s+|\\(|\\)");
                        if (parts.length >= 3) {
                            nedescStr = parts[0];
                            neipStr = parts[2].trim();
                        }
                        System.out.println("Hostname: " + nedescStr);
                        System.out.println("IP Address: " + neipStr);
                        logger.debug("Hostname: {}", nedescStr);
                        logger.debug("IP Address: {}", neipStr);
                    }
                    if (result.contains("scanned ports")) {
                        hwType = Constants.SWITCH;
                    }
                    if (result.contains("Microsoft Windows")) {
                        System.out.println("Device Type: Microsoft Windows Device");
                        hwType = Constants.SERVER;
                    }
                    if (result.contains("Juniper")) {
                        System.out.println("Device Type: Juniper Networking Device");
                    }
                    if (result.contains("OpenSSH") || result.contains("SSH") || result.contains("server")) {
                        System.out.println("Device Type: SSH Server (likely a Linux/Unix device)");
                        hwType = Constants.SERVER;
                    }
                    if (result.contains("Mocana NanoSSH")) {
                        System.out.println("Device Type: Embedded System with Mocana NanoSSH");
                        hwType = Constants.IP_PHONE;
                    }
                    if (result.contains("Kerberos") || result.contains("Active Directory")) {
                        System.out.println("Device Type: Microsoft Active Directory Server");
                        hwType = Constants.SERVER;
                    }
                    if (result.contains("HTTP")) {
                        System.out.println("Device Type: Web Server");
                        hwType = Constants.SERVER;
                    }
                    if (result.contains("SNMP")) {
                        System.out.println("Device Type: Likely a Network Device (Router/Switch)");
                        hwType = Constants.SWITCH;
                    }
                }
                catch (Exception e){
                    System.out.println("RAVI");
                    e.printStackTrace();
                }
            }

            if (hwType == Constants.SERVER) {
                if (nedescStr.length() == 0) {
                    nedescStr = "SERVER_" + neipStr.replace('.', '_');
                }
                // Handle server-specific logic here
                logger.info("Detected a server: {}", nedescStr);
                // You can add more server-specific processing here
            }
            if (hwType == Constants.WS) {
                if (nedescStr.length() == 0) {
                    nedescStr = "WORKSTATION_" + neipStr.replace('.', '_');
                }
                // Handle server-specific logic here
                logger.info("Detected a WORKSTATION: {}", neipStr);
                // You can add more server-specific processing here
            }
            if (hwType == Constants.SWITCH) {
                if (nedescStr.length() == 0) {
                    nedescStr = "SWITCH_" + neipStr.replace('.', '_');
                }
                // Handle server-specific logic here
                logger.info("Detected a switch: {}", nedescStr);
                // You can add more server-specific processing here
            }
            if (hwType == Constants.IP_PHONE) {
                if (nedescStr.length() == 0) {
                    nedescStr = "IPPHONE_" + neipStr.replace('.', '_');
                }
                // Handle server-specific logic here
                logger.info("Detected a switch: {}", nedescStr);
                // You can add more server-specific processing here
            }

            if (hwType == Constants.PRINTER) {
                if (nedescStr.length() == 0) {
                    nedescStr = "PRINTER_" + neipStr.replace('.', '_');
                }
                // Handle server-specific logic here
                logger.info("Detected a printer: {}", nedescStr);
                // You can add more server-specific processing here
            }
            if (hwType == Constants.UNKNOWN) {
                if (nedescStr.length() == 0) {
                    nedescStr = "UNKNOWN_" + neipStr.replace('.', '_');
                }
                // Handle server-specific logic here
                logger.info("Detected a UNKNOWN: {}", nedescStr);
                // You can add more server-specific processing here
            }


            if (!ne_macStr.isEmpty()) {
                Global.ne_MAC_IP_HashMap.put(ne_macStr, neipStr);
            }

            LLDPDiscoveryThreadService lLDPDiscoveryThread = new LLDPDiscoveryThreadService(neipStr, dbHandlerService, ipRange);
            Global.neDetailscheduledThreadPool.submit(lLDPDiscoveryThread);

            dbHandlerService.updateData(neipStr, ne_macStr, nedescStr, neHostNameStr, hwType, hwSubType, neOperSys);

        } catch (Exception ex) {
            logger.error("Exception in checkChangeInAliveHosts: {}", ex.getMessage(), ex);
        }
    }

    private String extractMacAddress(String result) {
        String[] data = result.split("MAC Address:");
        return data[1].split(" ")[1].trim();
    }

    private byte determineOperatingSystem(String result) {
        if (result.contains("cisco:ios") || result.contains("switch")) {
            return Constants.OS_TYPE_IOS;
        } else if (result.contains("linux") || result.contains("FreeBSD") || result.contains("Unix")) {
            return Constants.OS_TYPE_LINUX;
        } else if (result.contains("windows")) {
            return Constants.OS_TYPE_WIN;
        }
        return Constants.OS_TYPE_LINUX; // Default value
    }

    private short determineHardwareType(String result) {
        if (result.contains("Cisco") || result.contains("cisco")) {
            return Constants.SWITCH;
        } else if (result.contains("Juniper")) {
            return Constants.SWITCH;
        } else if (result.contains("HP") || result.contains("switch")) {
            return Constants.SWITCH;
        } else if (result.contains("dell") || result.contains("Linux") || result.contains("Windows")) {
            return Constants.SERVER;
        }else if (result.contains("Workstation")) {
            return Constants.WS;
        }



      /*  else if (result.contains("Microsoft Windows")) {
            System.out.println("Device Type: Microsoft Windows Device");
            return Constants.SERVER;
        } else if (result.contains("Juniper")) {
            System.out.println("Device Type: Juniper Networking Device");
        } else if (result.contains("OpenSSH") || result.contains("SSH")) {
            System.out.println("Device Type: SSH Server (likely a Linux/Unix device)");
            return Constants.SERVER;
        } else if (result.contains("Mocana NanoSSH")) {
            System.out.println("Device Type: Embedded System with Mocana NanoSSH");
            return Constants.IP_PHONE;
        } else if (result.contains("Kerberos") || result.contains("Active Directory")) {
            System.out.println("Device Type: Microsoft Active Directory Server");
            return Constants.SERVER;
        } else if (result.contains("HTTP")) {
            System.out.println("Device Type: Web Server");
            return Constants.SERVER;
        }
        else if (result.contains("SNMP")) {
            System.out.println("Device Type: Likely a Network Device (Router/Switch)");
            return Constants.SWITCH;
        }*/
       /* else {
            System.out.println("Device Type: Unknown");
        }*/
        return Constants.UNKNOWN; // Default value
    }

    private short determineHardwareSubType(String result) {
        if (result.contains("Cisco")) {
            return Constants.HW_SUB_TYPE_CISCO;
        } else if (result.contains("Juniper")) {
            return Constants.HW_SUB_TYPE_JUNIPER;
        } else if (result.contains("HP")) {
            return Constants.HW_SUB_TYPE_HP;
        } else if (result.contains("dell")) {
            return Constants.HW_SUB_TYPE_DELL;
        }



        return Constants.HW_SUB_TYPE_HP; // Default value
    }

    private short determineDeviceType(String result) {
        switch (result) {
            case "Device type: WAP":
                return Constants.SWITCH;
            case "Device type: general purpose":
                return Constants.WS;
            case "Device type: switch":
                return Constants.SWITCH;
            case "Device type: printer":
                return Constants.PRINTER;
            case "remote management":
                return Constants.SERVER;
            default:
                return Constants.UNKNOWN;
        }
    }

    private String extractIpAddress(String[] data) {

        if (data.length >= 2) {
            return data[1].trim();
        }
        return "";
    }

/*    private String extractHostName(String[] data, String neipStr) {
        String nedescStr = "";
        String[] parts = neipStr.split("\\s+|\\(|\\)");
        if (parts.length >= 3) {
            nedescStr = parts[0];
            neipStr = parts[2].trim();

            System.out.println("Hostname: " + nedescStr);
            System.out.println("IP Address: " + neipStr);
        }

        return nedescStr;
    }*/
}
