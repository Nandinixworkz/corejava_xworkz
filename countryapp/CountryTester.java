package com.xworkz.countryapp;

public class CountryTester {
    public static void main(String[] args) {
        State state = new State();
        Country country = new Country(state);
        country.state.toGetTax();
    }
}
