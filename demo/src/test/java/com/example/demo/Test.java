package com.example.demo;
import com.example.demo.Decor.BasketDecorator;
import com.example.demo.Decor.PaperDecorator;
import com.example.demo.flowers.Flower;
import com.example.demo.flowers.FlowerBucket;
import com.example.demo.flowers.FlowerColor;
import com.example.demo.flowers.FlowerPack;
import com.example.demo.flowers.FlowerType;
import com.example.demo.flowers.Item;
import com.example.demo.flowers.Order;

public class Test {
    public static void main(String[] args) {
        Item flower = new Flower(FlowerColor.RED, 60, 80.5, FlowerType.ROSE);
        System.out.println(flower.getDescription());
        flower = new PaperDecorator(flower);
        System.out.println(flower.getDescription());
        System.out.println(flower.getPrice());
        System.out.println(flower.getPrice());
        Flower flower2 = new Flower(FlowerColor.RED, 60, 80.5, FlowerType.ROSE);
        Item flowerPack = new FlowerPack(flower2, 2);
        System.out.println(flowerPack.getClass());
        System.out.println(flowerPack.getDescription());
        FlowerBucket buckflowerBuck = new FlowerBucket();
        FlowerPack flowerPack2 = new FlowerPack(flower2, 2);
        buckflowerBuck.add(flowerPack2);
        buckflowerBuck.add(flowerPack2);
        System.out.println(buckflowerBuck.getDescription());
        Item test = buckflowerBuck;
        System.out.println(test.getPrice());
        Order order = new Order();
        order.addItem(test);
        order.addItem(test);
        System.out.println(order.getPrice());
        System.out.println(test.getPrice());
        test = new BasketDecorator(test);
        System.out.println(test.getPrice());
        
        
        
    }
}
