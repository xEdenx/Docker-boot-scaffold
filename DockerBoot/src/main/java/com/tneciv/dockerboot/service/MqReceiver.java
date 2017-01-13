package com.tneciv.dockerboot.service;

import com.tneciv.dockerboot.config.RabbitMQConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Tneciv on 2017/1/14.
 */
@Service
public class MqReceiver {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AmqpTemplate amqpTemplate;

    @RabbitListener(queues = RabbitMQConfig.MQ_QUEUE)
    public void receive(Object o) {
        logger.debug("Mq receive msg : " + o.toString());
    }
    
}
