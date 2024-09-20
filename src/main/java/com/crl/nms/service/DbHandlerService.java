/*
package com.crl.nms.service;

import com.crl.nms.CDTAUTODISCOVERY.Constants;
import com.crl.nms.CDTAUTODISCOVERY.Global;
import com.crl.nms.databases.*;

import com.crl.nms.pojo.NeObjectPojo;
import com.crl.nms.repository.NeConnectivityRepo;


import com.crl.nms.repository.NmsNeDetailRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

import static com.crl.nms.CDTAUTODISCOVERY.Constants.ACTIVE;

@Service
public class DbHandlerService {

    @Autowired
    private NmsNeDetailRepository nmsNeDetailrepo;

    @Autowired
    private NeConnectivityRepo neConnectivityRepo;

    private ConcurrentHashMap<NmsNeTypes, Integer> neKeyHashMapCount = new ConcurrentHashMap(16, 0.9f, 1);
    Map<NmsNeTypes,Short>result=new HashMap<>();

    @Autowired
    KafkaTemplate<String, String> kafkaJSONStringMsgSender;
    */
/*    @Autowired
        NmsNeDetailRepository nmsNeDetailrepo;*//*

 public DbHandlerService(NmsNeDetailRepository nmsNeDetailrepo,NeConnectivityRepo neConnectivityRepo){



    Map<NmsNeTypes,NmsNeDetail>latestNeidByNetype=new HashMap<>();
    List<NmsNeDetail> nedetailslist=nmsNeDetailrepo.findAll();
    for (NmsNeDetail neDetail:nedetailslist) {
        //int count_bytype=neDetail.
        if (!latestNeidByNetype.containsKey(neDetail.getNeType())|| neDetail.getNeUptime().after(latestNeidByNetype.get(neDetail.getNeType()).getNeUptime())){
            latestNeidByNetype.put(neDetail.getNeType(),neDetail);
        }
        Global.ipKeyHash.put(neDetail.getNeIp().trim(), neDetail.getNekey().trim());
    }

    for (Map.Entry<NmsNeTypes,NmsNeDetail>entry:latestNeidByNetype.entrySet()){
        result.put(entry.getKey(),entry.getValue().getNeId());
    }

 }


   // private Object String;
    private static final Logger logger = LoggerFactory.getLogger(DbHandlerService.class);

    //   private static final Logger logger = Logger.getLogger(DbHandler.class);

   */
/* public String getNeDesc(String neKey) {
 *//*
 */
/* String query = new StringBuilder("select NE_DESC from NMS_NE_DETAIL where NEKEY='").append(neKey).append("'").toString();
        List neDesc = selectSqlQuery(query);*//*
 */
/*

        List<String> result = nmsNeDetailrepo.findNeDescBynekey(neKey);
        //  return result.orElse(null);

        if (result != null && !result.isEmpty()) {

            Iterator itr1 = result.iterator();

            while (itr1.hasNext()) {
                try {
                    String info = (String) itr1.next();
                    return info;

                } catch (NumberFormatException e) {
                     logger.info(e.getMessage());
                }
            }

        }
        return "";
    }*//*


 */
/*  public List getHwList() {
 *//*
 */
/* NEKEY					   NOT NULL VARCHAR2(30)
        AGENCY_ID				   NOT NULL NUMBER(5)
         NE_TYPE				   NOT NULL NUMBER(3)
            NE_ID					   NOT NULL NUMBER(3)
        NE_IP						    VARCHAR2(20)
         NE_DESC					    VARCHAR2(50)
         NE_HOSTNAME					    VARCHAR2(200)
         NE_STATUS					    NUMBER(2)
        NE_UPTIME					    TIMESTAMP(6)
        NE_DOWNTIME					    TIMESTAMP(6)
        SNMP_VERSION					    NUMBER(2)
         SNMP_PROFILE_STATUS				    NUMBER(2)
         HARDWARE_ID				   NOT NULL NUMBER(10*//*
 */
