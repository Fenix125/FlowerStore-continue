package com.example.demo.decor;

import com.example.demo.flowers.Item;

public class BasketDecorator extends ItemDecorator {
    private Item item;
    private static final double BASKET_COST = 4.0;
    public BasketDecorator(Item item) {
        this.item = item;
        
    }
    @Override
    public double getPrice() {
        return (BASKET_COST + item.getPrice());
    }
    @Override
    public String getDescription() {
        return item.getDescription();
    }
    public Item getItem() {
        return this.item;
    }
}
