package com.example.java;

public class Computer {
    private String brand;
    private int screenSize;
    int coreNumber;
    ComputerType computerType;

    public Computer(String brand, int screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", screenSize=" + screenSize +
                ", coreNumber=" + coreNumber +
                ", computerType=" + computerType +
                '}';
    }
}
