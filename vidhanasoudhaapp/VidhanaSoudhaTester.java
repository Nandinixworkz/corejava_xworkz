package com.xworkz.vidhanasoudhaapp;
import com.xworkz.trainapp.Compartments;
public class VidhanaSoudhaTester {
    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet();
        VidhanaSoudha vidhanaSoudha = new VidhanaSoudha(cabinet);
        vidhanaSoudha.cabinet.toRule();
    }
}
