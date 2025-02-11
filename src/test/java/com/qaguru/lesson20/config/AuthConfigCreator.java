package com.qaguru.lesson20.config;

import org.aeonbits.owner.ConfigFactory;

public class AuthConfigCreator {
    public static AuthConfig authConfig = ConfigFactory.create(AuthConfig.class, System.getProperties());
}
