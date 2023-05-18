package com.geekster.DoctorAPP.services;

import com.geekster.DoctorAPP.model.AuthenticationToken;
import com.geekster.DoctorAPP.model.Patient;
import com.geekster.DoctorAPP.repositories.IPatientRepo;
import com.geekster.DoctorAPP.repositories.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements IAuthService{

    @Autowired
    ITokenRepo iTokenRepo;
    public void saveToken(AuthenticationToken token)
    {
        iTokenRepo.save(token);
    }

    public AuthenticationToken getToken(Patient patient) {
        return  iTokenRepo.findByPatient(patient);

    }

    public boolean authenticate(String userEmail, String token) {

        AuthenticationToken authToken = iTokenRepo.findFirstByToken(token);//find token object via token string
        if(authToken == null)
        {
            return false;
        }
        String expectedEmail = authToken.getPatient().getPatientEmail();
        if(expectedEmail == null)
            return false;

        return expectedEmail.equals(userEmail);
    }
}
