package com.example.Project.Journal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class JournalService {
    private final JournalRepository journalRepository;

    @Autowired
    public JournalService(JournalRepository journalRepository) {
        this.journalRepository = journalRepository;
    }

    public List<Journal> getJournal() {
        return journalRepository.findAll();
    }

    public Journal addNewJournal(Map<String, String> journal) {
        String title = journal.get("title");
        String description = journal.get("description");
        Journal newJournal = new Journal(title, description);
        journalRepository.save(newJournal);
        return newJournal;
    }

    public Journal getJournal(@PathVariable("id") long id) {
        return journalRepository.findById(id).get();
    }

    public boolean deleteJournal(@PathVariable("journalID") long id){
        if(!journalRepository.findById(id).equals(Optional.empty())){
            journalRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Journal updateJournal(Long id, @RequestBody Map<String, String> journal) {
        Journal jo = journalRepository.findById(id).get();
        jo.setJournalTitle(journal.get("journalTitle"));
        jo.setJournalDescription(journal.get("journalDescription"));
        journalRepository.save(jo);
        return jo;
    }
}
