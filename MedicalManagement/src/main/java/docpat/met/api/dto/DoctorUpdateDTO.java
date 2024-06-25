package docpat.met.api.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DoctorUpdateDTO(
    @NotNull
    Long id,
    @Pattern(regexp = "\\d{2}-\\d{4,5}-\\d{4}")
    String phone,
    AddressDTO address) {}