/*
        List<Map<String, Object>> resultList = new ArrayList<>();
        Connection connection = null;

        try {
            // Attempt to establish the connection
            //  connection = DriverManager.getConnection(
            //   main.java.com.crl.nms.CDTAUTODISCOVERY.Global.l_dbUrlDbPrimary,
            //  main.java.com.crl.nms.CDTAUTODISCOVERY.Global.l_dbUser,
            //   main.java.com.crl.nms.CDTAUTODISCOVERY.Global.l_dbPasswd
            // );

            if (connection != null) {
                //String query = "SELECT ne_type, ne_ip, nekey, ne_desc, hardware_id FROM nms_ne_detail";




               //try (Statement statement = connection.createStatement();
                    // ResultSet resultSet = statement.executeQuery(query)) {

                  //  ResultSetMetaData metaData = resultSet.getMetaData();
                 //   int columnCount = metaData.getColumnCount();

                   // while (resultSet.next()) {
                        Map<String, Object> row = new HashMap<>();
                       // for (int i = 1; i <= columnCount; i++) {
                      //      String columnName = metaData.getColumnName(i);
                       //     Object value = resultSet.getObject(i);
                       //     row.put(columnName, value);
                       // }
                      //  resultList.add(row);
                   // }
              //  }
            }
       // } catch (SQLException e) {
           // System.out.println(e.getMessage());

        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());

            }
        }
        return resultList;

       // List<Object[]> result = nmsNeDetailrepo.findNeDetails();
         //       return result;
    }*//*




 */
/* public boolean executeSqlQuery(String query) {
        boolean flag = true;

        boolean primaryFlag = false;
        boolean secondaryFlag = false;

        try {
            // PrimaryHibernateWrapper Ph_wrapper = new PrimaryHibernateWrapper();
            // primaryFlag = Ph_wrapper.executeSqlQuery(query);
        } catch (HibernateException e) {
              logger.info(e.getMessage());
        } finally {
            // Cleanup code if needed
        }

        try {
            //SecondaryHibernateWrapper Sh_wrapper = new SecondaryHibernateWrapper();
            //  secondaryFlag = Sh_wrapper.executeSqlQuery(query);
        } catch (HibernateException e) {
              logger.info(e.getMessage());
        } finally {
            // Cleanup code if needed
        }

        flag = primaryFlag && secondaryFlag;

        return flag;
    }*//*


 */
/*  public List selectSqlQuery(String query) {

        List resultList = new ArrayList();

        try {
            //  PrimaryHibernateWrapper Ph_wrapper = new PrimaryHibernateWrapper();
            //  resultList = Ph_wrapper.selectSqlQuery(query);
        } catch (HibernateException e) {
            //   logger.info(e.getMessage());
        } finally {
            // Cleanup code if needed
        }

// Only execute on secondary if primary query fails
        if (resultList == null || resultList.isEmpty()) {

            try {
                //  SecondaryHibernateWrapper Sh_wrapper = new SecondaryHibernateWrapper();
                //  resultList = Sh_wrapper.selectSqlQuery(query);
            } catch (HibernateException e) {
                //  logger.info(e.getMessage());
            } finally {
                // Cleanup code if needed
            }
        }

        return resultList;

    }*//*


 */
/* byte[] unsignedShortToByte(short myInt) {
        byte[] bytes = new byte[2];
        bytes[0] = (byte) (myInt);
        myInt >>= 8;
        bytes[1] = (byte) (myInt);
        return bytes;
    }*//*


 */
/*    public void loadAgencyHwListFromDB() {
        try {
            // Global.neHashMap.clear();
            List agencyHwlist = getHwList();
            if (agencyHwlist != null && !agencyHwlist.isEmpty()) {
                startAgencyHwPoll(agencyHwlist);
            }

        } catch (Exception e) {
            //logger.info(e.getMessage());
        }

    }*//*


 */
