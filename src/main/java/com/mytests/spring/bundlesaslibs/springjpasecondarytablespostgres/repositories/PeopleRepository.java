package com.mytests.spring.bundlesaslibs.springjpasecondarytablespostgres.repositories;

import com.mytests.spring.bundlesaslibs.springjpasecondarytablespostgres.data.People;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PeopleRepository extends CrudRepository<People, Integer> {

    List<People> findAll();


}
