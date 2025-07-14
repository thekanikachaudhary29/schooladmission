package com.api.admissionservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Admission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long admissionId;
    @Column(unique = true, nullable = false)
    private Long admissionId;
    @OneToOne
    private ParentInfo parentInfo;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "admissionId")
    private List<PreviousSchoolDetails> previousSchoolDetails;
}