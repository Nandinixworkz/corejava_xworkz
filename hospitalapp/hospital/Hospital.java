package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

import java.nio.file.Path;

public interface Hospital {
    boolean addPatient(Patient patient);
    void getAllPatients();

}
