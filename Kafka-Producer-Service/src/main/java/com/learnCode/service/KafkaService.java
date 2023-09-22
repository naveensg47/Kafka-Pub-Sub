package com.learnCode.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


import static com.learnCode.constants.AppConstants.TOPIC_NAME;

@Service
public class KafkaService {

    private Logger logger= LoggerFactory.getLogger(KafkaService.class);
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public boolean updateLocation(String location){
        this.kafkaTemplate.send(TOPIC_NAME,location);
        logger.info("Location message produced");
        return true;
    }

}
