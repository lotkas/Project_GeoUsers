package VITYATEST.controller;

import VITYATEST.model.Country;
import VITYATEST.service.CountryService;
import VITYATEST.service.UserService;

import java.util.List;

public class CountryController {

    CountryService countryService = new CountryService();

    public List<Country> getAll() {
        return countryService.getAll();
    }
}