package docpat.met.api.controller;

import docpat.met.api.dto.PatientDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PatientController {

    @PostMapping
    public void createPatient(@RequestBody PatientDTO patient) {
        System.out.println(patient);
    }
}