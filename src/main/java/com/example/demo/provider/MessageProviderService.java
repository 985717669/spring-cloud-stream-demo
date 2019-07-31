package com.example.demo.provider;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author fengjf
 * Desc
 */
@Service
@EnableBinding(MessageSource.class)
public class MessageProviderService {

    @Autowired
    private MessageSource messageSource;

    public void sendSimpleMessage(Object message) {
        messageSource.messageChannel().send(MessageBuilder.withPayload(message).build());
    }

}
