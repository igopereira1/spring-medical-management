package docpat.met.api.dto;

import docpat.met.api.model.Specialty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DoctorDTO(
    @NotBlank
    String name,
    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    String crm,
    @NotNull
    Specialty specialty,
    @NotBlank
    @Email
    String email,
    @Pattern(regexp = "\\d{2}-\\d{4,5}-\\d{4}")
    String phone,
    @NotNull
    @Valid
    AddressDTO address) {}