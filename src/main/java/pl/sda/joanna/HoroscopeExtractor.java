package pl.sda.joanna;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HoroscopeExtractor {
private static final String PATTERN = "<p class=\"lead\">.+";

    public static String getHoroscopeText(String pageAsText) {
        Pattern patternHoroscope = Pattern.compile(PATTERN);
        Matcher matcherHoroscope = patternHoroscope.matcher(pageAsText);
        String foundText = "";
        if (matcherHoroscope.find()) {
            foundText = matcherHoroscope.group();
        }
        return foundText;
    }
}
