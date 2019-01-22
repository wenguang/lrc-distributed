package com.dvs.springActiveMQ;

//import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

public class IocProducer {
    // 负责消息的发送和接收可以理解为MessageProducer 和MessageConsummer的组合。
    private static JmsTemplate jt = null;

    public static void main(String[] args) {

//        BasicConfigurator.configure();

        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext-activemq.xml");
        // 获取JmsTemplate对象
        jt = (JmsTemplate) ctx.getBean("jmsTemplate");
        // 调用方法，发送消息
        jt.send(new MessageCreator() {
            // 消息的产生，返回消息发送消息
            public Message createMessage(Session s) throws JMSException {
                TextMessage msg = s
                        .createTextMessage("Spring send msg ----> Hello activeMQ4");
                return msg;
            }
        });
        System.out.println("end!");
    }
}
