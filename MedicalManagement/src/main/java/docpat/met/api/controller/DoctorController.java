package docpat.met.api.controller;

import docpat.met.api.dto.DoctorDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class DoctorController {

    @PostMapping
    public void createDoctor(@RequestBody DoctorDTO doctor) {
        System.out.println(doctor);
    }
}
