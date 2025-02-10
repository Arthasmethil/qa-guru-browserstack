package com.qaguru.lesson20.drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.annotation.Nonnull;

import static com.qaguru.lesson20.helpers.BrowserstackUrlHelper.getBrowserstackUrl;
import static com.qaguru.lesson20.helpers.ConfigEnvHelper.*;

public class BrowserstackDriver implements WebDriverProvider {

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        if (isAndroid) {
            return getAndroidDriver();
        } else if (isIos) {
            return getIosDriver();
        } else {
            throw new RuntimeException("Unknown platform");
        }
    }

    private DesiredCapabilities commonCapabilities() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("project", PROJECT_NAME);
        return caps;
    }

    public AndroidDriver getAndroidDriver() {
        DesiredCapabilities caps = commonCapabilities();
        caps.setCapability("app", ANDROID_APP);
        caps.setCapability("deviceName", ANDROID_DEVICE);
        caps.setCapability("os_version", ANDROID_VERSION);
        return new AndroidDriver(getBrowserstackUrl(), caps);
    }

    private IOSDriver getIosDriver() {
        DesiredCapabilities capabilities = commonCapabilities();
        capabilities.setCapability("app", IOS_APP);
        capabilities.setCapability("deviceName", IOS_DEVICE);
        capabilities.setCapability("os_version", IOS_VERSION);
        capabilities.setCapability("autoAcceptAlerts", true);
        return new IOSDriver(getBrowserstackUrl(), capabilities);
    }
}