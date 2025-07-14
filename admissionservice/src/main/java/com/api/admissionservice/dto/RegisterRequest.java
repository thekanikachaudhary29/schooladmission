package com.api.admissionservice.dto;

import com.api.admissionservice.entity.Admission;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @Pattern(regexp = "^[A-Z]+$", message = "All letters must be capital (A-Z only)")
    private String firstName;
    @Pattern(regexp = "^[A-Z]+$", message = "All letters must be capital (A-Z only)")
    private String lastName;
    private String gender;
    private Admission admissionId;
    private Date DOB;
    private String fatherName;
    private String motherName;
    private String occupation;
    private String previousSchoolName;
    private String address;
    @Pattern(regexp = "\\d{10}", message = "Mobile number must be 9 digits")
    private String mobileNo;
    @Pattern(regexp = "\\d{12}", message = "Aadhar card must be 12 digits ")
    private String aadharNumber;
    private String reasonForLeaving;
}
