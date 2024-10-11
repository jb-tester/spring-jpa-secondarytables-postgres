package com.mytests.spring.bundlesaslibs.springjpasecondarytablespostgres;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaSecondarytablesPostgresApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaSecondarytablesPostgresApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(PeopleService service) {
        return args -> {
            System.out.println("--------------------------------------");
            service.showAll();
            System.out.println("--------------------------------------");
        };
    }
}
