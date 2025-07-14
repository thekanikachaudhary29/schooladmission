package com.api.admissionservice.controller;

import com.api.admissionservice.dto.RegisterRequest;
import com.api.admissionservice.dto.RegisterResponse;
//import com.api.admissionservice.service.RegisterService;
import com.api.admissionservice.serviceresponse.ServiceResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/register")
@Tag(name = "Register New Student", description = "API for managing registered students")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping
    public ResponseEntity<ServiceResponse<RegisterResponse>> create(@RequestBody @Valid RegisterRequest request) {
      var create = registerService.create(request);
      return new ResponseEntity<>(create, HttpStatus.OK);
    }
}
