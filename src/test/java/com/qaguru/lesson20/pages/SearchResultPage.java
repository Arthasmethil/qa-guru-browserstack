package com.qaguru.lesson20.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultPage {
    private final SelenideElement searchPlaceholder = $(accessibilityId("Search Wikipedia"));
    private final SelenideElement searchField = $(id("org.wikipedia.alpha:id/search_src_text"));
    public final ElementsCollection resultsCollection = $$(id("org.wikipedia.alpha:id/page_list_item_title"));
    @Step("Input a word to find it in Wiki")
    public SearchResultPage inputTextToFind(String query) {
        searchPlaceholder.click();
        searchField.sendKeys(query);
        return this;
    }

    @Step("Check that results after search is not empty")
    public void checkResultsNotEmpty() {
        assertThat(resultsCollection).hasSizeGreaterThan(0);
    }

}
