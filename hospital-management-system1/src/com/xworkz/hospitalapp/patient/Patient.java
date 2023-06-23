package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.Documents;
import com.xworkz.hospitalapp.Gender;
import com.xworkz.hospitalapp.hospital.Address;
import lombok.*;

import javax.xml.ws.soap.Addressing;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    private String patientName;
    private int patientId;
    private int patientAge;
    private String bloodGroup;
    private Documents documents;
    private Gender gender;
    private String location;
    private String wardNo;
    private String attenderName;
    private String diseaseName;
     Address address;

}