/* void startAgencyHwPoll(List<Map<String, Object>> agencyHwlist) {
        try {
            if (agencyHwlist != null && !agencyHwlist.isEmpty()) {
                for (Map<String, Object> info : agencyHwlist) {
                   // main.java.com.crl.nms.NeInfo.NeObject neInfoObj = new main.java.com.crl.nms.NeInfo.NeObject();

                //    neInfoObj.pollAgencyId = 1;
                 //   neInfoObj.clientPollType = 1;

                    if (info.get("ne_type") != null) {
                  //      neInfoObj.neType = Byte.parseByte(info.get("ne_type").toString());
                    } else {
                        continue;
                    }

                    if (info.get("ne_ip") != null) {
                  //      neInfoObj.neIpAddr = info.get("ne_ip").toString();
                    } else {
                        continue;
                    }

                    if (info.get("nekey") != null) {
                     //   neInfoObj.neKey = info.get("nekey").toString();
                    } else {
                        continue;
                    }
//ne_type, ne_ip, nekey, ne_desc, hardware_id
                    if (info.get("ne_desc") != null) {
                     //   neInfoObj.neDesc = info.get("ne_desc").toString();
                    } else {
                        continue;
                    }

                    if (info.get("hardware_id") != null) {
                       // neInfoObj.hardwareId = Short.parseShort(info.get("hardware_id").toString());
                    }

                    //Global.neHashMap.put(neInfoObj.neKey, neInfoObj);
                    //  Global.ne_Ip_Key_HashMap.put(neInfoObj.neIpAddr, neInfoObj.neKey);
                    //  Global.ne_name_Key_HashMap.put(neInfoObj.neDesc, neInfoObj.neKey);
                    //Global.ne_hwId_Key_HashMap.put(String.valueOf(neInfoObj.hardwareId), neInfoObj.neKey);
                    //main.java.com.crl.nms.lldpdiscovery.Global.ipKeyHash.put(neInfoObj.neIpAddr, neInfoObj.neKey);
                }
            }
        } catch (NumberFormatException ex) {
            //logger.info("getAgencyHwList exception is caught ==" + ex.toString());
        }
    }*//*

        public void UpdateData (String neipStr, String ne_macStr, String nedescStr, String neHostNameStr,short hwType,
        short hwSubType, byte neOperSys )
        {
              Iterator itr = Global.neHashMap.keySet().iterator();
            //  if (main.java.com.crl.nms.HibernateDbConn.Global.ne_Ip_Key_HashMap.containsKey(neipStr)) {
            //return;
            //}
            String neKey1 = "";
            int neId = 0;
            ConcurrentHashMap<Integer, Integer> neKeyHashMap = new ConcurrentHashMap(16, 0.9f, 1);
             itr = Global.neHashMap.keySet().iterator();
            while (itr.hasNext()) {
                String nekey = (String) itr.next();

                NeObjectPojo neDetail =Global.neHashMap.get(nekey);
                if (hwType == neDetail.neType) {
                    String[] neKeyArr = nekey.split("_");
                    Integer value = Integer.parseInt(neKeyArr[2]);
                    neKeyHashMap.put(value, value);
                }
            }

         */
/*   for (Integer i = 1; i < 2000; i++) {
                Integer neidValue = neKeyHashMap.get(i);
                if (neidValue == null) {
                    neKey1 = "1_"+ i++ + "_" + hwType ;
                    neId = i;
                    logger.info("neKey1" + neKey1);
                    break;
                }
            }*//*

            //  neDetail
            //  main.java.com.crl.nms.NeInfo.NeObject neDetail = new main.java.com.crl.nms.NeInfo.NeObject();neDetail.neKey = neKey1;
           // neDetail.neType = hwType;
           // neDetail.neId = (short) neId;
           // neDetail.neIpAddr = neipStr;
           // neDetail.neDesc = nedescStr;
           // main.java.com.crl.nms.HibernateDbConn.Global.neHashMap.put(neKey1, neDetail);
            int hwId = 0;
            int ValueZero = 0;
            String ValueZeroInStr = "0";
            int ValueThree = 3;

            String position = "100";
           // com.crl.nms.lldpdiscovery.Global.ipKeyHash.put(neipStr.trim(), neKey1.trim());

            */
