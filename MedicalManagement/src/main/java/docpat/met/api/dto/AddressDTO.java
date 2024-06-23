package docpat.met.api.dto;

public record AddressDTO(
    String street,
    String number,
    String neighborhood,
    String city,
    String state,
    String zipCode,
    String complement) {}