package docpat.met.api.dto;

import docpat.met.api.model.Specialty;

public record DoctorDTO(
    String name,
    String crm,
    Specialty specialty,
    String email,
    String phone,
    AddressDTO address) {}