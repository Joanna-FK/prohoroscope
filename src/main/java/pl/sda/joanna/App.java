package pl.sda.joanna;

import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args)  {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Wprowadź wpisz znak zodiaku:");
        String userInput = scanner.next();

        String requestResult = Connector.getPage(userInput);
        if(requestResult.equals(Connector.NOT_FOUND))
        System.out.println(requestResult);
    }
}
