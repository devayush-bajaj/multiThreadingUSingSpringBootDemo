package com.dev.multiThreadingUsingSpringBootDemo;

import com.dev.multiThreadingUsingSpringBootDemo.service.ItemBucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AsyncRunner implements CommandLineRunner {

    @Autowired
    ItemBucketService itemBucketService;

    @Override
    public void run(String... args) throws Exception {
        itemBucketService.processTaskList();
    }
}
