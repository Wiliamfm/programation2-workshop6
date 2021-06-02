package edu.unbosque.Workshop6.resources.pojos;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryPOJO {

    private String username;
    private String name;
    private String address;
    private String neighborhood;
    private List<VisitPOJO> visitPOJOList= new ArrayList<>();

    public VeterinaryPOJO(){}

    public VeterinaryPOJO(String username, String name, String address, String neighborhood, List<VisitPOJO> visitPOJOList) {
        this.username = username;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
        this.visitPOJOList= visitPOJOList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public List<VisitPOJO> getVisitPOJOList() {
        return visitPOJOList;
    }

    public void setVisitPOJOList(List<VisitPOJO> visitPOJOList) {
        this.visitPOJOList = visitPOJOList;
    }
}
