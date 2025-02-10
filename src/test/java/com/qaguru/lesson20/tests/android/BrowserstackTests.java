package com.qaguru.lesson20.tests.android;

import com.qaguru.lesson20.pages.SearchPage;
import com.qaguru.lesson20.tests.TestBase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

public class BrowserstackTests extends TestBase {

    @Disabled
    @DisplayName("Search Appium via Wiki")
    @Tag("android")
    @Test
    void searchAppiumTest() {
        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });
        step("Verify content found", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Disabled
    @DisplayName("Search Selenide via Wiki")
    @Tag("android")
    @Test
    void searchSelenideTest() {
        SearchPage searchPage = new SearchPage();
        searchPage.inputTextToFind("Selenide");
        searchPage.checkResultsNotEmpty();
  }
}
