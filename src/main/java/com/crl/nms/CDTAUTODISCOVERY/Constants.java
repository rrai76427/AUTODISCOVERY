/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crl.nms.CDTAUTODISCOVERY;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author root
 */
public interface Constants {

    /**
     * DATABASE.
     */
    String NMS_DATA_PATH = "/home/CIKMS_PROJECT/NMRG/cikms/data/NMS/CIKMS_NMS/NeHealthPollEngine";
    String IPLIST_FILE = "/home/CIKMS_PROJECT/NMRG/cikms/data/NMS/CIKMS_NMS/NeHealthPollEngine/ping_script/hosts";
    String DATABASE_CONF_FILE = "//home/CIKMS_PROJECT/NMRG/cikms/data/NMS/DatabaseProperties/databasedetail.properties";

    /**
     * IP FLG.
     */
    byte IP_DEVICE = 1;
    byte NON_IP_DEVICE = 2;
    /**
     * SIZES.
     */
    byte PING_WAIT = 2;
    byte PERCENT_SIZE = 5;
    byte MAX_POLL_RETRY = 3;
    byte NMS_HEADER_SIZE = 16;
    byte IP_ADDR_SIZE = 16;
    byte NE_KEY_SIZE = 20;
    byte FILE_NAME_SIZE = 50;
    byte USER_NAME_SIZE = 50;
    short ALARM_DESC_SIZE = 150;
    byte PROC_PATH_SIZE = 100;
    byte MAX_DETAIL_POLL_HW = 10;
    short UDP_BUFF_SIZE = 1500;

    /**
     * Port NO.
     */
    short GET_SNMP_PORT = 10161;
    short DEFAULT_GET_PORT = 161;
    short TRAP_PORT = 162;
    int NE_HEALTH_PORT_START = 19000;
    int NE_DETAIL_PORT_START = 21000;
    int ALARM_PORT = 23001;
    int AGENCY_POLL_PORT = 23002;
    int CORE_NMS_PORT = 23003;
    int ENTERPRISE_POLL_PORT = 23004;
    int WEB_POLL_PORT = 23005;
    int NMS_CLIENT_PORT = 50488;

    int CORE_NMS_PORT_HA_PORT = 23011;
    int ALARM_PORT_HA_PORT = 23012;
    int AGENCY_POLL_PORT_HA_PORT = 23013;
    int NE_HEALTH_PORT_HA_PORT = 23014;
    int NE_DETAIL_POLL_PORT_HA_PORT = 23015;

    /**
     * CSCI CONSTANTS.
     */
    byte NE_HEALTH_POLL_CSCI = 1;
    byte ALARM_CSCI = 2;
    byte NMS_CLIENT_CSCI = 3;
    byte AGENCY_POLL_CSCI = 4;
    byte CORE_NMS_CSCI = 5;
    byte ENTERPRISE_POLL_CSCI = 6;
    byte WEB_SERVICE_CSCI = 7;
    byte NE_DETAIL_POLL_CSCI = 8;

    /**
     * THRESHOLD CONSTANTS.
     */
    byte THRESH_HIGH = 1;
    byte THRESH_NORMAL = 2;

    /**
     * DEVICES.
     */
    byte WS = 31;
    byte SERVER = 32;
    byte ROUTERS = 33;
    byte SWITCH = 34;
    byte UPS = 35;
    byte PRINTER = 36;
    byte IP_PHONE = 37;
    /**
     * Device STATUS.
     */
    byte UNKNOWN_STATUS = 0;
    byte HEALTHY = 1;//byte ACTIVE = 1;
    byte PARTIAL_HEALTHY = 2;//byte DOWN = 2;
    byte NOT_HEALTHY = 3;//byte PASSIVE = 3;
    //byte CLIENT_TIMED_OUT = 4;
    //byte SNMP_SERVICE_DOWN = 5;

    /**
     * Process STATUS.
     */
    byte PROCESS_RUNNING = 1;
    byte PROCESS_DOWN = 2;

    int ACTIVE = 1;
    byte DOWN = 2;

    byte OS_TYPE_WIN = 1;
    byte OS_TYPE_LINUX = 2;
    byte OS_TYPE_IOS = 3;

    byte HW_SUB_TYPE_CISCO = 1;
    byte HW_SUB_TYPE_JUNIPER = 2;
    byte HW_SUB_TYPE_LENOVO = 3;
    byte HW_SUB_TYPE_HP = 4;
    byte HW_SUB_TYPE_DELL = 5;

