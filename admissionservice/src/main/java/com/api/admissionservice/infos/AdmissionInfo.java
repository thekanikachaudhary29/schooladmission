package com.api.admissionservice.infos;

import java.util.Date;

public interface AdmissionInfo {
    Long getAdmissionId();

    String getFirstName();

    String getLlastName();

    Date getDOB();

    String getGender();

    String getAddress();

    String getCity();

    String getState();

    String getFatherName();

    String getMotherName();

    String getMobileNo();

    String getEmail();

    String getOccupation();

    String getHomeAddress();

    String getPreviousSchoolName();

    String getSchoolAddress();

    Date getFromDate();

    Date getToDate();

    String getReasonForLeaving();
}
