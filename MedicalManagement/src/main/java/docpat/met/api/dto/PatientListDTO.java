package docpat.met.api.dto;

import docpat.met.api.model.Patient;

public record PatientListDTO(Long id, String name, String cpf, String email) {

    public PatientListDTO(Patient patient) {
        this(patient.getId(), patient.getName(), patient.getCpf(), patient.getEmail());
    }
}