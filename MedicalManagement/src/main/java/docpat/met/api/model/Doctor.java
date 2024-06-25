package docpat.met.api.model;

import docpat.met.api.dto.DoctorCreateDTO;
import docpat.met.api.dto.DoctorUpdateDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Doctor")
@Table(name = "doctors")
@Getter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Specialty specialty;
    private String email;
    private String phone;
    @Embedded
    private Address address;

    public Doctor(DoctorCreateDTO doctorData) {
        this.name = doctorData.name();
        this.crm = doctorData.crm();
        this.specialty = doctorData.specialty();
        this.email = doctorData.email();
        this.phone = doctorData.phone();
        this.address = new Address(doctorData.address());
    }

    public void updateDoctorData(DoctorUpdateDTO doctorData) {
        if (doctorData.phone() != null) {
            this.phone = doctorData.phone();
        }
        if (doctorData.address() != null) {
            this.address.updateAddressData(doctorData.address());
        }
    }
}