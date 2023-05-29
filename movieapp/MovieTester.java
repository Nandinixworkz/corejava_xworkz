package com.xworkz.movieapp;

public class MovieTester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Movie movie = new Movie(ticket);
        movie.ticket.toWatch();
    }
}
