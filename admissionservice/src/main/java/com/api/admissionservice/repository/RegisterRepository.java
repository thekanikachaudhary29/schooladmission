package com.api.admissionservice.repository;

import com.api.admissionservice.entity.Admission;
import com.api.admissionservice.infos.AdmissionInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegisterRepository extends JpaRepository<Admission, Long> {
    Optional<AdmissionInfo> findByAdmissionId(Admission admissionId);

    @Query()
    AdmissionInfo findByAdmissionInfoId(Admission admissionId);
}
