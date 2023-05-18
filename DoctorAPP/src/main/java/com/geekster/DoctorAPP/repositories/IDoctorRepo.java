package com.geekster.DoctorAPP.repositories;

import com.geekster.DoctorAPP.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepo extends JpaRepository<Doctor, Long> {


    Doctor findByDoctorId(Long docId);
}
