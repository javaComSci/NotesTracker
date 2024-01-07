package com.javaComSci.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Note {
    @Id @GeneratedValue
    private String id;
    private String value;

    public Note() {}

    public String getValue() {
        return value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
