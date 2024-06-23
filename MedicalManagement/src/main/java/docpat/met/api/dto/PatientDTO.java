package docpat.met.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record PatientDTO(
    @NotBlank
    String name,
    @NotBlank
    @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")
    String cpf,
    @NotNull
    @Email
    String email,
    @Pattern(regexp = "\\d{2}-\\d{4,5}-\\d{4}")
    String phone,
    @NotNull
    @Valid
    AddressDTO address) {}