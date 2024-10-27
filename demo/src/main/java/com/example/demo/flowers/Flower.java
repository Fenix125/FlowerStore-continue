package com.example.demo.flowers;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Flower extends Item{
    protected FlowerColor color;
    protected int sepallength;
    protected double price;
    protected FlowerType flowerType;
    public Flower() { }
    public Flower(Flower flower) {
        this.description = flower.toString();
        this.color = flower.color;
        this.sepallength = flower.sepallength;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }
    public Flower(FlowerColor color, int sepallength, double price, FlowerType flowerType){
        this.color = color;
        this.sepallength = sepallength;
        this.price = price;
        this.flowerType = flowerType;
        this.description = this.toString();
    }
    public String getColor() {
        return color.toString();
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public double getPrice() {
        return price;
    }
    
}
