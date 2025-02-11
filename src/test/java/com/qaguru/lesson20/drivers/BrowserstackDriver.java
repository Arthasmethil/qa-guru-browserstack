package com.qaguru.lesson20.drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.annotation.Nonnull;

import static com.qaguru.lesson20.config.IphoneConfigCreator.iphoneConfig;
import static com.qaguru.lesson20.config.MobileConfigCreator.mobileConfig;
import static com.qaguru.lesson20.config.PixelConfigCreator.pixelConfig;
import static com.qaguru.lesson20.helpers.Browserstack.getBrowserstackUrl;

public class BrowserstackDriver implements WebDriverProvider {

    public static final String PLATFORM = System.getProperty("platform", "android");

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        switch (PLATFORM.toLowerCase()) {
            case "android" -> { return getAndroidDriver(); }
            case "ios" -> { return getIosDriver(); }
            default -> throw new RuntimeException("Unknown platform: " + PLATFORM);
        }
    }

    private DesiredCapabilities commonCapabilities() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("project", mobileConfig.projectName());
        return caps;
    }

    public AndroidDriver getAndroidDriver() {
        DesiredCapabilities caps = commonCapabilities();
        caps.setCapability("app", mobileConfig.appUrl());
        caps.setCapability("deviceName", pixelConfig.deviceAndroid());
        caps.setCapability("os_version", pixelConfig.androidOsVersion());
        return new AndroidDriver(getBrowserstackUrl(), caps);
    }

    private IOSDriver getIosDriver() {
        DesiredCapabilities capabilities = commonCapabilities();
        capabilities.setCapability("app", mobileConfig.appUrl());
        capabilities.setCapability("deviceName", iphoneConfig.deviceIos());
        capabilities.setCapability("os_version", iphoneConfig.deviceIos());
        capabilities.setCapability("autoAcceptAlerts", true);
        return new IOSDriver(getBrowserstackUrl(), capabilities);
    }
}