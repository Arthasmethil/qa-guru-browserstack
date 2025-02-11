package com.qaguru.lesson20.tests.android;

import com.qaguru.lesson20.pages.SearchPage;
import com.qaguru.lesson20.tests.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class BrowserstackTests extends TestBase {

    @DisplayName("Search Appium via Wiki")
    @Tag("android")
    @Test
    void searchAppiumTest() {
        SearchPage searchPage = new SearchPage();
        searchPage.inputTextToFind("Appium");
        searchPage.checkResultsNotEmpty();
    }

    @DisplayName("Search Selenide via Wiki")
    @Tag("android")
    @Test
    void searchSelenideTest() {
        SearchPage searchPage = new SearchPage();
        searchPage.inputTextToFind("Selenide");
        searchPage.checkResultsNotEmpty();




  }
}
