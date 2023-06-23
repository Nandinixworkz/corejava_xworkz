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
        System.out.println("Invoked getPatientByAddress method");
        if (address !=null && !address.isEmpty()){
            for (int i=0; i< this.patient.length;i++){
                if (this.patient[i].getLocation().equals(address)){
                    System.out.println("patient details " +this.patient[i]);
                }
            }
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
        if (existingPatientName != null && !existingPatientName.isEmpty() && updatedDiseaseName != null && !updatedDiseaseName.isEmpty()) {
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
        if (existingId != 0 && updatedWardNo != null && !updatedWardNo.isEmpty()) {
            for (int i = 0; i < this.patient.length; i++) {
                if (this.patient[i].getPatientId() == existingId) {
                    this.patient[i].setWardNo(updatedWardNo);
                    isUpdate = true;
                    System.out.println(this.patient[i]);
                }
            }
        }

        return isUpdate;
    }

    @Override
    public String[] getPatientNameByDiseaseName(String diseaseName) {
        System.out.println("Invoked getPatientNameByDiseaseName method");
        Patient patient1 = null;
        int ind = 0;
        for (Patient pat : patient) {
            if (pat.getDiseaseName().equals(diseaseName)) {
                System.out.println("patinet name is " + pat.getPatientName());
            }
        }
        return null;
    }

    @Override
    public boolean updatePatientsAgeByPatientId(int updateAge, int existingPatientId) {
        System.out.println("Invoked updatePatientsAgeByPatientId method");
        boolean isUpdates = false;
        if (updateAge!=0 && existingPatientId !=0){
            for (int i=0; i<this.patient.length; i++){
                if (this.patient[i].getPatientId()==existingPatientId){
                    this.patient[i].setPatientAge(updateAge);
                    isUpdates=true;
                    System.out.println(this.patient[i]);
                }
            }
        }
        return isUpdates;
    }

    @Override
    public Patient getPatientById(int patientId) {
        System.out.println("Invoked getPatientById method");
        int ind=0;
        for (Patient pat : patient) {
            if (pat.getPatientId() == patientId) {
                patient = this.patient;
                ind++;
                System.out.println(patient[ind]);
            }

        }
        return null;
    }

    @Override
    public String getPatientAttenderNameByPatientId(int patientId) {
        System.out.println("Invoked getPatientAttenderNameByPatientId method");
        for (Patient pat1 : patient) {
            if (pat1.getPatientId() == patientId) {
                System.out.println("Patient attender name is " + pat1.getAttenderName());
            }
        }
        return null;
    }
    public Patient getPatientStreetById(int id) {
        System.out.println("Invoked getPatientStreetById method");
        for (Patient pat1 : patient) {
            if (pat1.getPatientId()== id){
                System.out.println("Door no is " +pat1.getAddress().getCountry().getState().getCity().getArea().getStreet().getDoorNo());
            }
        }
        return null;
    }
    }