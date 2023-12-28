package com.ff.controller;

import com.ff.dto.User;
import com.ff.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/produce")
public class ProducerController {
    @Autowired
    private ProducerService producerService;

    @PostMapping
    public ResponseEntity sendObject(@RequestBody User user)
    {
        producerService.sendMessage(user);
        return new  ResponseEntity(Map.of("message","Object Sent"), HttpStatus.OK);
    }
}
