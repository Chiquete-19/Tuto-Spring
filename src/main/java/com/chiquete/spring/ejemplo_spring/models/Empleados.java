package com.chiquete.spring.ejemplo_spring.models;

import java.util.Map;

public class Empleados {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String puesto;
    private double sueldo;

    public Empleados(Map<String,Object> datos){
        this.nombre=(String)datos.get("nombre");
        this.apellidoP=(String)datos.get("apellidoP");
        this.apellidoM=(String)datos.get("apellidoM");
        this.puesto=(String)datos.get("puesto");
        this.sueldo=(double)datos.get("sueldo");

    }
    public Empleados(String nombre,String apellidoP,String apellidoM,String puesto,double sueldo){
        this.nombre=nombre;
        this.apellidoP=apellidoP;
        this.apellidoM=apellidoM;
        this.puesto=puesto;
        this.sueldo=sueldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoP() {
        return apellidoP;
    }
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    public String getApellidoM() {
        return apellidoM;
    }
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
