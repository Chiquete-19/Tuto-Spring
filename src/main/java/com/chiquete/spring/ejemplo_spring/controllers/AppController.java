package com.chiquete.spring.ejemplo_spring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.chiquete.spring.ejemplo_spring.Logica.Logica;
import com.chiquete.spring.ejemplo_spring.models.Empleados;


@Controller
public class AppController {

    @GetMapping("/")
    public String info(Model m) {
        Logica logica=new Logica();
        Empleados emp= logica.crearEmpleado();

        m.addAttribute("gola","Titulo");
        m.addAttribute("Empleado", emp);
        return "info";
    }
    
}
