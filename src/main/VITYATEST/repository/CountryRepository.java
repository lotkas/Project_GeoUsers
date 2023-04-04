package VITYATEST.repository;

import VITYATEST.model.Country;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryRepository {
    public static final String FILE_NAME = "countries.txt";

    public List<Country> getAll() {
        List<Country> countries = new ArrayList<>();

        try (FileReader fileReader = new FileReader(FILE_NAME)) {
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] countryFields = line.split(",");
                Long id = Long.parseLong((countryFields[0]));
                String name = countryFields[1];
                countries.add(new Country(id, name));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        countries.forEach(System.out::println);
        return countries;
    }
}