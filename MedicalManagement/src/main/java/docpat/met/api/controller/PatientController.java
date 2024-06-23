package docpat.met.api.controller;

import docpat.met.api.dto.PatientDTO;

import docpat.met.api.model.Patient;
import docpat.met.api.repository.PatientRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PatientController {
    @Autowired
    PatientRepository patientRepository;

    @PostMapping
    @Transactional
    public void createPatient(@RequestBody @Valid PatientDTO patient) {
        patientRepository.save(new Patient(patient));
    }
}