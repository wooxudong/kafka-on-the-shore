package com.xudong.services;

import com.xudong.services.sender.Sender;
import io.micronaut.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext context = ApplicationContext.build(new String[0])
                .mainClass(Application.class)
                .deduceEnvironment(false)
                .start();

        Sender sender = context.getBean(Sender.class);
        sender.sendProduct("key_1", "test-value");
        LOGGER.info("the producer app started at env: {}", context.getEnvironment().getActiveNames());
    }
}
