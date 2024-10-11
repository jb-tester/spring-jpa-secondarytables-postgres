package com.mytests.spring.bundlesaslibs.springjpasecondarytablespostgres;

import com.mytests.spring.bundlesaslibs.springjpasecondarytablespostgres.repositories.PeopleRepository;
import org.springframework.stereotype.Service;

@Service
class PeopleService {

    private final PeopleRepository repository;

    public PeopleService(PeopleRepository repository) {
        this.repository = repository;
    }

    public void showAll() {
        repository.findAll().forEach(System.out::println);
    }



}    