package com.geekster.DoctorAPP.repositories;

import com.geekster.DoctorAPP.model.AuthenticationToken;
import com.geekster.DoctorAPP.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken, Long> {


    AuthenticationToken findByPatient(Patient patient);

    AuthenticationToken findFirstByToken(String token);
}
