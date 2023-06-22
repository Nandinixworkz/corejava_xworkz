package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.Documents;
import com.xworkz.hospitalapp.Gender;
import lombok.*;

import javax.xml.ws.soap.Addressing;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    private String PatientName;
    private int patientId;
    private int patientAge;
    private String bloodGroup;
    private Documents documents;
    private Gender gender;
    private String address;
    private String wardNo;
    private String attenderName;
    private String diseaseName;

}