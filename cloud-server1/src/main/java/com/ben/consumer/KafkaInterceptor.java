package com.ben.consumer;

import org.apache.kafka.clients.consumer.ConsumerInterceptor;
import org.apache.kafka.clients.consumer.ConsumerRecords;

import java.util.Map;

public class KafkaInterceptor implements ConsumerInterceptor {
    @Override
    public ConsumerRecords onConsume(ConsumerRecords consumerRecords) {

        return null;
    }

    @Override
    public void close() {
        System.out.println("关闭消费者关闭消费者关闭消费者");
    }

    @Override
    public void onCommit(Map map) {
        System.out.println("开始提交开始提交开始提交开始提交");

    }

    @Override
    public void configure(Map<String, ?> map) {
        System.out.println("开始configure开始configure开始configure");
    }
}
