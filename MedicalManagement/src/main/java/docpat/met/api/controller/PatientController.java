package docpat.met.api.controller;

import docpat.met.api.dto.PatientCreateDTO;
import docpat.met.api.dto.PatientListDTO;
import docpat.met.api.dto.PatientUpdateDTO;
import docpat.met.api.model.Patient;
import docpat.met.api.repository.PatientRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PatientController {
    @Autowired
    PatientRepository patientRepository;

    @PostMapping
    @Transactional
    public void createPatient(@RequestBody @Valid PatientCreateDTO patient) {
        patientRepository.save(new Patient(patient));
    }

    @GetMapping
    public Page<PatientListDTO> getPatients(Pageable pageable) {
        return patientRepository.findAll(pageable).map(PatientListDTO::new);
    }

    @PutMapping
    @Transactional
    public void updatePatient(@RequestBody @Valid PatientUpdateDTO patientData) {
        var patient = patientRepository.findById(patientData.id()).orElseThrow();
        patient.updatePatientData(patientData);
    }
}