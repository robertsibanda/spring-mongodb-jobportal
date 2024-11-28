package com.nx.jobportal.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nx.jobportal.models.Vacancy;

@Repository
public interface  VacancyRepository extends MongoRepository<Vacancy, String>{
    
}
