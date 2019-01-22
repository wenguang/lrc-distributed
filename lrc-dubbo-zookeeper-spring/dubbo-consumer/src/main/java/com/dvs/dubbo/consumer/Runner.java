package com.dvs.dubbo.consumer;

import com.dvs.dubbo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext-consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = (DemoService)context.getBean("demoService");
        System.out.println("consumer");
        System.out.println(demoService.getDescription());
    }
}
