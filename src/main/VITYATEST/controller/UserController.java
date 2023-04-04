package VITYATEST.controller;

import VITYATEST.model.Country;
import VITYATEST.model.User;
import VITYATEST.service.UserService;

import java.util.List;
import java.util.Map;

public class UserController {
    UserService userService = new UserService();

    public List<User> getAll() {
        return userService.getAll();
    }

    public Map<Country, List<User>> getUserByIdCountry(){
        return userService.getUserByIdCountry();
    }
}