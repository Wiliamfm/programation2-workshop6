package edu.unbosque.Workshop6.resources.pojos;

public class Info {

    private String value;
    private int total;

    public Info(String value, int total) {
        this.value = value;
        this.total = total;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
