package docpat.met.api.model;

import docpat.met.api.dto.PatientCreateDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Patient")
@Table(name = "patients")
@Getter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private String email;
    private String phone;
    @Embedded
    private Address address;

    public Patient(PatientCreateDTO patientData) {
        this.name = patientData.name();
        this.cpf = patientData.cpf();
        this.email = patientData.email();
        this.phone = patientData.phone();
        this.address = new Address(patientData.address());
    }
}