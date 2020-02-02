package pl.sda.joanna;

import org.jsoup.Jsoup;

import java.io.IOException;

public class Connector {
public static final String NOT_FOUND = "NOT FOUND";
    private static final String URL_TEMPLATE = "https://horoskopy.gazeta.pl/horoskop/[placeholder]/dzienny";


    public static String getPage(String zodiacSign) {
        String url = URL_TEMPLATE.replace("[placeholder]", zodiacSign);
        String requestResult;
        try {
            requestResult = Jsoup.connect(url).get().html();
        } catch (IOException e) {
            requestResult = NOT_FOUND;
            e.printStackTrace();
        }
        return requestResult;
    }


}
