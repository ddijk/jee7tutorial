package com.ns.lala;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserEntityManagerCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserEntityManagerCommandLineRunner.class);


    @Override
    public void run(String... args) {

        log.info("-------------------------------");
        log.info("YESSSS, Scanning works");
        log.info("-------------------------------");

    }
}
