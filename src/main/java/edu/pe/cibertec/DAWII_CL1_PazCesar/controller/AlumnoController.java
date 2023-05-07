package edu.pe.cibertec.DAWII_CL1_PazCesar.controller;

import edu.pe.cibertec.DAWII_CL1_PazCesar.model.Alumno;
import edu.pe.cibertec.DAWII_CL1_PazCesar.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/frmMantAlumno")
    public String frmMantAlumno(Model model) {
        model.addAttribute("listarAlumnos", alumnoService.listarAlumnos());
        return "Alumno/frmMantAlumno";
    }

    @GetMapping("/listarAlumnos")
    @ResponseBody
    public List<Alumno> listarAlumno() {
        return alumnoService.listarAlumnos();
    }
}
