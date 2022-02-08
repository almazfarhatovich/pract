package com.company;

public class Group {
    private String name;
    private String datOfStart;
    private int price;

    public Group() {
    }

    public Group(String name, String datOfStart, int price) {
        this.name = name;
        this.datOfStart = datOfStart;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatOfStart() {
        return datOfStart;
    }

    public void setDatOfStart(String datOfStart) {
        this.datOfStart = datOfStart;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n course name:" + name + "\n Date of start:" + datOfStart + "\n price:" + price + "som";
    }
}
