package VITYATEST.view;

import VITYATEST.controller.CountryController;
import VITYATEST.controller.UserController;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class UserView {
    String operationsInfo = ("""
            -----------------------
            1. Get all User's
            2. Back
            -----------------------
            """);
    Scanner in = new Scanner(System.in);
    Boolean Status = true;
    String operation;
    UserController userController = new UserController();

    public void runUserView() {
        try {
            Status = true;
            while (Status) {
                System.out.println(operationsInfo);
                System.out.print("Enter command");
                operation = in.next();

                switch (operation){
                    case "1" -> getAllUsers();
                    case "2" -> Status = false;
                    default -> System.out.println("Unknown command");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public void getAllUsers(){

    }
}
