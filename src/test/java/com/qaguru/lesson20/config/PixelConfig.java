package com.qaguru.lesson20.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:./pixel6.properties",
        "classpath:pixel6.properties"
})
public interface PixelConfig extends Config {
    @Key("android.device")
    String deviceAndroid();

    @Key("android.osVersion")
    String androidOsVersion();
}
