package com.example.demo.flowers;


public abstract class Item {
    public String description;
    public abstract String getDescription();
    public abstract double getPrice();
    protected void setDescription(String newDescription) {
        this.description = newDescription;
    }
}