/*String InsertData = new StringBuilder("insert into \"nms_ne_detail\" ")
                    .append("(nekey, cpu_limit, csci_id, hardware_id, hdd_limit, is_critical_server, ")
                    .append("ne_desc, ne_downtime, ne_hostname, ne_id, ne_ip, ne_status, ne_uptime, ")
                    .append("node_id, ram_limit, snmp_profile_status, snmp_version, x_pos, y_pos, ne_type,node_key)")
                    .append(" VALUES ('")
                    .append(neKey1.trim()).append("',")
                    .append(main.java.com.crl.nms.CDTAUTODISCOVERY.Constants.LIMIT).append(",")
                    .append(main.java.com.crl.nms.CDTAUTODISCOVERY.Constants.ACTIVE).append(",")
                    .append(hwId).append(",")
                    .append(main.java.com.crl.nms.CDTAUTODISCOVERY.Constants.LIMIT).append(",")
                    .append(main.java.com.crl.nms.CDTAUTODISCOVERY.Constants.ACTIVE).append(",")
                    .append("'").append(nedescStr.trim()).append("',")
                    .append("now(),") // Assuming PostgreSQL's now() function for timestamps
                    .append("'").append(neHostNameStr.trim()).append("',")
                    .append(neId).append(",")
                    .append("'").append(neipStr.trim()).append("',")
                    .append(main.java.com.crl.nms.CDTAUTODISCOVERY.Constants.ACTIVE).append(",")
                    .append("now(),") // Assuming PostgreSQL's now() function for timestamps
                    .append(main.java.com.crl.nms.CDTAUTODISCOVERY.Constants.ACTIVE).append(",")
                    .append(main.java.com.crl.nms.CDTAUTODISCOVERY.Constants.LIMIT).append(",")
                    .append(main.java.com.crl.nms.CDTAUTODISCOVERY.Constants.ACTIVE).append(",")
                    .append(main.java.com.crl.nms.CDTAUTODISCOVERY.Constants.ACTIVE).append(",")
                    .append("'").append(position).append("',")
                    .append("'").append(position).append("',")
                    .append(hwType).append(",")
                    .append("1001")
                    .append(");")
                    .toString();*//*

            // System.out.println(InsertData);
            //  insertQuery(InsertData);
            // Execute the query, e.g., using JDBC
          //  List<NmsNeDetail>nmsNeDetails=nmsNeDetailrepo.findAll();
           List<NmsNeDetail>nmsNeDetail=nmsNeDetailrepo.findByneIp(neipStr);
            List<NmsNeDetail>nmsNeTypeList=nmsNeDetailrepo.findByneTypeNeType(hwType);

    if (nmsNeDetail.size()==0) {
        Short key=hwType;
        NmsNeDetail neDetail= new NmsNeDetail();

        NmsNeTypes nmsNeType =new NmsNeTypes();
        nmsNeType.setNeType(key);
        short neCount=0;
        
        
        if((result==null && result.size()==0 && nmsNeTypeList.size()==0)||nmsNeTypeList.size()==0){
            result.put(nmsNeType,neCount);
        }
        if(result!=null && result.size()>0){
         
        System.out.println(nmsNeType);
         neCount=result.get(nmsNeType);
        
        }
        
        
        neCount++;
        neKey1 = "1001_"+ neCount + "_" + hwType ;

        Global.ipKeyHash.put(neipStr.trim(), neKey1.trim());

        logger.info("neKey1" + neKey1);
        result.put(nmsNeType,neCount);
        //System.out.println("AutoDiscovery of CRL : "+" Hostname "+neHostNameStr.trim()+" Netypes :"+hwType +" NeID : "+neId+" neKey :"+neKey1+" NeIP : "+neipStr);
        NmsNeDetail entity = new NmsNeDetail();
        entity.setNekey(neKey1);
        entity.setCpuLimit(Short.valueOf(Constants.LIMIT));
        entity.setCsciId((short) ACTIVE);
        entity.setHardwareId(hwId);
        entity.setHddLimit(Short.valueOf(Constants.LIMIT));
        entity.setIsCriticalServer((short) ACTIVE);
        entity.setUpdatedBy("AUTODISCOVERY");
        entity.setNeDesc(nedescStr.trim());
        Date dt = new Date();
        entity.setNeDowntime(dt);
        if (neHostNameStr.length()==0){
            neHostNameStr=neipStr;
        }
        entity.setNeHostname(neHostNameStr.trim());

        entity.setNeId((short) neCount);
        entity.setNeIp(neipStr.trim());
        entity.setNeStatus((short) ACTIVE);
        entity.setNeUptime(new Date());
        entity.setNodeId(1001);
        entity.setRamLimit(Short.valueOf(Constants.LIMIT));
        entity.setSnmpProfileStatus(Short.valueOf((short) ACTIVE));
        entity.setSnmpVersion(Short.valueOf((short) ACTIVE));
        entity.setXPos(position);
        entity.setYPos(position);

        NmsNeTypes nmsNeTypes = new NmsNeTypes();
        nmsNeTypes.setNeType(hwType);
        entity.setNeType(nmsNeTypes);

        NodeDefinition nodeDefinition = new NodeDefinition();
        nodeDefinition.setNodeKey(1001);
        entity.setNodeKey(nodeDefinition);

        nmsNeDetailrepo.save(entity);
        sendMsgToKAFKA("AutoDiscovery Completed Successfully","publish_auto_discovery");
    }

        }


         */
