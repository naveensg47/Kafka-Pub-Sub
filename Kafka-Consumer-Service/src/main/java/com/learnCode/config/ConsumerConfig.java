package com.learnCode.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import static com.learnCode.constants.AppConstants.GROUP_ID;
import static com.learnCode.constants.AppConstants.TOPIC_NAME;

@Configuration
public class ConsumerConfig {

    public static Logger logger= LoggerFactory.getLogger(ConsumerConfig.class);

    //Listens to the targeted topics
    @KafkaListener(topics = TOPIC_NAME,groupId = GROUP_ID)
    public void updatedLocation(String value){
logger.info("Message Received");
    }

}
