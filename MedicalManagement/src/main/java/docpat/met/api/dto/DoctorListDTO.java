package docpat.met.api.dto;

import docpat.met.api.model.Doctor;

public record DoctorListDTO(Long id, String name, String crm, String specialty, String email) {

    public DoctorListDTO(Doctor doctor) {
        this(doctor.getId(), doctor.getName(), doctor.getCrm(), doctor.getSpecialty().name(), doctor.getEmail());
    }
}