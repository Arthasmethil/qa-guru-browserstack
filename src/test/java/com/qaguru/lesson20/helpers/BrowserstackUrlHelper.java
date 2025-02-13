package com.qaguru.lesson20.helpers;

import java.net.MalformedURLException;
import java.net.URL;

import static com.qaguru.lesson20.config.AuthConfigCreator.authConfig;
import static io.restassured.RestAssured.given;


public class BrowserstackUrlHelper {
    public static URL getBrowserstackUrl() {
        try {
            return new URL("https://" + authConfig.username() + ":" + authConfig.password()
                    + "@hub-cloud.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String videoUrl(String sessionId) {
        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic(authConfig.username(), authConfig.password())
                .get(url)
                .then()
                .log().status()
                .log().body()
                .extract().path("automation_session.video_url");
    }
}
