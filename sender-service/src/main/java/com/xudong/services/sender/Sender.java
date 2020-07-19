package com.xudong.services.sender;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient(
        id="sender-client",
        acks = KafkaClient.Acknowledge.ALL
)
public interface Sender {

    @Topic("test-product")
    void sendProduct(@KafkaKey String key, String name);

}
