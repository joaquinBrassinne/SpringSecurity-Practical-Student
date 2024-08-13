package com.alumnos.springSecurity.practice.controller;

import com.alumnos.springSecurity.practice.model.Alumno;
import com.alumnos.springSecurity.practice.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/califications")
    public Alumno getCalifications(){
        return this.alumnoService.califications();
    }

    @GetMapping("/califications/average")
    public String getAverage(){
        return "El promedio es de: " + this.alumnoService.promedio();
    }
}
