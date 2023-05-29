package com.xworkz.theaterapp.theater;

public class TheaterTester {
    public static void main(String[] args) {
        Screens screens = new Screens();
        Theater theater = new Theater(screens);
        theater.screens.toShow();
    }
}
