package com.qaguru.lesson20.config;

import org.aeonbits.owner.ConfigFactory;

public class DeviceConfigCreator {
    public static DeviceConfig deviceConfig = ConfigFactory.create(DeviceConfig.class, System.getProperties());
}
