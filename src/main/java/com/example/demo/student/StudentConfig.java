package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student gega = new Student(
                    "Gega",
                    "gega@gmail.com",
                    LocalDate.of(1999, Month.OCTOBER, 20)
            );

            Student anano = new Student(
                    "Anano",
                    "anano@gmail.com",
                    LocalDate.of(1999, Month.JUNE, 4)
            );

            repository.saveAll(
                    List.of(gega, anano)
            );
        };
    }
}