/*   public void insertQuery (String InsertData){
                Connection connection = null;

                //   try {
                // Attempt to establish the connection
                //   connection = DriverManager.getConnection(main.java.com.crl.nms.CDTAUTODISCOVERY.Global.l_dbUrlDbPrimary, main.java.com.crl.nms.CDTAUTODISCOVERY.Global.l_dbUser, main.java.com.crl.nms.CDTAUTODISCOVERY.Global.l_dbPasswd);
                //  } catch (SQLException e) {
                //   e.printStackTrace();
                //  }

                if (connection != null) {
                    // Execute the INSERT statement
                    try {
                        Statement statement = connection.createStatement();
                        int rowsAffected = statement.executeUpdate(InsertData);

                        if (rowsAffected > 0) {
                            System.out.println("Insertion successful. " + rowsAffected + " row(s) affected.");
                        } else {
                            System.out.println("Insertion failed. No rows affected.");
                        }

                        statement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    // Close the connection
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                } else {
                    // logger.info("Failed to connect to the database.");

                }

            }*//*


        public void deleteDummyConnectivity (String Destip){
               */
/* String query = new StringBuilder("delete from NE_CONNECTIVITY where SRC_NEIP='")
                        .append(Destip).append("' and SRC_PORT=").append("0").append(" or DEST_NEIP='")
                        .append(Destip).append("' and DEST_PORT=").append("0").toString();
                System.out.println("deleteDummyConnectivity-" + query);
                boolean returnFlag = executeQuery(query);*//*



          //  neConnectivityRepo.deleteByDestIpAndPort(Destip);
        }
        public void insertConnectivity (String Src_ip, String Srcport, String Destip, String DestPort){

            String srcIpKey = Global.ipKeyHash.get(Src_ip);
            String destIpKey = Global.ipKeyHash.get(Destip);
            //String destIpKey1=
            System.out.println("Src_ip--" + Src_ip + "--srcIpKey----" + srcIpKey + "Destip--" + Destip + "--destIpKey--" + destIpKey);
            if (srcIpKey != null && destIpKey != null) {
                String neConn1 = Src_ip + "_" + Srcport + "_" + Destip + "_" + DestPort;
                String neConn2 = Destip + "_" + DestPort + "_" + Src_ip + "_" + Srcport;

                //deleteNeConnectivity(Src_ip, Srcport, Destip, DestPort);
                      */
