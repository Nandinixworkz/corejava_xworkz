package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitalImpl implements Hospital {
    Patient patient[] = new Patient[2];
    int index;

    @Override
    public boolean addPatient(Patient patient) {
        System.out.println("Invoked addPatient method");
        boolean isAdded = false;
        if (patient != null) {
            System.out.println("patient check is completed ....Proceed to add the patient");

            if (patient.getPatientName() != null && !patient.getPatientName().isEmpty() && patient.getPatientId() >0 && patient.getPatientAge() >0 && patient.getBloodGroup() != null && !patient.getBloodGroup().isEmpty() ) {
                this.patient[index] = patient;
                index++;
                isAdded = true;
                System.out.println("Patient data added successfully");

            } else {
                System.out.println("patient age is checked");
            }
    }
       return isAdded;
}
    @Override
    public void getAllPatients() {
        System.out.println("Invoked getAllPateient");
        System.out.println("List of patients are");
        for (Patient pat : this.patient) {
            System.out.println(pat);
        }
    }

}


