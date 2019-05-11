package com.kuliza.kafkaWithSpring.kafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message) {
        try {
            kafkaTemplate.send("topicA", message);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
