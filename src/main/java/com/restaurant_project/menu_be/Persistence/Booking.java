package com.restaurant_project.menu_be.Persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Booking {
    @Id
    private long id;
    private String name;
    private int person;
    private LocalTime time;
    private LocalDate date;

    //create Constructor

    public Booking(long id, String name, int person, LocalTime time, LocalDate date) {
        this.id = id;
        this.name = name;
        this.person = person;
        this.time = time;
        this.date = date;
    }

    public Booking() {

    }

    //Getter & Setter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
