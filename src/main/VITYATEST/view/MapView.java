package VITYATEST.view;

import VITYATEST.controller.UserController;
import VITYATEST.model.Country;
import VITYATEST.model.User;

import java.util.*;

public class MapView {
    String operationsInfo = ("""
            -----------------------
            1. Get Map
            2. Back
            -----------------------
            """);
    Scanner in = new Scanner(System.in);
    Boolean Status = true;
    String operation;

    UserController userController = new UserController();

    public void runGetMapView() {
        try {
            Status = true;
            while (Status) {
                System.out.println(operationsInfo);
                System.out.print("Enter command: ");
                operation = in.next();

                switch (operation) {
                    case "1" -> getUsersById();
                    case "2" -> Status = false;
                    default -> System.out.println("Unknown command");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void getUsersById() {
        Map<Country, List<User>> usersByCountry = new HashMap<>(userController.getUserByIdCountry());
    }
}

