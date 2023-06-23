package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public interface Hospital {
    boolean addPatient(Patient patient);
    void getAllPatients();
   Patient getPatientByAddress(String address);
   String getPatientNameByWardNo(String wardNo);
  boolean updatePatientDiseaseByPatientName(String existingPatientName,String updatedDiseaseName);

  boolean updatePatientWardNoByPatientId(int existingId, String updatedWardNo);

    String[] getPatientNameByDiseaseName(String diseaseName);

    boolean updatePatientsAgeByPatientId(int updateAge, int existingPatientId);
    Patient getPatientById(int patientId);
    String getPatientAttenderNameByPatientId(int patientId);
    Patient getPatientStreetById(int id);

}
