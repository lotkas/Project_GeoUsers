package VITYATEST.service;

import VITYATEST.model.Country;
import VITYATEST.model.User;
import VITYATEST.repository.CountryRepository;
import VITYATEST.repository.UserRepository;

import java.util.List;

public class CountryService {

        CountryRepository countryRepository = new CountryRepository();

        public List<Country> getAll() {
            return countryRepository.getAll();
        }
    }