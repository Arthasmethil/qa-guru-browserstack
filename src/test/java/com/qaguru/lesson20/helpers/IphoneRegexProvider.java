package com.qaguru.lesson20.helpers;

import java.util.regex.Pattern;

public class IphoneRegexProvider {
    private static final Pattern IPHONE_PATTERN = Pattern.compile("(?i)^iPhone.*");

    public static boolean isIphone(String deviceName) {
        return deviceName != null && IPHONE_PATTERN.matcher(deviceName).matches();
    }
}
