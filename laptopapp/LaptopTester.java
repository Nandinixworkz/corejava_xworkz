package com.xworkz.laptopapp;

public class LaptopTester {
    public static void main(String[] args) {
        HardDisk hardDisk = new HardDisk();
        Laptop laptop = new Laptop(hardDisk);
        laptop.hardDisk.toUse();
    }
}
