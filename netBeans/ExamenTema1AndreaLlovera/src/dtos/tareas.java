/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import java.util.Date;

/**
 *
 * @author Tarde
 */
public class tareas {
    private int id;
    private String nombre;
    private String descripcion;
    private String asignaturas;
    private Date fechaInicio;
    private Date fechaFin;

    public tareas(int id,String nombre, String descripcion, String asignaturas,Date fechaInicio,Date fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.asignaturas = asignaturas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.id=id;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getId() {
        return id;
    }
    
    public String[] toArrayString() {
        String tarea[] = {this.nombre, this.descripcion, this.asignaturas + "", this.fechaFin+"",this.fechaInicio+""};
        return tarea;
    }
    
}
