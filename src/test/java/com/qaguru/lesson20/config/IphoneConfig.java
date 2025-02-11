package com.qaguru.lesson20.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:./iphone13.properties",
        "classpath:iphone13.properties"
})
public interface IphoneConfig extends Config {

    @Key("ios.device")
    String deviceIos();

    @Key("ios.osVersion")
    String iosOsVersion();
}
