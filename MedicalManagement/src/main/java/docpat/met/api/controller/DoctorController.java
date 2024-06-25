package docpat.met.api.controller;

import docpat.met.api.dto.DoctorCreateDTO;
import docpat.met.api.dto.DoctorListDTO;
import docpat.met.api.dto.DoctorUpdateDTO;
import docpat.met.api.model.Doctor;
import docpat.met.api.repository.DoctorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class DoctorController {
    @Autowired
    DoctorRepository doctorRepository;

    @PostMapping
    @Transactional
    public void createDoctor(@RequestBody @Valid DoctorCreateDTO doctor) {
        doctorRepository.save(new Doctor(doctor));
    }

    @GetMapping
    public Page<DoctorListDTO> getDoctors(Pageable pageable) {
        return doctorRepository.findAll(pageable).map(DoctorListDTO::new);
    }

    @PutMapping
    @Transactional
    public void updateDoctor(@RequestBody @Valid DoctorUpdateDTO doctorData) {
        var doctor = doctorRepository.findById(doctorData.id()).orElseThrow();
        doctor.updateDoctorData(doctorData);
    }
}