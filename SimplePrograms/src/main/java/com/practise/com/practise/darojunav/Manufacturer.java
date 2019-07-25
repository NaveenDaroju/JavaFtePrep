package com.practise.com.practise.darojunav;

public class Manufacturer {
    public boolean brand;
    public String name;
    public int liscenseNumber;

    public Manufacturer(boolean brand, String name, int liscenseNumber) {
        this.brand = brand;
        this.name = name;
        this.liscenseNumber = liscenseNumber;
    }

    public boolean isBrand() {
        return brand;
    }

    public void setBrand(boolean brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLiscenseNumber() {
        return liscenseNumber;
    }

    public void setLiscenseNumber(int liscenseNumber) {
        this.liscenseNumber = liscenseNumber;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "brand=" + brand +
                ", name='" + name + '\'' +
                ", liscenseNumber=" + liscenseNumber +
                '}';
    }
}
