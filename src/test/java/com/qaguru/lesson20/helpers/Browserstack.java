package com.qaguru.lesson20.helpers;

import java.net.MalformedURLException;
import java.net.URL;

import static io.restassured.RestAssured.given;


public class Browserstack {

    private static String login = "login";
    private static String key = "pass";

    public static URL getBrowserstackUrl() {
        try {
            return new URL("https://" + login + ":" + key
                    + "@hub-cloud.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    // curl -u ":" -X GET "https://api.browserstack.com/app-automate/sessions/0359d759d2aaa4f46401dac46bd281b6d9b24943.json"
    // automation_session.video_url

    public static String videoUrl(String sessionId) {
        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic("dmitriik_wmpY7k", "Nyv8qddHP4tac6JGw38C")
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}
