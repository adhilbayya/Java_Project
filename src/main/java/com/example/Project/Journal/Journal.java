package com.example.Project.Journal;

import jakarta.persistence.*;

@Entity
@Table
public class Journal {
    @Id
    @SequenceGenerator(
            name = "journal_generator",
            sequenceName = "journal_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "journal_generator"
    )
    private long journalID;
    private String journalTitle;
    private String journalDescription;

    public Journal() {
    }

    public Journal(long journalID, String journalTitle, String journalDescription) {
        this.journalID = journalID;
        this.journalTitle = journalTitle;
        this.journalDescription = journalDescription;
    }

    public Journal(String journalTitle, String journalDescription) {
        this.journalTitle = journalTitle;
        this.journalDescription = journalDescription;
    }

    public long getJournalID() {
        return journalID;
    }

    public void setJournalID(long journalID) {
        this.journalID = journalID;
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String journalTitle) {
        this.journalTitle = journalTitle;
    }

    public String getJournalDescription() {
        return journalDescription;
    }

    public void setJournalDescription(String journalDescription) {
        this.journalDescription = journalDescription;
    }
}
