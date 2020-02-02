package pl.sda.joanna;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej, jak masz na imię?");
        String userName = scanner.next();
        System.out.println("Którego dnia miesiąca się urodziłeś?");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("W którym miesiącu się urodziłeś? Podaj liczbę.");
        int month = scanner.nextInt();
        scanner.nextLine();
        String sign = ZodiacSingValidation.getSign(day, month);
        String requestResult = Connector.getPage(sign);
        String horoscopeMessage = "";
        if (!requestResult.equals(Connector.NOT_FOUND)) {
            horoscopeMessage = HoroscopeExtractor.getHoroscopeText(requestResult);
        }
        System.out.println("Hej " + userName + " Twoj znak zodiaku to: " + sign + " \n" + "Horoskop na dzisiaj: " + horoscopeMessage);

    }

    private static void testHoroscopeExtractor() {
        String horoscopeText = HoroscopeExtractor.getHoroscopeText("TRALALALALA LALLALA");
        System.out.println(horoscopeText);
    }
}
