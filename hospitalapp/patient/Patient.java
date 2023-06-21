package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.Documents;
import com.xworkz.hospitalapp.Gender;
import lombok.*;

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
    Documents documents;
    Gender gender;


}