/*  if (neDuplicateConnectivityHash.get(neConn1) == null && neDuplicateConnectivityHash.get(neConn2) == null) {
                            String query = new StringBuilder("Insert into NE_CONNECTIVITY  values ('1','")
                            .append(srcIpKey).append("','").append(Src_ip).append("',").append(Srcport).append(",'").append("1").append("','").append(destIpKey).append("','").append(Destip).append("',")
                            .append(DestPort).append(",null,null,1,null,null,")
                            .append("'").append(returnCurrUtilDate_Sec()).append("'")
                            .append(",null)").toString();
                            System.out.println("NE_CONNECTIVITY-query" + query);
                            // boolean flag = executeQuery(query);
                             insertQuery(query);
                            System.out.println("NE_CONNECTIVITY-flag--" + query);
                            neDuplicateConnectivityHash.put(neConn1, Src_ip);
                        }*//*


                NeConnectivity entity = new NeConnectivity();
                NeConnectivityPK neConnectivityPK = new NeConnectivityPK();
                neConnectivityPK.setSrcNekey(srcIpKey);
                neConnectivityPK.setDestNekey(destIpKey);
                neConnectivityPK.setSrcPort(Long.parseLong(Srcport));
                neConnectivityPK.setDestPort(Long.parseLong(DestPort));
                entity.setNeConnectivityPK(neConnectivityPK);
                entity.setDestNodeid("1001");
                entity.setLinkid(1L);
                entity.setLinkstatus((short) 0);
                entity.setLinktype("12");
                entity.setPdestIp(Destip);
                entity.setPsrcIp(Src_ip);
                entity.setSrcNodeid("1001");

                entity.setSrcNeip(Src_ip);
                entity.setDestNeip(Destip);
                entity.setDestPortStatus((short) 0);
                entity.setSrcPortStatus((short) 1);
                entity.setUpdatedOn(new Date());
                entity.setUpdatedBy(java.lang.String.valueOf(new Date()));


                neConnectivityRepo.save(entity);
                //neConnectivityHash.remove(neConn1);
            }

        }

    public void sendMsgToKAFKA(Object messages,String topicname) {

        try {
            ObjectMapper Obj = new ObjectMapper();
            String message=Obj.writeValueAsString(messages);;
            kafkaJSONStringMsgSender.send(topicname,message);
            logger.info("{} : published to topic : {}",message,topicname);
        }
        catch (Exception e) {
            logger.error(e.getMessage());
        }
    }
        public void deleteNeConnectivity (String Src_ip, String srcPort, String Destip, String destPort){

               */
/* String query = new StringBuilder("delete from NE_CONNECTIVITY where SRC_NEIP='")
                        .append(Src_ip).append("' and ").append(" SRC_PORT='")
                        .append(srcPort).append("' and ").append(" DEST_NEIP='").append(Destip)
                        .append("' and ").append(" DEST_PORT='").append(destPort).append("'")
                        .toString();
                insertQuery(query);*//*


          //  neConnectivityRepo.deleteBySrcAndDest(Src_ip, srcPort, Destip, destPort);
        }

       */
/* public void deleteNedetail (String Src_ip){

 *//*
 */
/* String query = new StringBuilder("delete from nms_ne_detail where ne_ip='")
                        .append(Src_ip).append("'")
                        .toString();
                insertQuery(query);*//*
 */
/*

            nmsNeDetailrepo.deleteByNeIp(Src_ip);
        }*//*


 */
/*   private boolean executeQuery (String query){
            boolean flag = false;
            // main.java.com.crl.nms.lldpdiscovery.HibernateWrapper hibernateWrapper = new main.java.com.crl.nms.lldpdiscovery.HibernateWrapper();
            try {
                //  flag = hibernateWrapper.executeSqlQuery(query);

            } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
                // logger.info(e.getMessage());
            } finally {
                // hibernateWrapper.destroy();
            }
            return flag;
        }*//*



}

*/
package com.crl.nms.service;

import com.crl.nms.CDTAUTODISCOVERY.Constants;
import com.crl.nms.CDTAUTODISCOVERY.Global;
import com.crl.nms.databases.*;
import com.crl.nms.messages.IpRange;
import com.crl.nms.pojo.AddDeviceModel;
import com.crl.nms.pojo.NeObjectPojo;
import com.crl.nms.repository.AuthenticationProtocolEnumRepo;
import com.crl.nms.repository.NeConnectivityRepo;
import com.crl.nms.repository.NmsNeDetailRepository;
import com.crl.nms.repository.PrivacyProtocolEnumRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import static com.crl.nms.CDTAUTODISCOVERY.Constants.ACTIVE;

@Service
public class DbHandlerService {

    private static final Logger logger = LoggerFactory.getLogger(DbHandlerService.class);


    AddDeviceModel addDeviceModel = new AddDeviceModel();
    @Autowired
    AuthenticationProtocolEnumRepo authenticationProtocolEnumRepo;
    @Autowired
    PrivacyProtocolEnumRepo privacyProtocolEnumRepo;
    @Autowired
    private NmsNeDetailRepository nmsNeDetailRepo;
    @Autowired
    private NeConnectivityRepo neConnectivityRepo;
    @Autowired
    private KafkaTemplate<String, String> kafkaJSONStringMsgSender;

