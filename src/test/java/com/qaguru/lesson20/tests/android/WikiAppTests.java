package com.qaguru.lesson20.tests.android;

import com.qaguru.lesson20.constants.Constants;
import com.qaguru.lesson20.pages.OnboardingWikiPage;
import com.qaguru.lesson20.tests.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class WikiAppTests extends TestBase {

    @DisplayName("Wiki Onboarding test")
    @Tag("emulator")
    @Test
    void searchSelenideTest() {
        OnboardingWikiPage onboardingWikiPage = new OnboardingWikiPage();

        onboardingWikiPage.checkTitle(Constants.TITLE_ENCYCLOPEDIA);
        onboardingWikiPage.clickContinue();
        onboardingWikiPage.checkTitle(Constants.TITLE_WAYS);
        onboardingWikiPage.clickContinue();
        onboardingWikiPage.checkTitle(Constants.TITLE_LISTS);
        onboardingWikiPage.clickContinue();
        onboardingWikiPage.checkTitle(Constants.TITLE_DATA);

  }
}
