package edu.pe.cibertec.DAWII_CL1_PazCesar.repository;

import edu.pe.cibertec.DAWII_CL1_PazCesar.model.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Integer> {
}
