package com.example.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.model.Person;
import com.example.springapp.repository.PersonRepo;

@Service
public class BadriPersonService {
    public PersonRepo personRepo;

    public BadriPersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(Person person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<Person> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
