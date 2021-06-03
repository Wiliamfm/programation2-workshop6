package edu.unbosque.Workshop6.resources.pojos;

import java.util.ArrayList;
import java.util.List;

public class VisitPOJO {

    private int id;
    private String createdAt;
    private String type;
    private String description;
    private VeterinaryPOJO vet;
    private int petId;
    private String microship;

    public VisitPOJO(){}

    public VisitPOJO(int id, String createdAt, String type, String description, VeterinaryPOJO vet, int petId, String microship) {
        this.id = id;
        this.createdAt = createdAt;
        this.type = type;
        this.description = description;
        this.vet = vet;
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

    public VeterinaryPOJO getVet() {
        return vet;
    }

    public void setVet(VeterinaryPOJO vet) {
        this.vet = vet;
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
