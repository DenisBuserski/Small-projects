package com.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Current log level: {}", LOGGER.isTraceEnabled() ? "TRACE" : "Not TRACE");

        LOGGER.trace("This is a TRACE message");
        LOGGER.debug("This is a DEBUG message");
        LOGGER.info("This is an INFO message");
        LOGGER.warn("This is a WARN message");
        LOGGER.error("This is an ERROR message");

        LOGGER.info("My name is {}. Nice to mee you!", "Denis");

        MyService myService = new MyService();


    }
}
