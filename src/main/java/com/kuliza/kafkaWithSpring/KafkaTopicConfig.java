package com.kuliza.kafkaWithSpring;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

//    @Value("127.0.0.1:9092")
//    private String bootstrapAddrss;
//
//    @Bean
//    public KafkaAdmin kafkaAdmin() {
//        Map<String,Object> configs = new HashMap<String, Object>();
//        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddrss);
//        return new KafkaAdmin(configs);
//    }

//    @Bean
//    public NewTopic topic1() {
//        return new NewTopic("topicA", 1, (short) 1);
//    }
}
