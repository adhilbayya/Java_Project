package com.example.Project.Journal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class JournalConfig {
    @Bean
    CommandLineRunner commandLineRunner(JournalRepository journalRepository) {
        return args -> {
            Journal j1 = new Journal(
                    "12",
                    "Journal 1",
                    "This is journal one"
            );
            Journal j2 = new Journal(
                    "12",
                        "Journal 2",
                    "This is journal two"
            );
            Journal j3 = new Journal(
                    "13",
                    "Journal 3",
                    "This is journal three"
            );
            Journal j4 = new Journal(
                    "13",
                    "Journal 3",
                    "This is journal three"
            );Journal j5 = new Journal(
                    "13",
                    "Journal 3",
                    "This is journal three"
            );Journal j6 = new Journal(
                    "14",
                    "Journal 3",
                    "This is journal three"
            );

            journalRepository.saveAll(
                    List.of(j1, j2, j3, j4, j5, j6)
            );
        };
    }
}
