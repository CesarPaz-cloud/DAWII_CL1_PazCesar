package edu.pe.cibertec.DAWII_CL1_PazCesar.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Alumno")
public class Alumno {
    @Id
    public Integer idAl;
    @Column(name = "ApeAlumno")
    public String Ape;
    @Column(name = "NomAlumno")
    public String Nom;
    public String proc;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idEs")
    private Especialidad especialidad;
}
