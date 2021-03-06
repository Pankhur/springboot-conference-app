package com.pluralsight.conference.models;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

// define entity for JPA & name as db table name
@Entity(name ="speakers")
public class Speaker {

    //for primary key
    @Id
    //for auto sequencing
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long speaker_id;

    //for table names
    private String first_name;
    private String last_name;
    private String title;
    private String company;
    private String speaker_bio;

    //for bi directional communication refering to table session_speakers, which has relationship key
    @ManyToMany(mappedBy = "speakers")
    private List<Session> sessions;

    //for handling binary data in java
    @Lob
    @Type(type="org.hiberanate.type.BinaryType")
    private byte[] speaker_photo;

    //Constructor
    public Speaker() {

    }


    //Getter & setter methods

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }



    public Long getSpeaker_id() {
        return speaker_id;
    }

    public void setSpeaker_id(Long speaker_id) {
        this.speaker_id = speaker_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSpeaker_bio() {
        return speaker_bio;
    }

    public void setSpeaker_bio(String speaker_bio) {
        this.speaker_bio = speaker_bio;
    }

}
