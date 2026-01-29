package com.chiquete.spring.ejemplo_spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chiquete.spring.ejemplo_spring.Logica.Logica;
import com.chiquete.spring.ejemplo_spring.models.Empleados;



@RestController
@RequestMapping("/api")
public class AppRestController {

    @GetMapping("/info")
    public Map<String,Object> info() {
        Logica logica=new Logica();
        Empleados emp1=logica.crearEmpleado();
        
        Empleados emp2=logica.crearEmpleado();
        Map<String,Object>Empleados=new HashMap<>();
        Empleados.put("Empleado1",emp1);
        Empleados.put("Empleado2",emp2);
        
        return Empleados;
    }
    
}
