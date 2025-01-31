package com.qaguru.lesson20.drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.annotation.Nonnull;

import static com.qaguru.lesson20.helpers.Browserstack.getBrowserstackUrl;

public class BrowserstackDriver implements WebDriverProvider {

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        return getAndroidDriver();
    }


    private DesiredCapabilities commonCapabilities() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("project", "browserstack autotests");
        return caps;
    }

    public AndroidDriver getAndroidDriver() {
        DesiredCapabilities caps = commonCapabilities();
        caps.setCapability("app", "bs://sample.app");
        caps.setCapability("deviceName", "Google Pixel 6 Pro");
        caps.setCapability("os_version", "12.0");
        return new AndroidDriver(getBrowserstackUrl(), caps);
    }
}