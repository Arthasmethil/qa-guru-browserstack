package com.qaguru.lesson20.drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.annotation.Nonnull;

import static com.qaguru.lesson20.config.DeviceConfigCreator.deviceConfig;
import static com.qaguru.lesson20.config.MobileConfigCreator.mobileConfig;
import static com.qaguru.lesson20.helpers.Browserstack.getBrowserstackUrl;
import static com.qaguru.lesson20.helpers.IphoneRegexProvider.isIphone;

public class BrowserstackDriver implements WebDriverProvider {

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        return createDriver();
    }

    private DesiredCapabilities commonCapabilities() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("project", mobileConfig.projectName());
        return caps;
    }

    public AppiumDriver createDriver() {
        DesiredCapabilities caps = commonCapabilities();
        caps.setCapability("app", mobileConfig.appUrl());
        caps.setCapability("deviceName", deviceConfig.deviceName());
        caps.setCapability("os_version", deviceConfig.deviceOsVersion());
        if (isIphone(deviceConfig.deviceName())) {
            caps.setCapability("autoAcceptAlerts", true);
            return new IOSDriver(getBrowserstackUrl(), caps);
        }
        return new AndroidDriver(getBrowserstackUrl(), caps);
    }
}