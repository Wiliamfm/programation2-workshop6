package edu.unbosque.Workshop6.resources.pojos;

import java.util.ArrayList;
import java.util.List;

public class VisitPOJO {

    private int id;
    private String createdAt;
    private String type;
    private String description;
    private String veterinaryId;
    private int petId;
    private String microship;

    public VisitPOJO(){}

    public VisitPOJO(int id, String createdAt, String type, String description, String veterinaryId, int petId, String microship) {
        this.id = id;
        this.createdAt = createdAt;
        this.type = type;
        this.description = description;
        this.veterinaryId = veterinaryId;
        this.petId = petId;
        this.microship = microship;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVeterinaryId() {
        return veterinaryId;
    }

    public void setVeterinaryId(String veterinaryId) {
        this.veterinaryId = veterinaryId;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getMicroship() {
        return microship;
    }

    public void setMicroship(String microship) {
        this.microship = microship;
    }
}
