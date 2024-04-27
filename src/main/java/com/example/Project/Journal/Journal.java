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

    private String userID;
    private String journalTitle;
    private String journalDescription;

    public Journal() {
    }

    public Journal(long journalID, String userID, String journalTitle, String journalDescription) {
        this.journalID = journalID;
        this.userID = userID;
        this.journalTitle = journalTitle;
        this.journalDescription = journalDescription;
    }

    public Journal(String userID, String journalTitle, String journalDescription) {
        this.userID = userID;
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

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
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
