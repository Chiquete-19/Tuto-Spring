package com.chiquete.spring.ejemplo_spring.models.DTO;

import java.util.HashMap;
import java.util.Map;

import com.chiquete.spring.ejemplo_spring.models.Empleados;


//Clases DTO Son para transferir datos entre capas, esto quiere
// decir que no estan conectadas a la base de datos, pero que si pueden implementar logica 
public class Logica {
     public Empleados crearEmpleado(){
        Map<String,Object>datosEmpleado=new HashMap<>();
        datosEmpleado.put("nombre","Fernando");
        datosEmpleado.put("apellidoP","Chiquete");
        datosEmpleado.put("apellidoM",null);
        datosEmpleado.put("puesto","Jefe");
        datosEmpleado.put("sueldo",15000.00);
        Empleados emp=new Empleados(datosEmpleado);
        return emp;
    }
}
