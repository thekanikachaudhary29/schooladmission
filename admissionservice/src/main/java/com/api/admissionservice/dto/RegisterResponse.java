package com.api.admissionservice.dto;

import com.api.admissionservice.entity.Admission;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResponse {
    private Admission admissionId;
    private String firstName;
    private String lastName;
    private Date DOB;
    private String gender;
    private String address;
    private String city;
    private String state;
    private String fatherName;
    private String motherName;
    private String mobileNo;
    private String email;
    private String occupation;
    private String homeAddress;
    private String previousSchoolName;
    private String schoolAddress;
    private Date fromDate;
    private Date toDate;
    private String reasonForLeaving;
}
