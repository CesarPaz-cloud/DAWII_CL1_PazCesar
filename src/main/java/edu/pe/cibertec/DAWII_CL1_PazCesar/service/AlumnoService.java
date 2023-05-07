package edu.pe.cibertec.DAWII_CL1_PazCesar.service;

import edu.pe.cibertec.DAWII_CL1_PazCesar.model.Alumno;
import edu.pe.cibertec.DAWII_CL1_PazCesar.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }
    public void registrarAlumno(Alumno alumno){
       alumnoRepository.save(alumno);
    }
    public  void eliminarAlumno(Alumno idAl){
        alumnoRepository.deleteById(idAl.getIdAl());
    }
}
