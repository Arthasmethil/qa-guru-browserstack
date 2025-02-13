package com.qaguru.lesson20.config;

import org.aeonbits.owner.ConfigFactory;

public class MobileConfigCreator {
    public static MobileConfig mobileConfig = ConfigFactory.create(MobileConfig.class, System.getProperties());
}
