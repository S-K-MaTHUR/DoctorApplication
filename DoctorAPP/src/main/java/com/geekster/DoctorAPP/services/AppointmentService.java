package com.geekster.DoctorAPP.services;

import com.geekster.DoctorAPP.model.Appointment;
import com.geekster.DoctorAPP.model.AppointmentKey;
import com.geekster.DoctorAPP.repositories.IAppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    IAppointmentRepo appointmentRepo;

    public void bookAppointment(Appointment appointment) {
        appointmentRepo.save(appointment);
    }

    public void cancelAppointment(AppointmentKey key) {
        appointmentRepo.deleteById(key);
    }
}