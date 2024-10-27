package com.example.demo;

import com.example.demo.decor.PaperDecorator;
import com.example.demo.flowers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlowerShopTests {
    private static final double BASE_FLOWER_PRICE = 80.5;
    private static final int QUANTITY_FLOWER_PACK = 2;
    private static final double PAPER_DECORATOR_COST = 13.0;
    private static final double BASKET_DECORATOR_COST = 4.0;
    private static final int SEPALLENGTH = 60;
    private static final double COSTDECORBASKET = 648.0;
    @Test
    public void testFlowerCreationAndDescription() {
        Item flower = new Flower(FlowerColor.RED, SEPALLENGTH, BASE_FLOWER_PRICE, FlowerType.ROSE);
        assertNotNull(flower);
        assertEquals("Flower(color=#FF0000, sepallength=60, price=80.5, flowerType=ROSE)", flower.getDescription());
        assertEquals(BASE_FLOWER_PRICE, flower.getPrice());
    }
    @Test
    public void testFlowerWithPaperDecorator() {
        Item flower = new Flower(FlowerColor.RED, SEPALLENGTH, BASE_FLOWER_PRICE, FlowerType.ROSE);
        flower = new PaperDecorator(flower);
        assertEquals(BASE_FLOWER_PRICE + PAPER_DECORATOR_COST, flower.getPrice());
    }
    @Test
    public void testFlowerPackCreation() {
        Flower flower = new Flower(FlowerColor.RED, SEPALLENGTH, BASE_FLOWER_PRICE, FlowerType.ROSE);
        Item flowerPack = new FlowerPack(flower, QUANTITY_FLOWER_PACK);
        assertEquals(QUANTITY_FLOWER_PACK * BASE_FLOWER_PRICE, flowerPack.getPrice());
    }

    @Test
    public void testFlowerBucketWithMultiplePacks() {
        Flower flower = new Flower(FlowerColor.RED, SEPALLENGTH, BASE_FLOWER_PRICE, FlowerType.ROSE);
        FlowerPack flowerPack = new FlowerPack(flower, QUANTITY_FLOWER_PACK);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
        flowerBucket.add(flowerPack);
        assertEquals(2 * QUANTITY_FLOWER_PACK * BASE_FLOWER_PRICE, flowerBucket.getPrice());
    }

    @Test
    public void testOrderWithItemsAndDecorators() {
        Flower flower = new Flower(FlowerColor.RED, SEPALLENGTH, BASE_FLOWER_PRICE, FlowerType.ROSE);
        FlowerPack flowerPack = new FlowerPack(flower, QUANTITY_FLOWER_PACK);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
        flowerBucket.add(flowerPack);

        Order order = new Order();
        order.addItem(flowerBucket);
        order.addItem(flowerBucket);

        assertEquals(2 * 2 * QUANTITY_FLOWER_PACK * BASE_FLOWER_PRICE, order.getPrice());
        assertEquals(order.getPrice() + BASKET_DECORATOR_COST, COSTDECORBASKET);
    }
}
