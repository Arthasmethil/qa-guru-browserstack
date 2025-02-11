package com.qaguru.lesson20.config;

import org.aeonbits.owner.ConfigFactory;

public class IphoneConfigCreator {
    public static IphoneConfig iphoneConfig = ConfigFactory.create(IphoneConfig.class, System.getProperties());
}
