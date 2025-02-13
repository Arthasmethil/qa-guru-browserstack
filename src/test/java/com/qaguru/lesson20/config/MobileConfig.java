package com.qaguru.lesson20.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:./mobile.properties",
        "classpath:mobile.properties"
})
public interface MobileConfig extends Config {
    @Key("app.url")
    String appUrl();

    @Key("project.name")
    String projectName();
}
