package com.json.practiceproblems.covertobjecttojson;

public class Car {
    String brand;
    String model;
    String color;

    Car(  String brand,
    String model,
    String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
