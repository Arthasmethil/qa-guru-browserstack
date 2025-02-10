package com.qaguru.lesson20.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static org.assertj.core.api.Assertions.assertThat;

public class OnboardingWikiPage {
    private final SelenideElement title = $(id("org.wikipedia.alpha:id/primaryTextView"));
    private final SelenideElement continueBtn = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));
    @Step("Check that title on a page is {text}")
    public OnboardingWikiPage checkTitle(String text) {
        assertThat(title.getText()).isEqualTo(text);
        return this;
    }

    @Step("Click to Continue")
    public OnboardingWikiPage clickContinue() {
        continueBtn.click();
        return this;
    }
}
