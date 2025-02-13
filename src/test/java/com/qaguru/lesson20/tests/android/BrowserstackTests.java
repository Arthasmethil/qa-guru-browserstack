package com.qaguru.lesson20.tests.android;

import com.qaguru.lesson20.pages.SearchPage;
import com.qaguru.lesson20.pages.SearchResultPage;
import com.qaguru.lesson20.tests.TestBase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.qaguru.lesson20.constants.Constants.*;

public class BrowserstackTests extends TestBase {

    @Disabled
    @DisplayName("Search Appium via Wiki")
    @Tag("android")
    @Test
    void searchAppiumTest() {
        SearchPage searchPage = new SearchPage();
        searchPage.inputTextToFind(APPIUM_SEARCH);
        searchPage.checkResultsNotEmpty();
    }

    @Disabled
    @DisplayName("Search Selenide via Wiki")
    @Tag("android")
    @Test
    void searchSelenideTest() {
        SearchPage searchPage = new SearchPage();
        searchPage.inputTextToFind(SELENIDE_SEARCH);
        searchPage.checkResultsNotEmpty();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.clickOnFirstElementOfResult();
        searchResultPage.checkErrorOpenedPage(ERROR_DESCRIPTION);
  }
}
