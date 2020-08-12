package com.tmax.dbps.bigdata.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Properties;
import java.util.concurrent.Future;

public class DemoProducer{
    public static void main (final String[] args){
        Properties producerProps = new Properties();
        producerProps.put("bootstrap.servers","localhost:9092");
        producerProps.put("key.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");
        producerProps.put("value.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");
        producerProps.put("acks","all");
        producerProps.put("retries",1);
        producerProps.put("batch.size",20000);
        producerProps.put("linger.ms",1);
        producerProps.put("buffer.memory",24568545);
        KafkaProducer<String, String> producer = new KafkaProducer<String,String>(producerProps);

        for (int i=0;i<20;i++){
            ProducerRecord data = new ProducerRecord<String,String>("test","Hello this is record" + i);
            Future<RecordMetadata> recordMetadata = producer.send(data);
        }

        producer.close();
    }
}