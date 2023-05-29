package com.xworkz.zomatoapp;

public class ZomatoTester {
    public static void main(String[] args) {
        DeliveryBoy deliveryBoy = new DeliveryBoy();
        Zomato zomato = new Zomato(deliveryBoy);
        zomato.deliveryBoy.toDeliveryFood();
    }
}
