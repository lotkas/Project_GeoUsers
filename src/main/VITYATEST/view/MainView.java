package VITYATEST.view;

import VITYATEST.controller.UserController;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

public class MainView {
    String operationsInfo = ("""
            -----------------------
            1. Get all Countries
            2. Get all Users
            3. Get Map
            4. Exit
            -----------------------
            """);
    Scanner in = new Scanner(System.in);
    Boolean Status = true;
    String operation;

    CountryView countryView = new CountryView();
    UserView userView = new UserView();
    MapView mapView = new MapView();

    public void runMainView() {
        try {
            while (Status) {
                System.out.println(operationsInfo);
                System.out.print("Enter command: ");
                operation = in.next();

                switch (operation) {
                    case "1" -> countryView.runCountryView();
                    case "2" -> userView.runUserView();
                    case "3" -> mapView.runGetMapView();
                    case "4" -> Status = false;
                    default -> System.out.println("Unknown command");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
