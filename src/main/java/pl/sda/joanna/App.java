package pl.sda.joanna;

import java.util.Scanner;

public class App {

    public static void main(String[] args)  {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Wprowadź znak zodiaku:");
        String userInput = scanner.next();

        String requestResult = Connector.getPage(userInput);
        String horoscopeMessage = "";
        if(!requestResult.equals(Connector.NOT_FOUND)){
           horoscopeMessage = HoroscopeExtractor.getHoroscopeText(requestResult);
        }
        System.out.println( horoscopeMessage);

    }

    private static void testHoroscopeExtractor(){
        String horoscopeText = HoroscopeExtractor.getHoroscopeText("TRALALALALA LALLALA");
        System.out.println(horoscopeText);
    }
}
