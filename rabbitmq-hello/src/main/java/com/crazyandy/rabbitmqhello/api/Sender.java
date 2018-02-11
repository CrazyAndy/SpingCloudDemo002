package com.crazyandy.rabbitmqhello.api;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author:sunhu
 * @Description:
 * @Date Created in 2018/2/11 9:30
 * @Modified By:
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String context = "hello"+new Date();
        System.out.println("sender:"+context);
        rabbitTemplate.convertAndSend("hello",context);
    }
}
