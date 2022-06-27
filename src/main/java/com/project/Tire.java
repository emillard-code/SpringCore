package com.project;

import org.springframework.beans.factory.annotation.Value;

public class Tire {

    @Value("Firestone")
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "tire [" + "brand=" + brand + ']';
    }

}
