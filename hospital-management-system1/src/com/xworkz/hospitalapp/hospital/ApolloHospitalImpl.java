package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitalImpl implements Hospital {
    Patient patient[];
    int index;

    public ApolloHospitalImpl(int size) {
        patient = new Patient[size];
    }

    @Override
    public boolean addPatient(Patient patient) {
        System.out.println("Invoked addPatient method");
        boolean isAdded = false;
        if (patient != null) {
            System.out.println("patient check is completed ....Proceed to add the patient");

            if (patient.getPatientName() != null && !patient.getPatientName().isEmpty() && patient.getPatientId() > 0 && patient.getPatientAge() >= 0 && patient.getBloodGroup() != null && !patient.getBloodGroup().isEmpty()) {
                this.patient[index] = patient;
                index++;
                isAdded = true;

            } else {
                System.out.println("Patient data added successfully");
            }
        } else {
            System.out.println("Patient details are checked");
        }
        return isAdded;
    }

    @Override
    public void getAllPatients() {
        System.out.println("Invoked getAllPateient");
        System.out.println("List of patients are");
        for (Patient pat : this.patient
        ) {
            System.out.println(pat);
        }
    }

    @Override
    public Patient getPatientByAddress(String address) {
        System.out.println("Invoked getPatientByAddress");
        System.out.println("List of the patient address details");
        if (address != null && !address.isEmpty()) {
            for (int i = 0; i < this.patient.length; i++) {
                if (this.patient[i].getAddress().equals(address)) {
                    System.out.println(this.patient[i]);
                }
            }
        } else {
            System.out.println("Invalid address details");
        }
        return null;
    }

    @Override
    public String getPatientNameByWardNo(String wardNo) {
        System.out.println("List of the patient wardno");
        if (wardNo != null && !wardNo.isEmpty()) {
            for (int i = 0; i < this.patient.length; i++) {
                if (this.patient[i].getWardNo().equals(wardNo)) {
                    System.out.println("patient name" + this.patient[i].getPatientName());
                }
            }
        }
        return null;
    }
    @Override
    public boolean updatePatientDiseaseByPatientName(String existingPatientName, String updatedDiseaseName) {
        System.out.println("Invoked updatePatientDiseaseByPatientName method");
        boolean isUpdated = false;
        if (existingPatientName != null && !existingPatientName.isEmpty() && updatedDiseaseName!=null && !updatedDiseaseName.isEmpty()) {
            for (int i = 0; i < this.patient.length; i++) {
                if (this.patient[i].getPatientName().equals(existingPatientName)) {
                    this.patient[i].setDiseaseName(updatedDiseaseName);
                    isUpdated = true;
                    System.out.println(this.patient[i]);
                }
            }
        }
        return isUpdated;
    }
    @Override
    public boolean updatePatientWardNoByPatientId(int existingId, String updatedWardNo) {
        System.out.println("Invoked updatePatientWardNoByPatientId method");
        boolean isUpdate = false;
        if (existingId !=0 && updatedWardNo!=null && !updatedWardNo.isEmpty()){
            for (int i=0; i< this.patient.length;i++){
                if(this.patient[i].getPatientId()==existingId){
                    this.patient[i].setWardNo(updatedWardNo);
                    isUpdate = true;
                    System.out.println(this.patient[i]);
                }
            }
        }

        return isUpdate;
    }
}
