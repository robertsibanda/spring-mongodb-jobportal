package com.nx.jobportal.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nx.jobportal.models.Vacancy;
import com.nx.jobportal.services.VacancyService;

@RestController
public class VacancyController {

    @Autowired
    VacancyService vacancyService;
    

    @GetMapping("/")
    public List<Vacancy> getAllVacancies() {
        // get a list of all the vacancies
        List<Vacancy> mVacancys =  vacancyService.getAllVacancies();
        return mVacancys;
    }


    @GetMapping("/vacancy/{id}")
    public Optional<Vacancy> getVacancyById(@PathVariable String id) {
        // get a single vanacy with matching id
        Optional<Vacancy> sVacancy = vacancyService.getVacancyById(id);
        return sVacancy;
    }

    @PostMapping("/")
    public Vacancy createVacancy(@RequestBody Vacancy  vaca) {
        // create a new vacancy and return it
        return vacancyService.createVacancy(vaca);
    }


}
