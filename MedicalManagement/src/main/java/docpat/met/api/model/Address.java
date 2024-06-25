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

    public void updateAddressData(AddressDTO address) {
        if (address.street() != null) {
            this.street = address.street();
        }
        if (address.number() != null) {
            this.number = address.number();
        }
        if (address.neighborhood() != null) {
            this.neighborhood = address.neighborhood();
        }
        if (address.city() != null) {
            this.city = address.city();
        }
        if (address.state() != null) {
            this.state = address.state();
        }
        if (address.zipCode() != null) {
            this.zipCode = address.zipCode();
        }
        if (address.complement() != null) {
            this.complement = address.complement();
        }
    }
}