package com.alumnos.springSecurity.practice.service;

import com.alumnos.springSecurity.practice.model.Alumno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {


    public Alumno califications(){
        Alumno alumno = new Alumno();
        alumno.setName("Joaquin");
        alumno.setLastName("Brassinne");
        alumno.getCalifications().add(8.0);
        alumno.getCalifications().add(7.0);
        alumno.getCalifications().add(6.0);
        alumno.getCalifications().add(10.0);
        alumno.getCalifications().add(9.0);
        alumno.getCalifications().add(5.0);
        alumno.getCalifications().add(7.0);
        alumno.getCalifications().add(9.0);
        return alumno;
    }

    public double promedio(){
        Alumno alumno = califications();

        List<Double> califications = alumno.getCalifications();

        double suma = 0;

        for (Double calificacion: califications){
            suma += calificacion;
        }

        return suma/califications.size();
    }
}
