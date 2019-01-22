package com.dvs.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext-provider.xml");
        System.out.println(cxt.getDisplayName() + ": here");
        cxt.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}
