package com.ff.service;

import com.ff.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;
    public boolean sendMessage(User user)
    {
        kafkaTemplate.send("json_obj",user);
        return true;
    }
}
