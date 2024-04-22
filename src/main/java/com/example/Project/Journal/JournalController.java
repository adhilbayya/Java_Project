package com.example.Project.Journal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/journal")
public class JournalController {
    private final JournalService journalService;

    @Autowired
    public JournalController(JournalService journalService) {
        this.journalService = journalService;
    }

    @GetMapping
    public List<Journal> getJournals() {
        return journalService.getJournal();
    }

    @PostMapping
    public void addJournal(@RequestBody Journal journal) {
        journalService.addNewJournal(journal);
    }
}
