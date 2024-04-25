package com.example.Project.Journal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class JournalController {
    private final JournalService journalService;

    @Autowired
    public JournalController(JournalService journalService) {
        this.journalService = journalService;
    }

    @GetMapping("/get-all-journal")
    public List<Journal> getJournals() {
        return journalService.getJournal();
    }

    @GetMapping("/get-journal/{id}")
    public Journal getJournal(@PathVariable("id") long id) {
        return journalService.getJournal(id);
    }

    @DeleteMapping("/remove-journal/{journalID}")
    public boolean deleteJournal(@PathVariable("journalID") long id){
        return journalService.deleteJournal(id);
    }

    @PutMapping("update-journal/{id}")
    public Journal updateJournal(@PathVariable("id") long id, @RequestBody Map<String, String> journal){
        return journalService.updateJournal(id, journal);
    }

    @PostMapping("/add-journal")
    public Journal addJournal(@RequestBody Map<String, String> journal){
        return journalService.addNewJournal(journal);
    }
}
