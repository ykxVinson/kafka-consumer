package com.vinson.component;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TopicComponent {
    @KafkaListener(topics = {"first"})
    public void onMessage(ConsumerRecord<String,String> record){
        String topic = record.topic();
        String msg = record.value();
        System.out.println("消费者接收消息： topic--> " + topic + ", msg --> "+ msg);
        System.out.println("test publisher");
    }
}
