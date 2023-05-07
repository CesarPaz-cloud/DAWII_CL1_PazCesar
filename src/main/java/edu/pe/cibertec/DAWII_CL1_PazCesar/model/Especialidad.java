package edu.pe.cibertec.DAWII_CL1_PazCesar.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Especialidad")
public class Especialidad {
    @Id
    public String idEs;
    @Column(name = "NomEsp")
    public String nomEs;
    @Column(name = "Costo")
    public double Costo;

    @JsonManagedReference
    @OneToMany(mappedBy = "especialidad", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Alumno> listaAlumno = new ArrayList<>();
}
