package com.tneciv.dockerboot.service;

import com.tneciv.dockerboot.config.RabbitMQConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Tneciv on 2017/1/14.
 */
@Service
public class MqSender {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(Object o) {
        logger.debug("Rabbit mq send : " + o.toString());
        this.amqpTemplate.convertAndSend(RabbitMQConfig.MQ_QUEUE, o);
    }

}
