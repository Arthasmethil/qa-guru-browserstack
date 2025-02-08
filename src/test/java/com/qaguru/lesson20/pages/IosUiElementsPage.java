package com.qaguru.lesson20.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static org.assertj.core.api.Assertions.assertThat;

public class IosUiElementsPage {
    private final SelenideElement textBtn = $(accessibilityId("Text Button"));
    private final SelenideElement textInput = $(accessibilityId("Text Input"));
    private final SelenideElement textOutput = $(accessibilityId("Text Output"));

    @Step("Click the text button")
    public IosUiElementsPage clickTextButton() {
        textBtn.click();
        return this;
    }

    @Step("Input text {text}")
    public IosUiElementsPage inputText(String text) {
        textInput.sendKeys(text + "\n");
        return this;
    }

    @Step("Check entered text")
    public IosUiElementsPage checkTextIsCorrect(String text) {
        assertThat(textOutput.getText()).isEqualTo(text);
        return this;
    }
}
