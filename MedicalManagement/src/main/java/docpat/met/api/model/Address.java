package docpat.met.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String street;
    private String number;
    private String neighborhood;
    private String city;
    private String state;
    @Column(name = "zip_code")
    private String zipCode;
    private String complement;
}