package com.geekster.DoctorAPP.repositories;

import com.geekster.DoctorAPP.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepo extends JpaRepository<Patient, Long> {

    Patient findFirstByPatientEmail(String userEmail);
}
