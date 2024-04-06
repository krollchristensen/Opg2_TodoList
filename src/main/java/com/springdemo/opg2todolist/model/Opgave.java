package com.springdemo.opg2todolist.model;

public class Opgave {
    private Long id;
    private String beskrivelse;

    public Opgave(Long id, String beskrivelse) {
        this.id = 0L;
        this.beskrivelse = beskrivelse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {

        this.beskrivelse = beskrivelse;
    }
}
