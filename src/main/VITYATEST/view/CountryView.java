package VITYATEST.view;

import VITYATEST.controller.CountryController;
import VITYATEST.model.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryView {
    String operationsInfo = ("""
            -----------------------
            1. Get all Countries
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
                    case "1" -> getAllCountries();
                    case "2" -> Status = false;
                    default -> System.out.println("Unknown command");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllCountries() {
        List<Country> countries = new ArrayList<>(countryController.getAll());
    }
}