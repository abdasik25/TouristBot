package com.example.botmanager;

import com.example.botmanager.handler.TouristBotHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


/**
 * @author Alexander Lomat
 * @version 0.0.4
 * Run this class to start TelegramBot (see /data/BotConfigure for bot data)
 */


public class BotStarter {

    private static final Logger LOGGER = LogManager.getLogger();


    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi botsApi = new TelegramBotsApi();
        try {
            botsApi.registerBot(new TouristBotHandler());
        } catch (TelegramApiException e) {
            LOGGER.fatal("Error while registering bot ", e);
        }
    }
}
