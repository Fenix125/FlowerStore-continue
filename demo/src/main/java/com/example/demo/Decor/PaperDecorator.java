package com.example.demo.Decor;

import com.example.demo.flowers.Item;

public class PaperDecorator extends ItemDecorator{
    Item item;
    public PaperDecorator(Item item) {
        this.item = item;
    }
    @Override
    public double getPrice() {
        return (13 + item.getPrice());
    }
    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
