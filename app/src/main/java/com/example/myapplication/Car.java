package com.example.myapplication;

public class Car extends Obj {
    private Brand brand;
    private Engine engine;


    public Car() {}

    public Car(String name, String pathImg, Brand brand, Engine engine) {
        super(name, pathImg);
        this.brand = brand;
        this.engine = engine;
    }


    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
