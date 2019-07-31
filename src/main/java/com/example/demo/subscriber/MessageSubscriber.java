package com.example.demo.subscriber;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Author fengjf
 * Desc
 */
@EnableBinding({Sink.class})
public class MessageSubscriber {

    @StreamListener(Sink.INPUT)
    public void getMessage(String message) {
        System.out.println("StreamListener 监听到一条新的消息：" + message);
    }
}
