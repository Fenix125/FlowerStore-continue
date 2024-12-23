package com.example.demo.flowers;

public enum FlowerColor {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF"),
    YELLOW("#FFFF00"),
    WHITE("#FFFFFF");
    private String rgb;
    

    FlowerColor(String rgb) {
        this.rgb = rgb;
    }
    @Override
    public String toString() {
        return rgb.toString();
    }
}
