package com.flowired.repo;

import com.flowired.model.Patient;
import org.springframework.stereotype.Repository;

@Repository
public class PatientRepoImpl implements  IPatientRepo{

    @Override
    public Patient sayHello(Patient patient){
        return patient;
    }

}
