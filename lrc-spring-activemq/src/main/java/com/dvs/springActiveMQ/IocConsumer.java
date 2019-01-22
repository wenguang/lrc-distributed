package com.dvs.springActiveMQ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class IocConsumer {
    private static JmsTemplate jt = null;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-activemq.xml");
        //获取JmsTemplate对象
        jt = (JmsTemplate) ctx.getBean("jmsTemplate");
        //接收消息
        String msg = (String) jt.receiveAndConvert();
        System.out.println("receive msg = " + msg);
    }
}
