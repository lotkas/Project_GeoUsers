package VITYATEST.service;

import VITYATEST.controller.CountryController;
import VITYATEST.controller.UserController;
import VITYATEST.model.Country;
import VITYATEST.model.User;
import VITYATEST.repository.CountryRepository;
import VITYATEST.repository.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {

    UserRepository userRepository = new UserRepository();
    CountryRepository countryRepository = new CountryRepository();

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public Map<Country, List<User>> getUserByIdCountry() {
        Map<Country, List<User>> usersByCountry = new HashMap<>();
        List<User> users = userRepository.getAll();
        List<Country> countries = countryRepository.getAll();

        for (Country country : countries) {
            List<User> usersInCountry = new ArrayList<>();
            for (User user : users) {
                if (user.getCountryId().equals(country.getId())) {
                    usersInCountry.add(user);
                }
            }
            usersByCountry.put(country, usersInCountry);
        }

        for (Map.Entry<Country, List<User>> map : usersByCountry.entrySet()) {
            Country country = map.getKey();
            List<User> usersInCountry = map.getValue();
            for (User user : usersInCountry) {
                System.out.printf("Country: %s - ", country.getName());
                System.out.printf("User: %s\n", user.getUsername());
            }
        }
        return usersByCountry;
    }
}