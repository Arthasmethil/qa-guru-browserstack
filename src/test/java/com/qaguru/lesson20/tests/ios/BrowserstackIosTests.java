package com.qaguru.lesson20.tests.ios;

import com.qaguru.lesson20.pages.IosUiElementsPage;
import com.qaguru.lesson20.tests.TestBase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class BrowserstackIosTests extends TestBase {

    @Disabled
    @DisplayName("iOS test")
    @Tag("ios")
    @Test
    void iosTextTest() {
        String testData = "Selenide";
        IosUiElementsPage iosUiElementsPage = new IosUiElementsPage();
        iosUiElementsPage.clickTextButton();
        iosUiElementsPage.inputText(testData);
        iosUiElementsPage.checkTextIsCorrect(testData);
    }
}
