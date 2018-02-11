package com.crazyandy.rabbitmqhello;

import com.crazyandy.rabbitmqhello.api.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author:sunhu
 * @Description:
 * @Date Created in 2018/2/11 11:39
 * @Modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitmqHelloApplication.class)
public class HelloApplicationTest {
    @Autowired
    private Sender sender;
    @Test
    public void hello() throws Exception{
        sender.send();
    }
}
