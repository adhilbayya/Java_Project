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
                    "Journal 1",
                    "This is journal one"
            );
            Journal j2 = new Journal(
                        "Journal 2",
                    "This is journal two"
            );
            journalRepository.saveAll(
                    List.of(j1, j2)
            );
        };
    }
}
