package dev.patika.vetsystem.business.abstracts;

import dev.patika.vetsystem.entities.Doctor;
import org.springframework.data.domain.Page;

public interface IDoctorService {
    Doctor save(Doctor doctor);

    Doctor get(long id);

    Page<Doctor> cursor(int page, int pageSize);

    Doctor update(Doctor doctor);

    boolean delete(long id);
}
