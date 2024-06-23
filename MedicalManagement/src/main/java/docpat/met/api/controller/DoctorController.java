package docpat.met.api.controller;

import docpat.met.api.dto.DoctorDTO;
import docpat.met.api.model.Doctor;
import docpat.met.api.repository.DoctorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class DoctorController {
    @Autowired
    DoctorRepository doctorRepository;

    @PostMapping
    @Transactional
    public void createDoctor(@RequestBody @Valid DoctorDTO doctor) {
        doctorRepository.save(new Doctor(doctor));
    }
}