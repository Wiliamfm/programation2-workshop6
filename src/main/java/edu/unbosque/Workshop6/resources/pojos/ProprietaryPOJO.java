package edu.unbosque.Workshop6.resources.pojos;

public class ProprietaryPOJO {

    private String username;
    private int id;
    private String name;
    private String address;
    private String neighborhood;

    public ProprietaryPOJO(String username, int id, String name, String address, String neighborhood) {
        this.username = username;
        this.id = id;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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
}
