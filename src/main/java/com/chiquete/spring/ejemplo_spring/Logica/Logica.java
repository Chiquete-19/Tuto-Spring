package com.chiquete.spring.ejemplo_spring.Logica;

import java.util.HashMap;
import java.util.Map;

import com.chiquete.spring.ejemplo_spring.models.Empleados;

public class Logica {
     public Empleados crearEmpleado(){
        Map<String,Object>datosEmpleado=new HashMap<>();
        datosEmpleado.put("nombre","Fernando");
        datosEmpleado.put("apellidoP","Chiquete");
        datosEmpleado.put("apellidoM","V");
        datosEmpleado.put("puesto","Jefe");
        datosEmpleado.put("sueldo",15000.00);
        Empleados emp=new Empleados(datosEmpleado);
        return emp;
    }
}
