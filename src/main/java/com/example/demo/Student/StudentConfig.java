package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
@Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository) {
        return args -> {
            Student zandile = new Student(
                            "Zandile",
                            "zandile.gmail.com",
                            LocalDate.of(2000, Month.APRIL, 5)


            );

            Student alex = new Student(
                    "Alex",
                    "alex.gmail.com",
                    LocalDate.of(2000, Month.APRIL, 5)

            );

            studentRepository.saveAll(
                    List.of(zandile, alex)
            );
        };
}
}
