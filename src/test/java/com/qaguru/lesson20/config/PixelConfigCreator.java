package com.qaguru.lesson20.config;

import org.aeonbits.owner.ConfigFactory;

public class PixelConfigCreator {
    public static PixelConfig pixelConfig = ConfigFactory.create(PixelConfig.class, System.getProperties());
}
