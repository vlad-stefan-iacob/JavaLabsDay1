package com.qa;

import java.util.Arrays;

public class House {
    private String[] rooms;
    private double price;
    private String owner;
    private int levels;
    private String location;

    public House(String[] rooms, double price, String owner, int levels, String location) {
        this.rooms = rooms;
        this.price = price;
        this.owner = owner;
        this.levels = levels;
        this.location = location;
    }

    public String[] getRooms() {
        return rooms;
    }

    public void setRooms(String[] rooms) {
        this.rooms = rooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + Arrays.toString(rooms) +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                ", levels=" + levels +
                ", location='" + location + '\'' +
                '}';
    }
}
