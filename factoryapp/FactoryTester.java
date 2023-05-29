package com.xworkz.factoryapp;

import javax.crypto.Mac;

public class FactoryTester {
    public static void main(String[] args) {
        Machines machines = new Machines();
        Factory factory = new Factory(machines);
        factory.machines.toWork();
    }
}