    /**
     * FAULT STATUS.
     */
    byte FAULT_OPEN = 1;
    byte FAULT_AUTO_ESCLATION = 2;
    byte FAULT_MANUAL_ESCLATION = 3;
    byte FAULT_CLOSE = 4;

    /**
     * FAULT ACK STATUS.
     */
    byte FAULT_ACK = 1;
    byte FAULT_NOT_ACK = 2;

    /**
     * Alarm SEVERITY.
     */
    byte CRITICAL = 1;//byte CRITICAL = 1;
    byte NON_CRITICAL = 2;//byte MAJOR = 2;
    byte INFORMATIVE = 3;//byte MINOR = 3;
    //byte THRESHOLD = 4;
    //byte INFORMATIVE = 5;

//    /**
//     * Device STATUS.
//     *
//     */
//    byte UNKNOWN_STATUS = 0;
//    byte ACTIVE = 1;
//    byte DOWN = 2;
//    byte PASSIVE = 3;
//    byte CLIENT_TIMED_OUT = 4;
//    byte SNMP_SERVICE_DOWN = 5;
//    byte ZOMBIE = 6;
//    /**
//     * FAULT STATUS.
//     *
//     */
//    byte FAULT_OPEN = 1;
//    byte FAULT_AUTO_ESCLATION = 2;
//    byte FAULT_MANUAL_ESCLATION = 3;
//    byte FAULT_CLOSE = 4;
//    byte FAULT_MANUAL_CLOSE = 5;
    /**
     * FAULT VISUAL NOTIFY STATUS.
     */
    byte DISABLE_NOTIFY = 0;
    byte ENABLE_NOTIFY = 1;
    byte AUDIO_NOTIFY = 2;

    /**
     * FAULT ACK STATUS.
     */
    byte FAULT_SEEN = 1;
    byte FAULT_UNSEEN = 2;

//    /**
//     * Alarm SEVERITY.
//     *
//     */
//    byte CRITICAL = 1;
//    byte MAJOR = 2;
//    byte MINOR = 3;
//    byte THRESHOLD = 4;
//    byte INFORMATIVE = 5;
    /**
     * ALARM DB COMMAND.
     */
    byte INSERT_CMD = 1;
    byte DELETE_CMD = 2;
    byte UPDATE_CMD = 3;
    byte NOCHANGE_CMD = 4;

    /**
     * THRESHOLD LIMIT.
     */
    byte RAM_LIMIT = 1;
    byte CPU_LIMIT = 2;
    byte HDD_LIMIT = 3;

    /**
     * ERROR CODES.
     */
    byte SUCCESS_CONF = 1;
    byte DUP_PROC_NAME = 2;
    byte DEL_PROC_FAIL = 3;
    byte FILE_OPEN_ERROR = 4;
    byte PROC_NAME_LEN_ZERO = 5;
    byte NO_PROC_NAME_EXIST = 6;
    byte MAX_PROC_EXIST = 7;
    byte PROC_PATH_LEN_ZERO = 8;
    byte NO_THRESH_LIMIT_CHANGE = 9;

    /**
     * TREND COUNT.
     */
    byte MAX_HISTORT_CNT = 10;

    /**
     * SNMP CLIENT TYPE.
     */
    byte NMS_CLIENT_TYPE = 1;
    byte SNMP_AGENT_TYPE = 2;
    byte NON_SNMP = 3;

    /**
     * ALARM DATE FORMAT.
     */
    String NONE_STR = "NONE";
    String LOG_DATE_FORMAT = "dd-MM-yyyy";
    DateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    public String ALARM_OPEN_DATETIME = "31-12-9999 11:59:59";
    public String LOG_DATETIME_FORMAT = "dd-MM-yyyy HH24:mi:ss";
    public String CPU_TIMESTAMP_FORMAT = "MM/dd/YY HH24:mi:ss";

    /**
     * OTHERS
     */
    public byte IP_ADDRESS_CHANGE = 1;
    public byte NE_NAME_CHANGE = 2;
    public byte BOTH_CHANGE = 3;

    /**
     * Column Counts
     */
    public byte ADDC_HW_COL_COUNT = 5;
    public byte CDPS_HW_COL_COUNT = 7;
    public byte OTHERS_HW_COL_COUNT = 9;
    public byte LIMIT = 90;

}
