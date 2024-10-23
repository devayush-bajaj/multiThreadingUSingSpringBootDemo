package com.dev.multiThreadingUsingSpringBootDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemBucketService {

    @Autowired
    SpringBootAsyncService springBootAsyncService;

    /*We want to print length of each item in a list using multiple threads*/
    public void processTaskList(){

        System.out.println("Creating Items list");
        List<String> taskList = new ArrayList<>();
        taskList.add("apple");
        taskList.add("banana");
        taskList.add("grapes");
        taskList.add("orange");
        taskList.add("watermelon");
        taskList.add("papaya");
        taskList.add("pomegranate");
        taskList.add("chiku");
        taskList.add("guava");
        taskList.add("coconut");
        taskList.add("muskmelon");
        taskList.add("almond");

        System.out.println("Item list prepared successfully");
        System.out.println("Processing task list");

        for (String task : taskList){
           springBootAsyncService.processTask(task);
        }

        System.out.println("Processing has been completed!");
    }


}
