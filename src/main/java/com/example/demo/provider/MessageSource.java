package com.example.demo.provider;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * Author fengjf
 * Desc 定义消息管道
 */

@Component
public interface MessageSource {
    String OUTPUT = "output";

    @Output(MessageSource.OUTPUT)
    MessageChannel messageChannel();
}
