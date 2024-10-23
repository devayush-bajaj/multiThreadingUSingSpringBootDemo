package com.dev.multiThreadingUsingSpringBootDemo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class SpringBootAsyncService {

    @Async(value = "asyncthreadbean")
    public void processTask(String payload){
        System.out.println("Starting "+Thread.currentThread().getName()+" thread - Processing Payload " + payload);
        System.out.println("length of Payload " + payload.length());
        System.out.println("exiting thread - payload processing completed");
    }
}