    private ConcurrentHashMap<NmsNeTypes, Integer> neKeyHashMapCount = new ConcurrentHashMap<>(16, 0.9f, 1);
    private Map<NmsNeTypes, Short> result = new HashMap<>();

    @Transactional
    public void initialize() {
        Map<NmsNeTypes, NmsNeDetail> latestNeidByNetype = new HashMap<>();
        List<NmsNeDetail> neDetailsList = nmsNeDetailRepo.findAll();
        for (NmsNeDetail neDetail : neDetailsList) {
            if (!latestNeidByNetype.containsKey(neDetail.getNeType()) ||
                    neDetail.getNeUptime().after(latestNeidByNetype.get(neDetail.getNeType()).getNeUptime())) {
                latestNeidByNetype.put(neDetail.getNeType(), neDetail);
            }
            Global.ipKeyHash.put(neDetail.getNeIp().trim(), neDetail.getNekey().trim());
        }

        for (Map.Entry<NmsNeTypes, NmsNeDetail> entry : latestNeidByNetype.entrySet()) {
            result.put(entry.getKey(), entry.getValue().getNeId());
        }
    }

    @Transactional
    public void updateData(String neipStr, String neMacStr, String nedescStr, String neHostNameStr, short hwType, short hwSubType, byte neOperSys) {
        String neKey1 = "";
        int neId = 0;
        ConcurrentHashMap<Integer, Integer> neKeyHashMap = new ConcurrentHashMap<>(16, 0.9f, 1);

        for (String neKey : Global.neHashMap.keySet()) {
            NeObjectPojo neDetail = Global.neHashMap.get(neKey);
            if (hwType == neDetail.neType) {
                String[] neKeyArr = neKey.split("_");
                Integer value = Integer.parseInt(neKeyArr[2]);
                neKeyHashMap.put(value, value);
            }
        }

        List<NmsNeDetail> nmsNeDetail = nmsNeDetailRepo.findByneIp(neipStr);
        List<NmsNeDetail> nmsNeTypeList = nmsNeDetailRepo.findByneTypeNeType(hwType);

        if (nmsNeDetail.isEmpty()) {
            Short key = hwType;
            NmsNeDetail entity = new NmsNeDetail();

            NmsNeTypes nmsNeType = new NmsNeTypes();
            nmsNeType.setNeType(key);
            short neCount = 0;

            if ((result == null || result.isEmpty()) || nmsNeTypeList.isEmpty()) {
                result.put(nmsNeType, neCount);
            } else {
                neCount = result.getOrDefault(nmsNeType, (short) 0);
            }

            neCount++;
            neKey1 = "1001_" + neCount + "_" + hwType;
            Global.ipKeyHash.put(neipStr.trim(), neKey1.trim());

            logger.info("neKey1: {}", neKey1);

            result.put(nmsNeType, neCount);

            entity.setNekey(neKey1);
            addDeviceModel.setNeKey(neKey1);

            entity.setCpuLimit(Short.valueOf(Constants.LIMIT));

            entity.setCsciId((short) ACTIVE);

            entity.setHardwareId(0); // Set appropriate value


            entity.setHddLimit(Short.valueOf(Constants.LIMIT));
           // addDeviceModel.setThreshLimit(String.valueOf(Constants.LIMIT));

            entity.setIsCriticalServer((short) ACTIVE);
           // addDeviceModel.setIsIPChange(Short.parseShort("0"));


            entity.setUpdatedBy("AUTODISCOVERY");
            addDeviceModel.setUserName("AUTODISCOVERY");

            entity.setNeDesc(nedescStr.trim());
            addDeviceModel.setDeviceName(nedescStr);


            entity.setNeDowntime(new Date());

            entity.setNeHostname(neHostNameStr.isEmpty() ? neipStr : neHostNameStr.trim());


            entity.setNeId((short) neCount);
           // addDeviceModel.setNeId(neCount);

            entity.setNeIp(neipStr.trim());
            addDeviceModel.setDeviceIP(neipStr.trim());


            entity.setNeStatus((short) ACTIVE);


            entity.setNeUptime(new Date());


            entity.setNodeId(1001);
           // addDeviceModel.setNodeId(String.valueOf(1001));

            entity.setRamLimit(Short.valueOf(Constants.LIMIT));


            entity.setSnmpProfileStatus(Short.valueOf((short) ACTIVE));
          //  addDeviceModel.setSnmpProfileStatus(String.valueOf(ACTIVE));

         //   addDeviceModel.setIsSnmpFlag(1);


            entity.setSnmpVersion(Short.valueOf((short) ACTIVE));
          //  addDeviceModel.setSnmpVersion(String.valueOf(ACTIVE));


            entity.setXPos("100");


            entity.setYPos("100");

            NmsNeTypes nmsNeTypes = new NmsNeTypes();
            nmsNeTypes.setNeType(hwType);
            entity.setNeType(nmsNeTypes);
            addDeviceModel.setDeviceType(String.valueOf(hwType));


            NodeDefinition nodeDefinition = new NodeDefinition();
            nodeDefinition.setNodeKey(1001);
            entity.setNodeKey(nodeDefinition);


            nmsNeDetailRepo.save(entity);
            // sendMsgToKAFKA("AutoDiscovery Completed Successfully", "autodiscoverycompleted");
            sendMsgToKAFKA(addDeviceModel, Global.ADD_DEVICE);

        }
    }

