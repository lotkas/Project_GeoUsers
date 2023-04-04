package VITYATEST.repository;

import VITYATEST.model.User;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRepository {
    public static final String FILE_NAME = "users.txt";

    public List<User> getAll() {
        List<User> users = new ArrayList<>();

        try (FileReader fileReader = new FileReader(FILE_NAME)) {
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] userFields = line.split(",");
                Long id = Long.parseLong((userFields[0]));
                String username = userFields[1];
                String email = userFields[2];
                Long countryId = Long.parseLong(userFields[3]);
                users.add(new User(id, username, email, countryId));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        users.forEach(System.out::println);
        return users;
    }
}