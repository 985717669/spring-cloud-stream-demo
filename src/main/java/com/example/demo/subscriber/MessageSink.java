package com.example.demo.subscriber;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * Author fengjf
 * Desc
 */
@Component
public interface MessageSink {
    String INPUT = "input";

    @Input(MessageSink.INPUT)
    SubscribableChannel subscribableChannel();
}
