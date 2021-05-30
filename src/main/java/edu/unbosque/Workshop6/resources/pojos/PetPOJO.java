package edu.unbosque.Workshop6.resources.pojos;

import java.util.ArrayList;
import java.util.List;

public class PetPOJO {

    private int id;
    private String microship;
    private String name;
    private String specie;
    private String race;
    private String size;
    private String sex;
    private String picture;
    private ProprietaryPOJO owner;
    private ArrayList<CasePOJO> casePOJOList = new ArrayList<>();
    private List<VisitPOJO> visitPOJOList= new ArrayList<>();

    public PetPOJO(){}

    public PetPOJO(int id, String microship, String name, String specie, String race, String size, String sex, String picture, ProprietaryPOJO owner) {
        this.id = id;
        this.microship = microship;
        this.name = name;
        this.specie = specie;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.owner= owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMicroship() {
        return microship;
    }

    public void setMicroship(String microship) {
        this.microship = microship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public ProprietaryPOJO getOwner() {
        return owner;
    }

    public void setOwner(ProprietaryPOJO owner) {
        this.owner = owner;
    }

    public ArrayList<CasePOJO> getCasePOJOList() {
        return casePOJOList;
    }

    public void setCasePOJOList(ArrayList<CasePOJO> casePOJOList) {
        this.casePOJOList = casePOJOList;
    }

    public List<VisitPOJO> getVisitPOJOList() {
        return visitPOJOList;
    }

    public void setVisitPOJOList(List<VisitPOJO> visitPOJOList) {
        this.visitPOJOList = visitPOJOList;
    }
}
