package com.nx.jobportal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nx.jobportal.models.Vacancy;
import com.nx.jobportal.repo.VacancyRepository;

@Service
public class VacancyService {

    @Autowired
    VacancyRepository jobPostRepository;


    public List<Vacancy> getAllVacancies() {
        return jobPostRepository.findAll();
    }

    public Optional<Vacancy> getVacancyById(String id) {
        return jobPostRepository.findById(id);
    }

    public Vacancy createVacancy(Vacancy vaca) {
        return jobPostRepository.insert(vaca);
    }
    
}
