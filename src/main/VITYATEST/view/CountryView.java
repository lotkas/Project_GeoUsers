package VITYATEST.view;

import VITYATEST.controller.CountryController;

import java.util.Scanner;

public class CountryView {
    String operationsInfo = ("""
            -----------------------
            1. Get all Country's
            2. Back
            -----------------------
            """);
    Scanner in = new Scanner(System.in);
    Boolean Status = true;
    String operation;
    CountryController countryController = new CountryController();

    public void runCountryView() {
        try {
            Status = true;
            while (Status) {
                System.out.println(operationsInfo);
                System.out.print("Enter command: ");
                operation = in.next();

                switch (operation) {
                    case "1" -> getAllCountrys();
                    case "2" -> Status = false;
                    default -> System.out.println("Unknown command");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void getAllCountrys(){
        // List<Country> countryList = new List<Country>(CountryController.getAll());
        // CountryList.forEach(n -> System.out.println("Name: " + n.getName() + "ID: " + n.getId()));
        }
    }