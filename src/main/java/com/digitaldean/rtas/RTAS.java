package com.digitaldean.rtas;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RTAS implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("rtas");

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing!");
        LOGGER.info("Initialized!");
    }
}
