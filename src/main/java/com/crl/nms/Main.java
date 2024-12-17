/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms;


import com.crl.nms.CDTAUTODISCOVERY.Constants;
import com.crl.nms.CDTAUTODISCOVERY.Global;
import com.crl.nms.repository.AuthenticationProtocolEnumRepo;
import com.crl.nms.repository.NeConnectivityRepo;
import com.crl.nms.repository.NmsNeDetailRepository;
import com.crl.nms.repository.PrivacyProtocolEnumRepo;
import com.crl.nms.service.DbHandlerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author root
 */
@SpringBootApplication
public class Main {


    /**
     * @param args the command line arguments
     */

    private static final Logger logger = LoggerFactory.getLogger(DbHandlerService.class);
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private KafkaTemplate<String, String> kafkaJSONStringMsgSender;

    public static void main(String[] args) {
        //System.setProperty("spring.config.location","file:/usr/local/cbtc/NMS/data/DatabaseProperties/AlarmHandler/application.properties");

        // Get the path where the JAR file is executed
        String jarExecutionPath = System.getProperty("user.dir");
        System.out.println(jarExecutionPath);

        // Construct the path to application.properties relative to the execution path
        String dynamicPath = "file:" + jarExecutionPath + "/applicationneautodiscovery.properties";
        System.out.println("ApplicationNeAutodiscovery.properties should be at " + dynamicPath);

        // Set the dynamic path for spring.config.location
        System.setProperty("spring.config.location", dynamicPath);

        SpringApplication.run(Main.class, args);


    }

