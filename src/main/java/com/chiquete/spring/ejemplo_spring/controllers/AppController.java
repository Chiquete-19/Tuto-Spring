package com.chiquete.spring.ejemplo_spring.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.chiquete.spring.ejemplo_spring.models.DTO.Logica;
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
    //Otra manera de enviar dato de un modelo a la vista 
    @ModelAttribute("empleados")
    public List<Empleados> obtenerEmpleados(){
        return Arrays.asList(
            new Empleados("Fernando","Chiquete","V","Jefe",15000.00),
            new Empleados("Ana","Lopez","M","Auxiliar",8000.00),
            new Empleados("Luis","Martinez","R","Gerente",20000.00)
        );
    }
}


