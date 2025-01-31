package com.qaguru.lesson20.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:./auth.properties",
        "classpath:auth.properties"
})
public interface AuthConfig extends Config {

    String username();

    String password();
}
