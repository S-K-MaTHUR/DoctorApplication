package com.geekster.DoctorAPP.services;

import com.geekster.DoctorAPP.model.AuthenticationToken;
import com.geekster.DoctorAPP.model.Patient;

public interface IAuthService {

    void saveToken(AuthenticationToken token);
    AuthenticationToken getToken(Patient patient);
    boolean authenticate(String userEmail, String token);


}
