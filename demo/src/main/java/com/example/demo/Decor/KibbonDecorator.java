package com.example.demo.Decor;

import com.example.demo.flowers.Item;

public class KibbonDecorator extends ItemDecorator{
    Item item;
    public KibbonDecorator(Item item) {
        this.item = item;
    }
    @Override
    public double getPrice() {
        return (40 + item.getPrice());
    }
    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
