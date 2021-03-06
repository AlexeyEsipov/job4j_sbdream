package ru.job4j.dreamjob.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Candidate implements Serializable {
    private int id;
    private String name;
    private String description;
    private final LocalDateTime created =
            LocalDateTime.now().truncatedTo(TimeUnit.MINUTES.toChronoUnit());
    private boolean visible;
    private City city;
    private byte[] photo;

    public Candidate(int id, String name, String description, City city, boolean visible) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.city = city;
        this.visible = visible;
    }

//    public Candidate(int id, String name,
//    String description, City city, boolean visible,  byte[] photo) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.visible = visible;
//        this.city = city;
//        this.photo = photo;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Candidate candidate = (Candidate) o;
        return id == candidate.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}