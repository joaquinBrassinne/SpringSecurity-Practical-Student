package com.alumnos.springSecurity.practice.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Alumno {
    private String name;
    private String lastName;
    private List<Double> califications;

    public Alumno() {
        this.califications = new ArrayList<>(); // Inicializa la lista al crear el objeto
    }
}
