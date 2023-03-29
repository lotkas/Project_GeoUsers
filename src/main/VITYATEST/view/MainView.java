package VITYATEST.view;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainView {
    String operationsInfo = ("""
            -----------------------
            1. Geo
            2. User
            3. Exit
            -----------------------
            """);
    Scanner in = new Scanner(System.in);
    Boolean Status = true;
    String operation;
    CountryView countryView = new CountryView();
    UserView userView = new UserView();

    public void runMainView() {
        try {
            while (Status) {
                System.out.println(operationsInfo);
                System.out.print("Enter command: ");
                operation = in.next();

                switch (operation) {
                    case "1" -> countryView.runCountryView();
                    case "2" -> userView.runUserView();
                    case "3" -> Status = false;
                    default -> System.out.println("Unknown command");
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
