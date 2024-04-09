package com.springdemo.opg2todolist.model;

/**
 * Opgave-klassen repræsenterer en enkelt opgave i to-do listen.
 * Den indeholder opgavens id og en beskrivelse.
 */
public class Opgave {
    private Long id;
    private String beskrivelse;

    /**
     * Konstruktør for Opgave-klassen.
     * @param id Opgavens unikke identifikator.
     * @param beskrivelse Opgavens beskrivelse.
     */
    public Opgave(Long id, String beskrivelse) {
        this.id = id;
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
