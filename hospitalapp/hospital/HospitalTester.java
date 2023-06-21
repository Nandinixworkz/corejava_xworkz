package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.Documents;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {
    public static void main(String[] args) {
        Hospital has = new ApolloHospitalImpl();
        Patient pat =new Patient();
        pat.setPatientId(1);
        pat.setPatientName("sanju");
        pat.setPatientAge(23);
        pat.setBloodGroup("O+ve");
        //pat.setDocuments(HGHF67);
        //pat.setGender("Male");
        has.addPatient(pat);
        has.getAllPatients();

        Patient pat1 = new Patient();
        pat1.setPatientId(2);
        pat1.setPatientName("Nandini");
        pat1.setPatientAge(27);
        pat1.setBloodGroup("B+ve");
        //pat1.setDocuments(Documents panCard);
        //pat1.setGender(Gender);
        has.addPatient(pat1);
        has.getAllPatients();
    }
}
