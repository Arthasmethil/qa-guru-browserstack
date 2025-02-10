package com.qaguru.lesson20.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.qaguru.lesson20.drivers.BrowserstackDriver;
import com.qaguru.lesson20.drivers.LocalDriver;
import com.qaguru.lesson20.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;


public class TestBase {
    @BeforeAll
    public static void setUp() {
        String deviceHost = System.getProperty("deviceHost", "emulator");
        if (deviceHost.equals("browserstack")) {
            Configuration.browser = BrowserstackDriver.class.getName();
        } else if (deviceHost.equals("emulator")) {
            Configuration.browser = LocalDriver.class.getName();
        } else {
            throw new RuntimeException("Unknown deviceHost was provided.");
        }
        Configuration.browserSize = null;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    public void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = Selenide.sessionId().toString();

        Attach.pageSource();
        Selenide.closeWebDriver();

        Attach.addVideo(sessionId);
    }
}
