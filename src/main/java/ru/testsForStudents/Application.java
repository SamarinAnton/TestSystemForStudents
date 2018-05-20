package ru.testsForStudents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

//1)To watch mapped objects in entities
//2)To write right methods in DAO layer
//3)When we will make (1) To watch mapped objects in DTO layers
