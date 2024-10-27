package com.example.demo.decor;

import com.example.demo.flowers.Item;

public class KibbonDecorator extends ItemDecorator {
    private Item item;
    private static final double KIBBON_COST = 40.0;
    public KibbonDecorator(Item item) {
        this.item = item;
    }
    @Override
    public double getPrice() {
        return (KIBBON_COST + item.getPrice());
    }
    @Override
    public String getDescription() {
        return item.getDescription();
    }
    public Item getItem() {
        return this.item;
    }
}
