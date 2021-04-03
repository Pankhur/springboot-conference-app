package com.pluralsight.conference.models;

import javax.persistence.Entity;

@Entity(name ="speakers")
public class Speaker {

    
    private  Long speaker_id;
    private String first_name;
    private String last_name;
    private String title;
    private String company;
    private String speaker_bio;
    public Speaker() {

    }
}
