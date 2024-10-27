package com.example.demo.flowers;


public abstract class Item {
    String description;
    public abstract String getDescription();
    public abstract double getPrice();
    protected void setDescription(String description) {
        this.description = description;
    }
}
