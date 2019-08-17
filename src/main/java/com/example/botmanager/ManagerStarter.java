package com.example.botmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Alexander Lomat
 * @version 0.0.4
 *  Run this class to start BotManager (localhost:8080)
 */


@SpringBootApplication
public class ManagerStarter {
    public static void main(String[] args) {
        SpringApplication.run(ManagerStarter.class, args);
    }
}