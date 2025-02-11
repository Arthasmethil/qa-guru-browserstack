package com.qaguru.lesson20.helpers;

public class ConfigEnvHelper {
//    public static MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
//    // Platform config
    public static final String PLATFORM = System.getProperty("platform", "android");
//
//    // Browserstack config
//    public static final String PROJECT_NAME = System.getProperty("project", config.projectName());
//    public static final String USERNAME = System.getProperty("username", config.username());
//    public static final String PASSWORD = System.getProperty("password", config.password());
//
//    // Android config
//    public static final boolean isAndroid = PLATFORM.equals("android");
//    public static final String ANDROID_DEVICE = System.getProperty("device", config.deviceAndroid());
//    public static final String ANDROID_VERSION = System.getProperty("os", config.androidOsVersion());
//    public static final String ANDROID_APP = System.getProperty("app", config.appUrl());
//
//    // IOS config
//    public static final boolean isIos = PLATFORM.equals("ios");
//    public static final String IOS_DEVICE = System.getProperty("device", config.deviceIos());
//    public static final String IOS_VERSION = System.getProperty("os", config.iosOsVersion());
//    public static final String IOS_APP = System.getProperty("app", config.appUrl());
}
