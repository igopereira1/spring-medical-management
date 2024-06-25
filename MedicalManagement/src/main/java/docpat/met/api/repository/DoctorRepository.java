package docpat.met.api.repository;

import docpat.met.api.model.Doctor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor, Long>{
    Page<Doctor> findAllByActiveTrue(Pageable pageable);
}