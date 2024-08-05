package com.flowired.controller;

import com.flowired.model.Patient;
import com.flowired.service.IPatientService;
import com.flowired.service.PatientServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {

    //@Autowired
    private final IPatientService service;

//    public PatientController(PatientService service) {
//        this.service = service;
//    }

    @GetMapping
    public Patient sayHelloValid(){
        //service = new PatientService();
        return  service.sayHelloValid(new Patient(1,"x","x","","","",""));
    }


}
