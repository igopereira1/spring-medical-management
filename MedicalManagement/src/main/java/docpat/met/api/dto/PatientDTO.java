package docpat.met.api.dto;

public record PatientDTO(
    String name,
    String cpf,
    String email,
    String phone,
    AddressDTO address) {}