package com.geekster.DoctorAPP.repositories;

import com.geekster.DoctorAPP.model.Appointment;
import com.geekster.DoctorAPP.model.AppointmentKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment, AppointmentKey> {

    public String findByIdAppId(Long id);
}
