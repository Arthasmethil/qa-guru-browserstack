package com.qaguru.lesson20.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:./mobile.properties",
        "classpath:mobile.properties"
})
public interface MobileConfig extends Config {

//    @Key("username")
//    String username();
//
//    @Key("password")
//    String password();

    @Key("app.url")
    String appUrl();

    @Key("project.name")
    String projectName();
//
//    @Key("android.device")
//    String deviceAndroid();
//
//    @Key("android.osVersion")
//    String androidOsVersion();
//
//    @Key("ios.device")
//    String deviceIos();
//
//    @Key("ios.osVersion")
//    String iosOsVersion();
}
