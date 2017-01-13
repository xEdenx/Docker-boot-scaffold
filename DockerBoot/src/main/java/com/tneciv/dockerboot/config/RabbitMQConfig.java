package com.tneciv.dockerboot.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Tneciv on 2017/1/14.
 */
@Configuration
public class RabbitMQConfig {
    public static final String MQ_QUEUE = "MQ_Tneciv";
    
    @Bean
    public Queue queue(){
       return new Queue(MQ_QUEUE);
    }
    
}
