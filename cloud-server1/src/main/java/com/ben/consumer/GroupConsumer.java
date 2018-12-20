package com.ben.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

public class GroupConsumer {

    private static final String broker = "127.0.0.1:9092";
    private static final String topic = "an1";

    public static void main(String[] args) {

        Properties prop = new Properties();
        prop.put("bootstrap.servers",broker);
        prop.put("group.id","group1");
        prop.put("enable.auto.commit","true");
        prop.put("session.timeout.ms","300000");
        prop.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        prop.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        prop.put("auto.offset.reset", "earliest");
        prop.put("interceptor.classes", "com.ben.consumer.KafkaInterceptor");



        KafkaConsumer<String,String> consumer = new KafkaConsumer<String,String> (prop);

        consumer.subscribe(Arrays.asList(topic));

        Duration duration = Duration.ofMillis(300);

//        consumer.
        while (true) {
            ConsumerRecords<String,String>  consumerRecords = consumer.poll(duration);
            for (ConsumerRecord<String, String> consumerRecord : consumerRecords) {
                System.out.println("消费：" + consumerRecord.value());
            }
        }


    }






}
