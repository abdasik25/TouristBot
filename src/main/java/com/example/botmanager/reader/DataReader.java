package com.example.botmanager.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;


/**
 * @author Alexander Lomat
 * @version 0.0.2
 * Data reader from file class
 */

public class DataReader {

    private static final Logger LOGGER = LogManager.getLogger();

    public static String read(String path) throws FileNotFoundException {
        if (path == null || !Paths.get(path).toFile().exists()) {
            LOGGER.fatal("FILEPATH " + path + " is wrong.");
            throw new FileNotFoundException();
        }
        return new Scanner(new File(path)).useDelimiter("\\Z").next();
    }
}