    @Transactional
    public void insertConnectivity(String srcIp, String srcPort, String destIp, String destPort) {
        String srcIpKey = Global.ipKeyHash.get(srcIp);
        String destIpKey = Global.ipKeyHash.get(destIp);

        if (srcIpKey != null && destIpKey != null) {
            NeConnectivity entity = new NeConnectivity();
            NeConnectivityPK neConnectivityPK = new NeConnectivityPK();
            neConnectivityPK.setSrcNekey(srcIpKey);
            neConnectivityPK.setDestNekey(destIpKey);
            neConnectivityPK.setSrcPort(Long.parseLong(srcPort));
            neConnectivityPK.setDestPort(Long.parseLong(destPort));
            entity.setNeConnectivityPK(neConnectivityPK);
            entity.setDestNodeid("1001");
            entity.setLinkid(1L);
            entity.setLinkstatus((short) 0);
            entity.setLinktype("12");
            entity.setPdestIp(destIp);
            entity.setPsrcIp(srcIp);
            entity.setSrcNodeid("1001");
            entity.setSrcNeip(srcIp);
            entity.setDestNeip(destIp);
            entity.setDestPortStatus((short) 0);
            entity.setSrcPortStatus((short) 1);
            entity.setUpdatedOn(new Date());
            entity.setUpdatedBy(new Date().toString());

            neConnectivityRepo.save(entity);
        }
    }

/*    @Transactional
    public void deleteDummyConnectivity(String destIp) {
        neConnectivityRepo.deleteByDestIpAndPort(destIp);
    }*/

  /*  @Transactional
    public void deleteNeConnectivity(String srcIp, String srcPort, String destIp, String destPort) {
        neConnectivityRepo.deleteBySrcAndDest(srcIp, srcPort, destIp, destPort);
    }*/

    @Transactional
    public void deleteNedetail(String srcIp) {
        nmsNeDetailRepo.deleteByNeIp(srcIp);
    }

    public void sendMsgToKAFKA(Object messages, String topicName) {
        try {
            ObjectMapper objMapper = new ObjectMapper();
            String message = objMapper.writeValueAsString(messages);
            kafkaJSONStringMsgSender.send(topicName, message);
            logger.info("{} : published to topic : {}", message, topicName);
        } catch (Exception e) {
            logger.error("Failed to send message to Kafka: {}", e.getMessage());
        }
    }

    public Optional<AuthenticationProtocolEnum> findAuthenticationProtocolEnum(IpRange ipRange) {
        try {
            Optional<AuthenticationProtocolEnum> authenticationProtocolEnum = authenticationProtocolEnumRepo.findById(Integer.valueOf(ipRange.getAuthProtocol()));
            return authenticationProtocolEnum;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public Optional<PrivacyProtocolEnum> findPrivacyProtocolEnum(IpRange ipRange) {

        try {
            Optional<PrivacyProtocolEnum> privacyProtocolEnum = privacyProtocolEnumRepo.findById(Integer.valueOf(ipRange.getAuthProtocol()));
            return privacyProtocolEnum;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
