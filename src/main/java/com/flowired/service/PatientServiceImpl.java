package com.flowired.service;

import com.flowired.model.Patient;
import com.flowired.repo.IPatientRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements  IPatientService{

    //@Autowired
    private final IPatientRepo repo;

    //@Autowired
//    public PatientService(PatientRepo repo) {
//        this.repo = repo;
//    }
    @Override
    public Patient sayHelloValid(Patient patient) {
        //repo = new PatientRepo();
        if (patient.getIdPatient() >= 1) {
            return repo.sayHello(patient);
        } else {
            return  new Patient();
        }
    }

}
