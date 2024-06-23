package docpat.met.api.model;

import docpat.met.api.dto.AddressDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String street;
    private String number;
    private String neighborhood;
    private String city;
    private String state;
    @Column(name = "zip_code")
    private String zipCode;
    private String complement;

    public Address(AddressDTO addressData) {
        this.street = addressData.street();
        this.number = addressData.number();
        this.neighborhood = addressData.neighborhood();
        this.city = addressData.city();
        this.state = addressData.state();
        this.zipCode = addressData.zipCode();
        this.complement = addressData.complement();
    }
}