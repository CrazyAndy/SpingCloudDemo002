package com.crazyandy.rabbitmqhello.api;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author:sunhu
 * @Description:
 * @Date Created in 2018/2/11 9:33
 * @Modified By:
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {
    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver:"+hello);
    }
}
