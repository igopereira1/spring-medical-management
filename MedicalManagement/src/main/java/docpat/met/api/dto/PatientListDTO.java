package docpat.met.api.dto;

import docpat.met.api.model.Patient;

public record PatientListDTO(String name, String cpf, String email) {

    public PatientListDTO(Patient patient) {
        this(patient.getName(), patient.getCpf(), patient.getEmail());
    }
}