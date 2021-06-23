package run.com.kafka;


import kafka.javaapi.producer.Producer;


public class KafkaProducer extends Thread{

    private String topic;

    private Producer<Integer, String> producer;




}
