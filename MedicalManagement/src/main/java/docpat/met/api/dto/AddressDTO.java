package docpat.met.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressDTO(
    @NotBlank
    String street,
    @NotBlank
    String number,
    @NotBlank
    String neighborhood,
    @NotBlank
    String city,
    @NotBlank
    String state,
    @NotBlank
    @Pattern(regexp = "\\d{5}-\\d{3}")
    String zipCode,
    String complement) {}