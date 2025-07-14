package com.api.admissionservice.service;

import com.api.admissionservice.dto.RegisterRequest;
import com.api.admissionservice.dto.RegisterResponse;
import com.api.admissionservice.entity.Admission;
import com.api.admissionservice.repository.RegisterRepository;
import com.api.admissionservice.serviceresponse.ServiceResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterService {

    @Autowired
    private RegisterRepository registerRepository;


    public ServiceResponse<RegisterResponse> create(@Valid RegisterRequest request) {
//      Optional<AdmissionInfo> existing = registerRepository.findByAdmissionId(request.getAdmissionId());
//      RegisterResponse response = new RegisterResponse();
//      if(existing.isPresent()) {
//          throw new RuntimeException("Admission Id exists");
//      } else {
  //        AdmissionInfo admissionInfo = registerRepository.findByAdmissionInfoId(request.getAdmissionId());
        Admission ad = new Admission();
        //  response.setAdmissionId(request.getAdmissionId());
          ad.setFirstName(request.getFirstName());
          response.setLastName(request.getLastName());
          response.setDOB(request.getDOB());
          response.setGender(request.getGender());
          response.setAddress(request.getAddress());
          response.setCity(admissionInfo.getCity());
          response.setState(admissionInfo.getState());
          response.setFatherName(request.getFatherName());
          response.setMotherName(request.getMotherName());
          response.setMobileNo(request.getMobileNo());
          response.setEmail(admissionInfo.getEmail());
          response.setOccupation(request.getOccupation());
          response.setHomeAddress(admissionInfo.getHomeAddress());
          response.setPreviousSchoolName(request.getPreviousSchoolName());
          response.setSchoolAddress(admissionInfo.getSchoolAddress());
          response.setReasonForLeaving(admissionInfo.getReasonForLeaving());

          var dto = mapEntityToDto(response);
          var admission = registerRepository.save(dto);

          ServiceResponse<RegisterResponse> serviceResponse = new ServiceResponse();
          serviceResponse.getData(admission);
          serviceResponse.setMessage("Registration Successful");
          serviceResponse.setSuccess(true);

      }
    }

    private Admission mapEntityToDto(RegisterResponse response) {
        Admission ad = new Admission();

        //response.setAdmissionId(ad.getAdmissionId());
        response.setFirstName(ad.getFirstName());
        response.setLastName(ad.getLastName());
        response.setDOB(request.getDOB());
        response.setGender(request.getGender());
        response.setAddress(request.getAddress());
        response.setCity(admissionInfo.getCity());
        response.setState(admissionInfo.getState());
        response.setFatherName(request.getFatherName());
        response.setMotherName(request.getMotherName());
        response.setMobileNo(request.getMobileNo());
        response.setEmail(admissionInfo.getEmail());
        response.setOccupation(request.getOccupation());
        response.setHomeAddress(admissionInfo.getHomeAddress());
        response.setPreviousSchoolName(request.getPreviousSchoolName());
        response.setSchoolAddress(admissionInfo.getSchoolAddress());
        response.setReasonForLeaving(admissionInfo.getReasonForLeaving());


    }


}