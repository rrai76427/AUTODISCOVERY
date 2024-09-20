package com.crl.nms.actors;

import com.crl.nms.CDTAUTODISCOVERY.Global;
import com.crl.nms.messages.IpRange;
import com.crl.nms.service.DbHandlerService;
import com.crl.nms.service.NeFpingPollThreadService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.Date;

@Configuration
public class MessageListener {

    private static final Logger logger = LoggerFactory.getLogger(MessageListener.class);

    @Autowired
    DbHandlerService dbHandlerService;
    ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics = Global.STATRT_AUTO_DISCOVERY, groupId = "startautodiscovery", containerFactory = "kafkaListenerContainerFactory")
    public void listenGroup(String message) {

        Date dt = new Date();
        logger.info("Received Message  Device at  " + dt + ":  " + message);
        try {
            IpRange ipRange = objectMapper.readValue(message, IpRange.class);
            logger.info("ipRange from " + ipRange.getFromIp() + " " + ipRange.getToIp());
            NeFpingPollThreadService neFpingPollThreadService1 = new NeFpingPollThreadService(ipRange.getFromIp(), ipRange.getToIp(), ipRange, dbHandlerService);
            neFpingPollThreadService1.run();


        } catch (JsonProcessingException e) {
            logger.error(e.getMessage());
        }
    }


}
