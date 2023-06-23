package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.Documents;
import com.xworkz.hospitalapp.Gender;
import com.xworkz.hospitalapp.patient.Patient;

import java.util.Scanner;

public class HospitalTester {
    public static void main(String[] args) {
    System.out.println("Main is invoked");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the patient details to be added");
        int size = sc.nextInt();
        Hospital hospital = new ApolloHospitalImpl(size);

        for (int patientIndex = 0; patientIndex<size; patientIndex++ ){
            Patient patient = new Patient();
            System.out.println("Enter the patient id");
            patient.setPatientId(sc.nextInt());
            System.out.println("Enter the patient name");
            patient.setPatientName(sc.next());
            System.out.println("Enter the patient age");
            patient.setPatientAge(sc.nextInt());
            System.out.println("Enter the patient blood group ");
            patient.setBloodGroup(sc.next());
            System.out.println("Enter the patient gender");
            patient.setGender(Gender.valueOf(sc.next()));
            System.out.println("Enter the patient Address");
            patient.setLocation(sc.next());
            System.out.println("Enter the patient ward no");
            patient.setWardNo(sc.next());
            System.out.println("Enter the patient attender name");
            patient.setAttenderName(sc.next());
            System.out.println("Enter the patient disease name");
            patient.setDiseaseName(sc.next());
            //hospital.addPatient(patient);
            DoorNo doorNo = new DoorNo();
            Street street = new Street();
            Area area = new Area();
            City city = new City();
            State state = new State();
            Country country = new Country();
            Address address = new Address();
            System.out.println("Enter the Door No");
            doorNo.setDoorNo(sc.nextInt());
            System.out.println("Enter the street ");
            street.setStreet(sc.next());
            System.out.println("Enter the area");
            area.setArea(sc.next());
            System.out.println("Enter the city");
            city.setCity(sc.next());
            System.out.println("Enter the state");
            state.setState(sc.next());
            System.out.println("Enter the country");
            country.setCountry(sc.next());
            System.out.println("Enter the addresso");
            address.setAddress(sc.next());

            patient.setAddress(address);
            address.setCountry(country);
            country.setState(state);
            state.setCity(city);
            city.setArea(area);
            area.setStreet(street);
            street.setDoorNo(doorNo);
            hospital.addPatient(patient);
        }

        hospital.getAllPatients();
        System.out.println("Enter the existing address of the patient");
        hospital.getPatientByAddress(sc.next());
        System.out.println("Enter the existing ward no of the patient");
       hospital.getPatientNameByWardNo(sc.next());
       System.out.println("Enter the updated patient disease");
       hospital.updatePatientDiseaseByPatientName(sc.next(), sc.next());
        System.out.println("Enter the updated patient ward no");
        hospital.updatePatientWardNoByPatientId(sc.nextInt(), sc.next());
        System.out.println("Enter the disease name");
        hospital.getPatientNameByDiseaseName(sc.next());
        System.out.println("Enter the patient details");
        hospital.updatePatientsAgeByPatientId(sc.nextInt(), sc.nextInt());
        System.out.println("Enter the patient id");
        hospital.getPatientById(sc.nextInt());
        System.out.println("Enter the patient id");
        hospital.getPatientAttenderNameByPatientId(sc.nextInt());
        System.out.println("Enter id");
        hospital.getPatientStreetById(sc.nextInt());


    }

}
