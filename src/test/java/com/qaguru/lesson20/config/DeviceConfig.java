package com.qaguru.lesson20.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.FIRST)
@Config.Sources({
        "classpath:${env}.properties",
        "classpath:pixel6.properties"
})
public interface DeviceConfig extends Config {
    @Key("device.name")
    String deviceName();

    @Key("device.osVersion")
    String deviceOsVersion();
}