    private static void setDatabasePropertyAndSelfIp() {
        FileReader reader = null;
        try {
            reader = new FileReader(Constants.DATABASE_CONF_FILE);
            Properties prop = new Properties();
            try {
                prop.load(reader);
                Global.currObj.dbDriver = prop.getProperty("jdbc.driverClassName");
                Global.currObj.dbURL = prop.getProperty("jdbc.url");
                Global.currObj.dbUser = prop.getProperty("jdbc.username");
                Global.currObj.dbPasswd = prop.getProperty("jdbc.password");
            } catch (IOException ex) {
                logger.info("setDatabasePropertyAndSelfIp ->" + ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            logger.info("setDatabasePropertyAndSelfIp ->" + ex.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }

            } catch (IOException ex) {
                logger.info("setDatabasePropertyAndSelfIp ->" + ex.getMessage());
            }
        }
    }

    @Bean
    public CommandLineRunner commandLineRunner(DbHandlerService dbHandlerService, NmsNeDetailRepository nmsNeDetailRepository, NeConnectivityRepo neConnectivityRepo, AuthenticationProtocolEnumRepo authenticationProtocolEnumRepo, PrivacyProtocolEnumRepo privacyProtocolEnumRepo) {

        return args -> {
//            dbHandlerService.intiateActor(dbHandlerService);

            //UtilFunctions infoObj = new UtilFunctions();
            //infoObj.getDatabaseProperties();
            //setDatabasePropertyAndSelfIp();
            DbHandlerService dbObj = new DbHandlerService();
            dbObj.initialize(nmsNeDetailRepository);

            //  TestIp testIp=new TestIp();
            // sendMsgToNeAlarm(testIp);
            //   NeFpingPollThreadService neFpingPollThreadService1=new NeFpingPollThreadService("192.168.110.33","192.168.110.33",dbHandlerService);
//          NeFpingPollThreadService neFpingPollThreadService1=new NeFpingPollThreadService(ipRange.getStartIp(),ipRange.getEndIp(),dbHandlerService);
            // neFpingPollThreadService1.run();
            //     OperationSwitchService operationSwitchService=new OperationSwitchService(dbHandlerService);

            // dbObj.getNmsIpAddress();
            //List infoList = dbObj.loadAlarmClassfication();
            // if (infoList != null && !infoList.isEmpty()) {
            //     Iterator itr = infoList.iterator();
            //  while (itr.hasNext()) {
            //     Object[] row = (Object[]) itr.next();

            // AlarmClassification alarmObj = new AlarmClassification();
            //  alarmObj.alarmId = Short.parseShort(row[0].toString());
            //alarmObj.severity = Byte.parseByte(row[1].toString());
            //alarmObj.desc = row[2].toString();
            //Global.alarmClassMap.put(alarmObj.alarmId, alarmObj);
            // }
            //  }

            // new PcktAnalyzerThread().start();
            //   new CmdAnalyzerThread().start();

            // PcktAnalyzerThread pworker = new PcktAnalyzerThread();//pktAnalyzerThread
            // CmdAnalyzerThread cworker = new CmdAnalyzerThread();

/*           for (int i = 0; i < 200; i++) {
         //      Global.pscheduledThreadPool.scheduleAtFixedRate(pworker, 0, 1, TimeUnit.SECONDS);
           }
           for (int i = 0; i < 10; i++) {
              // Global.cscheduledThreadPool.scheduleAtFixedRate(cworker, 0, 1, TimeUnit.SECONDS);
           }*/

            try {

                //     SocketAddress bindaddr = new InetSocketAddress("192.168.103.212", Constants.ALARM_PORT);
                //   SocketAddress bindaddr = new InetSocketAddress(Global.currObj.selfIP, Constants.ALARM_PORT);
                //  DatagramSocket socket = new DatagramSocket(bindaddr);
                //  logger.info("Alarm Handler Applications Server start ------");
            /*   boolean flag = true;
               while (flag) {
                //   final byte[] buffer = new byte[Constants.UDP_BUFF_SIZE];
                 //  DatagramPacket packet = new DatagramPacket(buffer, Constants.UDP_BUFF_SIZE);
                  // socket.receive(packet);

                //   if (buffer[0] == Constants.WEB_SERVICE_CSCI) {
                   //    synchronized (Global.cmdBufferList) {
                  //         Global.cmdBufferList.add(buffer);
                           //  if (Global.CMD_WAIT_FLAG) {
                           //     Global.CMD_WAIT_FLAG = false;
                   //        Global.cmdBufferList.notify();
                           //  }
                 //      }
                  // } else {
                   //    synchronized (Global.udpBufferList) {
                    //       Global.udpBufferList.add(buffer);

//                        if (Global.SYNC_WAIT_FLAG) {
//                            Global.SYNC_WAIT_FLAG = false;
                       //    Global.udpBufferList.notify();
                           //   }
                     //  }
                 //  }
               }*/
            } catch (Exception ex) {
                logger.info("Error in socket creation ->" + ex.toString());
                System.exit(1);
            } finally {
                // System.exit(1);
            }
        };
    }

    private void sendMsgToNeAlarm(Object messages) {
        try {
            String message = objectMapper.writeValueAsString(messages);
            kafkaJSONStringMsgSender.send(Global.STATRT_AUTO_DISCOVERY, message);

        } catch (Exception e) {
            logger.error("Failed to send message: ", e);
        }
    }


    /*        @Bean
    public CommandLineRunner commandLineRunner(DbHandlerService dbHandlerService) {

        return args -> {

            dbHandlerService.intiateActor(dbHandlerService);

            UtilFunctions infoObj = new UtilFunctions();
            infoObj.getDatabaseProperties();
            setDatabasePropertyAndSelfIp();
            DbHandler dbObj = new DbHandler();
            dbObj.getNmsIpAddress();
            List infoList = dbObj.loadAlarmClassfication();
            if (infoList != null && !infoList.isEmpty()) {
                Iterator itr = infoList.iterator();
                while (itr.hasNext()) {
                    Object[] row = (Object[]) itr.next();

                    AlarmClassification alarmObj = new AlarmClassification();
                    alarmObj.alarmId = Short.parseShort(row[0].toString());
                    alarmObj.severity = Byte.parseByte(row[1].toString());
                    alarmObj.desc = row[2].toString();
                    Global.alarmClassMap.put(alarmObj.alarmId, alarmObj);
                }
            }

            new PcktAnalyzerThread().start();
            new CmdAnalyzerThread().start();

            PcktAnalyzerThread pworker = new PcktAnalyzerThread();//pktAnalyzerThread
            CmdAnalyzerThread cworker = new CmdAnalyzerThread();

            for (int i = 0; i < 200; i++) {
                Global.pscheduledThreadPool.scheduleAtFixedRate(pworker, 0, 1, TimeUnit.SECONDS);
            }
            for (int i = 0; i < 10; i++) {
                Global.cscheduledThreadPool.scheduleAtFixedRate(cworker, 0, 1, TimeUnit.SECONDS);
            }

            try {

                //     SocketAddress bindaddr = new InetSocketAddress("192.168.103.212", Constants.ALARM_PORT);
                SocketAddress bindaddr = new InetSocketAddress(Global.currObj.selfIP, Constants.ALARM_PORT);
                DatagramSocket socket = new DatagramSocket(bindaddr);
                logger.info("Alarm Handler Applications Server start ------");
                boolean flag = true;
                while (flag) {
                    final byte[] buffer = new byte[Constants.UDP_BUFF_SIZE];
                    DatagramPacket packet = new DatagramPacket(buffer, Constants.UDP_BUFF_SIZE);
                    socket.receive(packet);

                    if (buffer[0] == Constants.WEB_SERVICE_CSCI) {
                        synchronized (Global.cmdBufferList) {
                            Global.cmdBufferList.add(buffer);
                            //  if (Global.CMD_WAIT_FLAG) {
                            //     Global.CMD_WAIT_FLAG = false;
                            Global.cmdBufferList.notify();
                            //  }
                        }
                    } else {
                        synchronized (Global.udpBufferList) {
                            Global.udpBufferList.add(buffer);

//                        if (Global.SYNC_WAIT_FLAG) {
//                            Global.SYNC_WAIT_FLAG = false;
                            Global.udpBufferList.notify();
                            //   }
                        }
                    }
                }
            } catch (IOException ex) {
                logger.info("Error in socket creation ->" + ex.toString());
                System.exit(1);
            } finally {
                System.exit(1);
            }

        };




    }

     */


}



/*    public static void main(String[] args) {

        // TODO code application logic here
        UtilFunctions infoObj = new UtilFunctions();
        infoObj.getDatabaseProperties();
        setDatabasePropertyAndSelfIp();
        DbHandler dbObj = new DbHandler();
        dbObj.getNmsIpAddress();
        List infoList = dbObj.loadAlarmClassfication();
        if (infoList != null && !infoList.isEmpty()) {
            Iterator itr = infoList.iterator();
            while (itr.hasNext()) {
                Object[] row = (Object[]) itr.next();

                AlarmClassification alarmObj = new AlarmClassification();
                alarmObj.alarmId = Short.parseShort(row[0].toString());
                alarmObj.severity = Byte.parseByte(row[1].toString());
                alarmObj.desc = row[2].toString();
                Global.alarmClassMap.put(alarmObj.alarmId, alarmObj);
            }
        }

        new PcktAnalyzerThread().start();
        new CmdAnalyzerThread().start();

        PcktAnalyzerThread pworker = new PcktAnalyzerThread();//pktAnalyzerThread
        CmdAnalyzerThread cworker = new CmdAnalyzerThread();

        for (int i = 0; i < 200; i++) {
            Global.pscheduledThreadPool.scheduleAtFixedRate(pworker, 0, 1, TimeUnit.SECONDS);
        }
        for (int i = 0; i < 10; i++) {
            Global.cscheduledThreadPool.scheduleAtFixedRate(cworker, 0, 1, TimeUnit.SECONDS);
        }

        try {

            //     SocketAddress bindaddr = new InetSocketAddress("192.168.103.212", Constants.ALARM_PORT);
            SocketAddress bindaddr = new InetSocketAddress(Global.currObj.selfIP, Constants.ALARM_PORT);
            DatagramSocket socket = new DatagramSocket(bindaddr);
            logger.info("Alarm Handler Applications Server start ------");
            boolean flag = true;
            while (flag) {
                final byte[] buffer = new byte[Constants.UDP_BUFF_SIZE];
                DatagramPacket packet = new DatagramPacket(buffer, Constants.UDP_BUFF_SIZE);
                socket.receive(packet);

                if (buffer[0] == Constants.WEB_SERVICE_CSCI) {
                    synchronized (Global.cmdBufferList) {
                        Global.cmdBufferList.add(buffer);
                        //  if (Global.CMD_WAIT_FLAG) {
                        //     Global.CMD_WAIT_FLAG = false;
                        Global.cmdBufferList.notify();
                        //  }
                    }
                } else {
                    synchronized (Global.udpBufferList) {
                        Global.udpBufferList.add(buffer);

//                        if (Global.SYNC_WAIT_FLAG) {
//                            Global.SYNC_WAIT_FLAG = false;
                        Global.udpBufferList.notify();
                        //   }
                    }
                }
            }
        } catch (IOException ex) {
            logger.info("Error in socket creation ->" + ex.toString());
            System.exit(1);
        } finally {
            System.exit(1);
        }

    }

    private static void setDatabasePropertyAndSelfIp() {
        FileReader reader = null;
        try {
            reader = new FileReader(Constants.DATABASE_CONF_FILE);
            Properties prop = new Properties();
            try {
                prop.load(reader);
                Global.currObj.dbDriver = prop.getProperty("jdbc.driverClassName");
                Global.currObj.dbURL = prop.getProperty("jdbc.url");
                Global.currObj.dbUser = prop.getProperty("jdbc.username");
                Global.currObj.dbPasswd = prop.getProperty("jdbc.password");
            } catch (IOException ex) {
                logger.info("setDatabasePropertyAndSelfIp ->" + ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            logger.info("setDatabasePropertyAndSelfIp ->" + ex.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }

            } catch (IOException ex) {
                logger.info("setDatabasePropertyAndSelfIp ->" + ex.getMessage());
            }
        }

    }

}*/
