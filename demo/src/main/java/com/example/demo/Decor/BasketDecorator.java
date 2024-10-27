package com.example.demo.Decor;

import com.example.demo.flowers.Item;

public class BasketDecorator extends ItemDecorator{
    Item item;
    public BasketDecorator(Item item) {
        this.item = item;
        
    }
    @Override
    public double getPrice() {
        return (4 + item.getPrice());
    }
    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
