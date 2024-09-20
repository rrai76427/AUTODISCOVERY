package com.crl.nms.CDTAUTODISCOVERY;

import com.crl.nms.messages.IpRange;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Main {

    @Autowired
    static KafkaTemplate<String, String> kafkaJSONStringMsgSender;


    public static void main(String[] args) {

        IpRange ipRange = new IpRange("192.168.111.10", "192.168.111.15");

        sendMsgToNeAlarm(ipRange);

    }

    public static void sendMsgToNeAlarm(Object messages) {

        try {
            ObjectMapper Obj = new ObjectMapper();
            String message = Obj.writeValueAsString(messages);
            kafkaJSONStringMsgSender.send(Global.STATRT_AUTO_DISCOVERY, message);
           /* if(messages instanceof DeviceStatus){
                kafkaJSONStringMsgSender.send(Global.DEVICE_UP,message);
               // kafkaJSONStringMsgSender.send(Global.DEi",message);
            }
            else {
//                kafkaJSONStringMsgSender.send(Global.DEVICE_DOWN,message);
//                kafkaJSONStringMsgSender.send(Global.DEVICE_DOWN+"_ui",message);
            }*/
            //logger.info("Message Publish to AlarmHandler !!!");
        } catch (Exception e) {
            // logger.error(e.getMessage());
        }
    }
}
