package com.qaguru.lesson20.helpers;

import com.qaguru.lesson20.config.LocalConfig;
import org.aeonbits.owner.ConfigFactory;

public class ConfigProvider {
    public static LocalConfig localConfig = ConfigFactory.create(LocalConfig.class, System.getProperties());
}
