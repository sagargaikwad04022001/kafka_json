package com.ff.service;

import com.ff.dto.User;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserConsumerService {


    @KafkaListener(topics = "json_obj",groupId = "json-group")
    public void consume(ConsumerRecord<String, User> record)
    {
        User result=record.value();
        System.out.println(result);
    }
}
