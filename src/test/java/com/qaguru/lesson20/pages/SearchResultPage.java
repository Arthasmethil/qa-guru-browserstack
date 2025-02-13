package com.qaguru.lesson20.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultPage {
    private final SelenideElement error = $(id("org.wikipedia.alpha:id/view_wiki_error_text"));
    private final ElementsCollection resultsCollection = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    @Step("Click on first element after search")
    public SearchResultPage clickOnFirstElementOfResult() {
        resultsCollection.first().click();
        return this;
    }

    @Step("Check that results page have an error")
    public void checkErrorOpenedPage(String query) {
        assertThat(error.getText()).isEqualTo(query);
    }

}
